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

/** Generated Model for HSC_C_Certificate
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_C_Certificate extends PO implements I_HSC_C_Certificate, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120123L;

    /** Standard Constructor */
    public X_HSC_C_Certificate (Properties ctx, int HSC_C_Certificate_ID, String trxName)
    {
      super (ctx, HSC_C_Certificate_ID, trxName);
      /** if (HSC_C_Certificate_ID == 0)
        {
			setHSC_C_Certificate_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_C_Certificate (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_C_Certificate[")
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

	/** Set Cert_Type.
		@param Cert_Type Cert_Type	  */
	public void setCert_Type (boolean Cert_Type)
	{
		set_Value (COLUMNNAME_Cert_Type, Boolean.valueOf(Cert_Type));
	}

	/** Get Cert_Type.
		@return Cert_Type	  */
	public boolean isCert_Type () 
	{
		Object oo = get_Value(COLUMNNAME_Cert_Type);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set HSC_C_Certificate.
		@param HSC_C_Certificate_ID HSC_C_Certificate	  */
	public void setHSC_C_Certificate_ID (int HSC_C_Certificate_ID)
	{
		if (HSC_C_Certificate_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_C_Certificate_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_C_Certificate_ID, Integer.valueOf(HSC_C_Certificate_ID));
	}

	/** Get HSC_C_Certificate.
		@return HSC_C_Certificate	  */
	public int getHSC_C_Certificate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_C_Certificate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set issued_by.
		@param issued_by issued_by	  */
	public void setissued_by (String issued_by)
	{
		set_Value (COLUMNNAME_issued_by, issued_by);
	}

	/** Get issued_by.
		@return issued_by	  */
	public String getissued_by () 
	{
		return (String)get_Value(COLUMNNAME_issued_by);
	}

	/** Set issued_by_list.
		@param issued_by_list issued_by_list	  */
	public void setissued_by_list (String issued_by_list)
	{
		set_Value (COLUMNNAME_issued_by_list, issued_by_list);
	}

	/** Get issued_by_list.
		@return issued_by_list	  */
	public String getissued_by_list () 
	{
		return (String)get_Value(COLUMNNAME_issued_by_list);
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

	/** Set Standard.
		@param Standard Standard	  */
	public void setStandard (String Standard)
	{
		set_Value (COLUMNNAME_Standard, Standard);
	}

	/** Get Standard.
		@return Standard	  */
	public String getStandard () 
	{
		return (String)get_Value(COLUMNNAME_Standard);
	}

	/** Set Standerd_List.
		@param Standerd_List Standerd_List	  */
	public void setStanderd_List (String Standerd_List)
	{
		set_Value (COLUMNNAME_Standerd_List, Standerd_List);
	}

	/** Get Standerd_List.
		@return Standerd_List	  */
	public String getStanderd_List () 
	{
		return (String)get_Value(COLUMNNAME_Standerd_List);
	}

	/** Set valid_from.
		@param valid_from valid_from	  */
	public void setvalid_from (Timestamp valid_from)
	{
		set_Value (COLUMNNAME_valid_from, valid_from);
	}

	/** Get valid_from.
		@return valid_from	  */
	public Timestamp getvalid_from () 
	{
		return (Timestamp)get_Value(COLUMNNAME_valid_from);
	}

	/** Set valid_to.
		@param valid_to valid_to	  */
	public void setvalid_to (Timestamp valid_to)
	{
		set_Value (COLUMNNAME_valid_to, valid_to);
	}

	/** Get valid_to.
		@return valid_to	  */
	public Timestamp getvalid_to () 
	{
		return (Timestamp)get_Value(COLUMNNAME_valid_to);
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