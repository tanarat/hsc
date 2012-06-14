package com.ttt.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;

public class MTTTAnswersheet extends X_TTT_Answersheet {

	public MTTTAnswersheet(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTTTAnswersheet(Properties ctx, int TTT_Answersheet_ID,
			String trxName) {
		super(ctx, TTT_Answersheet_ID, trxName);
		// TODO Auto-generated constructor stub
		System.out.println("Standard Constructor : "
				+ this.getClass().getName());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		if (newRecord) {
			int questionId = getTTT_Question_ID();
			ArrayList<Integer> questionLineIds = MTTTQuestionLine
					.getQuestionLineIds(questionId);
			for (Iterator<Integer> iterator = questionLineIds.iterator(); iterator
					.hasNext();) {
				Integer id = iterator.next();
				MTTTAnswersheetLine answersheetLine = new MTTTAnswersheetLine(
						getCtx(), 0, get_TrxName());
				answersheetLine.setTTT_Answersheet_ID(getTTT_Answersheet_ID());
				answersheetLine.setTTT_Question_Line_ID(id);
				answersheetLine.setName(getName() + " - " + id);
				answersheetLine.save();
			}
		}
		return super.afterSave(newRecord, success);
	}
	public MTTTAnswersheetLine[] getAnswersheetLines(){
		String tableName = MTTTAnswersheetLine.Table_Name;
		String whereClause = "IsActive = 'Y' and TTT_Answersheet_ID = ?";
		List<MTTTAnswersheetLine> lines =  new Query(this.p_ctx, tableName, whereClause, this.get_TrxName())
								.setParameters(getTTT_Answersheet_ID()).list();
		return lines.toArray(new MTTTAnswersheetLine[lines.size()]);
	}
	public int[] selectAnswers(){
		
		MTTTAnswersheetLine[] lines = getAnswersheetLines();
		int[] answers = new int[lines.length];
		for (int i = 0; i < lines.length; i++) {
			answers[i] = lines[i].getSelected_Answer();
		}
		return answers;
		
	}
	public Hashtable<Integer, Integer> getSelectedAnswer(){
		Hashtable<Integer, Integer> selectedAnswer = new Hashtable<Integer, Integer>();
		MTTTAnswersheetLine[] lines = getAnswersheetLines();
		for (int i = 0; i < lines.length; i++) {
			selectedAnswer.put(lines[i].getTTT_Question_Line_ID(), lines[i].getSelected_Answer());
		}
		return selectedAnswer;
		
	}
	public int mark(){
		/*what question*/
		MTTTQuestion question = new MTTTQuestion(getCtx(), getTTT_Question_ID(), get_TrxName());
		Hashtable<Integer,Integer> correctAnswer = question.getCorrectAnswer();
		Hashtable<Integer,Integer> selectedAnswer = getSelectedAnswer();
		
		int mark = 0;
		Enumeration<Integer> keys = selectedAnswer.keys();
		while (keys.hasMoreElements()) {
			Integer key = (Integer) keys.nextElement();
			if(correctAnswer.containsKey(key) && correctAnswer.get(key).intValue() == selectedAnswer.get(key).intValue()){
				mark++;
			}
		}
		
		
		return mark;
	}

}
