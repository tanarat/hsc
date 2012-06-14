package org.hsc.process;

import org.compiere.process.SvrProcess;
import org.hsc.model.MHSCHalqProject;
import org.hsc.model.MHSCHalqTraining;
import org.hsc.utils.HSCSendMail;

public class TrainingReportMail extends SvrProcess {

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		int trainingID = getRecord_ID();
	
		MHSCHalqTraining training = new MHSCHalqTraining(getCtx(), trainingID,
				get_TrxName());
		HSCSendMail hscSendMail = new HSCSendMail();
		if (training.getTraining_Type().equals("1")) {

			int projectID = training.getHSC_Halq_Project_ID();
			MHSCHalqProject project = new MHSCHalqProject(getCtx(), projectID,
					get_TrxName());

			hscSendMail.sendTraining1ReportMail(project);
		}else if(training.getTraining_Type().equals("2")){
			hscSendMail.sendTraining2Mail(training);
		}else{
			return "Unknow training type";
		}
		return "Send email completed";

	}

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

}
