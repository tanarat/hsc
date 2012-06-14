package org.hsc.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.util.Env;

public class MHSCBPStaff extends X_HSC_BP_Staff {

	public MHSCBPStaff(Properties ctx, int HSC_BP_Staff_ID, String trxName) {
		super(ctx, HSC_BP_Staff_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MHSCBPStaff(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCBPStaff(Properties ctx, int HSC_BP_Staff_ID, String trxName,
				String title,String name,String lastName,String position, String education,int exp,boolean isTraining1Staff,int projectID,int C_BPartner_ID){
		super(ctx, HSC_BP_Staff_ID, trxName);
		setTitle(title);
		setName(name);
		setLastName(lastName);
		setPosition(position);
		setEducation(education);
		setExpYear(exp);
		setIsTraining1Staff(isTraining1Staff);
		setHSC_Halq_Project_ID(projectID);
		setC_BPartner_ID(C_BPartner_ID);
		save();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param Project_ID
	 * @param BPartner_ID
	 * @param phase 1= phase1, 2 = phase2, other = phase1 or phase2
	 * @return
	 */
	public static MHSCBPStaff[] getStaffs(int Project_ID,int BPartner_ID, int phase) {
		// TODO Auto-generated method stub
		Properties ctx = Env.getCtx();
		String tableName = MHSCBPStaff.Table_Name;
		String whereClause = "HSC_Halq_Project_ID = ? and C_BPartner_ID = ? and IsActive = 'Y'";
		if(phase == 1)
			whereClause += " and IsTraining1Staff = 'Y'";
		else if(phase == 2)
			whereClause += " and IsTraining2Staff = 'Y'";
		else
			whereClause += " and (IsTraining1Staff = 'Y' or IsTraining2Staff = 'Y')";
		List<MHSCBPStaff> staffs = new Query(ctx, tableName, whereClause, null).setParameters(Project_ID,BPartner_ID).list();
		return staffs.toArray(new MHSCBPStaff[staffs.size()]);
	}

//	@Override
//	protected boolean afterSave(boolean newRecord, boolean success) {
//		// TODO Auto-generated method stub
//		if(this.getAD_User_ID() != 0){
//			int userId =   this.getAD_User_ID();
//			MUser user = new MUser(this.getCtx(), userId, this.get_TrxName());
//			user.setEMailUser(this.getEMail());
//			user.setEMail(this.getEMail());
//			user.save();
//		}
//		return super.afterSave(newRecord, success);
//	}
	
	

}
