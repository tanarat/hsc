package org.hsc.process;

import org.hsc.model.MHSCBPStaff;
import org.hsc.model.MHSCHalqRegistrationForm;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.model.MUser;
import org.compiere.process.ProcessInfo;
import org.compiere.process.SvrProcess;

public class HSCRegisterSubmit extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		int formId = getRecord_ID();
		MHSCHalqRegistrationForm form = new MHSCHalqRegistrationForm(getCtx(),
				formId, get_TrxName());
		if((form.getRegisterFor() != null) &&(form.getRegisterFor().equals(MHSCHalqRegistrationForm.REGISTERFOR_ขอใช้บริการHAL_QERP))){
			if(form.erpRegister()){
				return "Register success";
			}else{
				return "Register fail";
			}	
		}
		
		
		
		
		
		if (register(form)) {

			form.setIsRegistered(true);
			form.save();
			ProcessInfo processInfo = this.getProcessInfo();

			return "register success";
		} else {
			return "register failed";
		}
	}

	private boolean register(MHSCHalqRegistrationForm form) {
		// update c_bpartner

		int bpartnerId =form.getC_BPartner_ID();
//		MMBPartner bpartner = new MMBPartner(getCtx(), bpartnerId,get_TrxName());
		MBPartner bpartner = new MBPartner(getCtx(),bpartnerId,get_TrxName());
		// name, name2
		bpartner.setName(form.getName());
		bpartner.setName2(form.getName2());

		// contact
		MUser contact = new MUser(bpartner);
		contact.setTitle(form.getContact_Title());
		contact.setName(form.getContact_Name() + " " + form.getContact_Lname());
		contact.setEMail(form.getContact_Email());
		contact.setPhone(form.getContact_Phone());
		contact.save();
		
		// office location
		MBPartnerLocation office = bpartner.getLocationByName("office");
		if (office == null) {
			MLocation offLoc = new MLocation(getCtx(), 0, get_TrxName());
			office = new MBPartnerLocation(bpartner);
			
			offLoc.setAddress1(form.getOff_Address1());
			offLoc.setAddress2(form.getOff_Address2());
			offLoc.setAddress3(form.getOff_Address3());
			offLoc.setAddress4(form.getOff_Address4());
//			offLoc.setCity(form.getOff_City());
			offLoc.setC_City_ID(form.getOff_City_ID());
			offLoc.setC_Country_ID(form.getOff_C_Country_ID());
			offLoc.setPostal(form.getOff_Postal());
			offLoc.save();			
			
			office.setName("office");
			office.setC_Location_ID(offLoc.get_ID());
			office.setPhone(form.getOff_Phone());
			office.setFax(form.getOff_Fax());
			office.save();
			
		}
		

		// factory location
		MBPartnerLocation factory = bpartner.getLocationByName("factory");
		if (factory == null) {
			MLocation facLoc = new MLocation(getCtx(), 0, get_TrxName()); 
			factory = new MBPartnerLocation(bpartner);
			if (form.isSame_Off_Address()) {
				facLoc.setAddress1(form.getOff_Address1());
				facLoc.setAddress2(form.getOff_Address2());
				facLoc.setAddress3(form.getOff_Address3());
				facLoc.setAddress4(form.getOff_Address4());
//				facLoc.setCity(form.getOff_City());
				facLoc.setC_City_ID(form.getOff_City_ID());
				facLoc.setC_Country_ID(form.getOff_C_Country_ID());
				facLoc.setPostal(form.getOff_Postal());
				factory.setPhone(form.getOff_Phone());
				factory.setFax(form.getOff_Fax());
				
			} else {
				facLoc.setAddress1(form.getFac_Address1());
				facLoc.setAddress2(form.getFac_Address2());
				facLoc.setAddress3(form.getFac_Address3());
				facLoc.setAddress4(form.getFac_Address4());
//				facLoc.setCity(form.getFac_City());
				facLoc.setC_City_ID(form.getFac_City_ID());
				facLoc.setC_Country_ID(form.getFac_C_Country_ID());
				facLoc.setPostal(form.getFac_Postal());
				factory.setPhone(form.getFac_Phone());
				factory.setFax(form.getFac_Fax());
			}
			
			facLoc.save();
			factory.setName("factory");
			factory.setC_Location_ID(facLoc.get_ID());
			factory.save();
		}
		
		MHSCBPStaff staffs[];
		staffs = MHSCBPStaff.getStaffs(form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID(),1);
		if(staffs == null || staffs.length == 0){
		// create new staffs record
			staffs = new MHSCBPStaff[5];
			staffs[0] = new MHSCBPStaff(getCtx(), 0, get_TrxName(), form.getStaff_Title1(),
							form.getStaff_Name1(), form.getStaff_Lname1(),
							form.getStaff_Position1(), form.getStaff_Edu1(), form.getStaff_Exp1(),true,form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID());
			staffs[1] = new MHSCBPStaff(getCtx(), 0, get_TrxName(), form.getStaff_Title2(),
							form.getStaff_Name2(), form.getStaff_Lname2(),
							form.getStaff_Position2(), form.getStaff_Edu2(), form.getStaff_Exp2(),true,form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID());
			staffs[2] = new MHSCBPStaff(getCtx(), 0, get_TrxName(), form.getStaff_Title3(),
						form.getStaff_Name3(), form.getStaff_Lname3(),
						form.getStaff_Position3(), form.getStaff_Edu3(), form.getStaff_Exp3(),true,form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID());
			staffs[3] = new MHSCBPStaff(getCtx(), 0, get_TrxName(), form.getStaff_Title4(),
							form.getStaff_Name4(), form.getStaff_Lname4(),
							form.getStaff_Position4(), form.getStaff_Edu4(), form.getStaff_Exp4(),true,form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID());
			staffs[4] = new MHSCBPStaff(getCtx(), 0, get_TrxName(), form.getStaff_Title5(),
							form.getStaff_Name5(), form.getStaff_Lname5(),
							form.getStaff_Position5(), form.getStaff_Edu5(), form.getStaff_Exp5(),true,form.getHSC_Halq_Project_ID(),form.getC_BPartner_ID());
		}else{
			//update 
			staffs[0].setTitle(form.getStaff_Title1());
			staffs[0].setName(form.getStaff_Name1());
			staffs[0].setLastName(form.getStaff_Lname1());
			staffs[0].setPosition(form.getStaff_Position1());
			staffs[0].setEducation(form.getStaff_Edu1());
			staffs[0].setExpYear(form.getStaff_Exp1());
			staffs[0].setIsTraining1Staff(true);
			
			staffs[1].setTitle(form.getStaff_Title2());
			staffs[1].setName(form.getStaff_Name2());
			staffs[1].setLastName(form.getStaff_Lname2());
			staffs[1].setPosition(form.getStaff_Position2());
			staffs[1].setEducation(form.getStaff_Edu2());
			staffs[1].setExpYear(form.getStaff_Exp2());
			staffs[1].setIsTraining1Staff(true);
			
			staffs[2].setTitle(form.getStaff_Title3());
			staffs[2].setName(form.getStaff_Name3());
			staffs[2].setLastName(form.getStaff_Lname3());
			staffs[2].setPosition(form.getStaff_Position3());
			staffs[2].setEducation(form.getStaff_Edu3());
			staffs[2].setExpYear(form.getStaff_Exp3());
			staffs[2].setIsTraining1Staff(true);
			
			staffs[3].setTitle(form.getStaff_Title4());
			staffs[3].setName(form.getStaff_Name4());
			staffs[3].setLastName(form.getStaff_Lname4());
			staffs[3].setPosition(form.getStaff_Position4());
			staffs[3].setEducation(form.getStaff_Edu4());
			staffs[3].setExpYear(form.getStaff_Exp4());
			staffs[3].setIsTraining1Staff(true);
			
			staffs[4].setTitle(form.getStaff_Title5());
			staffs[4].setName(form.getStaff_Name5());
			staffs[4].setLastName(form.getStaff_Lname5());
			staffs[4].setPosition(form.getStaff_Position5());
			staffs[4].setEducation(form.getStaff_Edu5());
			staffs[4].setExpYear(form.getStaff_Exp5());
			staffs[4].setIsTraining1Staff(true);

			
		}
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].save();
		}
//		MHSCBP hscbp = bpartner.getHSC_BP();
//		hscbp.addStaffs(staffs);
		
		return true;
	}
}
