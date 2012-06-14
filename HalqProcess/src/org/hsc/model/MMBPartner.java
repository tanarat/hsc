package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.model.MUser;
import org.compiere.util.DB;

public class MMBPartner extends MBPartner {

	public MMBPartner(Properties ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	public MMBPartner(Properties ctx, int C_BPartner_ID, String trxName) {
		// TODO Auto-generated constructor stub
		super(ctx, C_BPartner_ID, trxName);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MUser getUser(){
		MUser user = null;
		String sql = "select ad_user_id from ad_user where c_bpartner_id = ?";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, get_TrxName());
		try {
			pstmt.setInt(1, getC_BPartner_ID());
			rs = pstmt.executeQuery();
			rs.next();
			user = new MUser(getCtx(),rs.getInt(1),get_TrxName());
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
		
		return user;
	}
	public String getContactName(){
		String fullName = "";
		String sql = 	"select name || ' ' || lastname as fullName " +
						"from hsc_bp_staff " +
						"where ad_user_id in (select ad_user_id from ad_user where c_bpartner_id = ? ) " +
								"and isContactPerson = 'Y'";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_BPartner_ID());
			ResultSet rs = pstmt.executeQuery ();
			
			if (rs.next ())
			{
				fullName = rs.getString("fullName");
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		return fullName;
	}
	public MUser getHSCContact(){
		String sql = "select ad_user_id " +
				"from hsc_bp_staff " +
				"where ad_user_id in (select ad_user_id from ad_user where c_bpartner_id = ? ) " +
				"and isContactPerson = 'Y'";
				
		PreparedStatement pstmt = null;
		int userId = 0;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_BPartner_ID());
			ResultSet rs = pstmt.executeQuery ();
			
			if (rs.next ())
			{
				userId = rs.getInt("ad_user_id");
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		if(userId != 0)
			return new MUser(getCtx(), userId, get_TrxName());
		else
			return null;
	}
	public boolean deleteAllUsers(){
		return true;
	}
	public boolean deleteAllBPStaffs(){
		return true;
	}
	public MBPartnerLocation getLocation(String locationName){
		MBPartnerLocation locations[] = this.getLocations(true);
		for (int i = 0; i < locations.length; i++) {
			if(locationName.equals(locations[i].getName())){
				return locations[i];
			}
		}
		return null;
	}
	public int getHSC_BP_ID(){
		int hsc_bp_id = 0;
		String sql = 	"select hsc_bp_id from hsc_bp where c_bpartner_id = ?";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, get_ID());
			ResultSet rs = pstmt.executeQuery ();
			
			if (rs.next ())
			{
				hsc_bp_id = rs.getInt("hsc_bp_id");
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		
		return hsc_bp_id;
	}
	public MHSCBP getHSC_BP(){
		MHSCBP hsc_bp = null;
		String sql = 	"select hsc_bp_id from hsc_bp where c_bpartner_id = ?";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, get_ID());
			ResultSet rs = pstmt.executeQuery ();
			
			if (rs.next ())
			{
				int hsc_bp_id = rs.getInt("hsc_bp_id");
				hsc_bp = new MHSCBP(getCtx(), hsc_bp_id, get_TrxName());
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		
		return hsc_bp;
	}
	
	public MHSCBP getHSCBP() {
		// TODO Auto-generated method stub
		MHSCBP hscbp = null;
		String sql = "select * from hsc_bp where c_bpartner_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = DB.prepareStatement(sql, null);
		try {
			
			pstmt.setInt(1, get_ID());
			rs = pstmt.executeQuery();
			if(rs.next())
				hscbp = new MHSCBP(getCtx(), rs.getInt("HSC_BP_ID"), get_TrxName());
			
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
		
		return hscbp;
	}
}
