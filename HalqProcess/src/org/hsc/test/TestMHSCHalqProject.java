package org.hsc.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.compiere.model.MMailText;
import org.compiere.util.Env;
import org.hsc.model.MHSCBP;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqTraining;
import org.junit.Before;
import org.junit.Test;

public class TestMHSCHalqProject {

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
	}

	@Test
	public void testGetInviteMText() {
		
//		int projectID = 1000008;
//		MHSCHalqProject project = new MHSCHalqProject(Env.getCtx(), projectID, null);
//		MMailText inviteMail = project.getInviteMText();
//		System.out.println(inviteMail.getMailHeader());
//		MMailText approveMail = project.getApproveMText();
//		System.out.println(approveMail.getMailHeader());
	}
	@Test
	public void testGetTraining2(){
		int projectID = 1000008;
		int bpartnerID = 1000074;
		MHSCHalqProject project = new MHSCHalqProject(Env.getCtx(), projectID, null);
		MHSCHalqTraining training = project.getTraining2(bpartnerID);
		System.out.println(training.getName());
		assertEquals(1000009, training.get_ID());
	}
	
//	@Test
//	public void testInviteBPList() {
//		org.compiere.Adempiere.startupEnvironment(true);
////		int projectID = 1000008;
////		MHSCHalqProject project = new MHSCHalqProject(Env.getCtx(), projectID, null);
////		ArrayList<MHSCBP> inviteBPs = (ArrayList<MHSCBP>) project.inviteBPList();
////		assertEquals(1, inviteBPs.size());
////		MHSCBP bp = inviteBPs.get(0);
////		System.out.println(bp.getName());
////		System.out.println(bp.getName2());
////		assertEquals(1000017, bp.get_ID());
//	}

}
