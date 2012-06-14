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

/** Generated Model for HSC_BP_Staff
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_BP_Staff extends PO implements I_HSC_BP_Staff, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 25541206L;

    /** Standard Constructor */
    public X_HSC_BP_Staff (Properties ctx, int HSC_BP_Staff_ID, String trxName)
    {
      super (ctx, HSC_BP_Staff_ID, trxName);
      /** if (HSC_BP_Staff_ID == 0)
        {
			setHSC_BP_Staff_ID (0);
			setIsContactPerson (false);
			setIsLeader (false);
        } */
    }

    /** Load Constructor */
    public X_HSC_BP_Staff (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_BP_Staff[")
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

	/** Set BP Name.
		@param BPName BP Name	  */
	public void setBPName (String BPName)
	{
		throw new IllegalArgumentException ("BPName is virtual column");	}

	/** Get BP Name.
		@return BP Name	  */
	public String getBPName () 
	{
		return (String)get_Value(COLUMNNAME_BPName);
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

	/** Set Education.
		@param Education Education	  */
	public void setEducation (String Education)
	{
		set_Value (COLUMNNAME_Education, Education);
	}

	/** Get Education.
		@return Education	  */
	public String getEducation () 
	{
		return (String)get_Value(COLUMNNAME_Education);
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

	/** Set ExpYear.
		@param ExpYear ExpYear	  */
	public void setExpYear (int ExpYear)
	{
		set_Value (COLUMNNAME_ExpYear, Integer.valueOf(ExpYear));
	}

	/** Get ExpYear.
		@return ExpYear	  */
	public int getExpYear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExpYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Project)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Project.Table_Name)
			.getPO(getHSC_Halq_Project_ID(), get_TrxName());	}

	/** Set HSC_Halq_Project_ID.
		@param HSC_Halq_Project_ID HSC_Halq_Project_ID	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID)
	{
		if (HSC_Halq_Project_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, Integer.valueOf(HSC_Halq_Project_ID));
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

	/** Set IsContactPerson.
		@param IsContactPerson IsContactPerson	  */
	public void setIsContactPerson (boolean IsContactPerson)
	{
		set_Value (COLUMNNAME_IsContactPerson, Boolean.valueOf(IsContactPerson));
	}

	/** Get IsContactPerson.
		@return IsContactPerson	  */
	public boolean isContactPerson () 
	{
		Object oo = get_Value(COLUMNNAME_IsContactPerson);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsLeader.
		@param IsLeader IsLeader	  */
	public void setIsLeader (boolean IsLeader)
	{
		set_Value (COLUMNNAME_IsLeader, Boolean.valueOf(IsLeader));
	}

	/** Get IsLeader.
		@return IsLeader	  */
	public boolean isLeader () 
	{
		Object oo = get_Value(COLUMNNAME_IsLeader);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsTraining1Staff.
		@param IsTraining1Staff IsTraining1Staff	  */
	public void setIsTraining1Staff (boolean IsTraining1Staff)
	{
		set_Value (COLUMNNAME_IsTraining1Staff, Boolean.valueOf(IsTraining1Staff));
	}

	/** Get IsTraining1Staff.
		@return IsTraining1Staff	  */
	public boolean isTraining1Staff () 
	{
		Object oo = get_Value(COLUMNNAME_IsTraining1Staff);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsTraining2Staff.
		@param IsTraining2Staff IsTraining2Staff	  */
	public void setIsTraining2Staff (boolean IsTraining2Staff)
	{
		set_Value (COLUMNNAME_IsTraining2Staff, Boolean.valueOf(IsTraining2Staff));
	}

	/** Get IsTraining2Staff.
		@return IsTraining2Staff	  */
	public boolean isTraining2Staff () 
	{
		Object oo = get_Value(COLUMNNAME_IsTraining2Staff);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set LastName.
		@param LastName LastName	  */
	public void setLastName (String LastName)
	{
		set_Value (COLUMNNAME_LastName, LastName);
	}

	/** Get LastName.
		@return LastName	  */
	public String getLastName () 
	{
		return (String)get_Value(COLUMNNAME_LastName);
	}

	/** Set LoginName.
		@param LoginName LoginName	  */
	public void setLoginName (String LoginName)
	{
		set_Value (COLUMNNAME_LoginName, LoginName);
	}

	/** Get LoginName.
		@return LoginName	  */
	public String getLoginName () 
	{
		return (String)get_Value(COLUMNNAME_LoginName);
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

	/** Set Phone.
		@param Phone 
		Identifies a telephone number
	  */
	public void setPhone (String Phone)
	{
		set_Value (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone () 
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set Position.
		@param Position Position	  */
	public void setPosition (String Position)
	{
		set_Value (COLUMNNAME_Position, Position);
	}

	/** Get Position.
		@return Position	  */
	public String getPosition () 
	{
		return (String)get_Value(COLUMNNAME_Position);
	}

	/** Title AD_Reference_ID=1000011 */
	public static final int TITLE_AD_Reference_ID=1000011;
	/** เธ�เธฒเธข = 1 */
	public static final String TITLE_MR= "1";
	/** เธ�เธฒเธ�เธชเธฒเธง = 2 */
	public static final String TITLE_MISS = "2";
	/** เธ�เธฒเธ� = 3 */
	public static final String TITLE_MRS = "3";
	/** เธญเธทเน�เธ� เน� = 4 */
	public static final String TITLE_OTHER = "4";
	/** Set Title.
		@param Title 
		Name this entity is referred to as
	  */
	public void setTitle (String Title)
	{

		set_Value (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle () 
	{
		return (String)get_Value(COLUMNNAME_Title);
	}
}