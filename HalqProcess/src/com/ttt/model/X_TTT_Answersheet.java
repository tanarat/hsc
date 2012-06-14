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
package com.ttt.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for TTT_Answersheet
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_TTT_Answersheet extends PO implements I_TTT_Answersheet, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120117L;

    /** Standard Constructor */
    public X_TTT_Answersheet (Properties ctx, int TTT_Answersheet_ID, String trxName)
    {
      super (ctx, TTT_Answersheet_ID, trxName);
      /** if (TTT_Answersheet_ID == 0)
        {
			setName (null);
			setTTT_Answersheet_ID (0);
			setTTT_Question_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_TTT_Answersheet (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TTT_Answersheet[")
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

	/** Set HSC_BP_Staff.
		@param HSC_BP_Staff_ID HSC_BP_Staff	  */
	public void setHSC_BP_Staff_ID (int HSC_BP_Staff_ID)
	{
		if (HSC_BP_Staff_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_BP_Staff_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_BP_Staff_ID, Integer.valueOf(HSC_BP_Staff_ID));
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

	/** Set HSC_BP_Staff_Name.
		@param HSC_BP_Staff_Name HSC_BP_Staff_Name	  */
	public void setHSC_BP_Staff_Name (String HSC_BP_Staff_Name)
	{
		throw new IllegalArgumentException ("HSC_BP_Staff_Name is virtual column");	}

	/** Get HSC_BP_Staff_Name.
		@return HSC_BP_Staff_Name	  */
	public String getHSC_BP_Staff_Name () 
	{
		return (String)get_Value(COLUMNNAME_HSC_BP_Staff_Name);
	}

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

	/** Set TTT_Answersheet.
		@param TTT_Answersheet_ID TTT_Answersheet	  */
	public void setTTT_Answersheet_ID (int TTT_Answersheet_ID)
	{
		if (TTT_Answersheet_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TTT_Answersheet_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TTT_Answersheet_ID, Integer.valueOf(TTT_Answersheet_ID));
	}

	/** Get TTT_Answersheet.
		@return TTT_Answersheet	  */
	public int getTTT_Answersheet_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TTT_Answersheet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public com.ttt.model.I_TTT_Question getTTT_Question() throws RuntimeException
    {
		return (com.ttt.model.I_TTT_Question)MTable.get(getCtx(), com.ttt.model.I_TTT_Question.Table_Name)
			.getPO(getTTT_Question_ID(), get_TrxName());	}

	/** Set TTT_Question.
		@param TTT_Question_ID TTT_Question	  */
	public void setTTT_Question_ID (int TTT_Question_ID)
	{
		if (TTT_Question_ID < 1) 
			set_Value (COLUMNNAME_TTT_Question_ID, null);
		else 
			set_Value (COLUMNNAME_TTT_Question_ID, Integer.valueOf(TTT_Question_ID));
	}

	/** Get TTT_Question.
		@return TTT_Question	  */
	public int getTTT_Question_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TTT_Question_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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