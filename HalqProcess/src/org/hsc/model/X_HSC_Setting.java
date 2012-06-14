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

/** Generated Model for HSC_Setting
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Setting extends PO implements I_HSC_Setting, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120110L;

    /** Standard Constructor */
    public X_HSC_Setting (Properties ctx, int HSC_Setting_ID, String trxName)
    {
      super (ctx, HSC_Setting_ID, trxName);
      /** if (HSC_Setting_ID == 0)
        {
			setHSC_Setting_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Setting (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Setting[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_R_MailText getApm_MailText() throws RuntimeException
    {
		return (I_R_MailText)MTable.get(getCtx(), I_R_MailText.Table_Name)
			.getPO(getApm_MailText_ID(), get_TrxName());	}

	/** Set Apm Mail Template.
		@param Apm_MailText_ID 
		Text templates for mailings
	  */
	public void setApm_MailText_ID (int Apm_MailText_ID)
	{
		if (Apm_MailText_ID < 1) 
			set_Value (COLUMNNAME_Apm_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Apm_MailText_ID, Integer.valueOf(Apm_MailText_ID));
	}

	/** Get Apm Mail Template.
		@return Text templates for mailings
	  */
	public int getApm_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Apm_MailText_ID);
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

	/** Set HSC_Setting.
		@param HSC_Setting_ID HSC_Setting	  */
	public void setHSC_Setting_ID (int HSC_Setting_ID)
	{
		if (HSC_Setting_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Setting_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Setting_ID, Integer.valueOf(HSC_Setting_ID));
	}

	/** Get HSC_Setting.
		@return HSC_Setting	  */
	public int getHSC_Setting_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Setting_ID);
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

	/** Set Next_Cert_Seq.
		@param Next_Cert_Seq 
		Next certificate sequence number
	  */
	public void setNext_Cert_Seq (BigDecimal Next_Cert_Seq)
	{
		set_Value (COLUMNNAME_Next_Cert_Seq, Next_Cert_Seq);
	}

	/** Get Next_Cert_Seq.
		@return Next certificate sequence number
	  */
	public BigDecimal getNext_Cert_Seq () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Next_Cert_Seq);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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