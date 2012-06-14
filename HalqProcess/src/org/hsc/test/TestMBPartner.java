package org.hsc.test;

import static org.junit.Assert.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.util.Env;
import org.junit.Before;
import org.junit.Test;

public class TestMBPartner {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetLocationByName() {
//		fail("Not yet implemented");
		org.compiere.Adempiere.startupEnvironment(true);
		MBPartner bpartner = new MBPartner(Env.getCtx(), 1000074, null);
		MBPartnerLocation bploc = bpartner.getLocationByName("factory");
		if(bploc != null){ 
		MLocation loc = bploc.getLocation(true);
		System.out.println(bploc.getName());
		System.out.println(loc.toString());
		}else{
			System.out.println("not found");
		}
		
	}
	

}
