package org.hsc.model;

import java.util.Properties;

public class MHSCEmailLog extends X_HSC_Email_Log {

	public MHSCEmailLog(Properties ctx, int HSC_Email_Log_ID, String trxName) {
		super(ctx, HSC_Email_Log_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void log(String name, String type, int R_MailText_ID,
			String from, String to, String email, String status) {
		// TODO Auto-generated method stub
		this.setName(name);
		this.setHSC_Email_Type(type);
		this.setR_MailText_ID(R_MailText_ID);
		this.setsendfrom(from);
		this.setsendto(to);
		this.setEMail(email);
		this.setSentStatus(status);
		this.save();
	}

	

}
