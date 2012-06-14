package org.hsc.model;

import java.util.Properties;

import org.compiere.model.MProduct;
import org.compiere.model.Query;
import org.eevolution.model.MPPProductBOM;
import org.eevolution.model.MPPProductBOMLine;

public class MHSCRequestProduct extends X_HSC_Request_Product {

	public MHSCRequestProduct(Properties ctx, int HSC_Request_Product_ID,
			String trxName) {
		super(ctx, HSC_Request_Product_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		if (newRecord) {
			// BOM
			MProduct mProduct = new MProduct(getCtx(), getM_Product_ID(),get_TrxName());
			MPPProductBOM bom = MPPProductBOM.getDefault(mProduct,get_TrxName());
			if (bom != null) {
				MPPProductBOMLine bomLines[] = bom.getLines();

				// create HSC_Product_BOM
				MHSCProductBOM hscBOM = new MHSCProductBOM(getCtx(), 0,	get_TrxName());
				hscBOM.setName(bom.getName());
				// int reqProdId = getHSC_Request_Product_ID();
				hscBOM.setHSC_Request_Product_ID(getHSC_Request_Product_ID());
				hscBOM.save();

				// create HSC_Product_BOMLine
				for (int i = 0; i < bomLines.length; i++) {
					System.out.println(bomLines[i].getM_Product().getName());
					MHSCProductBOMLine hscBOMLine = new MHSCProductBOMLine(getCtx(), 0, get_TrxName());
					hscBOMLine.setHSC_Product_BOM_ID(hscBOM.getHSC_Product_BOM_ID());
					hscBOMLine.setName(bomLines[i].getM_Product().getName());
					hscBOMLine.save();
				}
			}
			// Certificates
			MHSCCertification[] certificates = mProduct.getCertificates(true);
			if(certificates != null && certificates.length != 0){
				MHSCCCertificate[] centerCerts = MHSCCCertificate.createFrom(certificates, this.getCtx(), this.get_TrxName());
				this.addCertificates(centerCerts);
			}
		}
		return super.afterSave(newRecord, success);
	}

	public void addCertificates(MHSCCCertificate[] certificates) {
		// insert HSC_C_Product_Cert
		// for each record
		// HSC_Request_Product_ID = this.get_ID()
		// HSC_C_Certificate_ID = certificates[i].get_ID()
		for (int i = 0; i < certificates.length; i++) {
			MHSCCProductCert productCert = new MHSCCProductCert(getCtx(), 0,
					get_TrxName());
			productCert.setHSC_Request_Product_ID(this.get_ID());
			productCert.setHSC_C_Certificate_ID(certificates[i].get_ID());
			productCert.setName(certificates[i].getName());
			productCert.save();
		}
	}

}
