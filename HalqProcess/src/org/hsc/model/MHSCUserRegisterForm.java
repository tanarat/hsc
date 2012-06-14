package org.hsc.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.compiere.util.DB;
import org.hsc.model.X_HSC_User_Register_Form;

public class MHSCUserRegisterForm extends X_HSC_User_Register_Form {

	public MHSCUserRegisterForm(Properties ctx, int HSC_User_Register_Form_ID,
			String trxName) {
		super(ctx, HSC_User_Register_Form_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCUserRegisterForm(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static boolean isExists(String userName) {
		boolean rs = false;
		String sql = "select * from hsc_user_register_form where username = ?";
		PreparedStatement pstmt = null;
		pstmt = DB.prepareStatement(sql, null);
		try {
			pstmt.setString(1, userName);
			ResultSet res = pstmt.executeQuery();
			rs = res.next();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public static int setFormId(String userName, int formId) {

		int rs = 0;

		if (!isExists(userName))
			return rs;

		String sql = "update hsc_user_register_form set hsc_halq_registration_form_id = ? where username = ?";
		PreparedStatement pstmt = DB.prepareStatement(sql, null);

		try {
			pstmt.setInt(1, formId);
			pstmt.setString(2, userName);
			rs = pstmt.executeUpdate();
			System.out.println("set form of user " + userName + " to " + formId
					+ " result " + rs);
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	public static int getFormId(String userName) {
		String sql = "select hsc_halq_registration_form_id from hsc_user_registrater_form where username = ?";
		PreparedStatement pstmt = null;
		pstmt = DB.prepareStatement(sql, null);
		int formId = 0;
		try {
			pstmt.setString(1, userName);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			formId = rs.getInt(1);
			System.out.println("userName " + userName);
			System.out.println("form id " + formId);
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return formId;
	}

}
