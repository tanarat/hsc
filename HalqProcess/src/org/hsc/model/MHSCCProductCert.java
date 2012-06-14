package org.hsc.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHSCCProductCert extends X_HSC_C_Product_Cert {

	public MHSCCProductCert(Properties ctx, int HSC_C_Product_Cert_ID,
			String trxName) {
		super(ctx, HSC_C_Product_Cert_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCCProductCert(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
