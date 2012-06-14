package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.MMailText;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.hsc.model.X_HSC_Halq_Project;
import org.hsc.utils.HSCSendMail;


public class MHSCHalqProject extends X_HSC_Halq_Project {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MHSCHalqProject(Properties ctx, int hsc_halq_project_ID,
			String trxName) {
		super(ctx, hsc_halq_project_ID, trxName);
		// TODO Auto-generated constructor stub
		
	}
	@Deprecated
	public MMailText getApproveMText(){
		String table = MMailText.Table_Name;
		String whereClause = "IsActive = 'Y' and Name = ?";
		
		List<MMailText> mailTexts = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters("HSC Approve Mail").list();
		if(mailTexts == null || mailTexts.size() == 0)
			return null;
		else
			return mailTexts.get(0);
		/*
		if(this.getApprove_MailText_ID() == 0){
			
			return null;
		}
		return new MMailText(this.getCtx(),this.getApprove_MailText_ID(),this.get_TrxName());
		*/
	}
	@Deprecated
	public MMailText getInviteMText(){
		String table = MMailText.Table_Name;
		String whereClause = "IsActive = 'Y' and Name = ?";
		
		List<MMailText> mailTexts = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters("HSC Invite Mail").list();
		if(mailTexts == null || mailTexts.size() == 0)
			return null;
		else
			return mailTexts.get(0);
		/*
		if(this.getInvite_MailText_ID() == 0){ // Invite mail template for this project has not been set
			return null;
		}
		return new MMailText(this.getCtx(), this.getInvite_MailText_ID(), this.get_TrxName());
		*/
	}
	@Deprecated
	public MMailText getTraining1MText() {
		// TODO Auto-generated method stub
		String table = MMailText.Table_Name;
		String whereClause = "IsActive = 'Y' and Name = ?";
		
		List<MMailText> mailTexts = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters("HSC Training1 Mail").list();
		if(mailTexts == null || mailTexts.size() == 0)
			return null;
		else
			return mailTexts.get(0);
		
	}
	public MMailText getMailText(int mailType){
		String mailTextName = "";
		switch (mailType) {
		case HSCSendMail.INVITE_MAIL:
			mailTextName = "HSC Invite Mail";
			break;
		case HSCSendMail.APPROVE_MAIL:
			mailTextName = "HSC Approve Mail";
			break;
		case HSCSendMail.TRAINING1_MAIL:
			mailTextName = "HSC Training1 Mail";
			break;
		case HSCSendMail.TRAINING2_MAIL:
			mailTextName = "HSC Training2 Mail";
			break;
		case HSCSendMail.TRAINING1_REPORT_MAIL:
			mailTextName = "HSC Training1 Report Mail";
			break;
		case HSCSendMail.TRAINING2_REPORT_MAIL:
			mailTextName = "HSC Training2 Report Mail";
			break;
		default:
			return null;
		}
		String table = MMailText.Table_Name;
		String whereClause = "IsActive = 'Y' and Name = ?";
		
		List<MMailText> mailTexts = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters(mailTextName).list();
		if(mailTexts == null || mailTexts.size() == 0)
			return null;
		else
			return mailTexts.get(0);
	}

//	public MMailText getAppointmentMText() {
//		// TODO Auto-generated method stub
//		if(this.getAppointment_MailText_ID() == 0){ // Invite mail template for this project has not been set
//			return null;
//		}
//		return new MMailText(this.getCtx(), this.getAppointment_MailText_ID(), this.get_TrxName());
//	}
	
	
	/*
	 * Create register form for all BPs invited to this project
	 */
	public void createRegisterForm(){
		
	}
	
