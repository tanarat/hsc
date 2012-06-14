package org.hsc.test;

import static org.junit.Assert.*;

import org.compiere.util.Env;
import org.hsc.model.MHSCBPStaff;
import org.hsc.model.MHSCHalqTraining;
import org.junit.Before;
import org.junit.Test;

import com.ttt.model.MTTTAnswersheet;

public class TestMHSCHalqTraining {

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
	}

	@Test
	public void testGetStaffTraining() {
		
		int HSC_Halq_Training_ID = 1000036;
		MHSCHalqTraining training = new MHSCHalqTraining(Env.getCtx(), HSC_Halq_Training_ID, null);
		MHSCBPStaff[] staffs = training.getStaffTraining(1000074);
		assertEquals(1, staffs.length);
		
		
	}
	
	@Test
	public void testGetAnswersheet(){
		int HSC_Halq_Training_ID = 1000036;
		MHSCHalqTraining training = new MHSCHalqTraining(Env.getCtx(), HSC_Halq_Training_ID, null);
		int staff_ID = 1000360;
		int question_ID = 1000001;
		MTTTAnswersheet sheet = training.getAnswerSheet(staff_ID, question_ID);
		assertEquals(1000068, sheet.get_ID());
	}

}
