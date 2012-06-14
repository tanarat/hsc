package org.hsc.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;

public class MHSCCCertificate extends X_HSC_C_Certificate{



	public MHSCCCertificate(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCCCertificate(Properties ctx, int HSC_C_Certificate_ID,
			String trxName) {
		super(ctx, HSC_C_Certificate_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static MHSCCCertificate[] createFrom(MHSCCertification[] certificates,Properties ctx,String trxName) {
		// TODO Auto-generated method stub
		MHSCCCertificate[] c_certificates = new MHSCCCertificate[certificates.length];
		for (int i = 0; i < certificates.length; i++) {
			c_certificates[i] = new MHSCCCertificate(ctx, 0, trxName);
			c_certificates[i].setName(certificates[i].getName());
			c_certificates[i].setCert_No(certificates[i].getCert_No());
			c_certificates[i].setissued_by(certificates[i].getIssued_By());
			c_certificates[i].setissued_by_list(certificates[i].getIssued_By_List());
			c_certificates[i].setStandard(certificates[i].getStandard());
			c_certificates[i].setStanderd_List(certificates[i].getStanderd_List());
			c_certificates[i].setvalid_from(certificates[i].getValid_From());
			c_certificates[i].setvalid_to(certificates[i].getValid_To());
			c_certificates[i].save();
		}
		return c_certificates;
	}

	public static MHSCCProductCert[] getHSCCProductCert(MHSCRequestProduct reqProduct,Properties ctx,String trxName) {
		// TODO Auto-generated method stub
		String table = MHSCCProductCert.Table_Name;
		String whereClause = "IsActive = 'Y' and hsc_request_product_id = ?";
		List<MHSCCProductCert> certs = new Query(ctx, table, whereClause, trxName).setParameters(reqProduct.get_ID()).list();
		return certs.toArray(new MHSCCProductCert[certs.size()]);
		
	}

}
