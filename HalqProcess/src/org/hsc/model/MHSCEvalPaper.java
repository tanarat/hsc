package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.compiere.util.DB;

public class MHSCEvalPaper extends X_HSC_Eval_Paper {

	public MHSCEvalPaper(Properties ctx, int HSC_Eval_Paper_ID, String trxName) {
		super(ctx, HSC_Eval_Paper_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
//		if (newRecord) {
//			X_HSC_Eval_Tmpl tmpl = (X_HSC_Eval_Tmpl) getHSC_Eval_Tmpl();
//			ArrayList<Integer> evalItemIDs = tmpl.getEvalItemIDs();
//			for (Integer evalItemID : evalItemIDs) {
//
//				// Create Paper line with all IDs
//				X_HSC_Paper_Line paperLine = new X_HSC_Paper_Line(getCtx(), 0,
//						get_TrxName());
//				paperLine.setHSC_Eval_Paper_ID(getHSC_Eval_Paper_ID());
//				paperLine.setHSC_Eval_Item_ID(evalItemID);
//				paperLine.setName(getHSC_Eval_Paper_ID() + "-" + evalItemID);
//				paperLine.save();
//				System.out.println("--> " + evalItemID);
//			}
//		}
		return super.afterSave(newRecord, success);
	}

	public void createItemLine() {
//		X_HSC_Eval_Tmpl tmpl = (X_HSC_Eval_Tmpl) getHSC_Eval_Tmpl();
		MHSCEvalTmpl tmpl = new MHSCEvalTmpl(getCtx(), getHSC_Eval_Tmpl_ID(), get_TrxName());
		ArrayList<Integer> tmplItemIDs = tmpl.getEvalItemIDs();
		ArrayList<Integer> existItemIDs = this.getEvalItemIDs();
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		s1.addAll(tmplItemIDs);
		System.out.println(Arrays.toString(s1.toArray()));
		s2.addAll(existItemIDs);
		System.out.println(Arrays.toString(s2.toArray()));
		s1.removeAll(s2);
		System.out.println(Arrays.toString(s1.toArray()));
		
		for (Integer evalItemID : s1) {

			// Create Paper line with all IDs
			X_HSC_Paper_Line paperLine = new X_HSC_Paper_Line(getCtx(), 0,
					get_TrxName());
			paperLine.setHSC_Eval_Paper_ID(getHSC_Eval_Paper_ID());
			paperLine.setHSC_Eval_Item_ID(evalItemID);
			paperLine.setName(getHSC_Eval_Paper_ID() + "-" + evalItemID);
			paperLine.save();
			int paperLineID = paperLine.get_ID();
			ArrayList<Integer> reasonIDs = MHSCEvalItemReason.getItemReasonIDs(evalItemID);
			for (Iterator<Integer> iterator = reasonIDs.iterator(); iterator.hasNext();) {
				Integer reasonID = (Integer) iterator.next();
				MHSCPaperLineReason lineReason = new MHSCPaperLineReason(getCtx(), 0, get_TrxName());
				lineReason.setHSC_Paper_Line_ID(paperLineID);
				lineReason.setHSC_Eval_Item_Reason_ID(reasonID);
				lineReason.save();
			}
			System.out.println("--> " + evalItemID);
		}
	}
	public ArrayList<Integer> getEvalItemIDs() {
		// TODO Auto-generated method stub
		ArrayList<Integer> evalItemIDs = new ArrayList<Integer>();
		String sql = "select hsc_eval_item_id from hsc_paper_line where hsc_eval_paper_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getHSC_Eval_Paper_ID());
			rs = pstmt.executeQuery();
			while(rs.next()){
				evalItemIDs.add(rs.getInt("HSC_Eval_Item_ID"));
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
		
		return evalItemIDs;
	}

}
