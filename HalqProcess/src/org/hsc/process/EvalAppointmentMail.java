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
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqTraining;
import org.hsc.utils.HSCEMail;
import org.hsc.utils.HSCSendMail;

public class EvalAppointmentMail extends SvrProcess {

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		int appointmentID = getRecord_ID();
	
		MHSCAppointment appointment = new MHSCAppointment(getCtx(), appointmentID,
				get_TrxName());
		MHSCHalqProject project = appointment.getHSC_Halq_Project();
		HSCEMail email = new HSCEMail();
		MBPartner bpartner = appointment.getC_BPartner();
		
		
		
		/*Template*/
		MMailText template = null;
		if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_1stVisit))
			template = getMailText("HSC Advice1 Mail");
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_2ndVisit))
			template = getMailText("HSC Advice2 Mail");
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_3rdVisit))
			template = getMailText("HSC Advice3 Mail");
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_1stAudit))
			template = getMailText("HSC Audit1 Mail");
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_2ndAudit))
			template = getMailText("HSC Audit2 Mail");
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_3rdAudit))
			template = getMailText("HSC Audit3 Mail");
		email.setTemplate(template);
		/*param*/
		email.putParam("@no", "001");
		email.putParam("SendDate", new Date().toString());
		email.putParam("@CompanyName@", bpartner.getName());
		email.putParam("@ProjectName@", project.getName());
		
		Date appDate = appointment.getEvalDate();
		String dateTxt = "";
		if(appDate != null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(appDate);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int date = calendar.get(Calendar.DATE);
			dateTxt = String.format("%02d-%02d-%04d", date,month,year);
			
		}
		email.putParam("@AppointmentDate@", dateTxt );
		/*Advisor*/
		email.putParam("@Advisor@",appointment.getAdvisor().getName());
//		if((appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_1stAudit)) || 
//				(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_2ndAudit)) ||
//				(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_3rdAudit))		
//				){
//					
//				}
		
		/*To*/
		
		MUser[] contactUsers = bpartner.getActiveContacts(true);
		for (int i = 0; i < contactUsers.length; i++) {
			email.setToUser(contactUsers[i]);
			email.send();
		}
		
		
		return "Send email completed";

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
