package com.ttt.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MTTTAnswersheetLine extends X_TTT_Answersheet_Line {

	public MTTTAnswersheetLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTTTAnswersheetLine(Properties ctx, int TTT_Answersheet_Line_ID,
			String trxName) {
		super(ctx, TTT_Answersheet_Line_ID, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("Standard Constructor : " + this.getClass().getName());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
