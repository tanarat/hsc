package org.hsc.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.hsc.model.MHSCHalqRegistrationForm;

public class CalloutHalqCert extends CalloutEngine {
	public String getCertType(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value) {
		GridField fProject = mTab.getField("HSC_Halq_Project_ID");
		GridField fBP = mTab.getField("C_BPartner_ID");
		if(fProject.getValue() != null && fBP.getValue() != null){
			System.out.println("Project : " + fProject.getValue());
			System.out.println("BPartner " + fBP.getValue());
			MHSCHalqRegistrationForm form = MHSCHalqRegistrationForm.getForm((Integer)fProject.getValue(), (Integer)fBP.getValue());
			GridField fBP_type = mTab.getField("Cert_Type");
			String certType = form.getCert_Type();
			if(certType != null){
//				System.out.println(form.getCert_Type());
				fBP_type.setValue(certType, true);
//				System.out.println(fBP_type.getValue());
			}
		}
			
		return "";
	}
	
}

//GridField[] fields = mTab.getFields();
//for (int i = 0; i < fields.length; i++) {
//	System.out.println(fields[i].getColumnName() + " " + fields[i].getValue());
//}
//System.out.println("=============");
