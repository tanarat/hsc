package org.hsc.test;

import static org.junit.Assert.*;

import java.util.Properties;

import org.compiere.model.MProduct;
import org.compiere.util.Env;
import org.hsc.model.MHSCCCertificate;
import org.hsc.model.MHSCCertification;
import org.junit.Before;
import org.junit.Test;

public class TestMHSCCCertificate {
	Properties ctx;
	@Before
	public void setUp() throws Exception {
		org.compiere.Adempiere.startupEnvironment(true);
		ctx = Env.getCtx();
	}
	@Test
	public void testCreateFrom() {
		int productID = 1000001;
		MProduct product = new MProduct(ctx, productID, null);
		MHSCCertification certs[] = product.getCertificates(true);
		assertEquals(2, certs.length);
		MHSCCCertificate[] centerCerts = MHSCCCertificate.createFrom(certs,ctx,null);
		assertEquals(2, centerCerts.length);
		
	}

}
