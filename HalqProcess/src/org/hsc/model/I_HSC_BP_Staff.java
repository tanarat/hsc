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

/** Generated Interface for HSC_BP_Staff
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HSC_BP_Staff 
{

    /** TableName=HSC_BP_Staff */
    public static final String Table_Name = "HSC_BP_Staff";

    /** AD_Table_ID=1000016 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public I_AD_User getAD_User() throws RuntimeException;

    /** Column name BPName */
    public static final String COLUMNNAME_BPName = "BPName";

	/** Set BP Name	  */
	public void setBPName (String BPName);

	/** Get BP Name	  */
	public String getBPName();

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

    /** Column name Education */
    public static final String COLUMNNAME_Education = "Education";

	/** Set Education	  */
	public void setEducation (String Education);

	/** Get Education	  */
	public String getEducation();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name ExpYear */
    public static final String COLUMNNAME_ExpYear = "ExpYear";

	/** Set ExpYear	  */
	public void setExpYear (int ExpYear);

	/** Get ExpYear	  */
	public int getExpYear();

    /** Column name HSC_BP_Staff_ID */
    public static final String COLUMNNAME_HSC_BP_Staff_ID = "HSC_BP_Staff_ID";

	/** Set HSC_BP_Staff	  */
	public void setHSC_BP_Staff_ID (int HSC_BP_Staff_ID);

	/** Get HSC_BP_Staff	  */
	public int getHSC_BP_Staff_ID();

    /** Column name HSC_Halq_Project_ID */
    public static final String COLUMNNAME_HSC_Halq_Project_ID = "HSC_Halq_Project_ID";

	/** Set HSC_Halq_Project_ID	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID);

	/** Get HSC_Halq_Project_ID	  */
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

    /** Column name IsContactPerson */
    public static final String COLUMNNAME_IsContactPerson = "IsContactPerson";

	/** Set IsContactPerson	  */
	public void setIsContactPerson (boolean IsContactPerson);

	/** Get IsContactPerson	  */
	public boolean isContactPerson();

    /** Column name IsLeader */
    public static final String COLUMNNAME_IsLeader = "IsLeader";

	/** Set IsLeader	  */
	public void setIsLeader (boolean IsLeader);

	/** Get IsLeader	  */
	public boolean isLeader();

    /** Column name IsTraining1Staff */
    public static final String COLUMNNAME_IsTraining1Staff = "IsTraining1Staff";

	/** Set IsTraining1Staff	  */
	public void setIsTraining1Staff (boolean IsTraining1Staff);

	/** Get IsTraining1Staff	  */
	public boolean isTraining1Staff();

    /** Column name IsTraining2Staff */
    public static final String COLUMNNAME_IsTraining2Staff = "IsTraining2Staff";

	/** Set IsTraining2Staff	  */
	public void setIsTraining2Staff (boolean IsTraining2Staff);

	/** Get IsTraining2Staff	  */
	public boolean isTraining2Staff();

    /** Column name LastName */
    public static final String COLUMNNAME_LastName = "LastName";

	/** Set LastName	  */
	public void setLastName (String LastName);

	/** Get LastName	  */
	public String getLastName();

    /** Column name LoginName */
    public static final String COLUMNNAME_LoginName = "LoginName";

	/** Set LoginName	  */
	public void setLoginName (String LoginName);

	/** Get LoginName	  */
	public String getLoginName();

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

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Position */
    public static final String COLUMNNAME_Position = "Position";

	/** Set Position	  */
	public void setPosition (String Position);

	/** Get Position	  */
	public String getPosition();

    /** Column name Title */
    public static final String COLUMNNAME_Title = "Title";

	/** Set Title.
	  * Name this entity is referred to as
	  */
	public void setTitle (String Title);

	/** Get Title.
	  * Name this entity is referred to as
	  */
	public String getTitle();

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
}
