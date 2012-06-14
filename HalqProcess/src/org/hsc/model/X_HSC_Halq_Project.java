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

/** Generated Model for HSC_Halq_Project
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Project extends PO implements I_HSC_Halq_Project, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111017L;

    /** Standard Constructor */
    public X_HSC_Halq_Project (Properties ctx, int HSC_Halq_Project_ID, String trxName)
    {
      super (ctx, HSC_Halq_Project_ID, trxName);
      /** if (HSC_Halq_Project_ID == 0)
        {
			setHSC_Halq_Project_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Project (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Project[")
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

	public I_R_MailText getApprove_MailText() throws RuntimeException
    {
		return (I_R_MailText)MTable.get(getCtx(), I_R_MailText.Table_Name)
			.getPO(getApprove_MailText_ID(), get_TrxName());	}

	/** Set Approve_MailText_ID.
		@param Approve_MailText_ID 
		Text templates for mailings
	  */
	public void setApprove_MailText_ID (int Approve_MailText_ID)
	{
		if (Approve_MailText_ID < 1) 
			set_Value (COLUMNNAME_Approve_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Approve_MailText_ID, Integer.valueOf(Approve_MailText_ID));
	}

	/** Get Approve_MailText_ID.
		@return Text templates for mailings
	  */
	public int getApprove_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Approve_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Inform_Date.
		@param Inform_Date Inform_Date	  */
	public void setInform_Date (Timestamp Inform_Date)
	{
		set_Value (COLUMNNAME_Inform_Date, Inform_Date);
	}

	/** Get Inform_Date.
		@return Inform_Date	  */
	public Timestamp getInform_Date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Inform_Date);
	}

	public I_R_MailText getInvite_MailText() throws RuntimeException
    {
		return (I_R_MailText)MTable.get(getCtx(), I_R_MailText.Table_Name)
			.getPO(getInvite_MailText_ID(), get_TrxName());	}

	/** Set Invite_MailText_ID.
		@param Invite_MailText_ID 
		Text templates for mailings
	  */
	public void setInvite_MailText_ID (int Invite_MailText_ID)
	{
		if (Invite_MailText_ID < 1) 
			set_Value (COLUMNNAME_Invite_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Invite_MailText_ID, Integer.valueOf(Invite_MailText_ID));
	}

	/** Get Invite_MailText_ID.
		@return Text templates for mailings
	  */
	public int getInvite_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Invite_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Last_Register_Date.
		@param Last_Register_Date Last_Register_Date	  */
	public void setLast_Register_Date (Timestamp Last_Register_Date)
	{
		set_Value (COLUMNNAME_Last_Register_Date, Last_Register_Date);
	}

	/** Get Last_Register_Date.
		@return Last_Register_Date	  */
	public Timestamp getLast_Register_Date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Last_Register_Date);
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

	/** Set Num_Of_Factory.
		@param Num_Of_Factory Num_Of_Factory	  */
	public void setNum_Of_Factory (int Num_Of_Factory)
	{
		set_Value (COLUMNNAME_Num_Of_Factory, Integer.valueOf(Num_Of_Factory));
	}

	/** Get Num_Of_Factory.
		@return Num_Of_Factory	  */
	public int getNum_Of_Factory () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Num_Of_Factory);
		if (ii == null)
			 return 0;
		return ii.intValue();
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