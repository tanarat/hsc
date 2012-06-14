package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import org.compiere.util.DB;

public class MHSCHalqApprove extends X_HSC_Halq_Approve {

	public MHSCHalqApprove(Properties ctx, int HSC_Halq_Approve_ID,
			String trxName) {
		super(ctx, HSC_Halq_Approve_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static int getApproveIDFor(int formId){
//		boolean ret = false;
		int approveID = 0;
		String sql = 	"select * from hsc_halq_approve where hsc_halq_registration_form_id = ?";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql,null);
			pstmt.setInt (1, formId);
			ResultSet rs = pstmt.executeQuery ();
			rs.next ();
			approveID = rs.getInt("HSC_Halq_Approve_ID");
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			
//			log.log(Level.SEVERE, sql, e);
		}
		return approveID;
	}


	public MMBPartner getBPartner(){
		MMBPartner bpartner = null;
		String sql = "select * from c_bpartner where c_bpartner_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			pstmt.setInt(1, getC_BPartner_ID());
			rs = pstmt.executeQuery();
			rs.next();
			bpartner = new MMBPartner(getCtx(),rs.getInt("c_bpartner_id"),get_TrxName());
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
		return bpartner;
	}
}
