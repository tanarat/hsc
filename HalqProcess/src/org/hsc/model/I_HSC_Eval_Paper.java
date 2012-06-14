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
package org.hsc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HSC_Eval_Paper
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HSC_Eval_Paper 
{

    /** TableName=HSC_Eval_Paper */
    public static final String Table_Name = "HSC_Eval_Paper";

    /** AD_Table_ID=1000042 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Assignment */
    public static final String COLUMNNAME_Assignment = "Assignment";

	/** Set Assignment	  */
	public void setAssignment (String Assignment);

	/** Get Assignment	  */
	public String getAssignment();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name CreateItemLine */
    public static final String COLUMNNAME_CreateItemLine = "CreateItemLine";

	/** Set Create Checklist Item	  */
	public void setCreateItemLine (String CreateItemLine);

	/** Get Create Checklist Item	  */
	public String getCreateItemLine();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name EvalDate */
    public static final String COLUMNNAME_EvalDate = "EvalDate";

	/** Set Evaluation Date	  */
	public void setEvalDate (Timestamp EvalDate);

	/** Get Evaluation Date	  */
	public Timestamp getEvalDate();

    /** Column name HSC_BP_ID */
    public static final String COLUMNNAME_HSC_BP_ID = "HSC_BP_ID";

	/** Set HSC BP	  */
	public void setHSC_BP_ID (int HSC_BP_ID);

	/** Get HSC BP	  */
	public int getHSC_BP_ID();

	public org.hsc.model.I_HSC_BP getHSC_BP() throws RuntimeException;

    /** Column name HSC_Eval_Paper_ID */
    public static final String COLUMNNAME_HSC_Eval_Paper_ID = "HSC_Eval_Paper_ID";

	/** Set HSC_Eval_Paper.
	  * แบบฟอร์มประเมิน HAL-Q
	  */
	public void setHSC_Eval_Paper_ID (int HSC_Eval_Paper_ID);

	/** Get HSC_Eval_Paper.
	  * แบบฟอร์มประเมิน HAL-Q
	  */
	public int getHSC_Eval_Paper_ID();

    /** Column name HSC_Eval_Tmpl_ID */
    public static final String COLUMNNAME_HSC_Eval_Tmpl_ID = "HSC_Eval_Tmpl_ID";

	/** Set Checklist	  */
	public void setHSC_Eval_Tmpl_ID (int HSC_Eval_Tmpl_ID);

	/** Get Checklist	  */
	public int getHSC_Eval_Tmpl_ID();

	public org.hsc.model.I_HSC_Eval_Tmpl getHSC_Eval_Tmpl() throws RuntimeException;

    /** Column name HSC_Halq_Project_ID */
    public static final String COLUMNNAME_HSC_Halq_Project_ID = "HSC_Halq_Project_ID";

	/** Set HSC Halq Project	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID);

	/** Get HSC Halq Project	  */
	public int getHSC_Halq_Project_ID();

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsConform */
    public static final String COLUMNNAME_IsConform = "IsConform";

	/** Set Conform to the system.
	  * สอดคล้องกับระบบ
	  */
	public void setIsConform (boolean IsConform);

	/** Get Conform to the system.
	  * สอดคล้องกับระบบ
	  */
	public boolean isConform();

    /** Column name IsDefect */
    public static final String COLUMNNAME_IsDefect = "IsDefect";

	/** Set Have defects	  */
	public void setIsDefect (boolean IsDefect);

	/** Get Have defects	  */
	public boolean isDefect();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name nextvisit */
    public static final String COLUMNNAME_nextvisit = "nextvisit";

	/** Set Next Visit Date.
	  * นัดหมายครั้งต่อไป
	  */
	public void setnextvisit (Timestamp nextvisit);

	/** Get Next Visit Date.
	  * นัดหมายครั้งต่อไป
	  */
	public Timestamp getnextvisit();

    /** Column name PaperType */
    public static final String COLUMNNAME_PaperType = "PaperType";

	/** Set PaperType	  */
	public void setPaperType (String PaperType);

	/** Get PaperType	  */
	public String getPaperType();

    /** Column name Problem */
    public static final String COLUMNNAME_Problem = "Problem";

	/** Set Problem	  */
	public void setProblem (String Problem);

	/** Get Problem	  */
	public String getProblem();

    /** Column name RefPaper_ID */
    public static final String COLUMNNAME_RefPaper_ID = "RefPaper_ID";

	/** Set Ref Paper	  */
	public void setRefPaper_ID (int RefPaper_ID);

	/** Get Ref Paper	  */
	public int getRefPaper_ID();

	public org.hsc.model.I_HSC_Eval_Paper getRefPaper() throws RuntimeException;

    /** Column name Representative */
    public static final String COLUMNNAME_Representative = "Representative";

	/** Set Representative	  */
	public void setRepresentative (String Representative);

	/** Get Representative	  */
	public String getRepresentative();

    /** Column name Result */
    public static final String COLUMNNAME_Result = "Result";

	/** Set Result.
	  * Result of the action taken
	  */
	public void setResult (String Result);

	/** Get Result.
	  * Result of the action taken
	  */
	public String getResult();

    /** Column name Suggestion */
    public static final String COLUMNNAME_Suggestion = "Suggestion";

	/** Set Suggestion	  */
	public void setSuggestion (String Suggestion);

	/** Get Suggestion	  */
	public String getSuggestion();

    /** Column name TotalAdvice */
    public static final String COLUMNNAME_TotalAdvice = "TotalAdvice";

	/** Set Total Advices.
	  * จำนวนข้อแนะนำ
	  */
	public void setTotalAdvice (int TotalAdvice);

	/** Get Total Advices.
	  * จำนวนข้อแนะนำ
	  */
	public int getTotalAdvice();

    /** Column name TotalDefect */
    public static final String COLUMNNAME_TotalDefect = "TotalDefect";

	/** Set Total Defects.
	  * จำนวนข้อบกพร่อง
	  */
	public void setTotalDefect (int TotalDefect);

	/** Get Total Defects.
	  * จำนวนข้อบกพร่อง
	  */
	public int getTotalDefect();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
