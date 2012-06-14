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

/** Generated Model for HSC_Staff_Training
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Staff_Training extends PO implements I_HSC_Staff_Training, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111102L;

    /** Standard Constructor */
    public X_HSC_Staff_Training (Properties ctx, int HSC_Staff_Training_ID, String trxName)
    {
      super (ctx, HSC_Staff_Training_ID, trxName);
      /** if (HSC_Staff_Training_ID == 0)
        {
			setHSC_BP_Staff_ID (0);
			setHSC_Halq_Training_ID (0);
			setHSC_Staff_Training_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HSC_Staff_Training (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Staff_Training[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (String AD_User_ID)
	{
		throw new IllegalArgumentException ("AD_User_ID is virtual column");	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public String getAD_User_ID () 
	{
		return (String)get_Value(COLUMNNAME_AD_User_ID);
	}

	/** Set BP_Staff_Name.
		@param BP_Staff_Name BP_Staff_Name	  */
	public void setBP_Staff_Name (String BP_Staff_Name)
	{
		throw new IllegalArgumentException ("BP_Staff_Name is virtual column");	}

	/** Get BP_Staff_Name.
		@return BP_Staff_Name	  */
	public String getBP_Staff_Name () 
	{
		return (String)get_Value(COLUMNNAME_BP_Staff_Name);
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

	/** Set Education.
		@param Education Education	  */
	public void setEducation (String Education)
	{
		throw new IllegalArgumentException ("Education is virtual column");	}

	/** Get Education.
		@return Education	  */
	public String getEducation () 
	{
		return (String)get_Value(COLUMNNAME_Education);
	}

	/** Set ExpYear.
		@param ExpYear ExpYear	  */
	public void setExpYear (String ExpYear)
	{
		throw new IllegalArgumentException ("ExpYear is virtual column");	}

	/** Get ExpYear.
		@return ExpYear	  */
	public String getExpYear () 
	{
		return (String)get_Value(COLUMNNAME_ExpYear);
	}

	public org.hsc.model.I_HSC_BP_Staff getHSC_BP_Staff() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_BP_Staff)MTable.get(getCtx(), org.hsc.model.I_HSC_BP_Staff.Table_Name)
			.getPO(getHSC_BP_Staff_ID(), get_TrxName());	}

	/** Set HSC_BP_Staff.
		@param HSC_BP_Staff_ID HSC_BP_Staff	  */
	public void setHSC_BP_Staff_ID (int HSC_BP_Staff_ID)
	{
		if (HSC_BP_Staff_ID < 1) 
			set_Value (COLUMNNAME_HSC_BP_Staff_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_BP_Staff_ID, Integer.valueOf(HSC_BP_Staff_ID));
	}

	/** Get HSC_BP_Staff.
		@return HSC_BP_Staff	  */
	public int getHSC_BP_Staff_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_BP_Staff_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Halq_Training getHSC_Halq_Training() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Training)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Training.Table_Name)
			.getPO(getHSC_Halq_Training_ID(), get_TrxName());	}

	/** Set HSC_Halq_Training.
		@param HSC_Halq_Training_ID HSC_Halq_Training	  */
	public void setHSC_Halq_Training_ID (int HSC_Halq_Training_ID)
	{
		if (HSC_Halq_Training_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Training_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Training_ID, Integer.valueOf(HSC_Halq_Training_ID));
	}

	/** Get HSC_Halq_Training.
		@return HSC_Halq_Training	  */
	public int getHSC_Halq_Training_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Training_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Staff_Training.
		@param HSC_Staff_Training_ID HSC_Staff_Training	  */
	public void setHSC_Staff_Training_ID (int HSC_Staff_Training_ID)
	{
		if (HSC_Staff_Training_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Staff_Training_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Staff_Training_ID, Integer.valueOf(HSC_Staff_Training_ID));
	}

	/** Get HSC_Staff_Training.
		@return HSC_Staff_Training	  */
	public int getHSC_Staff_Training_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Staff_Training_ID);
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

	/** Set Position.
		@param Position Position	  */
	public void setPosition (String Position)
	{
		throw new IllegalArgumentException ("Position is virtual column");	}

	/** Get Position.
		@return Position	  */
	public String getPosition () 
	{
		return (String)get_Value(COLUMNNAME_Position);
	}
}