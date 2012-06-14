package org.hsc.utils;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

import org.compiere.model.MAttachment;
import org.compiere.model.MAttachmentEntry;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.MMailText;
import org.compiere.model.MUser;
import org.compiere.util.EMail;
import org.compiere.util.Env;
import org.hsc.model.MHSCEmailLog;

public class HSCEMail {
	private EMail email;
	private Properties ctx;
	private MClient mClient;
	private MUser fromUser;
	private MUser toUser;
	public MUser getToUser() {
		return toUser;
	}

	public void setToUser(MUser toUser) {
		this.toUser = toUser;
	}

	public MMailText getTemplate() {
		return template;
	}

	public void setTemplate(MMailText template) {
		this.template = template;
	}

	private String sentStatus;
	// private String text;
	private MMailText template;
	private Hashtable<String, String> params = new Hashtable<String, String>();

	public HSCEMail() {
		ctx = Env.getCtx();
		mClient = MClient.get(Env.getCtx());
		/* default fromUser -- hscAdmin */
		fromUser = new MUser(ctx, 1000000, null);

	}

	/*
	 * the following members must be set before send 1. template 2. params, if
	 * any parameter in template 3. toUser
	 */
	public String send() throws HSCSendMailException {
		// Create email object
		if (template == null)
			throw new HSCSendMailException("Mail Text has not been set");
		if (toUser == null)
			throw new HSCSendMailException("To user has not been set");
		if (toUser.getEMail() == null) 
			throw new HSCSendMailException(toUser.getName() +" has no email address");
		
		String text = parseParam(template.getMailText(true));
		if(text == null) 
			throw new HSCSendMailException("Mail Text no content");
		
		String header = "";
		try{
			header = template.getMailHeader();
		}catch(Exception e){
			throw new HSCSendMailException("Mail Text no subject");
		}
		String subject = parseParam(header);
		
		
		email = mClient.createEMail(fromUser, toUser, subject, text);
		// Attach all attachment to email
		MAttachment att = template.getAttachment();
		if (att != null) {
			MAttachmentEntry entry[] = att.getEntries();
			for (int j = 0; j < entry.length; j++) {
				File entryFile = entry[j].getFile();
				email.addAttachment(entryFile);
			}
		}
		sentStatus = email.send();
		log();
		return sentStatus;
	}
	private void log(){
		// log
		MHSCEmailLog mailLog = new MHSCEmailLog(ctx, 0, null);
		String bpartnerName = toUser.getC_BPartner().getName();
		String mailTypeStr = template.getName();
		mailLog.log("Send mail-" + toUser.getName(), mailTypeStr,
							template.get_ID(), fromUser.getName(), bpartnerName,
							toUser.getEMail(), sentStatus);
	}
	public void putParam(String key, String value) {
		params.put(key, value);
	}

	private String parseParam(String text) {
		Enumeration<String> keys = params.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			text = text.replace(key, params.get(key));
		}
		return text;
	}
}
