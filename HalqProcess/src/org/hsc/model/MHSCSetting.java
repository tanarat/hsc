package org.hsc.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import org.compiere.util.DB;
import org.compiere.util.Env;



public class MHSCSetting extends X_HSC_Setting {

	public MHSCSetting(Properties ctx, int HSC_Setting_ID, String trxName) {
		super(ctx, HSC_Setting_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	

	public MHSCSetting(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static MHSCSetting getDefaultSetting() {
		// TODO Auto-generated method stub
		MHSCSetting defaultSetting = null;
		
		String sql = "select * from hsc_setting where name = 'default'";
		Statement stmt = DB.createStatement();
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next())
				defaultSetting = new MHSCSetting(Env.getCtx(), rs, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return defaultSetting;
	}
	public static void increaseNextCertSeq(String settingName){
		
	}
	public static void increaseNextCertSeq(){
		MHSCSetting setting = getDefaultSetting();
		int x = setting.getNext_Cert_Seq().intValue();
		x+=1;
		setting.setNext_Cert_Seq(new BigDecimal(x));
		setting.save();
	}
}
