package org.hsc.process;

import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCHalqProject;
import org.hsc.utils.HSCSendMail;

public class ApproveAllBP extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MHSCHalqProject project = new MHSCHalqProject(getCtx(), getRecord_ID(), get_TrxName());
		HSCSendMail hscSendMail = new HSCSendMail();
		hscSendMail.sendApproveMail(project,null); 
		return "Send Approve email completed";
	}

}
