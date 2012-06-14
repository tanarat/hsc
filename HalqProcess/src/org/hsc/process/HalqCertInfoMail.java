package org.hsc.process;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.compiere.model.MBPartner;
import org.compiere.model.MMailText;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCAppointment;
import org.hsc.model.MHSCHalqCert;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqTraining;
import org.hsc.utils.HSCEMail;
import org.hsc.utils.HSCSendMail;

public class HalqCertInfoMail extends SvrProcess {

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		int certID = getRecord_ID();
	
		MHSCHalqCert cert = new MHSCHalqCert(getCtx(), certID, get_TrxName());
		
		MHSCHalqProject project = cert.getHSC_Halq_Project();
		HSCEMail email = new HSCEMail();
		MBPartner bpartner = cert.getC_BPartner();
		
		
		
		/*Template*/
		MMailText template = getMailText("HSC Certified Mail");
		
		email.setTemplate(template);
		/*param*/
		email.putParam("@no", "001");
		email.putParam("@SendDate@", new Date().toString());
		email.putParam("@CompanyName@", bpartner.getName());
		email.putParam("@ProjectName@", project.getName());
		
		
		
		Date dateFrom = cert.getDateStart();
		Date dateTo = cert.getDateFinish();
		email.putParam("@DateFrom@", dateFormat(dateFrom));
		email.putParam("@DateTo@", dateFormat(dateTo) );
		
		

		
		/*To*/
		
		MUser[] contactUsers = bpartner.getActiveContacts(true);
		for (int i = 0; i < contactUsers.length; i++) {
			email.setToUser(contactUsers[i]);
			email.send();
		}
		
		
		return "Send email completed";

	}
	private String dateFormat(Date date) {
		// TODO Auto-generated method stub
		String dateTxt = "";
		if(date != null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int y = calendar.get(Calendar.YEAR);
			int m = calendar.get(Calendar.MONTH) + 1;
			int d = calendar.get(Calendar.DATE);
			dateTxt = String.format("%02d-%02d-%04d", d,m,y);
			
		}
		return dateTxt;
	}
	private MMailText getMailText(String mailTextName) {
		String table = MMailText.Table_Name;
		String whereClause = "IsActive = 'Y' and Name = ?";
		
		List<MMailText> mailTexts = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters(mailTextName).list();
		if(mailTexts == null || mailTexts.size() == 0)
			return null;
		else
			return mailTexts.get(0);
	}

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

}
