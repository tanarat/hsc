package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.compiere.util.DB;

public class MHSCEvalTmpl extends X_HSC_Eval_Tmpl {

	public MHSCEvalTmpl(Properties ctx, int HSC_Eval_Tmpl_ID, String trxName) {
		super(ctx, HSC_Eval_Tmpl_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Integer> getEvalItemIDs() {
		// TODO Auto-generated method stub
		ArrayList<Integer> evalItemIDs = new ArrayList<Integer>();
		String sql = "select hsc_eval_item_id from hsc_eval_tmpl_item where hsc_eval_tmpl_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			
			pstmt.setInt(1, getHSC_Eval_Tmpl_ID());
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
