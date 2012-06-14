package com.ttt.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.util.DB;

public class MTTTQuestionLine extends X_TTT_Question_Line {

	public MTTTQuestionLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTTTQuestionLine(Properties ctx, int TTT_Question_Line_ID,
			String trxName) {
		super(ctx, TTT_Question_Line_ID, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("Standard Constructor : " + this.getClass().getName());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static ArrayList<Integer> getQuestionLineIds(int questionId) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lineIDs = new ArrayList<Integer>();
		String sql = 	"select TTT_Question_Line_ID from TTT_Question_Line where TTT_Question_ID = ?";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, questionId);
			ResultSet rs = pstmt.executeQuery ();
			
			while (rs.next ())
			{
				lineIDs.add(rs.getInt("TTT_Question_Line_ID"));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			
		}
		
		return lineIDs;
	}

}
