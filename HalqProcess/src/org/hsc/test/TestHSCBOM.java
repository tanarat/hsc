package org.hsc.test;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.hsc.model.MHSCProductBOM;

public class TestHSCBOM {
	public static void main(String args[]) {
		
		org.compiere.Adempiere.startupEnvironment(true);
		String Table_Name = "HSC_Product_BOM";
		int HSC_Request_Product_ID = 1000008;
		MHSCProductBOM hscBOM = new Query(Env.getCtx(), Table_Name,
				"HSC_Request_Product_ID=?", null)
				.setParameters(new Object[] { HSC_Request_Product_ID}).firstOnly();
		System.out.println(hscBOM.getName());
		System.out.println("done");
		// If outside trx, then cache it
//		if (hscBOM != null && trxName == null) {
//			s_cache.put(hscBOM.get_ID(), hscBOM);
//		}
	}
}
