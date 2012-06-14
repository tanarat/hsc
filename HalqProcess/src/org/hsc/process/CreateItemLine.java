package org.hsc.process;  

import javax.swing.JOptionPane;

import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCEvalPaper;
import org.hsc.model.X_HSC_Eval_Paper;

public class CreateItemLine extends SvrProcess{

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		int paperID = getRecord_ID();
		MHSCEvalPaper paper = new MHSCEvalPaper(getCtx(), paperID, get_TrxName());
		paper.createItemLine();
		return null;
	}

}
