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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for HSC_Halq_Project_Prospect
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Project_Prospect extends PO implements I_HSC_Halq_Project_Prospect, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120104L;

    /** Standard Constructor */
    public X_HSC_Halq_Project_Prospect (Properties ctx, int HSC_Halq_Project_Prospect_ID, String trxName)
    {
      super (ctx, HSC_Halq_Project_Prospect_ID, trxName);
      /** if (HSC_Halq_Project_Prospect_ID == 0)
        {
			setHSC_Halq_Project_Prospect_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Project_Prospect (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Project_Prospect[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_User getAD_User() throws RuntimeException
    {
		return (I_AD_User)MTable.get(getCtx(), I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.hsc.model.I_HSC_BP getHSC_BP() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_BP)MTable.get(getCtx(), org.hsc.model.I_HSC_BP.Table_Name)
			.getPO(getHSC_BP_ID(), get_TrxName());	}

	/** Set HSC_BP.
		@param HSC_BP_ID HSC_BP	  */
	public void setHSC_BP_ID (int HSC_BP_ID)
	{
		if (HSC_BP_ID < 1) 
			set_Value (COLUMNNAME_HSC_BP_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_BP_ID, Integer.valueOf(HSC_BP_ID));
	}

	/** Get HSC_BP.
		@return HSC_BP	  */
	public int getHSC_BP_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_BP_ID);
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
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Project_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Project_ID, Integer.valueOf(HSC_Halq_Project_ID));
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

	/** Set HSC_Halq_Project_Prospect_ID.
		@param HSC_Halq_Project_Prospect_ID HSC_Halq_Project_Prospect_ID	  */
	public void setHSC_Halq_Project_Prospect_ID (int HSC_Halq_Project_Prospect_ID)
	{
		if (HSC_Halq_Project_Prospect_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Project_Prospect_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Project_Prospect_ID, Integer.valueOf(HSC_Halq_Project_Prospect_ID));
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

	/** Set Send_Mail.
		@param Send_Mail Send_Mail	  */
	public void setSend_Mail (String Send_Mail)
	{
		set_Value (COLUMNNAME_Send_Mail, Send_Mail);
	}

	/** Get Send_Mail.
		@return Send_Mail	  */
	public String getSend_Mail () 
	{
		return (String)get_Value(COLUMNNAME_Send_Mail);
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