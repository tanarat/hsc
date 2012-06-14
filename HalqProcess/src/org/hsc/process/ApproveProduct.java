package org.hsc.process;

import org.compiere.model.MOrg;
import org.compiere.model.MProduct;
import org.compiere.process.AD_PrintPaper_Default;
import org.compiere.process.SvrProcess;
import org.compiere.util.Trx;
import org.hsc.model.MHSCCCertificate;
import org.hsc.model.MHSCCProductCert;
import org.hsc.model.MHSCProduct;
import org.hsc.model.MHSCProductBOM;
import org.hsc.model.MHSCProductBOMLine;
import org.hsc.model.MHSCRequestProduct;

public class ApproveProduct extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MHSCRequestProduct reqProduct = new MHSCRequestProduct(getCtx(), getRecord_ID(), get_TrxName());
		reqProduct.setIsApproved(true);
		reqProduct.save();
		
		int orgID = reqProduct.getAD_Org_ID();
		MOrg org = new MOrg (getCtx(), orgID, get_TrxName());
		int C_BPartner_ID = org.getLinkedC_BPartner_ID(null);
		if(C_BPartner_ID == 0)
			throw new Exception("No Linked BP to Org");
		
		
		MProduct mProduct = new MProduct(getCtx(), reqProduct.getM_Product_ID(), get_TrxName());
		
		MHSCProduct hscProduct = new MHSCProduct(getCtx(), 0, get_TrxName());
		hscProduct.setHSC_Request_Product_ID(reqProduct.getHSC_Request_Product_ID());
		hscProduct.setAD_Org_ID(0); // set Organization to *
		hscProduct.setC_BPartner_ID(C_BPartner_ID);
		hscProduct.setM_Product_ID(reqProduct.getM_Product_ID());
		hscProduct.setName(mProduct.getName());
		hscProduct.save();

		MHSCProductBOM hscBOM = MHSCProductBOM.getHSCProductBOM(reqProduct,get_TrxName());

		hscBOM.setHSC_Product_ID(hscProduct.getHSC_Product_ID());
		hscBOM.setAD_Org_ID(0);
		hscBOM.save();
		
		MHSCProductBOMLine[] bomLines = hscBOM.getBOMLines(true);
		for (int i = 0; i < bomLines.length; i++) {
			bomLines[i].setAD_Org_ID(0);
			bomLines[i].save();
		}
		
		MHSCCProductCert productCerts[] = MHSCCCertificate.getHSCCProductCert(reqProduct,this.getCtx(),this.get_TrxName());
		for (int i = 0; i < productCerts.length; i++) {
			productCerts[i].setHSC_Product_ID(hscProduct.get_ID());
			productCerts[i].setAD_Org_ID(0);
			productCerts[i].setC_BPartner_ID(C_BPartner_ID);
			productCerts[i].save();
		}
		MHSCCCertificate certs[] = hscProduct.getCertificates(true);
		for (int i = 0; i < certs.length; i++) {
			certs[i].setAD_Org_ID(0);
			certs[i].setC_BPartner_ID(C_BPartner_ID);
			certs[i].save();
		}
		return "Success";
	}

}
