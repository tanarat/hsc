package org.hsc.process;

import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCAppointment;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqTraining;
import org.hsc.model.MMBPartner;
import org.hsc.utils.HSCSendMail;

public class InformAppointment extends SvrProcess{

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		
		
		MHSCAppointment appointment = new MHSCAppointment(getCtx(),getRecord_ID(),get_TrxName());
		

		MMBPartner bpartner = new MMBPartner(getCtx(), appointment.getC_BPartner_ID(), get_TrxName());
		HSCSendMail hscSendMail = new HSCSendMail();
		hscSendMail.sendEvalAppointmentMail(appointment);

		return "Send email completed";
		
	}

}
