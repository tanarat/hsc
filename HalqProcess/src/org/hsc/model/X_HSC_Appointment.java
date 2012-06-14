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

/** Generated Model for HSC_Appointment
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Appointment extends PO implements I_HSC_Appointment, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20120119L;

    /** Standard Constructor */
    public X_HSC_Appointment (Properties ctx, int HSC_Appointment_ID, String trxName)
    {
      super (ctx, HSC_Appointment_ID, trxName);
      /** if (HSC_Appointment_ID == 0)
        {
			setAdvisor_ID (0);
			setAppointmentType (null);
			setC_BPartner_ID (0);
			setEvalDate (new Timestamp( System.currentTimeMillis() ));
			setHSC_Appointment_ID (0);
			setHSC_Eval_Tmpl_ID (0);
			setHSC_Halq_Project_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Appointment (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Appointment[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_BPartner getAdvisor() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getAdvisor_ID(), get_TrxName());	}

	/** Set Advisor_ID.
		@param Advisor_ID Advisor_ID	  */
	public void setAdvisor_ID (int Advisor_ID)
	{
		if (Advisor_ID < 1) 
			set_Value (COLUMNNAME_Advisor_ID, null);
		else 
			set_Value (COLUMNNAME_Advisor_ID, Integer.valueOf(Advisor_ID));
	}

	/** Get Advisor_ID.
		@return Advisor_ID	  */
	public int getAdvisor_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Advisor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** AppointmentType AD_Reference_ID=1000043 */
	public static final int APPOINTMENTTYPE_AD_Reference_ID=1000043;
	/** 1st Visit = V1 */
	public static final String APPOINTMENTTYPE_1stVisit = "V1";
	/** 2nd Visit = V2 */
	public static final String APPOINTMENTTYPE_2ndVisit = "V2";
	/** 3rd Visit = V3 */
	public static final String APPOINTMENTTYPE_3rdVisit = "V3";
	/** 1st Audit = A1 */
	public static final String APPOINTMENTTYPE_1stAudit = "A1";
	/** 2nd Audit = A2 */
	public static final String APPOINTMENTTYPE_2ndAudit = "A2";
	/** 3rd Audit = A3 */
	public static final String APPOINTMENTTYPE_3rdAudit = "A3";
	/** Set Appointment Type.
		@param AppointmentType Appointment Type	  */
	public void setAppointmentType (String AppointmentType)
	{

		set_Value (COLUMNNAME_AppointmentType, AppointmentType);
	}

	/** Get Appointment Type.
		@return Appointment Type	  */
	public String getAppointmentType () 
	{
		return (String)get_Value(COLUMNNAME_AppointmentType);
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

	/** Set Evaluation Date.
		@param EvalDate Evaluation Date	  */
	public void setEvalDate (Timestamp EvalDate)
	{
		set_Value (COLUMNNAME_EvalDate, EvalDate);
	}

	/** Get Evaluation Date.
		@return Evaluation Date	  */
	public Timestamp getEvalDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EvalDate);
	}

	/** Set HSC Appointment.
		@param HSC_Appointment_ID HSC Appointment	  */
	public void setHSC_Appointment_ID (int HSC_Appointment_ID)
	{
		if (HSC_Appointment_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Appointment_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Appointment_ID, Integer.valueOf(HSC_Appointment_ID));
	}

	/** Get HSC Appointment.
		@return HSC Appointment	  */
	public int getHSC_Appointment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Appointment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Eval_Tmpl getHSC_Eval_Tmpl() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Eval_Tmpl)MTable.get(getCtx(), org.hsc.model.I_HSC_Eval_Tmpl.Table_Name)
			.getPO(getHSC_Eval_Tmpl_ID(), get_TrxName());	}

	/** Set Checklist.
		@param HSC_Eval_Tmpl_ID Checklist	  */
	public void setHSC_Eval_Tmpl_ID (int HSC_Eval_Tmpl_ID)
	{
		if (HSC_Eval_Tmpl_ID < 1) 
			set_Value (COLUMNNAME_HSC_Eval_Tmpl_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Eval_Tmpl_ID, Integer.valueOf(HSC_Eval_Tmpl_ID));
	}

	/** Get Checklist.
		@return Checklist	  */
	public int getHSC_Eval_Tmpl_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Eval_Tmpl_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Halq_Project)MTable.get(getCtx(), org.hsc.model.I_HSC_Halq_Project.Table_Name)
			.getPO(getHSC_Halq_Project_ID(), get_TrxName());	}

	/** Set HSC_Halq_Project.
		@param HSC_Halq_Project_ID HSC_Halq_Project	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID)
	{
		if (HSC_Halq_Project_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, Integer.valueOf(HSC_Halq_Project_ID));
	}

	/** Get HSC_Halq_Project.
		@return HSC_Halq_Project	  */
	public int getHSC_Halq_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Project_ID);
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

	/** Set Send EMail.
		@param SendEMail 
		Enable sending Document EMail
	  */
	public void setSendEMail (String SendEMail)
	{
		set_Value (COLUMNNAME_SendEMail, SendEMail);
	}

	/** Get Send EMail.
		@return Enable sending Document EMail
	  */
	public String getSendEMail () 
	{
		return (String)get_Value(COLUMNNAME_SendEMail);
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