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

/** Generated Interface for HSC_Halq_Registration_Form
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HSC_Halq_Registration_Form 
{

    /** TableName=HSC_Halq_Registration_Form */
    public static final String Table_Name = "HSC_Halq_Registration_Form";

    /** AD_Table_ID=1000005 */
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

    /** Column name Approve */
    public static final String COLUMNNAME_Approve = "Approve";

	/** Set Approve	  */
	public void setApprove (String Approve);

	/** Get Approve	  */
	public String getApprove();

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

    /** Column name Cert_Type */
    public static final String COLUMNNAME_Cert_Type = "Cert_Type";

	/** Set Cert_Type	  */
	public void setCert_Type (String Cert_Type);

	/** Get Cert_Type	  */
	public String getCert_Type();

    /** Column name Contact_Email */
    public static final String COLUMNNAME_Contact_Email = "Contact_Email";

	/** Set Contact_Email	  */
	public void setContact_Email (String Contact_Email);

	/** Get Contact_Email	  */
	public String getContact_Email();

    /** Column name Contact_Lname */
    public static final String COLUMNNAME_Contact_Lname = "Contact_Lname";

	/** Set Contact_Lname	  */
	public void setContact_Lname (String Contact_Lname);

	/** Get Contact_Lname	  */
	public String getContact_Lname();

    /** Column name Contact_Name */
    public static final String COLUMNNAME_Contact_Name = "Contact_Name";

	/** Set Contact_Name	  */
	public void setContact_Name (String Contact_Name);

	/** Get Contact_Name	  */
	public String getContact_Name();

    /** Column name Contact_Phone */
    public static final String COLUMNNAME_Contact_Phone = "Contact_Phone";

	/** Set Contact_Phone	  */
	public void setContact_Phone (String Contact_Phone);

	/** Get Contact_Phone	  */
	public String getContact_Phone();

    /** Column name Contact_Position */
    public static final String COLUMNNAME_Contact_Position = "Contact_Position";

	/** Set Contact_Position	  */
	public void setContact_Position (String Contact_Position);

	/** Get Contact_Position	  */
	public String getContact_Position();

    /** Column name Contact_Title */
    public static final String COLUMNNAME_Contact_Title = "Contact_Title";

	/** Set Contact_Title	  */
	public void setContact_Title (String Contact_Title);

	/** Get Contact_Title	  */
	public String getContact_Title();

    /** Column name CountryNameOfOutMkt */
    public static final String COLUMNNAME_CountryNameOfOutMkt = "CountryNameOfOutMkt";

	/** Set CountryNameOfOutMkt	  */
	public void setCountryNameOfOutMkt (int CountryNameOfOutMkt);

	/** Get CountryNameOfOutMkt	  */
	public int getCountryNameOfOutMkt();

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

    /** Column name Director */
    public static final String COLUMNNAME_Director = "Director";

	/** Set Director	  */
	public void setDirector (String Director);

	/** Get Director	  */
	public String getDirector();

    /** Column name Fac_Address1 */
    public static final String COLUMNNAME_Fac_Address1 = "Fac_Address1";

	/** Set Fac_Address1	  */
	public void setFac_Address1 (String Fac_Address1);

	/** Get Fac_Address1	  */
	public String getFac_Address1();

    /** Column name Fac_Address2 */
    public static final String COLUMNNAME_Fac_Address2 = "Fac_Address2";

	/** Set Fac_Address2	  */
	public void setFac_Address2 (String Fac_Address2);

	/** Get Fac_Address2	  */
	public String getFac_Address2();

    /** Column name Fac_Address3 */
    public static final String COLUMNNAME_Fac_Address3 = "Fac_Address3";

	/** Set Fac_Address3	  */
	public void setFac_Address3 (String Fac_Address3);

	/** Get Fac_Address3	  */
	public String getFac_Address3();

    /** Column name Fac_Address4 */
    public static final String COLUMNNAME_Fac_Address4 = "Fac_Address4";

	/** Set Fac_Address4	  */
	public void setFac_Address4 (String Fac_Address4);

	/** Get Fac_Address4	  */
	public String getFac_Address4();

    /** Column name Fac_C_Country_ID */
    public static final String COLUMNNAME_Fac_C_Country_ID = "Fac_C_Country_ID";

	/** Set Fac_C_Country_ID	  */
	public void setFac_C_Country_ID (int Fac_C_Country_ID);

	/** Get Fac_C_Country_ID	  */
	public int getFac_C_Country_ID();

    /** Column name Fac_City_ID */
    public static final String COLUMNNAME_Fac_City_ID = "Fac_City_ID";

	/** Set Fac_City_ID	  */
	public void setFac_City_ID (int Fac_City_ID);

	/** Get Fac_City_ID	  */
	public int getFac_City_ID();

	public I_C_City getFac_City() throws RuntimeException;

    /** Column name Fac_Fax */
    public static final String COLUMNNAME_Fac_Fax = "Fac_Fax";

	/** Set Fac_Fax	  */
	public void setFac_Fax (String Fac_Fax);

	/** Get Fac_Fax	  */
	public String getFac_Fax();

    /** Column name Fac_Map */
    public static final String COLUMNNAME_Fac_Map = "Fac_Map";

	/** Set Fac_Map	  */
	public void setFac_Map (String Fac_Map);

	/** Get Fac_Map	  */
	public String getFac_Map();

    /** Column name Fac_Phone */
    public static final String COLUMNNAME_Fac_Phone = "Fac_Phone";

	/** Set Fac_Phone	  */
	public void setFac_Phone (String Fac_Phone);

	/** Get Fac_Phone	  */
	public String getFac_Phone();

    /** Column name Fac_Postal */
    public static final String COLUMNNAME_Fac_Postal = "Fac_Postal";

	/** Set Fac_Postal	  */
	public void setFac_Postal (String Fac_Postal);

	/** Get Fac_Postal	  */
	public String getFac_Postal();

    /** Column name Fac_Website */
    public static final String COLUMNNAME_Fac_Website = "Fac_Website";

	/** Set Fac_Website	  */
	public void setFac_Website (String Fac_Website);

	/** Get Fac_Website	  */
	public String getFac_Website();

    /** Column name Factory_ApproveBy */
    public static final String COLUMNNAME_Factory_ApproveBy = "Factory_ApproveBy";

	/** Set Factory_ApproveBy	  */
	public void setFactory_ApproveBy (String Factory_ApproveBy);

	/** Get Factory_ApproveBy	  */
	public String getFactory_ApproveBy();

    /** Column name Factory_License */
    public static final String COLUMNNAME_Factory_License = "Factory_License";

	/** Set Factory_License	  */
	public void setFactory_License (String Factory_License);

	/** Get Factory_License	  */
	public String getFactory_License();

    /** Column name GMPIssueBy */
    public static final String COLUMNNAME_GMPIssueBy = "GMPIssueBy";

	/** Set GMPIssueBy	  */
	public void setGMPIssueBy (String GMPIssueBy);

	/** Get GMPIssueBy	  */
	public String getGMPIssueBy();

    /** Column name HACCPIssueBy */
    public static final String COLUMNNAME_HACCPIssueBy = "HACCPIssueBy";

	/** Set HACCPIssueBy	  */
	public void setHACCPIssueBy (String HACCPIssueBy);

	/** Get HACCPIssueBy	  */
	public String getHACCPIssueBy();

    /** Column name HalalIssueFrom */
    public static final String COLUMNNAME_HalalIssueFrom = "HalalIssueFrom";

	/** Set HalalIssueFrom	  */
	public void setHalalIssueFrom (String HalalIssueFrom);

	/** Get HalalIssueFrom	  */
	public String getHalalIssueFrom();

    /** Column name HSC_Halq_Project_ID */
    public static final String COLUMNNAME_HSC_Halq_Project_ID = "HSC_Halq_Project_ID";

	/** Set HSC_Halq_Project_ID	  */
	public void setHSC_Halq_Project_ID (int HSC_Halq_Project_ID);

	/** Get HSC_Halq_Project_ID	  */
	public int getHSC_Halq_Project_ID();

	public org.hsc.model.I_HSC_Halq_Project getHSC_Halq_Project() throws RuntimeException;

    /** Column name HSC_Halq_Project_Prospect_ID */
    public static final String COLUMNNAME_HSC_Halq_Project_Prospect_ID = "HSC_Halq_Project_Prospect_ID";

	/** Set HSC_Halq_Project_Prospect_ID	  */
	public void setHSC_Halq_Project_Prospect_ID (int HSC_Halq_Project_Prospect_ID);

	/** Get HSC_Halq_Project_Prospect_ID	  */
	public int getHSC_Halq_Project_Prospect_ID();

	public org.hsc.model.I_HSC_Halq_Project_Prospect getHSC_Halq_Project_Prospect() throws RuntimeException;

    /** Column name HSC_Halq_Registration_Form_ID */
    public static final String COLUMNNAME_HSC_Halq_Registration_Form_ID = "HSC_Halq_Registration_Form_ID";

	/** Set HSC_Halq_Registration_Form_ID	  */
	public void setHSC_Halq_Registration_Form_ID (int HSC_Halq_Registration_Form_ID);

	/** Get HSC_Halq_Registration_Form_ID	  */
	public int getHSC_Halq_Registration_Form_ID();

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

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name IsGMP */
    public static final String COLUMNNAME_IsGMP = "IsGMP";

	/** Set IsGMP	  */
	public void setIsGMP (boolean IsGMP);

	/** Get IsGMP	  */
	public boolean isGMP();

    /** Column name IsHACCP */
    public static final String COLUMNNAME_IsHACCP = "IsHACCP";

	/** Set IsHACCP	  */
	public void setIsHACCP (boolean IsHACCP);

	/** Get IsHACCP	  */
	public boolean isHACCP();

    /** Column name IsHalal */
    public static final String COLUMNNAME_IsHalal = "IsHalal";

	/** Set IsHalal	  */
	public void setIsHalal (boolean IsHalal);

	/** Get IsHalal	  */
	public boolean isHalal();

    /** Column name IsISO */
    public static final String COLUMNNAME_IsISO = "IsISO";

	/** Set IsISO	  */
	public void setIsISO (boolean IsISO);

	/** Get IsISO	  */
	public boolean isISO();

    /** Column name IsOther1 */
    public static final String COLUMNNAME_IsOther1 = "IsOther1";

	/** Set IsOther1	  */
	public void setIsOther1 (boolean IsOther1);

	/** Get IsOther1	  */
	public boolean isOther1();

    /** Column name IsOther2 */
    public static final String COLUMNNAME_IsOther2 = "IsOther2";

	/** Set IsOther2	  */
	public void setIsOther2 (boolean IsOther2);

	/** Get IsOther2	  */
	public boolean isOther2();

    /** Column name IsRegistered */
    public static final String COLUMNNAME_IsRegistered = "IsRegistered";

	/** Set Registered.
	  * The application is registered.
	  */
	public void setIsRegistered (boolean IsRegistered);

	/** Get Registered.
	  * The application is registered.
	  */
	public boolean isRegistered();

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

    /** Column name Name2 */
    public static final String COLUMNNAME_Name2 = "Name2";

	/** Set Name 2.
	  * Additional Name
	  */
	public void setName2 (String Name2);

	/** Get Name 2.
	  * Additional Name
	  */
	public String getName2();

    /** Column name NumberOfEmp */
    public static final String COLUMNNAME_NumberOfEmp = "NumberOfEmp";

	/** Set NumberOfEmp	  */
	public void setNumberOfEmp (int NumberOfEmp);

	/** Get NumberOfEmp	  */
	public int getNumberOfEmp();

    /** Column name NumberOfForeign */
    public static final String COLUMNNAME_NumberOfForeign = "NumberOfForeign";

	/** Set NumberOfForeign	  */
	public void setNumberOfForeign (int NumberOfForeign);

	/** Get NumberOfForeign	  */
	public int getNumberOfForeign();

    /** Column name NumberOfMuslim */
    public static final String COLUMNNAME_NumberOfMuslim = "NumberOfMuslim";

	/** Set NumberOfMuslim	  */
	public void setNumberOfMuslim (int NumberOfMuslim);

	/** Get NumberOfMuslim	  */
	public int getNumberOfMuslim();

    /** Column name Off_Address1 */
    public static final String COLUMNNAME_Off_Address1 = "Off_Address1";

	/** Set Off_Address1	  */
	public void setOff_Address1 (String Off_Address1);

	/** Get Off_Address1	  */
	public String getOff_Address1();

    /** Column name Off_Address2 */
    public static final String COLUMNNAME_Off_Address2 = "Off_Address2";

	/** Set Off_Address2	  */
	public void setOff_Address2 (String Off_Address2);

	/** Get Off_Address2	  */
	public String getOff_Address2();

    /** Column name Off_Address3 */
    public static final String COLUMNNAME_Off_Address3 = "Off_Address3";

	/** Set Off_Address3	  */
	public void setOff_Address3 (String Off_Address3);

	/** Get Off_Address3	  */
	public String getOff_Address3();

    /** Column name Off_Address4 */
    public static final String COLUMNNAME_Off_Address4 = "Off_Address4";

	/** Set Off_Address4	  */
	public void setOff_Address4 (String Off_Address4);

	/** Get Off_Address4	  */
	public String getOff_Address4();

    /** Column name Off_C_Country_ID */
    public static final String COLUMNNAME_Off_C_Country_ID = "Off_C_Country_ID";

	/** Set Off_C_Country_ID	  */
	public void setOff_C_Country_ID (int Off_C_Country_ID);

	/** Get Off_C_Country_ID	  */
	public int getOff_C_Country_ID();

    /** Column name Off_City_ID */
    public static final String COLUMNNAME_Off_City_ID = "Off_City_ID";

	/** Set Off_City_ID	  */
	public void setOff_City_ID (int Off_City_ID);

	/** Get Off_City_ID	  */
	public int getOff_City_ID();

	public I_C_City getOff_City() throws RuntimeException;

    /** Column name Off_Fax */
    public static final String COLUMNNAME_Off_Fax = "Off_Fax";

	/** Set Off_Fax	  */
	public void setOff_Fax (String Off_Fax);

	/** Get Off_Fax	  */
	public String getOff_Fax();

    /** Column name Off_Map */
    public static final String COLUMNNAME_Off_Map = "Off_Map";

	/** Set Off_Map	  */
	public void setOff_Map (String Off_Map);

	/** Get Off_Map	  */
	public String getOff_Map();

    /** Column name Off_Phone */
    public static final String COLUMNNAME_Off_Phone = "Off_Phone";

	/** Set Off_Phone	  */
	public void setOff_Phone (String Off_Phone);

	/** Get Off_Phone	  */
	public String getOff_Phone();

    /** Column name Off_Postal */
    public static final String COLUMNNAME_Off_Postal = "Off_Postal";

	/** Set Off_Postal	  */
	public void setOff_Postal (String Off_Postal);

	/** Get Off_Postal	  */
	public String getOff_Postal();

    /** Column name PercentOfInMkt */
    public static final String COLUMNNAME_PercentOfInMkt = "PercentOfInMkt";

	/** Set PercentOfInMkt	  */
	public void setPercentOfInMkt (BigDecimal PercentOfInMkt);

	/** Get PercentOfInMkt	  */
	public BigDecimal getPercentOfInMkt();

    /** Column name PercentOfOutMkt */
    public static final String COLUMNNAME_PercentOfOutMkt = "PercentOfOutMkt";

	/** Set PercentOfOutMkt	  */
	public void setPercentOfOutMkt (BigDecimal PercentOfOutMkt);

	/** Get PercentOfOutMkt	  */
	public BigDecimal getPercentOfOutMkt();

    /** Column name Product_Name1 */
    public static final String COLUMNNAME_Product_Name1 = "Product_Name1";

	/** Set Product_Name1	  */
	public void setProduct_Name1 (String Product_Name1);

	/** Get Product_Name1	  */
	public String getProduct_Name1();

    /** Column name Product_Name2 */
    public static final String COLUMNNAME_Product_Name2 = "Product_Name2";

	/** Set Product_Name2	  */
	public void setProduct_Name2 (String Product_Name2);

	/** Get Product_Name2	  */
	public String getProduct_Name2();

    /** Column name Product_Name3 */
    public static final String COLUMNNAME_Product_Name3 = "Product_Name3";

	/** Set Product_Name3	  */
	public void setProduct_Name3 (String Product_Name3);

	/** Get Product_Name3	  */
	public String getProduct_Name3();

    /** Column name Product_Name4 */
    public static final String COLUMNNAME_Product_Name4 = "Product_Name4";

	/** Set Product_Name4	  */
	public void setProduct_Name4 (String Product_Name4);

	/** Get Product_Name4	  */
	public String getProduct_Name4();

    /** Column name Product_Name5 */
    public static final String COLUMNNAME_Product_Name5 = "Product_Name5";

	/** Set Product_Name5	  */
	public void setProduct_Name5 (String Product_Name5);

	/** Get Product_Name5	  */
	public String getProduct_Name5();

    /** Column name Project_Name */
    public static final String COLUMNNAME_Project_Name = "Project_Name";

	/** Set Project_Name	  */
	public void setProject_Name (String Project_Name);

	/** Get Project_Name	  */
	public String getProject_Name();

    /** Column name Register */
    public static final String COLUMNNAME_Register = "Register";

	/** Set Register	  */
	public void setRegister (String Register);

	/** Get Register	  */
	public String getRegister();

    /** Column name RegisterFor */
    public static final String COLUMNNAME_RegisterFor = "RegisterFor";

	/** Set RegisterFor	  */
	public void setRegisterFor (String RegisterFor);

	/** Get RegisterFor	  */
	public String getRegisterFor();

    /** Column name Request_Type1 */
    public static final String COLUMNNAME_Request_Type1 = "Request_Type1";

	/** Set Request_Type1	  */
	public void setRequest_Type1 (String Request_Type1);

	/** Get Request_Type1	  */
	public String getRequest_Type1();

    /** Column name Request_Type2 */
    public static final String COLUMNNAME_Request_Type2 = "Request_Type2";

	/** Set Request_Type2	  */
	public void setRequest_Type2 (String Request_Type2);

	/** Get Request_Type2	  */
	public String getRequest_Type2();

    /** Column name Request_Type3 */
    public static final String COLUMNNAME_Request_Type3 = "Request_Type3";

	/** Set Request_Type3	  */
	public void setRequest_Type3 (String Request_Type3);

	/** Get Request_Type3	  */
	public String getRequest_Type3();

    /** Column name Request_Type4 */
    public static final String COLUMNNAME_Request_Type4 = "Request_Type4";

	/** Set Request_Type4	  */
	public void setRequest_Type4 (String Request_Type4);

	/** Get Request_Type4	  */
	public String getRequest_Type4();

    /** Column name Request_Type5 */
    public static final String COLUMNNAME_Request_Type5 = "Request_Type5";

	/** Set Request_Type5	  */
	public void setRequest_Type5 (String Request_Type5);

	/** Get Request_Type5	  */
	public String getRequest_Type5();

    /** Column name Same_Off_Address */
    public static final String COLUMNNAME_Same_Off_Address = "Same_Off_Address";

	/** Set Same_Off_Address	  */
	public void setSame_Off_Address (boolean Same_Off_Address);

	/** Get Same_Off_Address	  */
	public boolean isSame_Off_Address();

    /** Column name Staff_Edu1 */
    public static final String COLUMNNAME_Staff_Edu1 = "Staff_Edu1";

	/** Set Staff_Edu1	  */
	public void setStaff_Edu1 (String Staff_Edu1);

	/** Get Staff_Edu1	  */
	public String getStaff_Edu1();

    /** Column name Staff_Edu2 */
    public static final String COLUMNNAME_Staff_Edu2 = "Staff_Edu2";

	/** Set Staff_Edu2	  */
	public void setStaff_Edu2 (String Staff_Edu2);

	/** Get Staff_Edu2	  */
	public String getStaff_Edu2();

    /** Column name Staff_Edu3 */
    public static final String COLUMNNAME_Staff_Edu3 = "Staff_Edu3";

	/** Set Staff_Edu3	  */
	public void setStaff_Edu3 (String Staff_Edu3);

	/** Get Staff_Edu3	  */
	public String getStaff_Edu3();

    /** Column name Staff_Edu4 */
    public static final String COLUMNNAME_Staff_Edu4 = "Staff_Edu4";

	/** Set Staff_Edu4	  */
	public void setStaff_Edu4 (String Staff_Edu4);

	/** Get Staff_Edu4	  */
	public String getStaff_Edu4();

    /** Column name Staff_Edu5 */
    public static final String COLUMNNAME_Staff_Edu5 = "Staff_Edu5";

	/** Set Staff_Edu5	  */
	public void setStaff_Edu5 (String Staff_Edu5);

	/** Get Staff_Edu5	  */
	public String getStaff_Edu5();

    /** Column name Staff_Exp1 */
    public static final String COLUMNNAME_Staff_Exp1 = "Staff_Exp1";

	/** Set Staff_Exp1	  */
	public void setStaff_Exp1 (int Staff_Exp1);

	/** Get Staff_Exp1	  */
	public int getStaff_Exp1();

    /** Column name Staff_Exp2 */
    public static final String COLUMNNAME_Staff_Exp2 = "Staff_Exp2";

	/** Set Staff_Exp2	  */
	public void setStaff_Exp2 (int Staff_Exp2);

	/** Get Staff_Exp2	  */
	public int getStaff_Exp2();

    /** Column name Staff_Exp3 */
    public static final String COLUMNNAME_Staff_Exp3 = "Staff_Exp3";

	/** Set Staff_Exp3	  */
	public void setStaff_Exp3 (int Staff_Exp3);

	/** Get Staff_Exp3	  */
	public int getStaff_Exp3();

    /** Column name Staff_Exp4 */
    public static final String COLUMNNAME_Staff_Exp4 = "Staff_Exp4";

	/** Set Staff_Exp4	  */
	public void setStaff_Exp4 (int Staff_Exp4);

	/** Get Staff_Exp4	  */
	public int getStaff_Exp4();

    /** Column name Staff_Exp5 */
    public static final String COLUMNNAME_Staff_Exp5 = "Staff_Exp5";

	/** Set Staff_Exp5	  */
	public void setStaff_Exp5 (int Staff_Exp5);

	/** Get Staff_Exp5	  */
	public int getStaff_Exp5();

    /** Column name Staff_Lname1 */
    public static final String COLUMNNAME_Staff_Lname1 = "Staff_Lname1";

	/** Set Staff_Lname1	  */
	public void setStaff_Lname1 (String Staff_Lname1);

	/** Get Staff_Lname1	  */
	public String getStaff_Lname1();

    /** Column name Staff_Lname2 */
    public static final String COLUMNNAME_Staff_Lname2 = "Staff_Lname2";

	/** Set Staff_Lname2	  */
	public void setStaff_Lname2 (String Staff_Lname2);

	/** Get Staff_Lname2	  */
	public String getStaff_Lname2();

    /** Column name Staff_Lname3 */
    public static final String COLUMNNAME_Staff_Lname3 = "Staff_Lname3";

	/** Set Staff_Lname3	  */
	public void setStaff_Lname3 (String Staff_Lname3);

	/** Get Staff_Lname3	  */
	public String getStaff_Lname3();

    /** Column name Staff_Lname4 */
    public static final String COLUMNNAME_Staff_Lname4 = "Staff_Lname4";

	/** Set Staff_Lname4	  */
	public void setStaff_Lname4 (String Staff_Lname4);

	/** Get Staff_Lname4	  */
	public String getStaff_Lname4();

    /** Column name Staff_Lname5 */
    public static final String COLUMNNAME_Staff_Lname5 = "Staff_Lname5";

	/** Set Staff_Lname5	  */
	public void setStaff_Lname5 (String Staff_Lname5);

	/** Get Staff_Lname5	  */
	public String getStaff_Lname5();

    /** Column name Staff_Name1 */
    public static final String COLUMNNAME_Staff_Name1 = "Staff_Name1";

	/** Set Staff_Name1	  */
	public void setStaff_Name1 (String Staff_Name1);

	/** Get Staff_Name1	  */
	public String getStaff_Name1();

    /** Column name Staff_Name2 */
    public static final String COLUMNNAME_Staff_Name2 = "Staff_Name2";

	/** Set Staff_Name2	  */
	public void setStaff_Name2 (String Staff_Name2);

	/** Get Staff_Name2	  */
	public String getStaff_Name2();

    /** Column name Staff_Name3 */
    public static final String COLUMNNAME_Staff_Name3 = "Staff_Name3";

	/** Set Staff_Name3	  */
	public void setStaff_Name3 (String Staff_Name3);

	/** Get Staff_Name3	  */
	public String getStaff_Name3();

    /** Column name Staff_Name4 */
    public static final String COLUMNNAME_Staff_Name4 = "Staff_Name4";

	/** Set Staff_Name4	  */
	public void setStaff_Name4 (String Staff_Name4);

	/** Get Staff_Name4	  */
	public String getStaff_Name4();

    /** Column name Staff_Name5 */
    public static final String COLUMNNAME_Staff_Name5 = "Staff_Name5";

	/** Set Staff_Name5	  */
	public void setStaff_Name5 (String Staff_Name5);

	/** Get Staff_Name5	  */
	public String getStaff_Name5();

    /** Column name Staff_Position1 */
    public static final String COLUMNNAME_Staff_Position1 = "Staff_Position1";

	/** Set Staff_Position1	  */
	public void setStaff_Position1 (String Staff_Position1);

	/** Get Staff_Position1	  */
	public String getStaff_Position1();

    /** Column name Staff_Position2 */
    public static final String COLUMNNAME_Staff_Position2 = "Staff_Position2";

	/** Set Staff_Position2	  */
	public void setStaff_Position2 (String Staff_Position2);

	/** Get Staff_Position2	  */
	public String getStaff_Position2();

    /** Column name Staff_Position3 */
    public static final String COLUMNNAME_Staff_Position3 = "Staff_Position3";

	/** Set Staff_Position3	  */
	public void setStaff_Position3 (String Staff_Position3);

	/** Get Staff_Position3	  */
	public String getStaff_Position3();

    /** Column name Staff_Position4 */
    public static final String COLUMNNAME_Staff_Position4 = "Staff_Position4";

	/** Set Staff_Position4	  */
	public void setStaff_Position4 (String Staff_Position4);

	/** Get Staff_Position4	  */
	public String getStaff_Position4();

    /** Column name Staff_Position5 */
    public static final String COLUMNNAME_Staff_Position5 = "Staff_Position5";

	/** Set Staff_Position5	  */
	public void setStaff_Position5 (String Staff_Position5);

	/** Get Staff_Position5	  */
	public String getStaff_Position5();

    /** Column name Staff_Title1 */
    public static final String COLUMNNAME_Staff_Title1 = "Staff_Title1";

	/** Set Staff_Title1	  */
	public void setStaff_Title1 (String Staff_Title1);

	/** Get Staff_Title1	  */
	public String getStaff_Title1();

    /** Column name Staff_Title2 */
    public static final String COLUMNNAME_Staff_Title2 = "Staff_Title2";

	/** Set Staff_Title2	  */
	public void setStaff_Title2 (String Staff_Title2);

	/** Get Staff_Title2	  */
	public String getStaff_Title2();

    /** Column name Staff_Title3 */
    public static final String COLUMNNAME_Staff_Title3 = "Staff_Title3";

	/** Set Staff_Title3	  */
	public void setStaff_Title3 (String Staff_Title3);

	/** Get Staff_Title3	  */
	public String getStaff_Title3();

    /** Column name Staff_Title4 */
    public static final String COLUMNNAME_Staff_Title4 = "Staff_Title4";

	/** Set Staff_Title4	  */
	public void setStaff_Title4 (String Staff_Title4);

	/** Get Staff_Title4	  */
	public String getStaff_Title4();

    /** Column name Staff_Title5 */
    public static final String COLUMNNAME_Staff_Title5 = "Staff_Title5";

	/** Set Staff_Title5	  */
	public void setStaff_Title5 (String Staff_Title5);

	/** Get Staff_Title5	  */
	public String getStaff_Title5();

    /** Column name Std_BRC */
    public static final String COLUMNNAME_Std_BRC = "Std_BRC";

	/** Set Std_BRC	  */
	public void setStd_BRC (String Std_BRC);

	/** Get Std_BRC	  */
	public String getStd_BRC();

    /** Column name Std_Cert1 */
    public static final String COLUMNNAME_Std_Cert1 = "Std_Cert1";

	/** Set Std_Cert1	  */
	public void setStd_Cert1 (String Std_Cert1);

	/** Get Std_Cert1	  */
	public String getStd_Cert1();

    /** Column name Std_Cert2 */
    public static final String COLUMNNAME_Std_Cert2 = "Std_Cert2";

	/** Set Std_Cert2	  */
	public void setStd_Cert2 (String Std_Cert2);

	/** Get Std_Cert2	  */
	public String getStd_Cert2();

    /** Column name Std_Cert3 */
    public static final String COLUMNNAME_Std_Cert3 = "Std_Cert3";

	/** Set Std_Cert3	  */
	public void setStd_Cert3 (String Std_Cert3);

	/** Get Std_Cert3	  */
	public String getStd_Cert3();

    /** Column name Std_Cert4 */
    public static final String COLUMNNAME_Std_Cert4 = "Std_Cert4";

	/** Set Std_Cert4	  */
	public void setStd_Cert4 (String Std_Cert4);

	/** Get Std_Cert4	  */
	public String getStd_Cert4();

    /** Column name Std_Cert5 */
    public static final String COLUMNNAME_Std_Cert5 = "Std_Cert5";

	/** Set Std_Cert5	  */
	public void setStd_Cert5 (String Std_Cert5);

	/** Get Std_Cert5	  */
	public String getStd_Cert5();

    /** Column name Std_Cert6 */
    public static final String COLUMNNAME_Std_Cert6 = "Std_Cert6";

	/** Set Std_Cert6	  */
	public void setStd_Cert6 (String Std_Cert6);

	/** Get Std_Cert6	  */
	public String getStd_Cert6();

    /** Column name Std_Inbound1 */
    public static final String COLUMNNAME_Std_Inbound1 = "Std_Inbound1";

	/** Set Std_Inbound1	  */
	public void setStd_Inbound1 (String Std_Inbound1);

	/** Get Std_Inbound1	  */
	public String getStd_Inbound1();

    /** Column name Std_Inbound2 */
    public static final String COLUMNNAME_Std_Inbound2 = "Std_Inbound2";

	/** Set Std_Inbound2	  */
	public void setStd_Inbound2 (String Std_Inbound2);

	/** Get Std_Inbound2	  */
	public String getStd_Inbound2();

    /** Column name Std_Inbound4 */
    public static final String COLUMNNAME_Std_Inbound4 = "Std_Inbound4";

	/** Set Std_Inbound4	  */
	public void setStd_Inbound4 (String Std_Inbound4);

	/** Get Std_Inbound4	  */
	public String getStd_Inbound4();

    /** Column name Std_Inbound5 */
    public static final String COLUMNNAME_Std_Inbound5 = "Std_Inbound5";

	/** Set Std_Inbound5	  */
	public void setStd_Inbound5 (String Std_Inbound5);

	/** Get Std_Inbound5	  */
	public String getStd_Inbound5();

    /** Column name Std_ISO */
    public static final String COLUMNNAME_Std_ISO = "Std_ISO";

	/** Set Std_ISO	  */
	public void setStd_ISO (String Std_ISO);

	/** Get Std_ISO	  */
	public String getStd_ISO();

    /** Column name Std_IssueBy3 */
    public static final String COLUMNNAME_Std_IssueBy3 = "Std_IssueBy3";

	/** Set Std_IssueBy3	  */
	public void setStd_IssueBy3 (String Std_IssueBy3);

	/** Get Std_IssueBy3	  */
	public String getStd_IssueBy3();

    /** Column name Std_IssueBy4 */
    public static final String COLUMNNAME_Std_IssueBy4 = "Std_IssueBy4";

	/** Set Std_IssueBy4	  */
	public void setStd_IssueBy4 (String Std_IssueBy4);

	/** Get Std_IssueBy4	  */
	public String getStd_IssueBy4();

    /** Column name Std_IssueBy5 */
    public static final String COLUMNNAME_Std_IssueBy5 = "Std_IssueBy5";

	/** Set Std_IssueBy5	  */
	public void setStd_IssueBy5 (String Std_IssueBy5);

	/** Get Std_IssueBy5	  */
	public String getStd_IssueBy5();

    /** Column name Std_Other */
    public static final String COLUMNNAME_Std_Other = "Std_Other";

	/** Set Std_Other	  */
	public void setStd_Other (String Std_Other);

	/** Get Std_Other	  */
	public String getStd_Other();

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

    /** Column name Website */
    public static final String COLUMNNAME_Website = "Website";

	/** Set Website	  */
	public void setWebsite (String Website);

	/** Get Website	  */
	public String getWebsite();
}
