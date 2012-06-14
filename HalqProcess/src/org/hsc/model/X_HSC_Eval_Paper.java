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

/** Generated Model for HSC_Eval_Paper
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_HSC_Eval_Paper extends PO implements I_HSC_Eval_Paper, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20111116L;

    /** Standard Constructor */
    public X_HSC_Eval_Paper (Properties ctx, int HSC_Eval_Paper_ID, String trxName)
    {
      super (ctx, HSC_Eval_Paper_ID, trxName);
      /** if (HSC_Eval_Paper_ID == 0)
        {
			setEvalDate (new Timestamp( System.currentTimeMillis() ));
			setHSC_BP_ID (0);
			setHSC_Eval_Paper_ID (0);
			setHSC_Eval_Tmpl_ID (0);
			setHSC_Halq_Project_ID (0);
			setIsConform (false);
			setIsDefect (false);
			setName (null);
			setPaperType (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_HSC_Eval_Paper (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_HSC_Eval_Paper[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Assignment.
		@param Assignment Assignment	  */
	public void setAssignment (String Assignment)
	{
		set_Value (COLUMNNAME_Assignment, Assignment);
	}

	/** Get Assignment.
		@return Assignment	  */
	public String getAssignment () 
	{
		return (String)get_Value(COLUMNNAME_Assignment);
	}

	/** Set Create Checklist Item.
		@param CreateItemLine Create Checklist Item	  */
	public void setCreateItemLine (String CreateItemLine)
	{
		set_Value (COLUMNNAME_CreateItemLine, CreateItemLine);
	}

	/** Get Create Checklist Item.
		@return Create Checklist Item	  */
	public String getCreateItemLine () 
	{
		return (String)get_Value(COLUMNNAME_CreateItemLine);
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

	public org.hsc.model.I_HSC_BP getHSC_BP() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_BP)MTable.get(getCtx(), org.hsc.model.I_HSC_BP.Table_Name)
			.getPO(getHSC_BP_ID(), get_TrxName());	}

	/** Set HSC BP.
		@param HSC_BP_ID HSC BP	  */
	public void setHSC_BP_ID (int HSC_BP_ID)
	{
		if (HSC_BP_ID < 1) 
			set_Value (COLUMNNAME_HSC_BP_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_BP_ID, Integer.valueOf(HSC_BP_ID));
	}

	/** Get HSC BP.
		@return HSC BP	  */
	public int getHSC_BP_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_BP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HSC_Eval_Paper.
		@param HSC_Eval_Paper_ID 
		แบบฟอร์มประเมิน HAL-Q
	  */
	public void setHSC_Eval_Paper_ID (int HSC_Eval_Paper_ID)
	{
		if (HSC_Eval_Paper_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HSC_Eval_Paper_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HSC_Eval_Paper_ID, Integer.valueOf(HSC_Eval_Paper_ID));
	}

	/** Get HSC_Eval_Paper.
		@return แบบฟอร์มประเมิน HAL-Q
	  */
	public int getHSC_Eval_Paper_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Eval_Paper_ID);
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

	/** Set HSC Halq Project.
		@param HSC_Halq_Project_ID HSC Halq Project	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID)
	{
		if (HSC_Halq_Project_ID < 1) 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, null);
		else 
			set_Value (COLUMNNAME_HSC_Halq_Project_ID, Integer.valueOf(HSC_Halq_Project_ID));
	}

	/** Get HSC Halq Project.
		@return HSC Halq Project	  */
	public int getHSC_Halq_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HSC_Halq_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Conform to the system.
		@param IsConform 
		สอดคล้องกับระบบ
	  */
	public void setIsConform (boolean IsConform)
	{
		set_Value (COLUMNNAME_IsConform, Boolean.valueOf(IsConform));
	}

	/** Get Conform to the system.
		@return สอดคล้องกับระบบ
	  */
	public boolean isConform () 
	{
		Object oo = get_Value(COLUMNNAME_IsConform);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Have defects.
		@param IsDefect Have defects	  */
	public void setIsDefect (boolean IsDefect)
	{
		set_Value (COLUMNNAME_IsDefect, Boolean.valueOf(IsDefect));
	}

	/** Get Have defects.
		@return Have defects	  */
	public boolean isDefect () 
	{
		Object oo = get_Value(COLUMNNAME_IsDefect);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Next Visit Date.
		@param nextvisit 
		นัดหมายครั้งต่อไป
	  */
	public void setnextvisit (Timestamp nextvisit)
	{
		set_Value (COLUMNNAME_nextvisit, nextvisit);
	}

	/** Get Next Visit Date.
		@return นัดหมายครั้งต่อไป
	  */
	public Timestamp getnextvisit () 
	{
		return (Timestamp)get_Value(COLUMNNAME_nextvisit);
	}

	/** PaperType AD_Reference_ID=1000043 */
	public static final int PAPERTYPE_AD_Reference_ID=1000043;
	/** 1st Visit = V1 */
	public static final String PAPERTYPE_1stVisit = "V1";
	/** 2nd Visit = V2 */
	public static final String PAPERTYPE_2ndVisit = "V2";
	/** 3rd Visit = V3 */
	public static final String PAPERTYPE_3rdVisit = "V3";
	/** 1st Audit = A1 */
	public static final String PAPERTYPE_1stAudit = "A1";
	/** 2nd Audit = A2 */
	public static final String PAPERTYPE_2ndAudit = "A2";
	/** 3rd Audit = A3 */
	public static final String PAPERTYPE_3rdAudit = "A3";
	/** Set PaperType.
		@param PaperType PaperType	  */
	public void setPaperType (String PaperType)
	{

		set_Value (COLUMNNAME_PaperType, PaperType);
	}

	/** Get PaperType.
		@return PaperType	  */
	public String getPaperType () 
	{
		return (String)get_Value(COLUMNNAME_PaperType);
	}

	/** Set Problem.
		@param Problem Problem	  */
	public void setProblem (String Problem)
	{
		set_Value (COLUMNNAME_Problem, Problem);
	}

	/** Get Problem.
		@return Problem	  */
	public String getProblem () 
	{
		return (String)get_Value(COLUMNNAME_Problem);
	}

	public org.hsc.model.I_HSC_Eval_Paper getRefPaper() throws RuntimeException
    {
		return (org.hsc.model.I_HSC_Eval_Paper)MTable.get(getCtx(), org.hsc.model.I_HSC_Eval_Paper.Table_Name)
			.getPO(getRefPaper_ID(), get_TrxName());	}

	/** Set Ref Paper.
		@param RefPaper_ID Ref Paper	  */
	public void setRefPaper_ID (int RefPaper_ID)
	{
		if (RefPaper_ID < 1) 
			set_Value (COLUMNNAME_RefPaper_ID, null);
		else 
			set_Value (COLUMNNAME_RefPaper_ID, Integer.valueOf(RefPaper_ID));
	}

	/** Get Ref Paper.
		@return Ref Paper	  */
	public int getRefPaper_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RefPaper_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Representative.
		@param Representative Representative	  */
	public void setRepresentative (String Representative)
	{
		set_Value (COLUMNNAME_Representative, Representative);
	}

	/** Get Representative.
		@return Representative	  */
	public String getRepresentative () 
	{
		return (String)get_Value(COLUMNNAME_Representative);
	}

	/** Set Result.
		@param Result 
		Result of the action taken
	  */
	public void setResult (String Result)
	{
		set_Value (COLUMNNAME_Result, Result);
	}

	/** Get Result.
		@return Result of the action taken
	  */
	public String getResult () 
	{
		return (String)get_Value(COLUMNNAME_Result);
	}

	/** Set Suggestion.
		@param Suggestion Suggestion	  */
	public void setSuggestion (String Suggestion)
	{
		set_Value (COLUMNNAME_Suggestion, Suggestion);
	}

	/** Get Suggestion.
		@return Suggestion	  */
	public String getSuggestion () 
	{
		return (String)get_Value(COLUMNNAME_Suggestion);
	}

	/** Set Total Advices.
		@param TotalAdvice 
		จำนวนข้อแนะนำ
	  */
	public void setTotalAdvice (int TotalAdvice)
	{
		set_Value (COLUMNNAME_TotalAdvice, Integer.valueOf(TotalAdvice));
	}

	/** Get Total Advices.
		@return จำนวนข้อแนะนำ
	  */
	public int getTotalAdvice () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TotalAdvice);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total Defects.
		@param TotalDefect 
		จำนวนข้อบกพร่อง
	  */
	public void setTotalDefect (int TotalDefect)
	{
		set_Value (COLUMNNAME_TotalDefect, Integer.valueOf(TotalDefect));
	}

	/** Get Total Defects.
		@return จำนวนข้อบกพร่อง
	  */
	public int getTotalDefect () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TotalDefect);
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