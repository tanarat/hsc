package org.hsc.test;

import static org.junit.Assert.*;

import org.hsc.model.MHSCEmailLog;
import org.hsc.utils.HSCEMail;
import org.hsc.utils.HSCSendMail;
import org.hsc.utils.HSCSendMailException;
import org.junit.Before;
import org.junit.Test;

public class TestHSCEMail {

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
	}

	@Test
	public void testSend() {
		HSCEMail mail = new HSCEMail();
		try {
			mail.send();
		} catch (HSCSendMailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
