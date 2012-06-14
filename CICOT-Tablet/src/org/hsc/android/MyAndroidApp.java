package org.hsc.android;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hsc.android.db.AuditorDAO;
import org.hsc.android.db.BPartnerDAO;
import org.hsc.android.db.ChecklistDAO;
import org.hsc.android.db.ChecklistItemDAO;
import org.hsc.android.db.ENumberDAO;
import org.hsc.android.db.FormDAO;
import org.hsc.android.db.HSCSqlHelper;
import org.hsc.android.db.ItemDAO;
import org.hsc.android.enumber.ENumberService;
import org.hsc.model.Auditor;
import org.hsc.model.BPartner;
import org.hsc.model.Checklist;
import org.hsc.model.Form;
import org.hsc.model.FormList;
import org.hsc.model.Item;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MyAndroidApp {
	public String tag = this.getClass().getName();
	private static MyAndroidApp appObj = null;

	static String DATA_DIR = "/sdcard/hsc/data";
	private File dataDir = null;
	
	private HSCSqlHelper sqlHelper;
	private SQLiteDatabase db;
	
	private FormDAO formDAO;
	private ENumberDAO eNumberDAO;
	private ENumberService eNumberService;
	
	
//	private List<Form> formList = null;
	
	private FormList formList;
	
	public static MyAndroidApp getApp(Context context) {
		if (appObj == null)
			appObj = new MyAndroidApp(context);
		return appObj;
	}
	private MyAndroidApp(Context context) {
		super();
		
		sqlHelper = new HSCSqlHelper(context);
		db = sqlHelper.getWritableDatabase();
		
		formDAO = new FormDAO(db);
		
		formList = new FormList();
		formList.setFormList(formDAO.getAll());
		
		eNumberDAO = new ENumberDAO(db);
		eNumberService = new ENumberService(getENumberServiceURL());
		eNumberService.seteNumberDAO(eNumberDAO);
//		eNumberDAO.loadSample();
//		loadSample();
			
	}
	
	private void loadSample(){
		Form form1,form2;
		form1 = new Form("form1"); 
		form2 = new Form("form2"); 
		formList.addForm(form1);
		formList.addForm(form2);
	}
//	public void recreateTable(){
//		formDAO.recreate();
//	}
	public FormList getFormList(){
		return formList;
	}
//	public List<Form> getFormList(boolean reload){
//		if((formList == null) || (reload))
//			reloadForms();
//		return formList;
//	}
//	public void reloadForms(){
//		formList = formDAO.getAll();
//	}
	
	public boolean saveForm(Form form){
		return formDAO.save(form);
	}
	
	
	public FormDAO getFormDAO() {
		// TODO Auto-generated method stub
		return formDAO;
	}
	public void renameForm(Form form, String newName) {
		// TODO Auto-generated method stub
		ContentValues values = new ContentValues();
		values.put(FormDAO.COLUMN_FORM_NAME, newName);
		formDAO.update(form.getId(), values);
//		form.setName(newName);
	}
	public ENumberDAO getENumberDAO() {
		// TODO Auto-generated method stub
		return eNumberDAO;
	}
	private static String ENUMBER_SERVICE_URL = "http://203.146.127.162:6080/hsc-rest/rest/enumber";
	public String getENumberServiceURL() {
		// TODO Auto-generated method stub
		return ENUMBER_SERVICE_URL;
	}
	public ENumberService getENumberService() {
		// TODO Auto-generated method stub
		return eNumberService;
	}
	
	
	
}
