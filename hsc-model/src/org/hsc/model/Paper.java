package org.hsc.model;

import java.io.Serializable;
import java.sql.Date;

public class Paper implements Serializable{
	private long id;
	private String name;
	private String auditType;	//V1,V2,V3,A1,A2,A3 ==> V - Visit and A - Audit
	private long bpId;			//BPartner
	private BPartner bpartner;
	private long checklistId; 	//Checklist
	private Checklist checklist;
	private Date date;			//Audit date
	private long auditorId;		//Auditor/Advisor
	private Auditor auditor;
	private ChecklistNote checklistNote;
	
	public static String AUDIT_TYPE_VISIT1 = "ตรวจเยี่ยมครั้งที่ 1";
	public static String AUDIT_TYPE_VISIT2 = "ตรวจเยี่ยมครั้งที่  2";
	public static String AUDIT_TYPE_VISIT3 = "ตรวจเยี่ยมครั้งที่ 3";
	public static String AUDIT_TYPE_AUDIT1 = "ตรวจประเมินครั้งที่ 1";
	public static String AUDIT_TYPE_AUDIT2 = "ตรวจประเมินครั้งที่ 2";
	public static String AUDIT_TYPE_AUDIT3 = "ตรวจประเมินครั้งที่ 3";
	public static String[] AUDIT_TYPES = {AUDIT_TYPE_VISIT1,AUDIT_TYPE_VISIT2,AUDIT_TYPE_VISIT3,
		AUDIT_TYPE_AUDIT1,AUDIT_TYPE_AUDIT2,AUDIT_TYPE_AUDIT3};
	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paper(long id, String name, long bpId, long checklistId, Date date,
			long auditorId) {
		super();
		this.id = id;
		this.name = name;
		this.bpId = bpId;
		this.checklistId = checklistId;
		this.date = date;
		this.auditorId = auditorId;
	}
	public Paper(long id, String name, BPartner bpartner, Checklist checklist, Date date, Auditor auditor) {
		super();
		this.id = id;
		this.name = name;
		this.bpartner = bpartner;
		this.setChecklist(checklist);
		this.date = date;
		this.setAuditor(auditor);
		setChecklistNote(null);
	}
	public void createChecklistNote(){
		setChecklistNote(new ChecklistNote(getChecklist().getItems()));
	}
	public void setChecklist(Checklist checklist) {
		this.checklist = checklist;
		setChecklistNote(null);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBpId() {
		return bpId;
	}
	public void setBpId(long bpId) {
		this.bpId = bpId;
	}
	public long getChecklistId() {
		return checklistId;
	}
	public void setChecklistId(long checklistId) {
		this.checklistId = checklistId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getAuditorId() {
		return auditorId;
	}
	public void setAuditorId(long auditorId) {
		this.auditorId = auditorId;
	}
	
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	@Override
	public String toString() {
		return name;
	}
	public Checklist getChecklist() {
		return checklist;
	}
	public Auditor getAuditor() {
		return auditor;
	}
	public void setAuditor(Auditor auditor) {
		this.auditor = auditor;
	}
	public ChecklistNote getChecklistNote() {
		return checklistNote;
	}
	public void setChecklistNote(ChecklistNote checklistNote) {
		this.checklistNote = checklistNote;
	}
	public BPartner getBPartner() {
		return bpartner;
	}
	public void setBPartner(BPartner bpartner) {
		this.bpartner = bpartner;
	}
	
	
}
