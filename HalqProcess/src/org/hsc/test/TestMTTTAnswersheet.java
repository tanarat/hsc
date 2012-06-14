package org.hsc.test;

import static org.junit.Assert.*;

import org.compiere.util.Env;
import org.junit.Before;
import org.junit.Test;

import com.ttt.model.MTTTAnswersheet;
import com.ttt.model.MTTTQuestion;

public class TestMTTTAnswersheet {

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
	}

	@Test
	public void testMark() {
		int sheet_ID = 1000068;
		MTTTAnswersheet sheet = new MTTTAnswersheet(Env.getCtx(), sheet_ID, null);
		
		assertEquals(2, sheet.mark());
		
	}

}
