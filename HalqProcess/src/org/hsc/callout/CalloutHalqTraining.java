package org.hsc.callout;   

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

public class CalloutHalqTraining extends CalloutEngine {
	public String trainingType(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value) {
		System.out.println("Training type : " + value.toString());

		if("1".equals(value.toString())){
			GridField field = mTab.getField("C_BPartner_ID");
			field.setValue(0,true);
			field.setDisplayed(false);
		}else{
			GridField field = mTab.getField("C_BPartner_ID");
			field.setDisplayed(true);
		}
		return null;
	}
}
