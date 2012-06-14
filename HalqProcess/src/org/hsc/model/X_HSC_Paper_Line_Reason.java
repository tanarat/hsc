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

/** Generated Model for HSC_Paper_Line_Reason
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Paper_Line_Reason extends PO implements I_HSC_Paper_Line_Reason, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111112L;

    /** Standard Constructor */
    public X_HSC_Paper_Line_Reason (Properties ctx, int HSC_Paper_Line_Reason_ID, String trxName)
    {
      super (ctx, HSC_Paper_Line_Reason_ID, trxName);
      /** if (HSC_Paper_Line_Reason_ID == 0)
        {
			setHSC_Eval_Item_Reason_ID (0);
			setHSC_Paper_Line_ID (0);
			setHSC_Paper_Line_Reason_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Paper_Line_Reason (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Paper_Line_Reason[")
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

	public org.hsc.model.I_HSC_Eval_Item_Reason getHSC_Eval_Item_Reason() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Eval_Item_Reason)MTable.get(getCtx(), org.hsc.model.I_HSC_Eval_Item_Reason.Table_Name)
			.getPO(getHSC_Eval_Item_Reason_ID(), get_TrxName());	}

	/** Set HSC_Eval_Item_Reason.
		@param HSC_Eval_Item_Reason_ID HSC_Eval_Item_Reason	  */
	public void setHSC_Eval_Item_Reason_ID (int HSC_Eval_Item_Reason_ID)
	{
		if (HSC_Eval_Item_Reason_ID < 1) 
			set_Value (COLUMNNAME_HSC_Eval_Item_Reason_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Eval_Item_Reason_ID, Integer.valueOf(HSC_Eval_Item_Reason_ID));
	}

	/** Get HSC_Eval_Item_Reason.
		@return HSC_Eval_Item_Reason	  */
	public int getHSC_Eval_Item_Reason_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Eval_Item_Reason_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Paper_Line getHSC_Paper_Line() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Paper_Line)MTable.get(getCtx(), org.hsc.model.I_HSC_Paper_Line.Table_Name)
			.getPO(getHSC_Paper_Line_ID(), get_TrxName());	}

	/** Set HSC_Paper_Line.
		@param HSC_Paper_Line_ID HSC_Paper_Line	  */
	public void setHSC_Paper_Line_ID (int HSC_Paper_Line_ID)
	{
		if (HSC_Paper_Line_ID < 1) 
			set_Value (COLUMNNAME_HSC_Paper_Line_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Paper_Line_ID, Integer.valueOf(HSC_Paper_Line_ID));
	}

	/** Get HSC_Paper_Line.
		@return HSC_Paper_Line	  */
	public int getHSC_Paper_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Paper_Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Paper_Line_Reason.
		@param HSC_Paper_Line_Reason_ID HSC_Paper_Line_Reason	  */
	public void setHSC_Paper_Line_Reason_ID (int HSC_Paper_Line_Reason_ID)
	{
		if (HSC_Paper_Line_Reason_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Paper_Line_Reason_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Paper_Line_Reason_ID, Integer.valueOf(HSC_Paper_Line_Reason_ID));
	}

	/** Get HSC_Paper_Line_Reason.
		@return HSC_Paper_Line_Reason	  */
	public int getHSC_Paper_Line_Reason_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Paper_Line_Reason_ID);
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