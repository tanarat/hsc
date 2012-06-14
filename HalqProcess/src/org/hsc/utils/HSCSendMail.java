package org.hsc.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.compiere.model.MAttachment;
import org.compiere.model.MAttachmentEntry;
import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
//import org.hsc.model.MHSCBP;
import org.hsc.model.MHSCAppointment;
import org.hsc.model.MHSCBPStaff;
import org.hsc.model.MHSCEmailLog;
import org.hsc.model.MHSCHalqApprove;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqProjectProspect;
import org.hsc.model.MHSCHalqTraining;
import org.hsc.model.MHSCSetting;
import org.compiere.model.MMailText;
import org.compiere.model.MUser;
import org.compiere.util.EMail;
import org.compiere.util.Env;

import com.ttt.model.MTTTAnswersheet;
//import org.hsc.model.MMBPartner;

//import sun.security.util.Debug;

public class HSCSendMail {
	
	private Properties ctx;
	private MClient mClient;
	private MUser fromUser;

	public HSCSendMail() {
		ctx = Env.getCtx();
		mClient = MClient.get(Env.getCtx());

		// default fromUser -- hscAdmin
		setFromUser(new MUser(ctx, 1000000, null));

	}

	/*
	 * Send invite mail to all bp for specific project
	 */
	public boolean sendInviteMail(MHSCHalqProject project, MBPartner bpartner)
			throws HSCSendMailException {

		if (bpartner == null) {
			ArrayList<MHSCHalqProjectProspect> prospects = project
					.getProspect();
			for (int i = 0; i < prospects.size(); i++) {
				bpartner = (MBPartner) prospects.get(i).getC_BPartner();
				sendMail(project, bpartner, INVITE_MAIL);
			}

		} else {

			sendMail(project, bpartner, INVITE_MAIL);
		}
		return true;
	}
	
