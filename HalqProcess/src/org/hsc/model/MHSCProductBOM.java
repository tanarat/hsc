package org.hsc.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.CCache;
import org.compiere.util.Env;
import org.eevolution.model.MPPProductBOMLine;


public class MHSCProductBOM extends X_HSC_Product_BOM {
	/**	Cache						*/
	private static CCache<Integer,MHSCProductBOM> s_cache = new CCache<Integer,MHSCProductBOM>(Table_Name, 40, 5);
	/** BOM Lines					*/
	private List<MHSCProductBOMLine> m_lines = null;
	
	public MHSCProductBOM(Properties ctx, int HSC_Product_BOM_ID, String trxName) {
		super(ctx, HSC_Product_BOM_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHSCProductBOM(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static MHSCProductBOM getHSCProductBOM(MHSCRequestProduct hscProduct, String trxName) {
		// TODO Auto-generated method stub
		System.out.println(hscProduct.getHSC_Request_Product_ID());
		int HSC_Request_Product_ID = hscProduct.getHSC_Request_Product_ID();
		MHSCProductBOM hscBOM = new Query(Env.getCtx(), Table_Name,
				"HSC_Request_Product_ID=?", null)
				.setParameters(new Object[] { HSC_Request_Product_ID}).firstOnly();
//		MHSCProductBOM hscBOM = new Query(hscProduct.getCtx(), Table_Name,
//				"HSC_Request_Product_ID=?", trxName)
//				.setParameters(
//						new Object[] { hscProduct.getHSC_Request_Product_ID()})
//				.firstOnly();
		// If outside trx, then cache it
//		if (hscBOM != null && trxName == null) {
//			s_cache.put(hscBOM.get_ID(), hscBOM);
//		}
		//
		return hscBOM;
	}

	

	public MHSCProductBOMLine[] getBOMLines(boolean reload) {
		// TODO Auto-generated method stub
		if (this.m_lines == null || reload)
		{
			
			final String whereClause = MHSCProductBOMLine.COLUMNNAME_HSC_Product_BOM_ID+"=?";
			this.m_lines = new Query(getCtx(), MHSCProductBOMLine.Table_Name, whereClause, get_TrxName())
											.setParameters(new Object[]{getHSC_Product_BOM_ID()})
											.setOnlyActiveRecords(true)
//											.setOrderBy(MHSCProductBOMLine.COLUMNNAME_Line)
											.list();
		}
		return this.m_lines.toArray(new MHSCProductBOMLine[this.m_lines.size()]);
		
	}
}
