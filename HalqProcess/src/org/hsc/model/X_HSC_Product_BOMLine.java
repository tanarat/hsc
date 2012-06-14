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

/** Generated Model for HSC_Product_BOMLine
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Product_BOMLine extends PO implements I_HSC_Product_BOMLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25541208L;

    /** Standard Constructor */
    public X_HSC_Product_BOMLine (Properties ctx, int HSC_Product_BOMLine_ID, String trxName)
    {
      super (ctx, HSC_Product_BOMLine_ID, trxName);
      /** if (HSC_Product_BOMLine_ID == 0)
        {
			setHSC_Product_BOM_ID (0);
			setHSC_Product_BOMLine_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Product_BOMLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Product_BOMLine[")
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

	public org.hsc.model.I_HSC_Product_BOM getHSC_Product_BOM() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Product_BOM)MTable.get(getCtx(), org.hsc.model.I_HSC_Product_BOM.Table_Name)
			.getPO(getHSC_Product_BOM_ID(), get_TrxName());	}

	/** Set HSC_Product_BOM.
		@param HSC_Product_BOM_ID HSC_Product_BOM	  */
	public void setHSC_Product_BOM_ID (int HSC_Product_BOM_ID)
	{
		if (HSC_Product_BOM_ID < 1) 
			set_Value (COLUMNNAME_HSC_Product_BOM_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Product_BOM_ID, Integer.valueOf(HSC_Product_BOM_ID));
	}

	/** Get HSC_Product_BOM.
		@return HSC_Product_BOM	  */
	public int getHSC_Product_BOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Product_BOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Product_BOMLine.
		@param HSC_Product_BOMLine_ID HSC_Product_BOMLine	  */
	public void setHSC_Product_BOMLine_ID (int HSC_Product_BOMLine_ID)
	{
		if (HSC_Product_BOMLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Product_BOMLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Product_BOMLine_ID, Integer.valueOf(HSC_Product_BOMLine_ID));
	}

	/** Get HSC_Product_BOMLine.
		@return HSC_Product_BOMLine	  */
	public int getHSC_Product_BOMLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Product_BOMLine_ID);
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