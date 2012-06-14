package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.I_C_BPartner;
import org.compiere.model.MUser;
import org.compiere.model.MUserRoles;
import org.compiere.model.X_C_BPartner;
import org.compiere.util.DB;

public class MHSCBP extends X_HSC_BP {

	public MHSCBP(Properties ctx, int HSC_BP_ID, String trxName) {
		super(ctx, HSC_BP_ID, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("===================MHSCBP======================");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayList<MHSCBPStaff> getTraining1Staff(int projectID){
		// TODO Auto-generated method stub
		ArrayList<MHSCBPStaff> training1Staffs = new ArrayList<MHSCBPStaff>();
		String sql = "select * from hsc_bp_staff where c_bpartner_id = ? and istraining1staff = 'Y' and hsc_halq_project_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getC_BPartner_ID());
			pstmt.setInt(2, projectID);
			rs = pstmt.executeQuery();
			while(rs.next()){
				training1Staffs.add(new MHSCBPStaff(getCtx(),rs.getInt("hsc_bp_staff_id"),get_TrxName()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return training1Staffs;
	}
	public ArrayList<MHSCBPStaff> getTraining2Staff() {
		// TODO Auto-generated method stub
		ArrayList<MHSCBPStaff> training2Staffs = new ArrayList<MHSCBPStaff>();
		String sql = "select * from hsc_bp_staff where c_bpartner_id = ? and istraining2staff = 'Y'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getC_BPartner_ID());
			rs = pstmt.executeQuery();
			while(rs.next()){
				training2Staffs.add(new MHSCBPStaff(getCtx(),rs.getInt("hsc_bp_staff_id"),get_TrxName()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return training2Staffs;
	}
	
	private int getRoleID(String roleName){
		int roleID = 0;
		String sql = 	"select ad_role_id from ad_role where name = ?";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setString (1, roleName);
			ResultSet rs = pstmt.executeQuery ();
			
			if (rs.next ())
			{
				roleID = rs.getInt("ad_role_id");
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		return roleID;
	}
	

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
//		log.info("before save");
//		MMBPartner bpartner;
//		
//		if (newRecord) { //new
//			bpartner = new MMBPartner(this.getCtx());
//		}else{	//update
//			bpartner = new MMBPartner(this.getCtx(), this.getC_BPartner_ID(), this.get_TrxName());
//		}
//		bpartner.setName(this.getName());
//		bpartner.setName2(this.getName2());
//		
//		bpartner.save();
//		this.setC_BPartner_ID(bpartner.get_ID());
//
//		if(newRecord){ // create default user
//			
//			MUser user = new MUser(bpartner);
//			user.setName(bpartner.get_ID()+"");
//			user.setPassword(bpartner.get_ID()+"");
//			user.save();
//			
//			//set user role
//			MUserRoles userRoles = new MUserRoles(this.getCtx(), user.get_ID(), this.getRoleID("Register User"), this.get_TrxName());
//			userRoles.save();
//			
//			MHSCBPStaff staff;
//			staff = new MHSCBPStaff(this.getCtx(), 0, this.get_TrxName());
////			staff.save();
//			staff.setC_BPartner_ID(bpartner.get_ID());
//			staff.setLoginName(user.getName());
//			staff.setAD_User_ID(user.get_ID());
//			staff.setIsContactPerson(true);
//			staff.setIsLeader(false);
//			staff.save();
//		}

		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
//		log.info("after save");
//		log.info("new record : " + newRecord);

		return super.afterSave(newRecord, success);
	}
	@Override
	protected boolean beforeDelete() {
		// TODO Auto-generated method stub
		MMBPartner partner = getBPartner();
		//delete AD_User
		partner.deleteAllUsers();
		//delete BP_Staff
		partner.deleteAllBPStaffs();
		//delete C_BPartner
		//spartner.delete(true);
		
		return super.beforeDelete();
	}
	public MMBPartner getBPartner(){
		
		return new MMBPartner(this.getCtx(), getC_BPartner_ID(), this.get_TrxName());
	}


	public void addStaffs(MHSCBPStaff[] staffs) {
		// TODO Auto-generated method stub
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].setC_BPartner_ID(getC_BPartner_ID());
			staffs[i].save();
		}
	}
	

	
	
}
