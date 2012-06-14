package com.ttt.model;

import java.sql.ResultSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;

public class MTTTQuestion extends X_TTT_Question {
//	private MTTTQuestionLine lines[] = null;

	public MTTTQuestion(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("========================= constructor 1====================");
	}

	public MTTTQuestion(Properties ctx, int TTT_Question_ID, String trxName) {
		super(ctx, TTT_Question_ID, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("========================= constructor 2====================");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MTTTQuestionLine[] getQuestionLines(){
		String tableName = MTTTQuestionLine.Table_Name;
		String whereClause = "IsActive = 'Y' and TTT_Question_ID = ?";
		List<MTTTQuestionLine> lines =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
								.setParameters(getTTT_Question_ID()).list();
		return lines.toArray(new MTTTQuestionLine[lines.size()]);
	}
	public int[] correctAnswer(){
		
		MTTTQuestionLine[] lines = getQuestionLines();
		int[] answers = new int[lines.length];
		for (int i = 0; i < lines.length; i++) {
			answers[i] = lines[i].getCorrect_Answer();
		}
		return answers;
		
	}
	
	public Hashtable<Integer, Integer> getCorrectAnswer(){
		Hashtable<Integer, Integer> correctAnswer = new Hashtable<Integer, Integer>();
		MTTTQuestionLine[] lines = getQuestionLines();
		for (int i = 0; i < lines.length; i++) {
			correctAnswer.put(lines[i].getTTT_Question_Line_ID(), lines[i].getCorrect_Answer());
		}
		return correctAnswer;
		
	}

}
