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

/** Generated Interface for HSC_Certification
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HSC_Certification 
{

    /** TableName=HSC_Certification */
    public static final String Table_Name = "HSC_Certification";

    /** AD_Table_ID=1000077 */
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

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name Cert_No */
    public static final String COLUMNNAME_Cert_No = "Cert_No";

	/** Set Cert_No	  */
	public void setCert_No (String Cert_No);

	/** Get Cert_No	  */
	public String getCert_No();

    /** Column name Cert_Type */
    public static final String COLUMNNAME_Cert_Type = "Cert_Type";

	/** Set Cert_Type	  */
	public void setCert_Type (boolean Cert_Type);

	/** Get Cert_Type	  */
	public boolean isCert_Type();

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

    /** Column name HSC_Certification_ID */
    public static final String COLUMNNAME_HSC_Certification_ID = "HSC_Certification_ID";

	/** Set HSC_Certification	  */
	public void setHSC_Certification_ID (int HSC_Certification_ID);

	/** Get HSC_Certification	  */
	public int getHSC_Certification_ID();

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

    /** Column name Issued_By */
    public static final String COLUMNNAME_Issued_By = "Issued_By";

	/** Set Issued_By	  */
	public void setIssued_By (String Issued_By);

	/** Get Issued_By	  */
	public String getIssued_By();

    /** Column name Issued_By_List */
    public static final String COLUMNNAME_Issued_By_List = "Issued_By_List";

	/** Set Issued_By_List	  */
	public void setIssued_By_List (String Issued_By_List);

	/** Get Issued_By_List	  */
	public String getIssued_By_List();

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

    /** Column name Standard */
    public static final String COLUMNNAME_Standard = "Standard";

	/** Set Standard	  */
	public void setStandard (String Standard);

	/** Get Standard	  */
	public String getStandard();

    /** Column name Standerd_List */
    public static final String COLUMNNAME_Standerd_List = "Standerd_List";

	/** Set Standerd_List	  */
	public void setStanderd_List (String Standerd_List);

	/** Get Standerd_List	  */
	public String getStanderd_List();

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

    /** Column name Valid_From */
    public static final String COLUMNNAME_Valid_From = "Valid_From";

	/** Set Valid_From	  */
	public void setValid_From (Timestamp Valid_From);

	/** Get Valid_From	  */
	public Timestamp getValid_From();

    /** Column name Valid_To */
    public static final String COLUMNNAME_Valid_To = "Valid_To";

	/** Set Valid_To	  */
	public void setValid_To (Timestamp Valid_To);

	/** Get Valid_To	  */
	public Timestamp getValid_To();

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
