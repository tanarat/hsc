package org.hsc.process;  

import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCHalqApprove;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MMBPartner;
import org.hsc.utils.HSCSendMail;

public class ApproveBP extends SvrProcess{

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MHSCHalqApprove approveBP = new MHSCHalqApprove(getCtx(), getRecord_ID(), get_TrxName());
		MHSCHalqProject project = new MHSCHalqProject(getCtx(), approveBP.getHSC_Halq_Project_ID(), get_TrxName());
		MMBPartner bpartner = new MMBPartner(getCtx(), approveBP.getC_BPartner_ID(), get_TrxName());
		HSCSendMail hscSendMail = new HSCSendMail();
		
		hscSendMail.sendApproveMail(project,bpartner); 
//			throw new Exception("Send Approve email failed");
		return "Send Approve email completed";
		
	}

}
