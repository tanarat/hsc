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

/** Generated Model for HSC_Email_Log
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Email_Log extends PO implements I_HSC_Email_Log, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120105L;

    /** Standard Constructor */
    public X_HSC_Email_Log (Properties ctx, int HSC_Email_Log_ID, String trxName)
    {
      super (ctx, HSC_Email_Log_ID, trxName);
      /** if (HSC_Email_Log_ID == 0)
        {
			setHSC_Email_Log_ID (0);
			setHSC_Email_Type (null);
			setName (null);
			setR_MailText_ID (0);
			setsendfrom (null);
			setsendto (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Email_Log (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Email_Log[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set HSC_Email_Log.
		@param HSC_Email_Log_ID HSC_Email_Log	  */
	public void setHSC_Email_Log_ID (int HSC_Email_Log_ID)
	{
		if (HSC_Email_Log_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Email_Log_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Email_Log_ID, Integer.valueOf(HSC_Email_Log_ID));
	}

	/** Get HSC_Email_Log.
		@return HSC_Email_Log	  */
	public int getHSC_Email_Log_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Email_Log_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Email_Type.
		@param HSC_Email_Type HSC_Email_Type	  */
	public void setHSC_Email_Type (String HSC_Email_Type)
	{
		set_Value (COLUMNNAME_HSC_Email_Type, HSC_Email_Type);
	}

	/** Get HSC_Email_Type.
		@return HSC_Email_Type	  */
	public String getHSC_Email_Type () 
	{
		return (String)get_Value(COLUMNNAME_HSC_Email_Type);
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

	public I_R_MailText getR_MailText() throws RuntimeException
    {
		return (I_R_MailText)MTable.get(getCtx(), I_R_MailText.Table_Name)
			.getPO(getR_MailText_ID(), get_TrxName());	}

	/** Set Mail Template.
		@param R_MailText_ID 
		Text templates for mailings
	  */
	public void setR_MailText_ID (int R_MailText_ID)
	{
		if (R_MailText_ID < 1) 
			set_Value (COLUMNNAME_R_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
	}

	/** Get Mail Template.
		@return Text templates for mailings
	  */
	public int getR_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set sendfrom.
		@param sendfrom sendfrom	  */
	public void setsendfrom (String sendfrom)
	{
		set_Value (COLUMNNAME_sendfrom, sendfrom);
	}

	/** Get sendfrom.
		@return sendfrom	  */
	public String getsendfrom () 
	{
		return (String)get_Value(COLUMNNAME_sendfrom);
	}

	/** Set sendto.
		@param sendto sendto	  */
	public void setsendto (String sendto)
	{
		set_Value (COLUMNNAME_sendto, sendto);
	}

	/** Get sendto.
		@return sendto	  */
	public String getsendto () 
	{
		return (String)get_Value(COLUMNNAME_sendto);
	}

	/** Set SentStatus.
		@param SentStatus SentStatus	  */
	public void setSentStatus (String SentStatus)
	{
		set_Value (COLUMNNAME_SentStatus, SentStatus);
	}

	/** Get SentStatus.
		@return SentStatus	  */
	public String getSentStatus () 
	{
		return (String)get_Value(COLUMNNAME_SentStatus);
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