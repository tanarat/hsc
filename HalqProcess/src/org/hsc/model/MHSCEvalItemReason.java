package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.compiere.util.DB;

public class MHSCEvalItemReason extends X_HSC_Eval_Item_Reason {

	public MHSCEvalItemReason(Properties ctx, int HSC_Eval_Item_Reason_ID,
			String trxName) {
		super(ctx, HSC_Eval_Item_Reason_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<Integer> getItemReasonIDs(int itemID) {
		// TODO Auto-generated method stub
		ArrayList<Integer> itemReasonIDs = new ArrayList<Integer>();
		String sql = "select hsc_eval_item_reason_id from hsc_eval_item_reason where hsc_eval_item_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, null);
		try {
			
//			pstmt.setInt(1, getHSC_Eval_Item_ID());
			pstmt.setInt(1, itemID);
			rs = pstmt.executeQuery();
			while(rs.next()){
				itemReasonIDs.add(rs.getInt("HSC_Eval_Item_Reason_ID"));
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
		
		return itemReasonIDs;
	}
}
