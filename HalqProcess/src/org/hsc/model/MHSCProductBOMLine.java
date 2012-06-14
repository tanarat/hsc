package org.hsc.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MHSCProductBOMLine extends X_HSC_Product_BOMLine {

	public MHSCProductBOMLine(Properties ctx, int HSC_Product_BOMLine_ID,
			String trxName) {
		super(ctx, HSC_Product_BOMLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MHSCProductBOMLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
