package org.hsc.test;

import static org.junit.Assert.*;

import org.compiere.util.Env;
import org.junit.Before;
import org.junit.Test;

import com.ttt.model.MTTTQuestion;

public class TestMTTTQuestion {

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
	}

	@Test
	public void testCorrectAnswer() {
		int question_ID = 1000001;
		MTTTQuestion question = new MTTTQuestion(Env.getCtx(), question_ID, null);
		int[] answers = question.correctAnswer();
		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);
		}
		
	}

}
