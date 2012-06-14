package org.hsc.model;

import java.util.Properties;

import org.compiere.model.I_C_BPartner;
import org.compiere.model.MBPartner;

public class MHSCAppointment extends X_HSC_Appointment {

	public MHSCAppointment(Properties ctx, int HSC_Appointment_ID,
			String trxName) {
		super(ctx, HSC_Appointment_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public MHSCHalqProject getHSC_Halq_Project() throws RuntimeException {
		// TODO Auto-generated method stub
		return new MHSCHalqProject(getCtx(),getHSC_Halq_Project_ID(),get_TrxName());
	}

	@Override
	public MBPartner getC_BPartner() throws RuntimeException {
		// TODO Auto-generated method stub
		return new MBPartner(getCtx(), getC_BPartner_ID(), get_TrxName());
	}
	public MBPartner getAdvisor(){
		int advisor_ID = this.getAdvisor_ID();
		return new MBPartner(getCtx(), advisor_ID, get_TrxName());
		
	}
	
	
}
