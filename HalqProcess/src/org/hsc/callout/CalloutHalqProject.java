package org.hsc.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MUser;
import org.compiere.util.Env;
import org.hsc.model.MHSCBP;
import org.hsc.model.MMBPartner;

public class CalloutHalqProject extends CalloutEngine {
	public String changeBP(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value) {
		System.out.println("WindowNo = " + WindowNo);
		System.out.println("C_BPartner_ID = " + Env.getContextAsInt(Env.getCtx(), WindowNo, "C_BPartner_ID"));
		
//		if (value != null) {
//			int C_BPartner_ID = Integer.valueOf(value.toString());
////			System.out.println("C_Bpartner_ID = " + C_BPartner_ID);
////			System.out.println("Value : " + value.toString());
//			MBPartner bp = new MBPartner(ctx, C_BPartner_ID, null);
//			MUser[] contacts = bp.getContacts(true);
//			if (contacts != null && contacts.length != 0) {
//				MUser user = contacts[0];
//				if (user != null) {
//					String cname = user.getName();
//					mTab.setValue("ContactPerson", (cname == null) ? "" : cname);
//					String cmail = user.getEMailUser();
//					mTab.setValue("ContactEmail", (cmail == null) ? "" : cmail);
//					return null;
//				}
//			}
//		}
//		mTab.setValue("ContactPerson", "");
//		mTab.setValue("ContactEmail", "");
		return null;
	}

	public String changeHSCBP(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value) {

		int HSC_BP_ID = Env.getContextAsInt(ctx, WindowNo, "HSC_BP_ID");
		if (HSC_BP_ID == 0)
			return "";
		MHSCBP hscBP = new MHSCBP(ctx, HSC_BP_ID, null);

		MMBPartner bpartner = new MMBPartner(ctx, hscBP.getC_BPartner_ID(),
				null);

		MUser user = bpartner.getHSCContact();
		if (user != null) {
			String bname = bpartner.getName();
			mTab.setValue("Name", (bname == null) ? "" : bname);
			log.info("bp name : " + bname);
			String cname = bpartner.getContactName();
			mTab.setValue("ContactPerson", (cname == null) ? "" : cname);
			log.info("contact name : " + cname);
			String cmail = user.getEMailUser();
			mTab.setValue("ContactEmail", (cmail == null) ? "" : cmail);
			log.info("contact mail : " + cmail);
		}
		return null;
	}

}
