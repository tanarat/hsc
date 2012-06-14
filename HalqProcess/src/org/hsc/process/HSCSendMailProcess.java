package org.hsc.process;

import java.util.logging.Level;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class HSCSendMailProcess extends SvrProcess  {

	private int p_Project_ID = 0;
	private int p_MailType = 0;
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
//		Parameter
			ProcessInfoParameter[] para = getParameter();
			for (int i = 0; i < para.length; i++)
			{
				String name = para[i].getParameterName();
				
				if (para[i].getParameter() == null) ;
				else if (name.equals("HSC_Halq_Project_ID")){
					p_Project_ID = para[i].getParameterAsInt();
					System.out.println(name + " : " + p_Project_ID);
				}
				else if(name.equals("HSC_Email_Type_ID")){
//					p_MailType = para[i].getParameterAsInt();
					System.out.println(name + " : " + para[i].getParameter().toString());
				}else{
					log.log(Level.SEVERE, "Unknown Parameter: " + name);
				}
			}
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
