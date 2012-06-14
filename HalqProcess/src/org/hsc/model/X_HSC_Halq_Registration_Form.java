/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.hsc.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for HSC_Halq_Registration_Form
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Registration_Form extends PO implements I_HSC_Halq_Registration_Form, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120120L;

    /** Standard Constructor */
    public X_HSC_Halq_Registration_Form (Properties ctx, int HSC_Halq_Registration_Form_ID, String trxName)
    {
      super (ctx, HSC_Halq_Registration_Form_ID, trxName);
      /** if (HSC_Halq_Registration_Form_ID == 0)
        {
			setHSC_Halq_Registration_Form_ID (0);
			setIsApproved (false);
			setIsRegistered (false);
			setSame_Off_Address (false);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Registration_Form (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Registration_Form[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Approve.
		@param Approve Approve	  */
	public void setApprove (String Approve)
	{
		set_Value (COLUMNNAME_Approve, Approve);
	}

	/** Get Approve.
		@return Approve	  */
	public String getApprove () 
	{
		return (String)get_Value(COLUMNNAME_Approve);
	}

	public I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Cert_Type AD_Reference_ID=1000057 */
	public static final int CERT_TYPE_AD_Reference_ID=1000057;
	/** โรงงาน = 1 */
	public static final String CERT_TYPE_โรงงาน = "1";
	/** คลัง = 2 */
	public static final String CERT_TYPE_คลัง = "2";
	/** ขนส่ง = 3 */
	public static final String CERT_TYPE_ขนส่ง = "3";
	/** ยา = 4 */
	public static final String CERT_TYPE_ยา = "4";
	/** Set Cert_Type.
		@param Cert_Type Cert_Type	  */
	public void setCert_Type (String Cert_Type)
	{

		set_Value (COLUMNNAME_Cert_Type, Cert_Type);
	}

	/** Get Cert_Type.
		@return Cert_Type	  */
	public String getCert_Type () 
	{
		return (String)get_Value(COLUMNNAME_Cert_Type);
	}

	/** Set Contact_Email.
		@param Contact_Email Contact_Email	  */
	public void setContact_Email (String Contact_Email)
	{
		set_Value (COLUMNNAME_Contact_Email, Contact_Email);
	}

	/** Get Contact_Email.
		@return Contact_Email	  */
	public String getContact_Email () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Email);
	}

	/** Set Contact_Lname.
		@param Contact_Lname Contact_Lname	  */
	public void setContact_Lname (String Contact_Lname)
	{
		set_Value (COLUMNNAME_Contact_Lname, Contact_Lname);
	}

	/** Get Contact_Lname.
		@return Contact_Lname	  */
	public String getContact_Lname () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Lname);
	}

	/** Set Contact_Name.
		@param Contact_Name Contact_Name	  */
	public void setContact_Name (String Contact_Name)
	{
		set_Value (COLUMNNAME_Contact_Name, Contact_Name);
	}

	/** Get Contact_Name.
		@return Contact_Name	  */
	public String getContact_Name () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Name);
	}

	/** Set Contact_Phone.
		@param Contact_Phone Contact_Phone	  */
	public void setContact_Phone (String Contact_Phone)
	{
		set_Value (COLUMNNAME_Contact_Phone, Contact_Phone);
	}

	/** Get Contact_Phone.
		@return Contact_Phone	  */
	public String getContact_Phone () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Phone);
	}

	/** Set Contact_Position.
		@param Contact_Position Contact_Position	  */
	public void setContact_Position (String Contact_Position)
	{
		set_Value (COLUMNNAME_Contact_Position, Contact_Position);
	}

	/** Get Contact_Position.
		@return Contact_Position	  */
	public String getContact_Position () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Position);
	}

	/** Contact_Title AD_Reference_ID=1000011 */
	public static final int CONTACT_TITLE_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String CONTACT_TITLE_นาย = "1";
	/** นางสาว = 2 */
	public static final String CONTACT_TITLE_นางสาว = "2";
	/** นาง = 3 */
	public static final String CONTACT_TITLE_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String CONTACT_TITLE_อื่นๆ = "4";
	/** Set Contact_Title.
		@param Contact_Title Contact_Title	  */
	public void setContact_Title (String Contact_Title)
	{

		set_Value (COLUMNNAME_Contact_Title, Contact_Title);
	}

	/** Get Contact_Title.
		@return Contact_Title	  */
	public String getContact_Title () 
	{
		return (String)get_Value(COLUMNNAME_Contact_Title);
	}

	/** Set CountryNameOfOutMkt.
		@param CountryNameOfOutMkt CountryNameOfOutMkt	  */
	public void setCountryNameOfOutMkt (int CountryNameOfOutMkt)
	{
		set_Value (COLUMNNAME_CountryNameOfOutMkt, Integer.valueOf(CountryNameOfOutMkt));
	}

	/** Get CountryNameOfOutMkt.
		@return CountryNameOfOutMkt	  */
	public int getCountryNameOfOutMkt () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CountryNameOfOutMkt);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Director.
		@param Director Director	  */
	public void setDirector (String Director)
	{
		set_Value (COLUMNNAME_Director, Director);
	}

	/** Get Director.
		@return Director	  */
	public String getDirector () 
	{
		return (String)get_Value(COLUMNNAME_Director);
	}

	/** Set Fac_Address1.
		@param Fac_Address1 Fac_Address1	  */
	public void setFac_Address1 (String Fac_Address1)
	{
		set_Value (COLUMNNAME_Fac_Address1, Fac_Address1);
	}

	/** Get Fac_Address1.
		@return Fac_Address1	  */
	public String getFac_Address1 () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Address1);
	}

	/** Set Fac_Address2.
		@param Fac_Address2 Fac_Address2	  */
	public void setFac_Address2 (String Fac_Address2)
	{
		set_Value (COLUMNNAME_Fac_Address2, Fac_Address2);
	}

	/** Get Fac_Address2.
		@return Fac_Address2	  */
	public String getFac_Address2 () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Address2);
	}

	/** Set Fac_Address3.
		@param Fac_Address3 Fac_Address3	  */
	public void setFac_Address3 (String Fac_Address3)
	{
		set_Value (COLUMNNAME_Fac_Address3, Fac_Address3);
	}

	/** Get Fac_Address3.
		@return Fac_Address3	  */
	public String getFac_Address3 () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Address3);
	}

	/** Set Fac_Address4.
		@param Fac_Address4 Fac_Address4	  */
	public void setFac_Address4 (String Fac_Address4)
	{
		set_Value (COLUMNNAME_Fac_Address4, Fac_Address4);
	}

	/** Get Fac_Address4.
		@return Fac_Address4	  */
	public String getFac_Address4 () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Address4);
	}

	/** Set Fac_C_Country_ID.
		@param Fac_C_Country_ID Fac_C_Country_ID	  */
	public void setFac_C_Country_ID (int Fac_C_Country_ID)
	{
		if (Fac_C_Country_ID < 1) 
			set_Value (COLUMNNAME_Fac_C_Country_ID, null);
		else 
			set_Value (COLUMNNAME_Fac_C_Country_ID, Integer.valueOf(Fac_C_Country_ID));
	}

	/** Get Fac_C_Country_ID.
		@return Fac_C_Country_ID	  */
	public int getFac_C_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Fac_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_City getFac_City() throws RuntimeException
    {
		return (I_C_City)MTable.get(getCtx(), I_C_City.Table_Name)
			.getPO(getFac_City_ID(), get_TrxName());	}

	/** Set Fac_City_ID.
		@param Fac_City_ID Fac_City_ID	  */
	public void setFac_City_ID (int Fac_City_ID)
	{
		if (Fac_City_ID < 1) 
			set_Value (COLUMNNAME_Fac_City_ID, null);
		else 
			set_Value (COLUMNNAME_Fac_City_ID, Integer.valueOf(Fac_City_ID));
	}

	/** Get Fac_City_ID.
		@return Fac_City_ID	  */
	public int getFac_City_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Fac_City_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Fac_Fax.
		@param Fac_Fax Fac_Fax	  */
	public void setFac_Fax (String Fac_Fax)
	{
		set_Value (COLUMNNAME_Fac_Fax, Fac_Fax);
	}

	/** Get Fac_Fax.
		@return Fac_Fax	  */
	public String getFac_Fax () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Fax);
	}

	/** Set Fac_Map.
		@param Fac_Map Fac_Map	  */
	public void setFac_Map (String Fac_Map)
	{
		set_Value (COLUMNNAME_Fac_Map, Fac_Map);
	}

	/** Get Fac_Map.
		@return Fac_Map	  */
	public String getFac_Map () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Map);
	}

	/** Set Fac_Phone.
		@param Fac_Phone Fac_Phone	  */
	public void setFac_Phone (String Fac_Phone)
	{
		set_Value (COLUMNNAME_Fac_Phone, Fac_Phone);
	}

	/** Get Fac_Phone.
		@return Fac_Phone	  */
	public String getFac_Phone () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Phone);
	}

	/** Set Fac_Postal.
		@param Fac_Postal Fac_Postal	  */
	public void setFac_Postal (String Fac_Postal)
	{
		set_Value (COLUMNNAME_Fac_Postal, Fac_Postal);
	}

	/** Get Fac_Postal.
		@return Fac_Postal	  */
	public String getFac_Postal () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Postal);
	}

	/** Set Fac_Website.
		@param Fac_Website Fac_Website	  */
	public void setFac_Website (String Fac_Website)
	{
		set_Value (COLUMNNAME_Fac_Website, Fac_Website);
	}

	/** Get Fac_Website.
		@return Fac_Website	  */
	public String getFac_Website () 
	{
		return (String)get_Value(COLUMNNAME_Fac_Website);
	}

	/** Set Factory_ApproveBy.
		@param Factory_ApproveBy Factory_ApproveBy	  */
	public void setFactory_ApproveBy (String Factory_ApproveBy)
	{
		set_Value (COLUMNNAME_Factory_ApproveBy, Factory_ApproveBy);
	}

	/** Get Factory_ApproveBy.
		@return Factory_ApproveBy	  */
	public String getFactory_ApproveBy () 
	{
		return (String)get_Value(COLUMNNAME_Factory_ApproveBy);
	}

	/** Set Factory_License.
		@param Factory_License Factory_License	  */
	public void setFactory_License (String Factory_License)
	{
		set_Value (COLUMNNAME_Factory_License, Factory_License);
	}

	/** Get Factory_License.
		@return Factory_License	  */
	public String getFactory_License () 
	{
		return (String)get_Value(COLUMNNAME_Factory_License);
	}

	/** GMPIssueBy AD_Reference_ID=1000002 */
	public static final int GMPISSUEBY_AD_Reference_ID=1000002;
	/** อย. = 1 */
	public static final String GMPISSUEBY_อย = "1";
	/** กรมประมง = 2 */
	public static final String GMPISSUEBY_กรมประมง = "2";
	/** กรมปศุสัตว์ = 3 */
	public static final String GMPISSUEBY_กรมปศุสัตว์ = "3";
	/** Codex( ) = 4 */
	public static final String GMPISSUEBY_Codex = "4";
	/** Set GMPIssueBy.
		@param GMPIssueBy GMPIssueBy	  */
	public void setGMPIssueBy (String GMPIssueBy)
	{

		set_Value (COLUMNNAME_GMPIssueBy, GMPIssueBy);
	}

	/** Get GMPIssueBy.
		@return GMPIssueBy	  */
	public String getGMPIssueBy () 
	{
		return (String)get_Value(COLUMNNAME_GMPIssueBy);
	}

	/** HACCPIssueBy AD_Reference_ID=1000002 */
	public static final int HACCPISSUEBY_AD_Reference_ID=1000002;
	/** อย. = 1 */
	public static final String HACCPISSUEBY_อย = "1";
	/** กรมประมง = 2 */
	public static final String HACCPISSUEBY_กรมประมง = "2";
	/** กรมปศุสัตว์ = 3 */
	public static final String HACCPISSUEBY_กรมปศุสัตว์ = "3";
	/** Codex( ) = 4 */
	public static final String HACCPISSUEBY_Codex = "4";
	/** Set HACCPIssueBy.
		@param HACCPIssueBy HACCPIssueBy	  */
	public void setHACCPIssueBy (String HACCPIssueBy)
	{

		set_Value (COLUMNNAME_HACCPIssueBy, HACCPIssueBy);
	}

	/** Get HACCPIssueBy.
		@return HACCPIssueBy	  */
	public String getHACCPIssueBy () 
	{
		return (String)get_Value(COLUMNNAME_HACCPIssueBy);
	}

	/** HalalIssueFrom AD_Reference_ID=1000003 */
	public static final int HALALISSUEFROM_AD_Reference_ID=1000003;
	/** ในประเทศ = 1 */
	public static final String HALALISSUEFROM_ในประเทศ = "1";
	/** ต่างประเทศ = 2 */
	public static final String HALALISSUEFROM_ต่างประเทศ = "2";
	/** Set HalalIssueFrom.
		@param HalalIssueFrom HalalIssueFrom	  */
	public void setHalalIssueFrom (String HalalIssueFrom)
	{

		set_Value (COLUMNNAME_HalalIssueFrom, HalalIssueFrom);
	}

	/** Get HalalIssueFrom.
		@return HalalIssueFrom	  */
	public String getHalalIssueFrom () 
	{
		return (String)get_Value(COLUMNNAME_HalalIssueFrom);
	}

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Project)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Project.Table_Name)
			.getPO(getHSC_Halq_Project_ID(), get_TrxName());	}

	/** Set HSC_Halq_Project_ID.
		@param HSC_Halq_Project_ID HSC_Halq_Project_ID	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID)
	{
		if (HSC_Halq_Project_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, Integer.valueOf(HSC_Halq_Project_ID));
	}

	/** Get HSC_Halq_Project_ID.
		@return HSC_Halq_Project_ID	  */
	public int getHSC_Halq_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Halq_Project_Prospect getHSC_Halq_Project_Prospect() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Project_Prospect)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Project_Prospect.Table_Name)
			.getPO(getHSC_Halq_Project_Prospect_ID(), get_TrxName());	}

	/** Set HSC_Halq_Project_Prospect_ID.
		@param HSC_Halq_Project_Prospect_ID HSC_Halq_Project_Prospect_ID	  */
	public void setHSC_Halq_Project_Prospect_ID (int HSC_Halq_Project_Prospect_ID)
	{
		if (HSC_Halq_Project_Prospect_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Project_Prospect_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Project_Prospect_ID, Integer.valueOf(HSC_Halq_Project_Prospect_ID));
	}

	/** Get HSC_Halq_Project_Prospect_ID.
		@return HSC_Halq_Project_Prospect_ID	  */
	public int getHSC_Halq_Project_Prospect_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Project_Prospect_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Halq_Registration_Form_ID.
		@param HSC_Halq_Registration_Form_ID HSC_Halq_Registration_Form_ID	  */
	public void setHSC_Halq_Registration_Form_ID (int HSC_Halq_Registration_Form_ID)
	{
		if (HSC_Halq_Registration_Form_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Registration_Form_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Registration_Form_ID, Integer.valueOf(HSC_Halq_Registration_Form_ID));
	}

	/** Get HSC_Halq_Registration_Form_ID.
		@return HSC_Halq_Registration_Form_ID	  */
	public int getHSC_Halq_Registration_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Registration_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsGMP.
		@param IsGMP IsGMP	  */
	public void setIsGMP (boolean IsGMP)
	{
		set_Value (COLUMNNAME_IsGMP, Boolean.valueOf(IsGMP));
	}

	/** Get IsGMP.
		@return IsGMP	  */
	public boolean isGMP () 
	{
		Object oo = get_Value(COLUMNNAME_IsGMP);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsHACCP.
		@param IsHACCP IsHACCP	  */
	public void setIsHACCP (boolean IsHACCP)
	{
		set_Value (COLUMNNAME_IsHACCP, Boolean.valueOf(IsHACCP));
	}

	/** Get IsHACCP.
		@return IsHACCP	  */
	public boolean isHACCP () 
	{
		Object oo = get_Value(COLUMNNAME_IsHACCP);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsHalal.
		@param IsHalal IsHalal	  */
	public void setIsHalal (boolean IsHalal)
	{
		set_Value (COLUMNNAME_IsHalal, Boolean.valueOf(IsHalal));
	}

	/** Get IsHalal.
		@return IsHalal	  */
	public boolean isHalal () 
	{
		Object oo = get_Value(COLUMNNAME_IsHalal);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsISO.
		@param IsISO IsISO	  */
	public void setIsISO (boolean IsISO)
	{
		set_Value (COLUMNNAME_IsISO, Boolean.valueOf(IsISO));
	}

	/** Get IsISO.
		@return IsISO	  */
	public boolean isISO () 
	{
		Object oo = get_Value(COLUMNNAME_IsISO);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsOther1.
		@param IsOther1 IsOther1	  */
	public void setIsOther1 (boolean IsOther1)
	{
		set_Value (COLUMNNAME_IsOther1, Boolean.valueOf(IsOther1));
	}

	/** Get IsOther1.
		@return IsOther1	  */
	public boolean isOther1 () 
	{
		Object oo = get_Value(COLUMNNAME_IsOther1);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsOther2.
		@param IsOther2 IsOther2	  */
	public void setIsOther2 (boolean IsOther2)
	{
		set_Value (COLUMNNAME_IsOther2, Boolean.valueOf(IsOther2));
	}

	/** Get IsOther2.
		@return IsOther2	  */
	public boolean isOther2 () 
	{
		Object oo = get_Value(COLUMNNAME_IsOther2);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Registered.
		@param IsRegistered 
		The application is registered.
	  */
	public void setIsRegistered (boolean IsRegistered)
	{
		set_Value (COLUMNNAME_IsRegistered, Boolean.valueOf(IsRegistered));
	}

	/** Get Registered.
		@return The application is registered.
	  */
	public boolean isRegistered () 
	{
		Object oo = get_Value(COLUMNNAME_IsRegistered);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Name 2.
		@param Name2 
		Additional Name
	  */
	public void setName2 (String Name2)
	{
		set_Value (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2 () 
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set NumberOfEmp.
		@param NumberOfEmp NumberOfEmp	  */
	public void setNumberOfEmp (int NumberOfEmp)
	{
		set_Value (COLUMNNAME_NumberOfEmp, Integer.valueOf(NumberOfEmp));
	}

	/** Get NumberOfEmp.
		@return NumberOfEmp	  */
	public int getNumberOfEmp () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberOfEmp);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NumberOfForeign.
		@param NumberOfForeign NumberOfForeign	  */
	public void setNumberOfForeign (int NumberOfForeign)
	{
		set_Value (COLUMNNAME_NumberOfForeign, Integer.valueOf(NumberOfForeign));
	}

	/** Get NumberOfForeign.
		@return NumberOfForeign	  */
	public int getNumberOfForeign () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberOfForeign);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NumberOfMuslim.
		@param NumberOfMuslim NumberOfMuslim	  */
	public void setNumberOfMuslim (int NumberOfMuslim)
	{
		set_Value (COLUMNNAME_NumberOfMuslim, Integer.valueOf(NumberOfMuslim));
	}

	/** Get NumberOfMuslim.
		@return NumberOfMuslim	  */
	public int getNumberOfMuslim () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberOfMuslim);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Off_Address1.
		@param Off_Address1 Off_Address1	  */
	public void setOff_Address1 (String Off_Address1)
	{
		set_Value (COLUMNNAME_Off_Address1, Off_Address1);
	}

	/** Get Off_Address1.
		@return Off_Address1	  */
	public String getOff_Address1 () 
	{
		return (String)get_Value(COLUMNNAME_Off_Address1);
	}

	/** Set Off_Address2.
		@param Off_Address2 Off_Address2	  */
	public void setOff_Address2 (String Off_Address2)
	{
		set_Value (COLUMNNAME_Off_Address2, Off_Address2);
	}

	/** Get Off_Address2.
		@return Off_Address2	  */
	public String getOff_Address2 () 
	{
		return (String)get_Value(COLUMNNAME_Off_Address2);
	}

	/** Set Off_Address3.
		@param Off_Address3 Off_Address3	  */
	public void setOff_Address3 (String Off_Address3)
	{
		set_Value (COLUMNNAME_Off_Address3, Off_Address3);
	}

	/** Get Off_Address3.
		@return Off_Address3	  */
	public String getOff_Address3 () 
	{
		return (String)get_Value(COLUMNNAME_Off_Address3);
	}

	/** Set Off_Address4.
		@param Off_Address4 Off_Address4	  */
	public void setOff_Address4 (String Off_Address4)
	{
		set_Value (COLUMNNAME_Off_Address4, Off_Address4);
	}

	/** Get Off_Address4.
		@return Off_Address4	  */
	public String getOff_Address4 () 
	{
		return (String)get_Value(COLUMNNAME_Off_Address4);
	}

	/** Set Off_C_Country_ID.
		@param Off_C_Country_ID Off_C_Country_ID	  */
	public void setOff_C_Country_ID (int Off_C_Country_ID)
	{
		if (Off_C_Country_ID < 1) 
			set_Value (COLUMNNAME_Off_C_Country_ID, null);
		else 
			set_Value (COLUMNNAME_Off_C_Country_ID, Integer.valueOf(Off_C_Country_ID));
	}

	/** Get Off_C_Country_ID.
		@return Off_C_Country_ID	  */
	public int getOff_C_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Off_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_City getOff_City() throws RuntimeException
    {
		return (I_C_City)MTable.get(getCtx(), I_C_City.Table_Name)
			.getPO(getOff_City_ID(), get_TrxName());	}

	/** Set Off_City_ID.
		@param Off_City_ID Off_City_ID	  */
	public void setOff_City_ID (int Off_City_ID)
	{
		if (Off_City_ID < 1) 
			set_Value (COLUMNNAME_Off_City_ID, null);
		else 
			set_Value (COLUMNNAME_Off_City_ID, Integer.valueOf(Off_City_ID));
	}

	/** Get Off_City_ID.
		@return Off_City_ID	  */
	public int getOff_City_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Off_City_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Off_Fax.
		@param Off_Fax Off_Fax	  */
	public void setOff_Fax (String Off_Fax)
	{
		set_Value (COLUMNNAME_Off_Fax, Off_Fax);
	}

	/** Get Off_Fax.
		@return Off_Fax	  */
	public String getOff_Fax () 
	{
		return (String)get_Value(COLUMNNAME_Off_Fax);
	}

	/** Set Off_Map.
		@param Off_Map Off_Map	  */
	public void setOff_Map (String Off_Map)
	{
		set_Value (COLUMNNAME_Off_Map, Off_Map);
	}

	/** Get Off_Map.
		@return Off_Map	  */
	public String getOff_Map () 
	{
		return (String)get_Value(COLUMNNAME_Off_Map);
	}

	/** Set Off_Phone.
		@param Off_Phone Off_Phone	  */
	public void setOff_Phone (String Off_Phone)
	{
		set_Value (COLUMNNAME_Off_Phone, Off_Phone);
	}

	/** Get Off_Phone.
		@return Off_Phone	  */
	public String getOff_Phone () 
	{
		return (String)get_Value(COLUMNNAME_Off_Phone);
	}

	/** Set Off_Postal.
		@param Off_Postal Off_Postal	  */
	public void setOff_Postal (String Off_Postal)
	{
		set_Value (COLUMNNAME_Off_Postal, Off_Postal);
	}

	/** Get Off_Postal.
		@return Off_Postal	  */
	public String getOff_Postal () 
	{
		return (String)get_Value(COLUMNNAME_Off_Postal);
	}

	/** Set PercentOfInMkt.
		@param PercentOfInMkt PercentOfInMkt	  */
	public void setPercentOfInMkt (BigDecimal PercentOfInMkt)
	{
		set_Value (COLUMNNAME_PercentOfInMkt, PercentOfInMkt);
	}

	/** Get PercentOfInMkt.
		@return PercentOfInMkt	  */
	public BigDecimal getPercentOfInMkt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentOfInMkt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PercentOfOutMkt.
		@param PercentOfOutMkt PercentOfOutMkt	  */
	public void setPercentOfOutMkt (BigDecimal PercentOfOutMkt)
	{
		set_Value (COLUMNNAME_PercentOfOutMkt, PercentOfOutMkt);
	}

	/** Get PercentOfOutMkt.
		@return PercentOfOutMkt	  */
	public BigDecimal getPercentOfOutMkt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentOfOutMkt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Product_Name1.
		@param Product_Name1 Product_Name1	  */
	public void setProduct_Name1 (String Product_Name1)
	{
		set_Value (COLUMNNAME_Product_Name1, Product_Name1);
	}

	/** Get Product_Name1.
		@return Product_Name1	  */
	public String getProduct_Name1 () 
	{
		return (String)get_Value(COLUMNNAME_Product_Name1);
	}

	/** Set Product_Name2.
		@param Product_Name2 Product_Name2	  */
	public void setProduct_Name2 (String Product_Name2)
	{
		set_Value (COLUMNNAME_Product_Name2, Product_Name2);
	}

	/** Get Product_Name2.
		@return Product_Name2	  */
	public String getProduct_Name2 () 
	{
		return (String)get_Value(COLUMNNAME_Product_Name2);
	}

	/** Set Product_Name3.
		@param Product_Name3 Product_Name3	  */
	public void setProduct_Name3 (String Product_Name3)
	{
		set_Value (COLUMNNAME_Product_Name3, Product_Name3);
	}

	/** Get Product_Name3.
		@return Product_Name3	  */
	public String getProduct_Name3 () 
	{
		return (String)get_Value(COLUMNNAME_Product_Name3);
	}

	/** Set Product_Name4.
		@param Product_Name4 Product_Name4	  */
	public void setProduct_Name4 (String Product_Name4)
	{
		set_Value (COLUMNNAME_Product_Name4, Product_Name4);
	}

	/** Get Product_Name4.
		@return Product_Name4	  */
	public String getProduct_Name4 () 
	{
		return (String)get_Value(COLUMNNAME_Product_Name4);
	}

	/** Set Product_Name5.
		@param Product_Name5 Product_Name5	  */
	public void setProduct_Name5 (String Product_Name5)
	{
		set_Value (COLUMNNAME_Product_Name5, Product_Name5);
	}

	/** Get Product_Name5.
		@return Product_Name5	  */
	public String getProduct_Name5 () 
	{
		return (String)get_Value(COLUMNNAME_Product_Name5);
	}

	/** Set Project_Name.
		@param Project_Name Project_Name	  */
	public void setProject_Name (String Project_Name)
	{
		throw new IllegalArgumentException ("Project_Name is virtual column");	}

	/** Get Project_Name.
		@return Project_Name	  */
	public String getProject_Name () 
	{
		return (String)get_Value(COLUMNNAME_Project_Name);
	}

	/** Set Register.
		@param Register Register	  */
	public void setRegister (String Register)
	{
		set_Value (COLUMNNAME_Register, Register);
	}

	/** Get Register.
		@return Register	  */
	public String getRegister () 
	{
		return (String)get_Value(COLUMNNAME_Register);
	}

	/** RegisterFor AD_Reference_ID=1000058 */
	public static final int REGISTERFOR_AD_Reference_ID=1000058;
	/** สมัครร่วมโครงการ HAL-Q = 1 */
	public static final String REGISTERFOR_สมัครร่วมโครงการHAL_Q = "1";
	/** ขอใช้บริการ HAL-Q ERP = 2 */
	public static final String REGISTERFOR_ขอใช้บริการHAL_QERP = "2";
	/** Set RegisterFor.
		@param RegisterFor RegisterFor	  */
	public void setRegisterFor (String RegisterFor)
	{

		set_Value (COLUMNNAME_RegisterFor, RegisterFor);
	}

	/** Get RegisterFor.
		@return RegisterFor	  */
	public String getRegisterFor () 
	{
		return (String)get_Value(COLUMNNAME_RegisterFor);
	}

	/** Request_Type1 AD_Reference_ID=1000013 */
	public static final int REQUEST_TYPE1_AD_Reference_ID=1000013;
	/** Meat not processed = 1 */
	public static final String REQUEST_TYPE1_MeatNotProcessed = "1";
	/** Seafood is processed = 2 */
	public static final String REQUEST_TYPE1_SeafoodIsProcessed = "2";
	/** Processed meat = 3 */
	public static final String REQUEST_TYPE1_ProcessedMeat = "3";
	/** Seafood = 4 */
	public static final String REQUEST_TYPE1_Seafood = "4";
	/** Fruits and vegetables = 5 */
	public static final String REQUEST_TYPE1_FruitsAndVegetables = "5";
	/** Seasoning = 6 */
	public static final String REQUEST_TYPE1_Seasoning = "6";
	/** Snack = 7 */
	public static final String REQUEST_TYPE1_Snack = "7";
	/** Delicatessen = 8 */
	public static final String REQUEST_TYPE1_Delicatessen = "8";
	/** Other = 9 */
	public static final String REQUEST_TYPE1_Other = "9";
	/** Set Request_Type1.
		@param Request_Type1 Request_Type1	  */
	public void setRequest_Type1 (String Request_Type1)
	{

		set_Value (COLUMNNAME_Request_Type1, Request_Type1);
	}

	/** Get Request_Type1.
		@return Request_Type1	  */
	public String getRequest_Type1 () 
	{
		return (String)get_Value(COLUMNNAME_Request_Type1);
	}

	/** Request_Type2 AD_Reference_ID=1000013 */
	public static final int REQUEST_TYPE2_AD_Reference_ID=1000013;
	/** Meat not processed = 1 */
	public static final String REQUEST_TYPE2_MeatNotProcessed = "1";
	/** Seafood is processed = 2 */
	public static final String REQUEST_TYPE2_SeafoodIsProcessed = "2";
	/** Processed meat = 3 */
	public static final String REQUEST_TYPE2_ProcessedMeat = "3";
	/** Seafood = 4 */
	public static final String REQUEST_TYPE2_Seafood = "4";
	/** Fruits and vegetables = 5 */
	public static final String REQUEST_TYPE2_FruitsAndVegetables = "5";
	/** Seasoning = 6 */
	public static final String REQUEST_TYPE2_Seasoning = "6";
	/** Snack = 7 */
	public static final String REQUEST_TYPE2_Snack = "7";
	/** Delicatessen = 8 */
	public static final String REQUEST_TYPE2_Delicatessen = "8";
	/** Other = 9 */
	public static final String REQUEST_TYPE2_Other = "9";
	/** Set Request_Type2.
		@param Request_Type2 Request_Type2	  */
	public void setRequest_Type2 (String Request_Type2)
	{

		set_Value (COLUMNNAME_Request_Type2, Request_Type2);
	}

	/** Get Request_Type2.
		@return Request_Type2	  */
	public String getRequest_Type2 () 
	{
		return (String)get_Value(COLUMNNAME_Request_Type2);
	}

	/** Request_Type3 AD_Reference_ID=1000013 */
	public static final int REQUEST_TYPE3_AD_Reference_ID=1000013;
	/** Meat not processed = 1 */
	public static final String REQUEST_TYPE3_MeatNotProcessed = "1";
	/** Seafood is processed = 2 */
	public static final String REQUEST_TYPE3_SeafoodIsProcessed = "2";
	/** Processed meat = 3 */
	public static final String REQUEST_TYPE3_ProcessedMeat = "3";
	/** Seafood = 4 */
	public static final String REQUEST_TYPE3_Seafood = "4";
	/** Fruits and vegetables = 5 */
	public static final String REQUEST_TYPE3_FruitsAndVegetables = "5";
	/** Seasoning = 6 */
	public static final String REQUEST_TYPE3_Seasoning = "6";
	/** Snack = 7 */
	public static final String REQUEST_TYPE3_Snack = "7";
	/** Delicatessen = 8 */
	public static final String REQUEST_TYPE3_Delicatessen = "8";
	/** Other = 9 */
	public static final String REQUEST_TYPE3_Other = "9";
	/** Set Request_Type3.
		@param Request_Type3 Request_Type3	  */
	public void setRequest_Type3 (String Request_Type3)
	{

		set_Value (COLUMNNAME_Request_Type3, Request_Type3);
	}

	/** Get Request_Type3.
		@return Request_Type3	  */
	public String getRequest_Type3 () 
	{
		return (String)get_Value(COLUMNNAME_Request_Type3);
	}

	/** Request_Type4 AD_Reference_ID=1000013 */
	public static final int REQUEST_TYPE4_AD_Reference_ID=1000013;
	/** Meat not processed = 1 */
	public static final String REQUEST_TYPE4_MeatNotProcessed = "1";
	/** Seafood is processed = 2 */
	public static final String REQUEST_TYPE4_SeafoodIsProcessed = "2";
	/** Processed meat = 3 */
	public static final String REQUEST_TYPE4_ProcessedMeat = "3";
	/** Seafood = 4 */
	public static final String REQUEST_TYPE4_Seafood = "4";
	/** Fruits and vegetables = 5 */
	public static final String REQUEST_TYPE4_FruitsAndVegetables = "5";
	/** Seasoning = 6 */
	public static final String REQUEST_TYPE4_Seasoning = "6";
	/** Snack = 7 */
	public static final String REQUEST_TYPE4_Snack = "7";
	/** Delicatessen = 8 */
	public static final String REQUEST_TYPE4_Delicatessen = "8";
	/** Other = 9 */
	public static final String REQUEST_TYPE4_Other = "9";
	/** Set Request_Type4.
		@param Request_Type4 Request_Type4	  */
	public void setRequest_Type4 (String Request_Type4)
	{

		set_Value (COLUMNNAME_Request_Type4, Request_Type4);
	}

	/** Get Request_Type4.
		@return Request_Type4	  */
	public String getRequest_Type4 () 
	{
		return (String)get_Value(COLUMNNAME_Request_Type4);
	}

	/** Request_Type5 AD_Reference_ID=1000013 */
	public static final int REQUEST_TYPE5_AD_Reference_ID=1000013;
	/** Meat not processed = 1 */
	public static final String REQUEST_TYPE5_MeatNotProcessed = "1";
	/** Seafood is processed = 2 */
	public static final String REQUEST_TYPE5_SeafoodIsProcessed = "2";
	/** Processed meat = 3 */
	public static final String REQUEST_TYPE5_ProcessedMeat = "3";
	/** Seafood = 4 */
	public static final String REQUEST_TYPE5_Seafood = "4";
	/** Fruits and vegetables = 5 */
	public static final String REQUEST_TYPE5_FruitsAndVegetables = "5";
	/** Seasoning = 6 */
	public static final String REQUEST_TYPE5_Seasoning = "6";
	/** Snack = 7 */
	public static final String REQUEST_TYPE5_Snack = "7";
	/** Delicatessen = 8 */
	public static final String REQUEST_TYPE5_Delicatessen = "8";
	/** Other = 9 */
	public static final String REQUEST_TYPE5_Other = "9";
	/** Set Request_Type5.
		@param Request_Type5 Request_Type5	  */
	public void setRequest_Type5 (String Request_Type5)
	{

		set_Value (COLUMNNAME_Request_Type5, Request_Type5);
	}

	/** Get Request_Type5.
		@return Request_Type5	  */
	public String getRequest_Type5 () 
	{
		return (String)get_Value(COLUMNNAME_Request_Type5);
	}

	/** Set Same_Off_Address.
		@param Same_Off_Address Same_Off_Address	  */
	public void setSame_Off_Address (boolean Same_Off_Address)
	{
		set_Value (COLUMNNAME_Same_Off_Address, Boolean.valueOf(Same_Off_Address));
	}

	/** Get Same_Off_Address.
		@return Same_Off_Address	  */
	public boolean isSame_Off_Address () 
	{
		Object oo = get_Value(COLUMNNAME_Same_Off_Address);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Staff_Edu1 AD_Reference_ID=1000012 */
	public static final int STAFF_EDU1_AD_Reference_ID=1000012;
	/** ปริญญาเอก = ปริญญาเอก */
	public static final String STAFF_EDU1_ปริญญาเอก = "ปริญญาเอก";
	/** ปริญญาโท = ปริญญาโท */
	public static final String STAFF_EDU1_ปริญญาโท = "ปริญญาโท";
	/** ปริญญาตรี = ปริญญาตรี */
	public static final String STAFF_EDU1_ปริญญาตรี = "ปริญญาตรี";
	/** ปวส. = ปวส. */
	public static final String STAFF_EDU1_ปวส = "ปวส.";
	/** ปวช. = ปวช. */
	public static final String STAFF_EDU1_ปวช = "ปวช.";
	/** มํธยมศึกษาตอนปลาย = มํธยมศึกษาตอนปลาย */
	public static final String STAFF_EDU1_มํธยมศึกษาตอนปลาย = "มํธยมศึกษาตอนปลาย";
	/** มัธยมศึกษาตอนต้น = มัธยมศึกษาตอนต้น */
	public static final String STAFF_EDU1_มัธยมศึกษาตอนต้น = "มัธยมศึกษาตอนต้น";
	/** ประถมศึกษา = ประถมศึกษา */
	public static final String STAFF_EDU1_ประถมศึกษา = "ประถมศึกษา";
	/** ไม่ระบุ = ไม่ระบุ */
	public static final String STAFF_EDU1_ไม่ระบุ = "ไม่ระบุ";
	/** Set Staff_Edu1.
		@param Staff_Edu1 Staff_Edu1	  */
	public void setStaff_Edu1 (String Staff_Edu1)
	{

		set_Value (COLUMNNAME_Staff_Edu1, Staff_Edu1);
	}

	/** Get Staff_Edu1.
		@return Staff_Edu1	  */
	public String getStaff_Edu1 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Edu1);
	}

	/** Staff_Edu2 AD_Reference_ID=1000012 */
	public static final int STAFF_EDU2_AD_Reference_ID=1000012;
	/** ปริญญาเอก = ปริญญาเอก */
	public static final String STAFF_EDU2_ปริญญาเอก = "ปริญญาเอก";
	/** ปริญญาโท = ปริญญาโท */
	public static final String STAFF_EDU2_ปริญญาโท = "ปริญญาโท";
	/** ปริญญาตรี = ปริญญาตรี */
	public static final String STAFF_EDU2_ปริญญาตรี = "ปริญญาตรี";
	/** ปวส. = ปวส. */
	public static final String STAFF_EDU2_ปวส = "ปวส.";
	/** ปวช. = ปวช. */
	public static final String STAFF_EDU2_ปวช = "ปวช.";
	/** มํธยมศึกษาตอนปลาย = มํธยมศึกษาตอนปลาย */
	public static final String STAFF_EDU2_มํธยมศึกษาตอนปลาย = "มํธยมศึกษาตอนปลาย";
	/** มัธยมศึกษาตอนต้น = มัธยมศึกษาตอนต้น */
	public static final String STAFF_EDU2_มัธยมศึกษาตอนต้น = "มัธยมศึกษาตอนต้น";
	/** ประถมศึกษา = ประถมศึกษา */
	public static final String STAFF_EDU2_ประถมศึกษา = "ประถมศึกษา";
	/** ไม่ระบุ = ไม่ระบุ */
	public static final String STAFF_EDU2_ไม่ระบุ = "ไม่ระบุ";
	/** Set Staff_Edu2.
		@param Staff_Edu2 Staff_Edu2	  */
	public void setStaff_Edu2 (String Staff_Edu2)
	{

		set_Value (COLUMNNAME_Staff_Edu2, Staff_Edu2);
	}

	/** Get Staff_Edu2.
		@return Staff_Edu2	  */
	public String getStaff_Edu2 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Edu2);
	}

	/** Staff_Edu3 AD_Reference_ID=1000012 */
	public static final int STAFF_EDU3_AD_Reference_ID=1000012;
	/** ปริญญาเอก = ปริญญาเอก */
	public static final String STAFF_EDU3_ปริญญาเอก = "ปริญญาเอก";
	/** ปริญญาโท = ปริญญาโท */
	public static final String STAFF_EDU3_ปริญญาโท = "ปริญญาโท";
	/** ปริญญาตรี = ปริญญาตรี */
	public static final String STAFF_EDU3_ปริญญาตรี = "ปริญญาตรี";
	/** ปวส. = ปวส. */
	public static final String STAFF_EDU3_ปวส = "ปวส.";
	/** ปวช. = ปวช. */
	public static final String STAFF_EDU3_ปวช = "ปวช.";
	/** มํธยมศึกษาตอนปลาย = มํธยมศึกษาตอนปลาย */
	public static final String STAFF_EDU3_มํธยมศึกษาตอนปลาย = "มํธยมศึกษาตอนปลาย";
	/** มัธยมศึกษาตอนต้น = มัธยมศึกษาตอนต้น */
	public static final String STAFF_EDU3_มัธยมศึกษาตอนต้น = "มัธยมศึกษาตอนต้น";
	/** ประถมศึกษา = ประถมศึกษา */
	public static final String STAFF_EDU3_ประถมศึกษา = "ประถมศึกษา";
	/** ไม่ระบุ = ไม่ระบุ */
	public static final String STAFF_EDU3_ไม่ระบุ = "ไม่ระบุ";
	/** Set Staff_Edu3.
		@param Staff_Edu3 Staff_Edu3	  */
	public void setStaff_Edu3 (String Staff_Edu3)
	{

		set_Value (COLUMNNAME_Staff_Edu3, Staff_Edu3);
	}

	/** Get Staff_Edu3.
		@return Staff_Edu3	  */
	public String getStaff_Edu3 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Edu3);
	}

	/** Staff_Edu4 AD_Reference_ID=1000012 */
	public static final int STAFF_EDU4_AD_Reference_ID=1000012;
	/** ปริญญาเอก = ปริญญาเอก */
	public static final String STAFF_EDU4_ปริญญาเอก = "ปริญญาเอก";
	/** ปริญญาโท = ปริญญาโท */
	public static final String STAFF_EDU4_ปริญญาโท = "ปริญญาโท";
	/** ปริญญาตรี = ปริญญาตรี */
	public static final String STAFF_EDU4_ปริญญาตรี = "ปริญญาตรี";
	/** ปวส. = ปวส. */
	public static final String STAFF_EDU4_ปวส = "ปวส.";
	/** ปวช. = ปวช. */
	public static final String STAFF_EDU4_ปวช = "ปวช.";
	/** มํธยมศึกษาตอนปลาย = มํธยมศึกษาตอนปลาย */
	public static final String STAFF_EDU4_มํธยมศึกษาตอนปลาย = "มํธยมศึกษาตอนปลาย";
	/** มัธยมศึกษาตอนต้น = มัธยมศึกษาตอนต้น */
	public static final String STAFF_EDU4_มัธยมศึกษาตอนต้น = "มัธยมศึกษาตอนต้น";
	/** ประถมศึกษา = ประถมศึกษา */
	public static final String STAFF_EDU4_ประถมศึกษา = "ประถมศึกษา";
	/** ไม่ระบุ = ไม่ระบุ */
	public static final String STAFF_EDU4_ไม่ระบุ = "ไม่ระบุ";
	/** Set Staff_Edu4.
		@param Staff_Edu4 Staff_Edu4	  */
	public void setStaff_Edu4 (String Staff_Edu4)
	{

		set_Value (COLUMNNAME_Staff_Edu4, Staff_Edu4);
	}

	/** Get Staff_Edu4.
		@return Staff_Edu4	  */
	public String getStaff_Edu4 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Edu4);
	}

	/** Staff_Edu5 AD_Reference_ID=1000012 */
	public static final int STAFF_EDU5_AD_Reference_ID=1000012;
	/** ปริญญาเอก = ปริญญาเอก */
	public static final String STAFF_EDU5_ปริญญาเอก = "ปริญญาเอก";
	/** ปริญญาโท = ปริญญาโท */
	public static final String STAFF_EDU5_ปริญญาโท = "ปริญญาโท";
	/** ปริญญาตรี = ปริญญาตรี */
	public static final String STAFF_EDU5_ปริญญาตรี = "ปริญญาตรี";
	/** ปวส. = ปวส. */
	public static final String STAFF_EDU5_ปวส = "ปวส.";
	/** ปวช. = ปวช. */
	public static final String STAFF_EDU5_ปวช = "ปวช.";
	/** มํธยมศึกษาตอนปลาย = มํธยมศึกษาตอนปลาย */
	public static final String STAFF_EDU5_มํธยมศึกษาตอนปลาย = "มํธยมศึกษาตอนปลาย";
	/** มัธยมศึกษาตอนต้น = มัธยมศึกษาตอนต้น */
	public static final String STAFF_EDU5_มัธยมศึกษาตอนต้น = "มัธยมศึกษาตอนต้น";
	/** ประถมศึกษา = ประถมศึกษา */
	public static final String STAFF_EDU5_ประถมศึกษา = "ประถมศึกษา";
	/** ไม่ระบุ = ไม่ระบุ */
	public static final String STAFF_EDU5_ไม่ระบุ = "ไม่ระบุ";
	/** Set Staff_Edu5.
		@param Staff_Edu5 Staff_Edu5	  */
	public void setStaff_Edu5 (String Staff_Edu5)
	{

		set_Value (COLUMNNAME_Staff_Edu5, Staff_Edu5);
	}

	/** Get Staff_Edu5.
		@return Staff_Edu5	  */
	public String getStaff_Edu5 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Edu5);
	}

	/** Set Staff_Exp1.
		@param Staff_Exp1 Staff_Exp1	  */
	public void setStaff_Exp1 (int Staff_Exp1)
	{
		set_Value (COLUMNNAME_Staff_Exp1, Integer.valueOf(Staff_Exp1));
	}

	/** Get Staff_Exp1.
		@return Staff_Exp1	  */
	public int getStaff_Exp1 () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Staff_Exp1);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Staff_Exp2.
		@param Staff_Exp2 Staff_Exp2	  */
	public void setStaff_Exp2 (int Staff_Exp2)
	{
		set_Value (COLUMNNAME_Staff_Exp2, Integer.valueOf(Staff_Exp2));
	}

	/** Get Staff_Exp2.
		@return Staff_Exp2	  */
	public int getStaff_Exp2 () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Staff_Exp2);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Staff_Exp3.
		@param Staff_Exp3 Staff_Exp3	  */
	public void setStaff_Exp3 (int Staff_Exp3)
	{
		set_Value (COLUMNNAME_Staff_Exp3, Integer.valueOf(Staff_Exp3));
	}

	/** Get Staff_Exp3.
		@return Staff_Exp3	  */
	public int getStaff_Exp3 () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Staff_Exp3);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Staff_Exp4.
		@param Staff_Exp4 Staff_Exp4	  */
	public void setStaff_Exp4 (int Staff_Exp4)
	{
		set_Value (COLUMNNAME_Staff_Exp4, Integer.valueOf(Staff_Exp4));
	}

	/** Get Staff_Exp4.
		@return Staff_Exp4	  */
	public int getStaff_Exp4 () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Staff_Exp4);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Staff_Exp5.
		@param Staff_Exp5 Staff_Exp5	  */
	public void setStaff_Exp5 (int Staff_Exp5)
	{
		set_Value (COLUMNNAME_Staff_Exp5, Integer.valueOf(Staff_Exp5));
	}

	/** Get Staff_Exp5.
		@return Staff_Exp5	  */
	public int getStaff_Exp5 () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Staff_Exp5);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Staff_Lname1.
		@param Staff_Lname1 Staff_Lname1	  */
	public void setStaff_Lname1 (String Staff_Lname1)
	{
		set_Value (COLUMNNAME_Staff_Lname1, Staff_Lname1);
	}

	/** Get Staff_Lname1.
		@return Staff_Lname1	  */
	public String getStaff_Lname1 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Lname1);
	}

	/** Set Staff_Lname2.
		@param Staff_Lname2 Staff_Lname2	  */
	public void setStaff_Lname2 (String Staff_Lname2)
	{
		set_Value (COLUMNNAME_Staff_Lname2, Staff_Lname2);
	}

	/** Get Staff_Lname2.
		@return Staff_Lname2	  */
	public String getStaff_Lname2 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Lname2);
	}

	/** Set Staff_Lname3.
		@param Staff_Lname3 Staff_Lname3	  */
	public void setStaff_Lname3 (String Staff_Lname3)
	{
		set_Value (COLUMNNAME_Staff_Lname3, Staff_Lname3);
	}

	/** Get Staff_Lname3.
		@return Staff_Lname3	  */
	public String getStaff_Lname3 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Lname3);
	}

	/** Set Staff_Lname4.
		@param Staff_Lname4 Staff_Lname4	  */
	public void setStaff_Lname4 (String Staff_Lname4)
	{
		set_Value (COLUMNNAME_Staff_Lname4, Staff_Lname4);
	}

	/** Get Staff_Lname4.
		@return Staff_Lname4	  */
	public String getStaff_Lname4 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Lname4);
	}

	/** Set Staff_Lname5.
		@param Staff_Lname5 Staff_Lname5	  */
	public void setStaff_Lname5 (String Staff_Lname5)
	{
		set_Value (COLUMNNAME_Staff_Lname5, Staff_Lname5);
	}

	/** Get Staff_Lname5.
		@return Staff_Lname5	  */
	public String getStaff_Lname5 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Lname5);
	}

	/** Set Staff_Name1.
		@param Staff_Name1 Staff_Name1	  */
	public void setStaff_Name1 (String Staff_Name1)
	{
		set_Value (COLUMNNAME_Staff_Name1, Staff_Name1);
	}

	/** Get Staff_Name1.
		@return Staff_Name1	  */
	public String getStaff_Name1 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Name1);
	}

	/** Set Staff_Name2.
		@param Staff_Name2 Staff_Name2	  */
	public void setStaff_Name2 (String Staff_Name2)
	{
		set_Value (COLUMNNAME_Staff_Name2, Staff_Name2);
	}

	/** Get Staff_Name2.
		@return Staff_Name2	  */
	public String getStaff_Name2 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Name2);
	}

	/** Set Staff_Name3.
		@param Staff_Name3 Staff_Name3	  */
	public void setStaff_Name3 (String Staff_Name3)
	{
		set_Value (COLUMNNAME_Staff_Name3, Staff_Name3);
	}

	/** Get Staff_Name3.
		@return Staff_Name3	  */
	public String getStaff_Name3 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Name3);
	}

	/** Set Staff_Name4.
		@param Staff_Name4 Staff_Name4	  */
	public void setStaff_Name4 (String Staff_Name4)
	{
		set_Value (COLUMNNAME_Staff_Name4, Staff_Name4);
	}

	/** Get Staff_Name4.
		@return Staff_Name4	  */
	public String getStaff_Name4 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Name4);
	}

	/** Set Staff_Name5.
		@param Staff_Name5 Staff_Name5	  */
	public void setStaff_Name5 (String Staff_Name5)
	{
		set_Value (COLUMNNAME_Staff_Name5, Staff_Name5);
	}

	/** Get Staff_Name5.
		@return Staff_Name5	  */
	public String getStaff_Name5 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Name5);
	}

	/** Set Staff_Position1.
		@param Staff_Position1 Staff_Position1	  */
	public void setStaff_Position1 (String Staff_Position1)
	{
		set_Value (COLUMNNAME_Staff_Position1, Staff_Position1);
	}

	/** Get Staff_Position1.
		@return Staff_Position1	  */
	public String getStaff_Position1 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Position1);
	}

	/** Set Staff_Position2.
		@param Staff_Position2 Staff_Position2	  */
	public void setStaff_Position2 (String Staff_Position2)
	{
		set_Value (COLUMNNAME_Staff_Position2, Staff_Position2);
	}

	/** Get Staff_Position2.
		@return Staff_Position2	  */
	public String getStaff_Position2 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Position2);
	}

	/** Set Staff_Position3.
		@param Staff_Position3 Staff_Position3	  */
	public void setStaff_Position3 (String Staff_Position3)
	{
		set_Value (COLUMNNAME_Staff_Position3, Staff_Position3);
	}

	/** Get Staff_Position3.
		@return Staff_Position3	  */
	public String getStaff_Position3 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Position3);
	}

	/** Set Staff_Position4.
		@param Staff_Position4 Staff_Position4	  */
	public void setStaff_Position4 (String Staff_Position4)
	{
		set_Value (COLUMNNAME_Staff_Position4, Staff_Position4);
	}

	/** Get Staff_Position4.
		@return Staff_Position4	  */
	public String getStaff_Position4 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Position4);
	}

	/** Set Staff_Position5.
		@param Staff_Position5 Staff_Position5	  */
	public void setStaff_Position5 (String Staff_Position5)
	{
		set_Value (COLUMNNAME_Staff_Position5, Staff_Position5);
	}

	/** Get Staff_Position5.
		@return Staff_Position5	  */
	public String getStaff_Position5 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Position5);
	}

	/** Staff_Title1 AD_Reference_ID=1000011 */
	public static final int STAFF_TITLE1_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String STAFF_TITLE1_นาย = "1";
	/** นางสาว = 2 */
	public static final String STAFF_TITLE1_นางสาว = "2";
	/** นาง = 3 */
	public static final String STAFF_TITLE1_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String STAFF_TITLE1_อื่นๆ = "4";
	/** Set Staff_Title1.
		@param Staff_Title1 Staff_Title1	  */
	public void setStaff_Title1 (String Staff_Title1)
	{

		set_Value (COLUMNNAME_Staff_Title1, Staff_Title1);
	}

	/** Get Staff_Title1.
		@return Staff_Title1	  */
	public String getStaff_Title1 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Title1);
	}

	/** Staff_Title2 AD_Reference_ID=1000011 */
	public static final int STAFF_TITLE2_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String STAFF_TITLE2_นาย = "1";
	/** นางสาว = 2 */
	public static final String STAFF_TITLE2_นางสาว = "2";
	/** นาง = 3 */
	public static final String STAFF_TITLE2_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String STAFF_TITLE2_อื่นๆ = "4";
	/** Set Staff_Title2.
		@param Staff_Title2 Staff_Title2	  */
	public void setStaff_Title2 (String Staff_Title2)
	{

		set_Value (COLUMNNAME_Staff_Title2, Staff_Title2);
	}

	/** Get Staff_Title2.
		@return Staff_Title2	  */
	public String getStaff_Title2 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Title2);
	}

	/** Staff_Title3 AD_Reference_ID=1000011 */
	public static final int STAFF_TITLE3_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String STAFF_TITLE3_นาย = "1";
	/** นางสาว = 2 */
	public static final String STAFF_TITLE3_นางสาว = "2";
	/** นาง = 3 */
	public static final String STAFF_TITLE3_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String STAFF_TITLE3_อื่นๆ = "4";
	/** Set Staff_Title3.
		@param Staff_Title3 Staff_Title3	  */
	public void setStaff_Title3 (String Staff_Title3)
	{

		set_Value (COLUMNNAME_Staff_Title3, Staff_Title3);
	}

	/** Get Staff_Title3.
		@return Staff_Title3	  */
	public String getStaff_Title3 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Title3);
	}

	/** Staff_Title4 AD_Reference_ID=1000011 */
	public static final int STAFF_TITLE4_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String STAFF_TITLE4_นาย = "1";
	/** นางสาว = 2 */
	public static final String STAFF_TITLE4_นางสาว = "2";
	/** นาง = 3 */
	public static final String STAFF_TITLE4_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String STAFF_TITLE4_อื่นๆ = "4";
	/** Set Staff_Title4.
		@param Staff_Title4 Staff_Title4	  */
	public void setStaff_Title4 (String Staff_Title4)
	{

		set_Value (COLUMNNAME_Staff_Title4, Staff_Title4);
	}

	/** Get Staff_Title4.
		@return Staff_Title4	  */
	public String getStaff_Title4 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Title4);
	}

	/** Staff_Title5 AD_Reference_ID=1000011 */
	public static final int STAFF_TITLE5_AD_Reference_ID=1000011;
	/** นาย = 1 */
	public static final String STAFF_TITLE5_นาย = "1";
	/** นางสาว = 2 */
	public static final String STAFF_TITLE5_นางสาว = "2";
	/** นาง = 3 */
	public static final String STAFF_TITLE5_นาง = "3";
	/** อื่น ๆ = 4 */
	public static final String STAFF_TITLE5_อื่นๆ = "4";
	/** Set Staff_Title5.
		@param Staff_Title5 Staff_Title5	  */
	public void setStaff_Title5 (String Staff_Title5)
	{

		set_Value (COLUMNNAME_Staff_Title5, Staff_Title5);
	}

	/** Get Staff_Title5.
		@return Staff_Title5	  */
	public String getStaff_Title5 () 
	{
		return (String)get_Value(COLUMNNAME_Staff_Title5);
	}

	/** Set Std_BRC.
		@param Std_BRC Std_BRC	  */
	public void setStd_BRC (String Std_BRC)
	{
		set_Value (COLUMNNAME_Std_BRC, Std_BRC);
	}

	/** Get Std_BRC.
		@return Std_BRC	  */
	public String getStd_BRC () 
	{
		return (String)get_Value(COLUMNNAME_Std_BRC);
	}

	/** Set Std_Cert1.
		@param Std_Cert1 Std_Cert1	  */
	public void setStd_Cert1 (String Std_Cert1)
	{
		set_Value (COLUMNNAME_Std_Cert1, Std_Cert1);
	}

	/** Get Std_Cert1.
		@return Std_Cert1	  */
	public String getStd_Cert1 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert1);
	}

	/** Set Std_Cert2.
		@param Std_Cert2 Std_Cert2	  */
	public void setStd_Cert2 (String Std_Cert2)
	{
		set_Value (COLUMNNAME_Std_Cert2, Std_Cert2);
	}

	/** Get Std_Cert2.
		@return Std_Cert2	  */
	public String getStd_Cert2 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert2);
	}

	/** Set Std_Cert3.
		@param Std_Cert3 Std_Cert3	  */
	public void setStd_Cert3 (String Std_Cert3)
	{
		set_Value (COLUMNNAME_Std_Cert3, Std_Cert3);
	}

	/** Get Std_Cert3.
		@return Std_Cert3	  */
	public String getStd_Cert3 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert3);
	}

	/** Set Std_Cert4.
		@param Std_Cert4 Std_Cert4	  */
	public void setStd_Cert4 (String Std_Cert4)
	{
		set_Value (COLUMNNAME_Std_Cert4, Std_Cert4);
	}

	/** Get Std_Cert4.
		@return Std_Cert4	  */
	public String getStd_Cert4 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert4);
	}

	/** Set Std_Cert5.
		@param Std_Cert5 Std_Cert5	  */
	public void setStd_Cert5 (String Std_Cert5)
	{
		set_Value (COLUMNNAME_Std_Cert5, Std_Cert5);
	}

	/** Get Std_Cert5.
		@return Std_Cert5	  */
	public String getStd_Cert5 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert5);
	}

	/** Set Std_Cert6.
		@param Std_Cert6 Std_Cert6	  */
	public void setStd_Cert6 (String Std_Cert6)
	{
		set_Value (COLUMNNAME_Std_Cert6, Std_Cert6);
	}

	/** Get Std_Cert6.
		@return Std_Cert6	  */
	public String getStd_Cert6 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Cert6);
	}

	/** Std_Inbound1 AD_Reference_ID=1000003 */
	public static final int STD_INBOUND1_AD_Reference_ID=1000003;
	/** ในประเทศ = 1 */
	public static final String STD_INBOUND1_ในประเทศ = "1";
	/** ต่างประเทศ = 2 */
	public static final String STD_INBOUND1_ต่างประเทศ = "2";
	/** Set Std_Inbound1.
		@param Std_Inbound1 Std_Inbound1	  */
	public void setStd_Inbound1 (String Std_Inbound1)
	{

		set_Value (COLUMNNAME_Std_Inbound1, Std_Inbound1);
	}

	/** Get Std_Inbound1.
		@return Std_Inbound1	  */
	public String getStd_Inbound1 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Inbound1);
	}

	/** Std_Inbound2 AD_Reference_ID=1000003 */
	public static final int STD_INBOUND2_AD_Reference_ID=1000003;
	/** ในประเทศ = 1 */
	public static final String STD_INBOUND2_ในประเทศ = "1";
	/** ต่างประเทศ = 2 */
	public static final String STD_INBOUND2_ต่างประเทศ = "2";
	/** Set Std_Inbound2.
		@param Std_Inbound2 Std_Inbound2	  */
	public void setStd_Inbound2 (String Std_Inbound2)
	{

		set_Value (COLUMNNAME_Std_Inbound2, Std_Inbound2);
	}

	/** Get Std_Inbound2.
		@return Std_Inbound2	  */
	public String getStd_Inbound2 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Inbound2);
	}

	/** Std_Inbound4 AD_Reference_ID=1000003 */
	public static final int STD_INBOUND4_AD_Reference_ID=1000003;
	/** ในประเทศ = 1 */
	public static final String STD_INBOUND4_ในประเทศ = "1";
	/** ต่างประเทศ = 2 */
	public static final String STD_INBOUND4_ต่างประเทศ = "2";
	/** Set Std_Inbound4.
		@param Std_Inbound4 Std_Inbound4	  */
	public void setStd_Inbound4 (String Std_Inbound4)
	{

		set_Value (COLUMNNAME_Std_Inbound4, Std_Inbound4);
	}

	/** Get Std_Inbound4.
		@return Std_Inbound4	  */
	public String getStd_Inbound4 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Inbound4);
	}

	/** Std_Inbound5 AD_Reference_ID=1000003 */
	public static final int STD_INBOUND5_AD_Reference_ID=1000003;
	/** ในประเทศ = 1 */
	public static final String STD_INBOUND5_ในประเทศ = "1";
	/** ต่างประเทศ = 2 */
	public static final String STD_INBOUND5_ต่างประเทศ = "2";
	/** Set Std_Inbound5.
		@param Std_Inbound5 Std_Inbound5	  */
	public void setStd_Inbound5 (String Std_Inbound5)
	{

		set_Value (COLUMNNAME_Std_Inbound5, Std_Inbound5);
	}

	/** Get Std_Inbound5.
		@return Std_Inbound5	  */
	public String getStd_Inbound5 () 
	{
		return (String)get_Value(COLUMNNAME_Std_Inbound5);
	}

	/** Std_ISO AD_Reference_ID=1000014 */
	public static final int STD_ISO_AD_Reference_ID=1000014;
	/** ISO22000: = 001 */
	public static final String STD_ISO_ISO22000 = "001";
	/** ISO9000: = 002 */
	public static final String STD_ISO_ISO9000 = "002";
	/** Set Std_ISO.
		@param Std_ISO Std_ISO	  */
	public void setStd_ISO (String Std_ISO)
	{

		set_Value (COLUMNNAME_Std_ISO, Std_ISO);
	}

	/** Get Std_ISO.
		@return Std_ISO	  */
	public String getStd_ISO () 
	{
		return (String)get_Value(COLUMNNAME_Std_ISO);
	}

	/** Std_IssueBy3 AD_Reference_ID=1000002 */
	public static final int STD_ISSUEBY3_AD_Reference_ID=1000002;
	/** อย. = 1 */
	public static final String STD_ISSUEBY3_อย = "1";
	/** กรมประมง = 2 */
	public static final String STD_ISSUEBY3_กรมประมง = "2";
	/** กรมปศุสัตว์ = 3 */
	public static final String STD_ISSUEBY3_กรมปศุสัตว์ = "3";
	/** Codex( ) = 4 */
	public static final String STD_ISSUEBY3_Codex = "4";
	/** Set Std_IssueBy3.
		@param Std_IssueBy3 Std_IssueBy3	  */
	public void setStd_IssueBy3 (String Std_IssueBy3)
	{

		set_Value (COLUMNNAME_Std_IssueBy3, Std_IssueBy3);
	}

	/** Get Std_IssueBy3.
		@return Std_IssueBy3	  */
	public String getStd_IssueBy3 () 
	{
		return (String)get_Value(COLUMNNAME_Std_IssueBy3);
	}

	/** Std_IssueBy4 AD_Reference_ID=1000002 */
	public static final int STD_ISSUEBY4_AD_Reference_ID=1000002;
	/** อย. = 1 */
	public static final String STD_ISSUEBY4_อย = "1";
	/** กรมประมง = 2 */
	public static final String STD_ISSUEBY4_กรมประมง = "2";
	/** กรมปศุสัตว์ = 3 */
	public static final String STD_ISSUEBY4_กรมปศุสัตว์ = "3";
	/** Codex( ) = 4 */
	public static final String STD_ISSUEBY4_Codex = "4";
	/** Set Std_IssueBy4.
		@param Std_IssueBy4 Std_IssueBy4	  */
	public void setStd_IssueBy4 (String Std_IssueBy4)
	{

		set_Value (COLUMNNAME_Std_IssueBy4, Std_IssueBy4);
	}

	/** Get Std_IssueBy4.
		@return Std_IssueBy4	  */
	public String getStd_IssueBy4 () 
	{
		return (String)get_Value(COLUMNNAME_Std_IssueBy4);
	}

	/** Std_IssueBy5 AD_Reference_ID=1000002 */
	public static final int STD_ISSUEBY5_AD_Reference_ID=1000002;
	/** อย. = 1 */
	public static final String STD_ISSUEBY5_อย = "1";
	/** กรมประมง = 2 */
	public static final String STD_ISSUEBY5_กรมประมง = "2";
	/** กรมปศุสัตว์ = 3 */
	public static final String STD_ISSUEBY5_กรมปศุสัตว์ = "3";
	/** Codex( ) = 4 */
	public static final String STD_ISSUEBY5_Codex = "4";
	/** Set Std_IssueBy5.
		@param Std_IssueBy5 Std_IssueBy5	  */
	public void setStd_IssueBy5 (String Std_IssueBy5)
	{

		set_Value (COLUMNNAME_Std_IssueBy5, Std_IssueBy5);
	}

	/** Get Std_IssueBy5.
		@return Std_IssueBy5	  */
	public String getStd_IssueBy5 () 
	{
		return (String)get_Value(COLUMNNAME_Std_IssueBy5);
	}

	/** Set Std_Other.
		@param Std_Other Std_Other	  */
	public void setStd_Other (String Std_Other)
	{
		set_Value (COLUMNNAME_Std_Other, Std_Other);
	}

	/** Get Std_Other.
		@return Std_Other	  */
	public String getStd_Other () 
	{
		return (String)get_Value(COLUMNNAME_Std_Other);
	}

	/** Set Website.
		@param Website Website	  */
	public void setWebsite (String Website)
	{
		set_Value (COLUMNNAME_Website, Website);
	}

	/** Get Website.
		@return Website	  */
	public String getWebsite () 
	{
		return (String)get_Value(COLUMNNAME_Website);
	}
}