	public ArrayList<MHSCHalqProjectProspect> getProspect(){
		ArrayList<MHSCHalqProjectProspect> prospects = new ArrayList<MHSCHalqProjectProspect>();
		String sql = "select * from hsc_halq_project_prospect where hsc_halq_project_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getHSC_Halq_Project_ID());
			rs = pstmt.executeQuery();
			while(rs.next()){
				prospects.add(new MHSCHalqProjectProspect(getCtx(),rs.getInt("hsc_halq_project_prospect_id"),get_TrxName()));
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
		
		return prospects;
	}
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		this.log.info("Saved");
		System.out.println("--------Saved-------");
		return super.afterSave(newRecord, success);
	}
	
	private List<MBPartner> approvedBPs = null; 
	public MBPartner[] getApprovedBPs(boolean reload){
		if(approvedBPs == null || reload){
			final String whereClause = "c_bpartner_id in(select c_bpartner_id from hsc_halq_approve where hsc_halq_project_id = ?)";
			this.approvedBPs = new Query(getCtx(), MBPartner.Table_Name, whereClause, get_TrxName())
											.setParameters(new Object[]{getHSC_Halq_Project_ID()})
											.setOnlyActiveRecords(true)
//											.setOrderBy(MHSCProductBOMLine.COLUMNNAME_Line)
											.list();
		}
		return this.approvedBPs.toArray(new MBPartner[this.approvedBPs.size()]);
	}
	
	@Deprecated
	public ArrayList<MHSCBP> getApprovedBPs() {
		// TODO Auto-generated method stub
		ArrayList<MHSCBP> hscBPs = new ArrayList<MHSCBP>();
		String sql = "select * from hsc_bp where c_bpartner_id in(select c_bpartner_id from hsc_halq_approve where hsc_halq_project_id = ?)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getHSC_Halq_Project_ID());
			rs = pstmt.executeQuery();
			while(rs.next()){
				hscBPs.add(new MHSCBP(getCtx(),rs.getInt("hsc_bp_id"),get_TrxName()));
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
		
		return hscBPs;
	}
	@Override
	public void setInvite_MailText_ID(int Invite_MailText_ID) {
		// TODO Auto-generated method stub
		super.setInvite_MailText_ID(Invite_MailText_ID);
		System.out.println("setInviteMail : " + Invite_MailText_ID);
	}
	public MUser getContactUser(MBPartner bpartner) {
		// TODO Auto-generated method stub
		String table_name = "HSC_Halq_Project_Prospect";
		String where = "HSC_Halq_Project_ID = ? and C_BPartner_ID = ?";
		Query query = new Query(this.getCtx(),table_name,where,this.get_TableName());
		query.setParameters(this.getHSC_Halq_Project_ID(),bpartner.getC_BPartner_ID());
		MHSCHalqProjectProspect prospect = query.firstOnly();
		return (MUser) prospect.getAD_User();
	}
	public MHSCHalqTraining getTraining1() {
		// TODO Auto-generated method stub
		String table = MHSCHalqTraining.Table_Name;
		String whereClause = "IsActive = 'Y' and hsc_halq_project_id = ? and training_type = ?";
		
		List<MHSCHalqTraining> training = new Query(getCtx(), table, whereClause, get_TrxName())
										.setParameters(this.get_ID(),1)
										.list();
		if(training == null || training.size() == 0)
			return null;
		else
			return training.get(0);
		
	}
	public MHSCHalqTraining getTraining2(int bpartner_ID) {
		// TODO Auto-generated method stub
		//select * from hsc_halq_training where IsActive = 'Y' and  training_type = '2' and hsc_halq_project_id = 1000008 and c_bpartner_id = 1000074
		String table = MHSCHalqTraining.Table_Name;
		String whereClause = "IsActive = 'Y' and training_type = ? and hsc_halq_project_id = ? and c_bpartner_id = ?";
		
		List<MHSCHalqTraining> training = new Query(getCtx(), table, whereClause, get_TrxName())
										.setParameters(2,this.get_ID(),bpartner_ID)
										.list();
		if(training == null || training.size() == 0)
			return null;
		else
			return training.get(0);
		
	}



	
	
}
