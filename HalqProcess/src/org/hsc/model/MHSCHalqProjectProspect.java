package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.hsc.model.MMBPartner;
import org.hsc.model.X_HSC_Halq_Project_Prospect;


public class MHSCHalqProjectProspect extends X_HSC_Halq_Project_Prospect {

	
	public MHSCHalqProjectProspect(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCHalqProjectProspect(Properties ctx,
			int hsc_halq_project_prospect_ID, String trxName) {
		super(ctx, hsc_halq_project_prospect_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	/*
	 * (non-Javadoc)
	 * @see org.compiere.model.PO#afterSave(boolean, boolean)
	 */
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		CLogger log = get_Logger();
		boolean formSaveOK = success;
		boolean userFormSaveOK = success;
		
		if (newRecord && success) {
			// create new registration form record
			MHSCHalqRegistrationForm form = new MHSCHalqRegistrationForm(getCtx(), 0,
					get_TrxName());
			

			form.setHSC_Halq_Project_ID(getHSC_Halq_Project_ID());
			form.setHSC_Halq_Project_Prospect_ID(getHSC_Halq_Project_Prospect_ID());
			form.setC_BPartner_ID(getC_BPartner_ID());

			MBPartner bpartner = (MBPartner) getC_BPartner();
			form.setName(bpartner.getName());
			form.setName2(bpartner.getName2());

			MBPartnerLocation bpOffLoc = bpartner.getLocationByName("office");
			if(bpOffLoc != null){
				MLocation off = bpOffLoc.getLocation(true);
				form.setOff_Address1(off.getAddress1());
				form.setOff_Address2(off.getAddress2());
				form.setOff_Address3(off.getAddress3());
				form.setOff_Address4(off.getAddress4());
				form.setOff_City_ID(off.getC_City_ID());
				form.setOff_C_Country_ID(off.getC_Country_ID());
				form.setOff_Postal(off.getPostal());
				form.setOff_Phone(bpOffLoc.getPhone());
				form.setOff_Fax(bpOffLoc.getFax());
				form.setWebsite(""); //Office website
			}
			
			MBPartnerLocation bpFacLoc = bpartner.getLocationByName("factory");
			if(bpFacLoc != null){
				MLocation fac = bpFacLoc.getLocation(true);
				form.setFac_Address1(fac.getAddress1());
				form.setFac_Address2(fac.getAddress2());
				form.setFac_Address3(fac.getAddress3());
				form.setFac_Address4(fac.getAddress4());
				form.setFac_City_ID(fac.getC_City_ID());
				form.setFac_C_Country_ID(fac.getC_Country_ID());
				form.setFac_Postal(fac.getPostal());
				form.setFac_Phone(bpFacLoc.getPhone());
				form.setFac_Fax(bpFacLoc.getFax());
				form.setFac_Website(""); //Factory website
			}
			
			
			
			
			formSaveOK = form.save();
			
			log.info("Create registration form ,id:" + form.getHSC_Halq_Registration_Form_ID());
			
			
			String userName = Integer.toString(getC_BPartner_ID());
			if(MHSCUserRegisterForm.isExists(userName)){
			
				int rs = MHSCUserRegisterForm.setFormId(userName,form.getHSC_Halq_Registration_Form_ID());
				userFormSaveOK = (rs == 1)?true:false;
				log.info("Update user_register_form for " + userName + " with form id:" + form.getHSC_Halq_Registration_Form_ID());
				
			}else{
				MHSCUserRegisterForm userRegistForm = new MHSCUserRegisterForm(getCtx(), 0, get_TrxName());
				userRegistForm.setUserName(userName);
				
				userRegistForm.setHSC_Halq_Registration_Form_ID(form.getHSC_Halq_Registration_Form_ID());
				userFormSaveOK = userRegistForm.save();
				log.info("Insert user_register_form for " + userName + " with form id:" + form.getHSC_Halq_Registration_Form_ID() + " result : " + userFormSaveOK);
			}
			
			
		}
		
		return super.afterSave(newRecord, (formSaveOK && userFormSaveOK));

	}

	@Override
	protected boolean afterDelete(boolean success) {
		// TODO Auto-generated method stub
		boolean formSaveOK = success;
		boolean userFormSaveOK = success;
		if (success) {
		String sql = "select hsc_halq_registration_form_id from hsc_halq_registration_form where hsc_halq_project_prospect_id = ?";
		PreparedStatement pstmt = null;
		pstmt = DB.prepareStatement(sql, null);
		try {
			
			pstmt.setInt(1, getHSC_Halq_Project_Prospect_ID());
			ResultSet res = pstmt.executeQuery();
			res.next();
			int formId = res.getInt(1);
			System.out.println("prospect id " + getHSC_Halq_Project_Prospect_ID());
			System.out.println("form id " + formId);
			pstmt.close();
			
			MHSCHalqRegistrationForm form = new MHSCHalqRegistrationForm(getCtx(), formId,get_TrxName());
			formSaveOK = form.delete(true);
			
			
			String userName = Integer.toString(getHSC_BP().getC_BPartner_ID());
			if(MHSCUserRegisterForm.isExists(userName)){
				int rs = MHSCUserRegisterForm.setFormId(userName,0);
				userFormSaveOK = (rs == 1)?true:false;
				log.info("Update user_register_form for " + userName + " with form id:" + form.getHSC_Halq_Registration_Form_ID());
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return super.afterDelete((formSaveOK && userFormSaveOK));
	}

	
//	public MMBPartner getBPartner(){
//		MMBPartner bpartner = null;
//		String sql = "select * from c_bpartner where c_bpartner_id = ?";
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		pstmt = DB.prepareStatement(sql, get_TrxName());
//		try {
//			pstmt.setInt(1, getHSC_BP().getC_BPartner_ID());
//			rs = pstmt.executeQuery();
//			rs.next();
//			bpartner = new MMBPartner(getCtx(),rs.getInt("c_bpartner_id"),get_TrxName());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return bpartner;
//	}
	public static void main(String[] args) {
		org.compiere.Adempiere.startupEnvironment(true);
		//Create new prospect record
//		MBPartner bp = new MBPartner(Env.getCtx(), 1000009, null);
//		MHSCHalqProjectProspect prospect = new MHSCHalqProjectProspect(Env.getCtx(), 0, null);
//		prospect.setC_BPartner_ID(bp.getC_BPartner_ID());
//		prospect.setName(bp.getName());
//		prospect.setHSC_Halq_Project_ID(1000006);
//		prospect.save();
//		System.out.println("Prospect ID : " + prospect.getHSC_Halq_Project_Prospect_ID());
		
		MHSCHalqProjectProspect prospect = new MHSCHalqProjectProspect(Env.getCtx(), 1000041, null);
		prospect.delete(true);
		System.out.println("deleted");
	}

}
