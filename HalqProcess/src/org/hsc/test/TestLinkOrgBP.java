package org.hsc.test;

import org.compiere.model.MOrg;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.hsc.model.MHSCProductBOM;

public class TestLinkOrgBP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.compiere.Adempiere.startupEnvironment(true);
		int AD_Org_ID = 1000002;
		MOrg org = new MOrg (Env.getCtx(), AD_Org_ID, null);
		System.out.println("Org Name : " + org.getName());
		System.out.println("Linked BP ID : " + org.getLinkedC_BPartner_ID(null));
		
		
	}

}