	public boolean sendTraining1Mail(MHSCHalqProject project) throws HSCSendMailException {
		// TODO Auto-generated method stub
		MBPartner[] bparterns = project.getApprovedBPs(true);
		for (int i = 0; i < bparterns.length; i++) {
			sendMail(project,bparterns[i],TRAINING1_MAIL);
		}
		return true;
	}
	public void sendTraining1ReportMail(MHSCHalqProject project) throws HSCSendMailException {
		MBPartner[] bparterns = project.getApprovedBPs(true);
		for (int i = 0; i < bparterns.length; i++) {
			sendMail(project,bparterns[i],TRAINING1_REPORT_MAIL);
		}
	}
	public void sendTraining2Mail(MHSCHalqTraining training) throws HSCSendMailException {
		// TODO Auto-generated method stub
		MHSCHalqProject project = training.getHSC_Halq_Project();
		MBPartner bpartner = (MBPartner) training.getC_BPartner();
		sendMail(project,bpartner,TRAINING2_MAIL);
	}
	public void sendTraining2ReportMail(MHSCHalqTraining training) throws HSCSendMailException {
		// TODO Auto-generated method stub
		MHSCHalqProject project = training.getHSC_Halq_Project();
		MBPartner bpartner = (MBPartner) training.getC_BPartner();
		sendMail(project,bpartner,TRAINING2_REPORT_MAIL);
	}
	public boolean sendApproveMail(MHSCHalqProject project, MBPartner bpartner)
			throws HSCSendMailException {
		// TODO Auto-generated method stub
		if (bpartner == null) {
			MBPartner[] approvedBPs = project.getApprovedBPs(true);
			for (int i = 0; i < approvedBPs.length; i++) {
				bpartner = approvedBPs[i];
				sendMail(project, bpartner, APPROVE_MAIL);
			}
		}else{
			sendMail(project, bpartner, APPROVE_MAIL);
		}
		return true;
	}
	public void sendEvalAppointmentMail(MHSCAppointment appointment) throws HSCSendMailException {
		// TODO Auto-generated method stub
		MHSCHalqProject project = appointment.getHSC_Halq_Project();
		MBPartner bpartner = appointment.getC_BPartner();
		if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_1stVisit))
			sendMail(project,bpartner,APPOINTMENT_V1_MAIL);
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_2ndVisit))
			sendMail(project,bpartner,APPOINTMENT_V2_MAIL);
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_3rdVisit))
			sendMail(project,bpartner,APPOINTMENT_V3_MAIL);
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_1stAudit))
			sendMail(project,bpartner,APPOINTMENT_A1_MAIL);
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_2ndAudit))
			sendMail(project,bpartner,APPOINTMENT_A2_MAIL);
		else if(appointment.getAppointmentType().equals(MHSCAppointment.APPOINTMENTTYPE_3rdAudit))
			sendMail(project,bpartner,APPOINTMENT_A3_MAIL);
	}

	public static final int INVITE_MAIL = 0;
	public static final int APPROVE_MAIL = 1;
	public static final int APPOINTMENT_MAIL = 2;
	public static final int TRAINING1_MAIL = 3;
	public static final int TRAINING1_REPORT_MAIL = 4;
	public static final int TRAINING2_MAIL = 5;
	public static final int TRAINING2_REPORT_MAIL = 6;
	public static final int APPOINTMENT_V1_MAIL = 7;
	public static final int APPOINTMENT_V2_MAIL = 8;
	public static final int APPOINTMENT_V3_MAIL = 9;
	public static final int APPOINTMENT_A1_MAIL = 10;
	public static final int APPOINTMENT_A2_MAIL = 11;
	public static final int APPOINTMENT_A3_MAIL = 12;

	/*
	 * Send invite mail to a specific bp for this project
	 */
	public boolean sendMail(MHSCHalqProject project, MBPartner bpartner,
			int mailType) throws HSCSendMailException {
		// Prepare mail info
		System.out.println("sendMail");
		
		MHSCHalqTraining training = null;
		MMailText template = project.getMailText(mailType);
		if (template == null)
			throw new HSCSendMailException("Mail Text has not been set");
		System.out.println(template.getName());

		String subject = (template.getMailHeader() == null) ? "No subject"
				: template.getMailHeader();
		String text = template.getMailText(true);

//		text = parsePara(text, project, bpartner, training);
		Hashtable<String, String> params = new Hashtable<String, String>();
		
		
		String mailTypeStr = "";
		
		/*common parameter*/
		params.put("@ProjectName@", project.getName());
		params.put("@CompanyName@", bpartner.getName());
		switch (mailType) {
		case INVITE_MAIL:
//			template = project.getInviteMText();
			mailTypeStr = mailTypeStr + "Invite";

			break;
		case APPROVE_MAIL:
//			template = project.getApproveMText();
			mailTypeStr = mailTypeStr + "Approve";
			break;
		case APPOINTMENT_MAIL:
			// template = project.getAppointmentMText();
			// mailTypeStr = mailTypeStr+"Appointment";
			break;
		case TRAINING1_MAIL:
//			template = project.getTraining1MText();
			training = project.getTraining1();
			mailTypeStr = mailTypeStr + "Inform-Training1";
			/*Training Date*/
			putParamTrainingDate(training, params);
			/*Training Place*/
			putParamTrainingPlace(training,params);
			break;
		case TRAINING2_MAIL:
			training = project.getTraining2(bpartner.get_ID());
			mailTypeStr = mailTypeStr + "Inform-Training2";
			/*Training Date*/
			putParamTrainingDate(training, params);
			break;
		case TRAINING1_REPORT_MAIL:
			mailTypeStr = mailTypeStr + "Report-Training1";
			training = project.getTraining1();
			/*Training Date*/
			putParamTrainingDate(training, params);
			/*Training Place*/
			putParamTrainingPlace(training,params);
			/*Entries*/
			putParamTrainingEntry(training,bpartner,params);
			
			break;
		case TRAINING2_REPORT_MAIL:
			mailTypeStr = mailTypeStr + "Report-Training2";
			training = project.getTraining2(bpartner.get_ID());
			/*Training Date*/
			putParamTrainingDate(training, params);
			/*Training Place*/
			putParamTrainingPlace(training,params);
			/*Entries*/
			putParamTrainingEntry(training,bpartner,params);
			break;
			
		case APPOINTMENT_V1_MAIL:
		case APPOINTMENT_V2_MAIL:
		case APPOINTMENT_V3_MAIL:
		case APPOINTMENT_A1_MAIL:
		case APPOINTMENT_A2_MAIL:
		case APPOINTMENT_A3_MAIL:
			mailTypeStr = mailTypeStr + "Appointment-"+mailType;
			
			break;
		default:
			throw new HSCSendMailException("Unknow Mail Type");
		}

		
		text = parsePara(text,params);
		System.out.println(text);

		MUser[] contactUsers = bpartner.getActiveContacts(true);
		if (contactUsers.length == 0)
			throw new HSCSendMailException(bpartner.getName()
					+ " has no contact user");

		for (int ii = 0; ii < contactUsers.length; ii++) {

			MUser toBPContact = contactUsers[ii];
			if (toBPContact.getEMail() == null) throw new HSCSendMailException(toBPContact.getName() +" of " + bpartner.getName() + " has no email address");;
			// Create email object
			EMail email = mClient.createEMail(fromUser, toBPContact, subject,
					text);
			// Attach all attachment to email
			MAttachment att = template.getAttachment();
			if (att != null) {
				MAttachmentEntry entry[] = att.getEntries();
				for (int i = 0; i < entry.length; i++) {
					File entryFile = entry[i].getFile();
					email.addAttachment(entryFile);
				}
			}
			String sentStatus = email.send();

			// log
			MHSCEmailLog mailLog = new MHSCEmailLog(ctx, 0, null);

			mailLog.log("Send mail-" + toBPContact.getName(), mailTypeStr,
					template.get_ID(), fromUser.getName(), bpartner.getName(),
					toBPContact.getEMail(), sentStatus);
		}
		return true;
	}
	private void putParamTrainingEntry(MHSCHalqTraining training, MBPartner bpartner,Hashtable<String, String> params) {
		// TODO Auto-generated method stub
		String entryFormat = "[%2d. ][%-30s][%5s][%5s]";
		String key = "";
		String value = "";
		int preTest_ID = 1000001;
		int postTest_ID = 1000002;
		
		
		/*entries*/
		/*[No.] [staff-name] [pre-test] [post-test]*/
		
		MHSCBPStaff[] staffs = training.getStaffTraining(bpartner.get_ID());
		if(staffs.length == 0) return;
		for (int i = 0; i < 5; i++) {
			MTTTAnswersheet pre_sheet = null;
			MTTTAnswersheet post_sheet = null;
			key = "@entry"+(i+1)+"@";
			if((i+1) <= staffs.length ){
				pre_sheet = training.getAnswerSheet(staffs[i].get_ID(), preTest_ID);
				post_sheet = training.getAnswerSheet(staffs[i].get_ID(), postTest_ID);
				

				String pre_mark = (pre_sheet == null)?"-":pre_sheet.mark()+"";
				String post_mark = (post_sheet == null)?"-":post_sheet.mark()+"";
				
				value = String.format(entryFormat
						,(i+1)
						, staffs[i].getName() + staffs[i].getLastName()
						, pre_mark
						, post_mark);
			}else{
				value = "";
			}
			
			params.put(key, value);
		}
	}

	private void putParamTrainingPlace(MHSCHalqTraining training,
			Hashtable<String, String> params) {
		// TODO Auto-generated method stub
		MBPartner trainingPlace =  (MBPartner) training.getTraining_Location();
		String place = "";
		if((trainingPlace != null) && (trainingPlace.getName() != null)){
			place = trainingPlace.getName();
			params.put("@Place@", place);
		}
		
	}

	private void putParamTrainingDate(MHSCHalqTraining training,Hashtable<String, String> params){
		Date trainingDate = training.getTraining_Date();
		String trainingDateTxt = "";
		if(trainingDate != null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(trainingDate);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int date = calendar.get(Calendar.DATE);
			trainingDateTxt = String.format("%02d-%02d-%04d", date,month,year);
			params.put("@TrainingDate@", trainingDateTxt);
		}
	}
	private String parsePara(String text,Hashtable<String,String> params){
		Enumeration<String> keys = params.keys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			text = text.replace(key,params.get(key));
		}
		return text;
	}
	private String parseParaBP(String text, MBPartner bpartner) {
		text = text.replace("@CompanyName@", bpartner.getName());
		return text;
	}

	private String parseParaProject(String text, MHSCHalqProject project) {
		text = text.replace("@ProjectName@", project.getName());
		return text;
	}
	private String parseParaTraining(String text, MHSCHalqTraining training) {
		// TODO Auto-generated method stub
		/*Training Date*/
		Date trainingDate = training.getTraining_Date();
		String trainingDateTxt = "";
		if(trainingDate != null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(trainingDate);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH);
			int date = calendar.get(Calendar.DATE);
			trainingDateTxt = String.format("%02d-%02d-%04d", date,month,year);
			text = text.replace("@Training1Date@", trainingDateTxt);
		}
		
		
		/*Training Place*/
		MBPartner trainingPlace =  (MBPartner) training.getTraining_Location();
		String place = "";
		if((trainingPlace != null) && (trainingPlace.getName() != null)){
			place = trainingPlace.getName();
			text = text.replace("@Place@", place);
		}
		
		
		return text;
	}

	private String parsePara(String text, MHSCHalqProject project,
			MBPartner bpartner, MHSCHalqTraining training) {
		text = parseParaProject(text, project);
		text = parseParaBP(text, bpartner);
		if(training != null)
			text = parseParaTraining(text,training);
		return text;
	}



	public MUser getFromUser() {
		return fromUser;
	}

	public void setFromUser(MUser fromUser) {
		this.fromUser = fromUser;
	}

	public static void main(String[] args) {

	}







}
