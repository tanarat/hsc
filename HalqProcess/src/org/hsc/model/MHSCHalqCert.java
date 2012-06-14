package org.hsc.model;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.util.DB;



public class MHSCHalqCert extends X_HSC_Halq_Cert {
	
	
	
	public MHSCHalqCert(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	public MHSCHalqCert(Properties ctx, int HSC_Halq_Cert_ID, String trxName) {
		super(ctx, HSC_Halq_Cert_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String CERT_FORMAT = "%02d-%s-%2d-%03d%03d-%2d";
	private final static int CERT_AGE = 2;
	
	public String genCertNo(MHSCHalqProject project, MBPartner bpartner) {

		MBPartnerLocation bpLoc = bpartner.getLocationByName("factory");
		if(bpLoc == null) {
//			throw new HSCCertException("Not found 'factory' location for " + bpartner.getName());
			JOptionPane.showMessageDialog(null, "Not found 'factory' location for " + bpartner.getName());
			return null;
		}
		MLocation factory = bpLoc.getLocation(true);
		int city_ID = factory.getC_City_ID();
		int areaCode = getAreaCode(city_ID);
		if( areaCode <= 0) {
			JOptionPane.showMessageDialog(null, "Error : area code");
			return null;
		}
		
		
		Timestamp projectStart = project.getDateStart();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(projectStart);
		int year = calendar.get(Calendar.YEAR);
//		year += 543; 
//		year -= 2500;
		if(year > 2500)
			year -= 2500;
		else{
			year += 543;
			year -= 2500;
		}
		
		
		int certSeq = getNextCertSeq();
		
		MHSCHalqRegistrationForm form = MHSCHalqRegistrationForm.getForm(project.get_ID(),bpartner.get_ID());
		int productAmt = form.getProductAmt();

//		String facType = getCert_Type();
		String certType = form.getCert_Type();
		if(certType == null || certType.length() == 0) {
			JOptionPane.showMessageDialog(null, "Not found 'BP Type' for " + bpartner.getName());
			return null;
		}
		String certNo = String.format(CERT_FORMAT, areaCode,certType,year,certSeq,productAmt,year+CERT_AGE);
		return certNo;
	}
	public static int getNextCertSeq(){
		MHSCSetting setting = MHSCSetting.getDefaultSetting();
		return setting.getNext_Cert_Seq().intValue();
	}
	public static int getAreaCode(int city_ID){
		int areaCode = 0;
		
		String sql = "Select areacode From C_City Where C_City_ID = ?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, city_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				areaCode = rs.getInt(1);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
//			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return areaCode;
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		
		if(newRecord){
			MHSCHalqProject project = new MHSCHalqProject(getCtx(), getHSC_Halq_Project_ID(), get_TrxName());
			MBPartner bpartner = new MBPartner(getCtx(), getC_BPartner_ID(), get_TrxName());
			String certNo = genCertNo(project, bpartner);
			if( certNo == null)  return false;
			
			setCert_No(certNo);
			
			MHSCHalqRegistrationForm form = MHSCHalqRegistrationForm.getForm(getHSC_Halq_Project_ID(), getC_BPartner_ID());
			System.out.println("cert type : " + form.getCert_Type());
			setCert_Type(form.getCert_Type());
			MHSCSetting.increaseNextCertSeq();
		}
		return super.beforeSave(newRecord);
	}
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		System.out.println("after save...");
		
		return super.afterSave(newRecord, success);
	}
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
}
