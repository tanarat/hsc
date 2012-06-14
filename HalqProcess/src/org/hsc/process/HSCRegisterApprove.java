package org.hsc.process;



import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCHalqApprove;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqRegistrationForm;
import org.hsc.model.MHSCRequestProduct;
import org.hsc.model.MMBPartner;
import org.hsc.utils.HSCSendMail;


public class HSCRegisterApprove extends SvrProcess {
	

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub

		
		int formId = getRecord_ID();
		MHSCHalqRegistrationForm form = new MHSCHalqRegistrationForm(getCtx(), formId, get_TrxName());
		if((form.getRegisterFor() != null) && (form.getRegisterFor().equals(MHSCHalqRegistrationForm.REGISTERFOR_ขอใช้บริการHAL_QERP))){
			
			form.erpApprove();
			return "Approval Success";
			
		}
		
		form.save();
		
		HSCSendMail hscSendMail = new HSCSendMail();
		int projectId = form.getHSC_Halq_Project_ID();
		int bpId = form.getC_BPartner_ID();
		MHSCHalqProject project = new MHSCHalqProject(getCtx(), projectId, get_TrxName());
		MMBPartner bpartner = new MMBPartner(getCtx(), bpId, get_TrxName());
//		if(!hscSendMail.sendApproveMail(project,bpartner)) //send not ok
//			throw new Exception("à¸ªà¹ˆà¸‡ email à¹„à¸¡à¹ˆà¸ªà¸³à¹€à¸£à¹‡à¸ˆ");
		return "à¸ªà¹ˆà¸‡ email à¸•à¸­à¸šà¸£à¸±à¸šà¸œà¸¹à¹‰à¸›à¸£à¸°à¸�à¸­à¸šà¸�à¸²à¸£à¹€à¸£à¸µà¸¢à¸šà¸£à¹‰à¸­à¸¢";
	}

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

}
