package org.hsc.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHSCCertification extends X_HSC_Certification {

	
	public MHSCCertification(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCCertification(Properties ctx, int HSC_Certification_ID,
			String trxName) {
		super(ctx, HSC_Certification_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
}
