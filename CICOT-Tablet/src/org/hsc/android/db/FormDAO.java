package org.hsc.android.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.hsc.model.Form;
import org.hsc.model.Item;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class FormDAO {
	public static String tag = FormDAO.class.getName();
	private static SQLiteDatabase db;
	public static String TABLE_NAME = "Form";
	public static final String COLUMN_FORM_ID = "_id";
	public static final String COLUMN_FORM_NAME = "form_name";
	public static final String COLUMN_FORM_REF = "ref";
//	public static final String COLUMN_0 = "column_0"; //bp name
	
	
	public static String[] allColumns = {COLUMN_FORM_ID,COLUMN_FORM_NAME,COLUMN_FORM_REF};
	
	public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
					COLUMN_FORM_ID + " integer primary key autoincrement, " +
					COLUMN_FORM_NAME + " text not null, " + 
					COLUMN_FORM_REF + " integer )";
					
	
	public static final String DROP_TABLE = "Drop TABLE IF EXISTS " + TABLE_NAME ;
	
	
	public static final String TABLE_NAME_FORM_VALUES = "Form_Values";
	public static final String CREATE_TABLE_FORM_VALUES = 
			"create table " + TABLE_NAME_FORM_VALUES + "(" +
			"formId integer not null, " +
			"field text not null, " +
			"value text)";
	public static final String DROP_TABLE_FORM_VALUE = "Drop TABLE IF EXISTS " + TABLE_NAME_FORM_VALUES ;

	public FormDAO(SQLiteDatabase db) {
		this.db = db;
	}
	
	public boolean save(Form form){
		if(isExist(form)){
			Log.i(tag, "form with id " + form.getId() + " already exist... update form");
			return (update(form) == 1)? true:false;
		}else{
			Log.i(tag, "form with id " + form.getId() + " is a new form.... insert new form");
			return (insert(form) != -1)? true:false ;
		}
//		return true;
		
	}
	private boolean isExist(Form form){
		String selectionArgs[] = {String.valueOf(form.getId())};
		Cursor cursor = db.query(TABLE_NAME, allColumns, COLUMN_FORM_ID + " = ?", selectionArgs, null, null, null);
		return cursor.moveToNext();
	}
	public long update(long formId,ContentValues values){
		String[] whereArgs = {String.valueOf(formId)};
		return db.update(TABLE_NAME, values, COLUMN_FORM_ID + " = ?", whereArgs);
	}
	private long update(Form form){
		String formId[] = {String.valueOf(form.getId())};
		Log.i(tag, "update form id = " + formId[0]);
		ContentValues values = new ContentValues();
		values.put(COLUMN_FORM_NAME, form.getName());
		values.put(COLUMN_FORM_REF, form.getRef());
		
		long nFormUpdated = db.update(TABLE_NAME, values, COLUMN_FORM_ID + " = ?", formId);
		
		ContentValues contentValues = new ContentValues();
		Map<String,String> valueMap = form.getValues();
		Set<String> keySet = valueMap.keySet();
//		String args[] = {String.valueOf(form.getId()),key};
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			String args[] = {String.valueOf(form.getId()),key};
			contentValues.put("value", valueMap.get(key));
			db.update(TABLE_NAME_FORM_VALUES, contentValues, "formId = ? and field = ?" , args);
		}

		return nFormUpdated;
		
		
		
		
	}
	private long insert(Form form) {
		
		ContentValues values = new ContentValues();
//		values.put(COLUMN_FORM_ID, form.getId()); 
		values.put(COLUMN_FORM_NAME, form.getName());
		values.put(COLUMN_FORM_REF, form.getRef());
		long id = db.insert(TABLE_NAME, null, values);
		form.setId(id);
		Log.i(tag, "insert form id = " + id);
		
		ContentValues contentValues = new ContentValues();
		Map<String,String> valueMap = form.getValues();
		Set<String> keySet = valueMap.keySet();
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			contentValues.put("formId", id);
			contentValues.put("field", key);
			contentValues.put("value", valueMap.get(key));
			db.insert(TABLE_NAME_FORM_VALUES, null, contentValues);
		}
		
		return id;
		
	}
//	private void insertFormValue(Form form){
//		ContentValues formValues = new ContentValues();
//		Map<String, String> valueMap = form.getValues();
//		Set<String> keys = valueMap.keySet();
//		Log.i(tag, keys.size() + "form values");
//		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
//			String key = (String) iterator.next();
//			formValues.put("formId", form.getId());
//			formValues.put("column", key);
//			formValues.put("value", valueMap.get(key));
//			db.insert("form_value", null, formValues);
//			Log.i(tag, "insert " + form.getId() + " " + key + valueMap.get(key));
//			formValues.clear();
//		}
//	}
	public List<Form> getAll(){
		List<Form> forms = new ArrayList<Form>();

		Cursor cursor = db.query(TABLE_NAME, allColumns, null, null, null, null, COLUMN_FORM_ID + " desc");
		cursor.moveToFirst();
		
		String[] col = {"field","value"};
		
		while (!cursor.isAfterLast()) {
			Form form = new Form(cursor.getLong(0), cursor.getString(1), cursor.getLong(2));
			String[] arg = {String.valueOf(form.getId())};
			Cursor cursor2 = db.query(TABLE_NAME_FORM_VALUES, col, "formId=?", arg, null, null, null);
			while(cursor2.moveToNext()){
				String key = cursor2.getString(0);
				String value = cursor2.getString(1);
				form.setValue(key, value);
				Log.i(tag, "getAll() : form.setValue("+key+","+value+")");
			}
			
			forms.add(form);
			cursor.moveToNext();
		}
		cursor.close();
		return forms;
	}
//	private void deleteFormValues(long id){
//		String formId[] = {id+""};
//		int rows = db.delete(TABLE_FORM_VALUE_TABLE, "formId = ?", formId);
//		Log.i(tag, rows + "rows form value deleted");
//	}
	public static void createTable(SQLiteDatabase db){
		dropTable(db);
		db.execSQL(CREATE_TABLE);
		Log.w(tag,"Create table : " + TABLE_NAME);
		db.execSQL(CREATE_TABLE_FORM_VALUES);
		Log.w(tag,"Create table : " + TABLE_NAME_FORM_VALUES);
	}
	public static void dropTable(SQLiteDatabase db){
		db.execSQL(DROP_TABLE);
		Log.w(tag, "Drop table : " + TABLE_NAME);
		db.execSQL(DROP_TABLE_FORM_VALUE);
		Log.w(tag, "Drop table : " + TABLE_NAME_FORM_VALUES);
		
	}
	public void delete(SQLiteDatabase db){
		Log.i(tag, "Delete all rows from table " + TABLE_NAME);
		db.delete(TABLE_NAME, null, null);
	}
	public void loadFromFile(File csvFile){
		try {
			FileReader freader = new FileReader(csvFile);
			BufferedReader buffreader = new BufferedReader(freader);
			String line ;
			while((line = buffreader.readLine()) != null){
				ContentValues values = valuesFromLine(line);
				db.insert(TABLE_NAME, null, values);
				Log.i(tag, "insert into Form");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private ContentValues valuesFromLine(String line){
		ContentValues values = new ContentValues();
		StringTokenizer token = new StringTokenizer(line,",");
		for(int i=0; token.hasMoreElements();i++){
			values.put(allColumns[i], token.nextToken());
		}
		return values;
	}

//	public void recreate() {
//		// TODO Auto-generated method stub
//		dropTable();
//		createTable();
//	}
	
}
