package org.hsc.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.Query;

import com.ttt.model.MTTTAnswersheet;

public class MHSCHalqTraining extends X_HSC_Halq_Training {

	
	public MHSCHalqTraining(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCHalqTraining(Properties ctx, int HSC_Halq_Training_ID,
			String trxName) {
		super(ctx, HSC_Halq_Training_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		if("1".equals(getTraining_Type())){
			setC_BPartner_ID(0);
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		System.out.println("MHSCHalqTraining --> afterSave " + newRecord);
		if(newRecord && "1".equals(getTraining_Type())){
			genBPStaffTraining1();
		}else if(newRecord && "2".equals(getTraining_Type())){
			genBPStaffTraining2();
		}
		return super.afterSave(newRecord, success);
	}

	private void genBPStaffTraining2() {
		// TODO Auto-generated method stub
		if("2".equals(getTraining_Type()) && (getC_BPartner_ID() != 0)) {
			MBPartner bp = new MBPartner(getCtx(), getC_BPartner_ID(), get_TrxName());
//			MHSCBP hscbp = bp.getHSCBP();
//			MHSCBP hscbp = MHSCBP.getHSCBP(getC_BPartner_ID());
			addStaffTraining2(bp);
		}
	}

//	private void addStaffTraining2(MHSCBP hscbp) {
//		// TODO Auto-generated method stub
//		ArrayList<MHSCBPStaff> training2Staff = hscbp.getTraining2Staff();
//		for (Iterator iterator2 = training2Staff.iterator(); iterator2.hasNext();) {
//			MHSCBPStaff staff = (MHSCBPStaff) iterator2.next();
//			log.info("\t"+staff.getName());
//			X_HSC_Staff_Training staffTraining = new X_HSC_Staff_Training(this.getCtx(), 0, this.get_TrxName());
//			staffTraining.setHSC_Halq_Training_ID(getHSC_Halq_Training_ID());
//			staffTraining.setHSC_BP_Staff_ID(staff.get_ID());
//			staffTraining.save();
//		}
//	}

	private void addStaffTraining2(MBPartner bp){
		MHSCBPStaff[] staffs =  bp.getTraining2Staff(getHSC_Halq_Project_ID());
		for (int i = 0; i < staffs.length; i++) {
			int training_ID = getHSC_Halq_Training_ID();
			int staff_ID = staffs[i].get_ID();
			if(!has(staff_ID)){
				X_HSC_Staff_Training staffTraining = new X_HSC_Staff_Training(this.getCtx(), 0, this.get_TrxName());
				staffTraining.setHSC_Halq_Training_ID(training_ID);
				staffTraining.setHSC_BP_Staff_ID(staff_ID);
				staffTraining.save();
			}
		}
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String genBPStaffTraining1(){
		// generate ผู้เข้าร่วมอบรม 
		
		if(!"1".equals(getTraining_Type())){
			return null;
		}else{
			MHSCHalqProject project = getHSC_Halq_Project();
//			ArrayList<MHSCBP> approvedHSCBPs = project.getApprovedBPs();
			MBPartner[] approvedBPs = project.getApprovedBPs(true);
			for (int i = 0; i < approvedBPs.length; i++) {
				addStaffTraining1(approvedBPs[i]);
			}
//			for (Iterator iterator = approvedHSCBPs.iterator(); iterator.hasNext();) {
//				MHSCBP hscbp = (MHSCBP) iterator.next();
//				log.info(hscbp.getName());
//				addStaffTraining1(hscbp);
//			}
			return "OK";
		}
	}
	private void addStaffTraining1(MBPartner bp){
		MHSCBPStaff[] staffs =  bp.getTraining1Staff(getHSC_Halq_Project_ID());
		for (int i = 0; i < staffs.length; i++) {
			int training_ID = getHSC_Halq_Training_ID();
			int staff_ID = staffs[i].get_ID();
			if(!has(staff_ID)){
				X_HSC_Staff_Training staffTraining = new X_HSC_Staff_Training(this.getCtx(), 0, this.get_TrxName());
				staffTraining.setHSC_Halq_Training_ID(training_ID);
				staffTraining.setHSC_BP_Staff_ID(staff_ID);
				staffTraining.save();
			}
		}
		
	}
	private boolean has(int staff_ID){
		String tableName = "HSC_Staff_Training";
		String whereClause = "IsActive = 'Y' and HSC_Halq_Training_ID = ? and HSC_BP_Staff_ID = ?";
		List<X_HSC_Staff_Training> staffsTraining =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
								.setParameters(getHSC_Halq_Training_ID(),staff_ID).list();
		if(staffsTraining != null && staffsTraining.size() > 0)
			return true;
		else
			return false;
	}
	@Deprecated
	private void addStaffTraining1(MHSCBP hscbp) {
		// TODO Auto-generated method stub
		ArrayList<MHSCBPStaff> training1Staff = hscbp.getTraining1Staff(getHSC_Halq_Project_ID());
		for (Iterator iterator2 = training1Staff.iterator(); iterator2.hasNext();) {
			MHSCBPStaff staff = (MHSCBPStaff) iterator2.next();
			log.info("\t"+staff.getName());
			X_HSC_Staff_Training staffTraining = new X_HSC_Staff_Training(this.getCtx(), 0, this.get_TrxName());
			staffTraining.setHSC_Halq_Training_ID(getHSC_Halq_Training_ID());
			staffTraining.setHSC_BP_Staff_ID(staff.get_ID());
			staffTraining.save();
		}
	}
	@Override
	public MHSCHalqProject getHSC_Halq_Project() throws RuntimeException {
		// TODO Auto-generated method stub
		return new MHSCHalqProject(getCtx(), getHSC_Halq_Project_ID(), get_TrxName());
	}
	private MHSCBPStaff[] staffsTraining = null;
	public MHSCBPStaff[] getStaffTraining(boolean reload){
		if(reload || staffsTraining == null){
			String tableName = "HSC_BP_Staff";
			String whereClause = "HSC_BP_Staff_ID in( select HSC_BP_Staff_ID from HSC_Staff_Training where HSC_Halq_Training_ID = ? and IsActive = 'Y' )";
			List<MHSCBPStaff> staffs =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
									.setParameters(getHSC_Halq_Training_ID()).list();
			staffsTraining = staffs.toArray(new MHSCBPStaff[staffs.size()]);
		}
		return staffsTraining;
	}
	public MHSCBPStaff[] getStaffTraining(int bpartner_ID){
		
			String tableName = "HSC_BP_Staff";
			String whereClause = "HSC_BP_Staff_ID in( select HSC_BP_Staff_ID from HSC_Staff_Training where HSC_Halq_Training_ID = ? and IsActive = 'Y' ) and C_BPartner_ID = ? ";
			List<MHSCBPStaff> staffs =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
									.setParameters(getHSC_Halq_Training_ID(),bpartner_ID).list();
			return staffs.toArray(new MHSCBPStaff[staffs.size()]);
	}
	
	public MTTTAnswersheet getAnswerSheet(int staff_ID, int question_ID){
		//select * from ttt_answersheet where hsc_halq_training_id = 1000036 and hsc_bp_staff_id = 1000360 and ttt_question_id = 1000001
		String tableName = MTTTAnswersheet.Table_Name;
		String whereClause = "hsc_halq_training_id = ? and hsc_bp_staff_id = ? and ttt_question_id = ?";
		List<MTTTAnswersheet> sheets =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
								.setParameters(getHSC_Halq_Training_ID(),staff_ID,question_ID).list();
		
		if(sheets != null && sheets.size() > 0)
			return sheets.get(0);
		else
			return null;
	}
	
}
