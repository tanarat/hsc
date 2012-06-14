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

/** Generated Model for HSC_Halq_Approve
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Approve extends PO implements I_HSC_Halq_Approve, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111025L;

    /** Standard Constructor */
    public X_HSC_Halq_Approve (Properties ctx, int HSC_Halq_Approve_ID, String trxName)
    {
      super (ctx, HSC_Halq_Approve_ID, trxName);
      /** if (HSC_Halq_Approve_ID == 0)
        {
			setHSC_Halq_Approve_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Approve (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Approve[")
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

	/** Set HSC_Halq_Approve_ID.
		@param HSC_Halq_Approve_ID HSC_Halq_Approve_ID	  */
	public void setHSC_Halq_Approve_ID (int HSC_Halq_Approve_ID)
	{
		if (HSC_Halq_Approve_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Approve_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Approve_ID, Integer.valueOf(HSC_Halq_Approve_ID));
	}

	/** Get HSC_Halq_Approve_ID.
		@return HSC_Halq_Approve_ID	  */
	public int getHSC_Halq_Approve_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Approve_ID);
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

	public org.hsc.model.I_HSC_Halq_Registration_Form getHSC_Halq_Registration_Form() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Registration_Form)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Registration_Form.Table_Name)
			.getPO(getHSC_Halq_Registration_Form_ID(), get_TrxName());	}

	/** Set HSC_Halq_Registration_Form_ID.
		@param HSC_Halq_Registration_Form_ID HSC_Halq_Registration_Form_ID	  */
	public void setHSC_Halq_Registration_Form_ID (int HSC_Halq_Registration_Form_ID)
	{
		if (HSC_Halq_Registration_Form_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Registration_Form_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Registration_Form_ID, Integer.valueOf(HSC_Halq_Registration_Form_ID));
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

	/** Set Send_Approve_Mail.
		@param Send_Approve_Mail Send_Approve_Mail	  */
	public void setSend_Approve_Mail (String Send_Approve_Mail)
	{
		set_Value (COLUMNNAME_Send_Approve_Mail, Send_Approve_Mail);
	}

	/** Get Send_Approve_Mail.
		@return Send_Approve_Mail	  */
	public String getSend_Approve_Mail () 
	{
		return (String)get_Value(COLUMNNAME_Send_Approve_Mail);
	}
}