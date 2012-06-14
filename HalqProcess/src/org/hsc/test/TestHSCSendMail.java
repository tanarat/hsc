package org.hsc.test;

import static org.junit.Assert.*;

import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.util.Env;
import org.hsc.model.MHSCHalqProject;
import org.hsc.utils.HSCSendMail;
import org.hsc.utils.HSCSendMailException;
import org.junit.Before;
import org.junit.Test;

public class TestHSCSendMail {
	HSCSendMail hscSendMail;
	Properties ctx = Env.getCtx();
	String trxName = null;
	int projectID = 1000008;
	int bpartnerID = 1000074;
	
	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
		
	}

	@Test
	public void test() {
		HSCSendMail hscSendMail = new HSCSendMail();
		MHSCHalqProject project = new MHSCHalqProject(ctx, projectID, trxName);
		MBPartner bpartner = new MBPartner(ctx, bpartnerID, trxName);
		
		try {
			System.out.println("Test Send Mail");
			if(hscSendMail == null) System.out.println("null");
			hscSendMail.sendMail(project, bpartner, HSCSendMail.TRAINING1_REPORT_MAIL);
		} catch (HSCSendMailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
