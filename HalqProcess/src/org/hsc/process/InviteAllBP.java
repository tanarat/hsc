package org.hsc.process;

import org.hsc.model.MHSCHalqProject;
import org.compiere.process.SvrProcess;
import org.hsc.utils.HSCSendMail;

public class InviteAllBP extends SvrProcess {
	int recordId;
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		this.recordId = getRecord_ID();
	}
	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MHSCHalqProject project = new MHSCHalqProject(getCtx(), recordId, get_TrxName());
		HSCSendMail hscSendMail = new HSCSendMail();
		hscSendMail.sendInviteMail(project,null); 
//			throw new Exception("Send Invite email failed");
		return "Send Invite email completed";
	}

}
