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

/** Generated Model for HSC_Halq_Training
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Halq_Training extends PO implements I_HSC_Halq_Training, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111101L;

    /** Standard Constructor */
    public X_HSC_Halq_Training (Properties ctx, int HSC_Halq_Training_ID, String trxName)
    {
      super (ctx, HSC_Halq_Training_ID, trxName);
      /** if (HSC_Halq_Training_ID == 0)
        {
			setHSC_Halq_Project_ID (0);
			setHSC_Halq_Training_ID (0);
			setName (null);
			setTraining_Type (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Halq_Training (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Halq_Training[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public org.hsc.model.I_HSC_Q_Paper getFeedback() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Q_Paper)MTable.get(getCtx(), org.hsc.model.I_HSC_Q_Paper.Table_Name)
			.getPO(getFeedback_ID(), get_TrxName());	}

	/** Set Feedback_ID.
		@param Feedback_ID Feedback_ID	  */
	public void setFeedback_ID (int Feedback_ID)
	{
		if (Feedback_ID < 1) 
			set_Value (COLUMNNAME_Feedback_ID, null);
		else 
			set_Value (COLUMNNAME_Feedback_ID, Integer.valueOf(Feedback_ID));
	}

	/** Get Feedback_ID.
		@return Feedback_ID	  */
	public int getFeedback_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Feedback_ID);
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

	/** Set HSC_Halq_Training.
		@param HSC_Halq_Training_ID HSC_Halq_Training	  */
	public void setHSC_Halq_Training_ID (int HSC_Halq_Training_ID)
	{
		if (HSC_Halq_Training_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Training_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Halq_Training_ID, Integer.valueOf(HSC_Halq_Training_ID));
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

	public org.hsc.model.I_HSC_Q_Paper getPosttest() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Q_Paper)MTable.get(getCtx(), org.hsc.model.I_HSC_Q_Paper.Table_Name)
			.getPO(getPosttest_ID(), get_TrxName());	}

	/** Set Posttest_ID.
		@param Posttest_ID Posttest_ID	  */
	public void setPosttest_ID (int Posttest_ID)
	{
		if (Posttest_ID < 1) 
			set_Value (COLUMNNAME_Posttest_ID, null);
		else 
			set_Value (COLUMNNAME_Posttest_ID, Integer.valueOf(Posttest_ID));
	}

	/** Get Posttest_ID.
		@return Posttest_ID	  */
	public int getPosttest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Posttest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Q_Paper getPretest() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Q_Paper)MTable.get(getCtx(), org.hsc.model.I_HSC_Q_Paper.Table_Name)
			.getPO(getPretest_ID(), get_TrxName());	}

	/** Set Pretest_ID.
		@param Pretest_ID Pretest_ID	  */
	public void setPretest_ID (int Pretest_ID)
	{
		if (Pretest_ID < 1) 
			set_Value (COLUMNNAME_Pretest_ID, null);
		else 
			set_Value (COLUMNNAME_Pretest_ID, Integer.valueOf(Pretest_ID));
	}

	/** Get Pretest_ID.
		@return Pretest_ID	  */
	public int getPretest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Pretest_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Training_Date.
		@param Training_Date Training_Date	  */
	public void setTraining_Date (Timestamp Training_Date)
	{
		set_Value (COLUMNNAME_Training_Date, Training_Date);
	}

	/** Get Training_Date.
		@return Training_Date	  */
	public Timestamp getTraining_Date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Training_Date);
	}

	public I_C_BPartner getTraining_Location() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getTraining_Location_ID(), get_TrxName());	}

	/** Set Training_Location_ID.
		@param Training_Location_ID Training_Location_ID	  */
	public void setTraining_Location_ID (int Training_Location_ID)
	{
		if (Training_Location_ID < 1) 
			set_Value (COLUMNNAME_Training_Location_ID, null);
		else 
			set_Value (COLUMNNAME_Training_Location_ID, Integer.valueOf(Training_Location_ID));
	}

	/** Get Training_Location_ID.
		@return Training_Location_ID	  */
	public int getTraining_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Training_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Training_Time_Start.
		@param Training_Time_Start Training_Time_Start	  */
	public void setTraining_Time_Start (Timestamp Training_Time_Start)
	{
		set_Value (COLUMNNAME_Training_Time_Start, Training_Time_Start);
	}

	/** Get Training_Time_Start.
		@return Training_Time_Start	  */
	public Timestamp getTraining_Time_Start () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Training_Time_Start);
	}

	/** Set Training_Time_Stop.
		@param Training_Time_Stop Training_Time_Stop	  */
	public void setTraining_Time_Stop (Timestamp Training_Time_Stop)
	{
		set_Value (COLUMNNAME_Training_Time_Stop, Training_Time_Stop);
	}

	/** Get Training_Time_Stop.
		@return Training_Time_Stop	  */
	public Timestamp getTraining_Time_Stop () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Training_Time_Stop);
	}

	/** Training_Type AD_Reference_ID=1000024 */
	public static final int TRAINING_TYPE_AD_Reference_ID=1000024;
	/** phase1 = 1 */
	public static final String TRAINING_TYPE_Phase1 = "1";
	/** phase2 = 2 */
	public static final String TRAINING_TYPE_Phase2 = "2";
	/** Set Training_Type.
		@param Training_Type Training_Type	  */
	public void setTraining_Type (String Training_Type)
	{

		set_Value (COLUMNNAME_Training_Type, Training_Type);
	}

	/** Get Training_Type.
		@return Training_Type	  */
	public String getTraining_Type () 
	{
		return (String)get_Value(COLUMNNAME_Training_Type);
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