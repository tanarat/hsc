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

/** Generated Model for HSC_User_Register_Form
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_User_Register_Form extends PO implements I_HSC_User_Register_Form, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111021L;

    /** Standard Constructor */
    public X_HSC_User_Register_Form (Properties ctx, int HSC_User_Register_Form_ID, String trxName)
    {
      super (ctx, HSC_User_Register_Form_ID, trxName);
      /** if (HSC_User_Register_Form_ID == 0)
        {
			setHSC_Halq_Registration_Form_ID (0);
			setHSC_User_Register_Form_ID (0);
			setUserName (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_User_Register_Form (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_User_Register_Form[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set HSC_User_Register_Form_ID.
		@param HSC_User_Register_Form_ID HSC_User_Register_Form_ID	  */
	public void setHSC_User_Register_Form_ID (int HSC_User_Register_Form_ID)
	{
		if (HSC_User_Register_Form_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_User_Register_Form_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_User_Register_Form_ID, Integer.valueOf(HSC_User_Register_Form_ID));
	}

	/** Get HSC_User_Register_Form_ID.
		@return HSC_User_Register_Form_ID	  */
	public int getHSC_User_Register_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_User_Register_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Registered EMail.
		@param UserName 
		Email of the responsible for the System
	  */
	public void setUserName (String UserName)
	{
		set_Value (COLUMNNAME_UserName, UserName);
	}

	/** Get Registered EMail.
		@return Email of the responsible for the System
	  */
	public String getUserName () 
	{
		return (String)get_Value(COLUMNNAME_UserName);
	}
}