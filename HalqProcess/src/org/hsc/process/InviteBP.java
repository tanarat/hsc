package org.hsc.process;


import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqProjectProspect;

import org.compiere.model.MBPartner;
import org.compiere.process.SvrProcess;
import org.hsc.utils.HSCSendMail;

public class InviteBP extends SvrProcess {
	int recordId;
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		this.recordId = getRecord_ID();
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("recordId : " + recordId);
		MHSCHalqProjectProspect prospect = new MHSCHalqProjectProspect(getCtx(), recordId, get_TrxName());
		MHSCHalqProject project = new MHSCHalqProject(getCtx(), prospect.getHSC_Halq_Project_ID(), get_TrxName());
		MBPartner bpartner = (MBPartner) prospect.getC_BPartner();
		HSCSendMail hscSendMail = new HSCSendMail();
		
		hscSendMail.sendInviteMail(project,bpartner); //send not ok
//			throw new Exception("Send Invite email failed");
		return "Send Invite email completed";
	}

}
