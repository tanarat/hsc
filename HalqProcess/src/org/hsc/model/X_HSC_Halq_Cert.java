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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for HSC_Halq_Cert
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Cert extends PO implements I_HSC_Halq_Cert, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120120L;

    /** Standard Constructor */
    public X_HSC_Halq_Cert (Properties ctx, int HSC_Halq_Cert_ID, String trxName)
    {
      super (ctx, HSC_Halq_Cert_ID, trxName);
      /** if (HSC_Halq_Cert_ID == 0)
        {
			setC_BPartner_ID (0);
			setHSC_Halq_Cert_ID (0);
			setHSC_Halq_Project_ID (0);
			setIsNew (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Cert (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Cert[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Cert_No.
		@param Cert_No Cert_No	  */
	public void setCert_No (String Cert_No)
	{
		set_Value (COLUMNNAME_Cert_No, Cert_No);
	}

	/** Get Cert_No.
		@return Cert_No	  */
	public String getCert_No () 
	{
		return (String)get_Value(COLUMNNAME_Cert_No);
	}

	/** Cert_Type AD_Reference_ID=1000057 */
	public static final int CERT_TYPE_AD_Reference_ID=1000057;
	/** โรงงาน = 1 */
	public static final String CERT_TYPE_FACTORY = "1";
	/** คลัง = 2 */
	public static final String CERT_TYPE_WAREHOUSE = "2";
	/** ขนส่ง = 3 */
	public static final String CERT_TYPE_TRANSPORT = "3";
	/** ยา = 4 */
	public static final String CERT_TYPE_PHARMACY = "4";
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

	/** Set Finish Date.
		@param DateFinish 
		Finish or (planned) completion date
	  */
	public void setDateFinish (Timestamp DateFinish)
	{
		set_Value (COLUMNNAME_DateFinish, DateFinish);
	}

	/** Get Finish Date.
		@return Finish or (planned) completion date
	  */
	public Timestamp getDateFinish () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFinish);
	}

	/** Set Date Start.
		@param DateStart 
		Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart)
	{
		set_Value (COLUMNNAME_DateStart, DateStart);
	}

	/** Get Date Start.
		@return Date Start for this Order
	  */
	public Timestamp getDateStart () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateStart);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set HSC_Halq_Cert.
		@param HSC_Halq_Cert_ID HSC_Halq_Cert	  */
	public void setHSC_Halq_Cert_ID (int HSC_Halq_Cert_ID)
	{
		if (HSC_Halq_Cert_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Cert_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Cert_ID, Integer.valueOf(HSC_Halq_Cert_ID));
	}

	/** Get HSC_Halq_Cert.
		@return HSC_Halq_Cert	  */
	public int getHSC_Halq_Cert_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Cert_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set IsNew.
		@param IsNew IsNew	  */
	public void setIsNew (boolean IsNew)
	{
		set_Value (COLUMNNAME_IsNew, Boolean.valueOf(IsNew));
	}

	/** Get IsNew.
		@return IsNew	  */
	public boolean isNew () 
	{
		Object oo = get_Value(COLUMNNAME_IsNew);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}