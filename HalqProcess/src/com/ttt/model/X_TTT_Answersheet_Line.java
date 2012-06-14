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

/** Generated Model for TTT_Answersheet_Line
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_TTT_Answersheet_Line extends PO implements I_TTT_Answersheet_Line, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120117L;

    /** Standard Constructor */
    public X_TTT_Answersheet_Line (Properties ctx, int TTT_Answersheet_Line_ID, String trxName)
    {
      super (ctx, TTT_Answersheet_Line_ID, trxName);
      /** if (TTT_Answersheet_Line_ID == 0)
        {
			setName (null);
			setTTT_Answersheet_ID (0);
			setTTT_Answersheet_Line_ID (0);
			setTTT_Question_Line_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_TTT_Answersheet_Line (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TTT_Answersheet_Line[")
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

	/** Set Selected_Answer.
		@param Selected_Answer Selected_Answer	  */
	public void setSelected_Answer (int Selected_Answer)
	{
		set_Value (COLUMNNAME_Selected_Answer, Integer.valueOf(Selected_Answer));
	}

	/** Get Selected_Answer.
		@return Selected_Answer	  */
	public int getSelected_Answer () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Selected_Answer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public com.ttt.model.I_TTT_Answersheet getTTT_Answersheet() throws RuntimeException
    {
		return (com.ttt.model.I_TTT_Answersheet)MTable.get(getCtx(), com.ttt.model.I_TTT_Answersheet.Table_Name)
			.getPO(getTTT_Answersheet_ID(), get_TrxName());	}

	/** Set TTT_Answersheet.
		@param TTT_Answersheet_ID TTT_Answersheet	  */
	public void setTTT_Answersheet_ID (int TTT_Answersheet_ID)
	{
		if (TTT_Answersheet_ID < 1) 
			set_Value (COLUMNNAME_TTT_Answersheet_ID, null);
		else 
			set_Value (COLUMNNAME_TTT_Answersheet_ID, Integer.valueOf(TTT_Answersheet_ID));
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

	/** Set TTT_Answersheet_Line.
		@param TTT_Answersheet_Line_ID TTT_Answersheet_Line	  */
	public void setTTT_Answersheet_Line_ID (int TTT_Answersheet_Line_ID)
	{
		if (TTT_Answersheet_Line_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TTT_Answersheet_Line_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TTT_Answersheet_Line_ID, Integer.valueOf(TTT_Answersheet_Line_ID));
	}

	/** Get TTT_Answersheet_Line.
		@return TTT_Answersheet_Line	  */
	public int getTTT_Answersheet_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TTT_Answersheet_Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public com.ttt.model.I_TTT_Question_Line getTTT_Question_Line() throws RuntimeException
    {
		return (com.ttt.model.I_TTT_Question_Line)MTable.get(getCtx(), com.ttt.model.I_TTT_Question_Line.Table_Name)
			.getPO(getTTT_Question_Line_ID(), get_TrxName());	}

	/** Set TTT_Question_Line.
		@param TTT_Question_Line_ID TTT_Question_Line	  */
	public void setTTT_Question_Line_ID (int TTT_Question_Line_ID)
	{
		if (TTT_Question_Line_ID < 1) 
			set_Value (COLUMNNAME_TTT_Question_Line_ID, null);
		else 
			set_Value (COLUMNNAME_TTT_Question_Line_ID, Integer.valueOf(TTT_Question_Line_ID));
	}

	/** Get TTT_Question_Line.
		@return TTT_Question_Line	  */
	public int getTTT_Question_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TTT_Question_Line_ID);
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