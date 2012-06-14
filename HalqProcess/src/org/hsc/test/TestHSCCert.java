package org.hsc.test;

import static org.junit.Assert.*;

import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.util.Env;
import org.hsc.model.MHSCHalqCert;
import org.hsc.model.MHSCHalqProject;
import org.junit.Before;
import org.junit.Test;

public class TestHSCCert {
	Properties ctx = Env.getCtx();
	int project_ID = 1000008;
	int bpartner_ID = 1000120;
	MHSCHalqProject project;
	MBPartner bpartner;

	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
		project = new MHSCHalqProject(ctx, project_ID, null);
		bpartner = new MBPartner(ctx, bpartner_ID, null);
	}
	@Test
	public void testGetAreaCode() {
		System.out.println("Test getAreaCode");
		MBPartnerLocation bpLoc = bpartner.getLocationByName("factory");
		MLocation factory = bpLoc.getLocation(true);
		int city_ID = factory.getC_City_ID();
		int areaCode = MHSCHalqCert.getAreaCode(city_ID);
		assertEquals(10, areaCode);
	}
	@Test
	public void testGenCertNo() {
		System.out.println("Test getCerNo");
		int HSC_Halq_Cert_ID = 1000007; 
		MHSCHalqCert cert = new MHSCHalqCert(ctx, HSC_Halq_Cert_ID, null);
		System.out.println(cert.genCertNo(project,bpartner));
	}
	@Test
	public void testGetNextCertSeq() {
		System.out.println("Test getNextCertSeq");
		assertEquals(1, MHSCHalqCert.getNextCertSeq());
	}


}
