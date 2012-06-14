package org.hsc.model;

import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Trx;



public class MHSCProduct extends X_HSC_Product {

	public MHSCProduct(Properties ctx, int HSC_Product_ID, String trxName) {
		super(ctx, HSC_Product_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		

		return super.afterSave(newRecord, success);
	}
	/**
	 * 
	 * 
	 */
	private MHSCCCertificate[] certificates;
	public MHSCCCertificate[] getCertificates(boolean reload){
		if(certificates == null || reload){
			reloadCertificates();
		}
		return certificates;
	}
	private void reloadCertificates(){
		String table = MHSCCCertificate.Table_Name;
		String whereClause = "IsActive = 'Y' and hsc_c_certificate_id in (select hsc_c_certificate_id from hsc_c_product_cert where hsc_product_id = ?)";
		List<MHSCCCertificate> certs = new Query(getCtx(), table, whereClause, get_TrxName()).setParameters(get_ID()).list();
		certificates = certs.toArray(new MHSCCCertificate[certs.size()]);
	}

}
