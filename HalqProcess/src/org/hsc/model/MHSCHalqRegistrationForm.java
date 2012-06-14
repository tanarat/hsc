package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.DB;
import org.compiere.util.Env;

public class MHSCHalqRegistrationForm extends X_HSC_Halq_Registration_Form {

	

	public MHSCHalqRegistrationForm(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCHalqRegistrationForm(Properties ctx,
			int hsc_halq_registration_form_ID, String trxName) {
		super(ctx, hsc_halq_registration_form_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		System.out.println(getRequest_Type1());
		System.out.println(getRequest_Type2());
		System.out.println(getRequest_Type3());
		System.out.println(getRequest_Type4());
		System.out.println(getRequest_Type5());
		return super.afterSave(newRecord, success);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		
		if(isApproved()){
			if(MHSCHalqApprove.getApproveIDFor(getHSC_Halq_Registration_Form_ID()) == 0){

				MHSCHalqApprove approve = new MHSCHalqApprove(getCtx(), 0, get_TrxName());
				approve.setHSC_Halq_Registration_Form_ID(getHSC_Halq_Registration_Form_ID());
				approve.setHSC_Halq_Project_ID(getHSC_Halq_Project_ID());
				approve.setC_BPartner_ID(getC_BPartner_ID());
				approve.save();
			}
		}else{
			int approveID = MHSCHalqApprove.getApproveIDFor(getHSC_Halq_Registration_Form_ID());
			if( approveID != 0){
				MHSCHalqApprove approve = new MHSCHalqApprove(getCtx(), approveID, get_TrxName());
				approve.delete(true);
			}
		}
		System.out.println(this.isGMP());
		return super.beforeSave(newRecord);
	}

	public static MHSCHalqRegistrationForm getForm(int project_ID, int bpartner_ID) {
		// TODO Auto-generated method stub
		Properties ctx = Env.getCtx();
		MHSCHalqRegistrationForm form = null;
		String sql = "Select * From HSC_Halq_Registration_Form " +
				"Where HSC_Halq_Project_ID = ? " +
				"and C_BPartner_ID = ? ";
				
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, project_ID);
			pstmt.setInt (2, bpartner_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				form = new MHSCHalqRegistrationForm(ctx, rs, null);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
//			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		
		return form;
	}

	public int getProductAmt() {
		// TODO Auto-generated method stub
		int productAmt = 0;
		if(getProduct_Name1() != null && getProduct_Name1().length() != 0) productAmt+=1;
		if(getProduct_Name2() != null && getProduct_Name2().length() != 0) productAmt+=1;
		if(getProduct_Name3() != null && getProduct_Name3().length() != 0) productAmt+=1;
		if(getProduct_Name4() != null && getProduct_Name4().length() != 0) productAmt+=1;
		if(getProduct_Name5() != null && getProduct_Name5().length() != 0) productAmt+=1;
		return productAmt;
	}

	public boolean erpRegister() {
		// TODO Auto-generated method stub
		boolean success = true;
		
		return success;
		
	}

	public void erpApprove() {
		// TODO Auto-generated method stub
		
	}

}
