package org.hsc.android.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.hsc.model.Auditor;
import org.hsc.model.Checklist;
import org.hsc.model.Item;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ChecklistDAO {
	private String tag = this.getClass().getName();
	private SQLiteDatabase db;
	
	public static String TABLE_NAME = "Checklist";
	public static String COLUMN_CHECKLIST_ID = "id";
	public static String COLUMN_CHECKLIST_NAME = "name";
	public static String[] allColumns = {COLUMN_CHECKLIST_ID,COLUMN_CHECKLIST_NAME};
	
	public static String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
			COLUMN_CHECKLIST_ID + " integer primary key , " +
			COLUMN_CHECKLIST_NAME + " text not null)"; 

	public ChecklistDAO(SQLiteDatabase db){
		this.db = db;
	}
	/*
	public void insert(Checklist checklist){
		ContentValues values = new ContentValues();
		values.put(COLUMN_CHECKLIST_ID, checklist.getId());
		values.put(COLUMN_CHECKLIST_NAME, checklist.getName());
		db.insert(TABLE_NAME, null, values);
	}*/
	/*
	public void insertChecklist(Checklist checklist){
		long id = checklist.getId();
		String checklistName = checklist.getName();
		
		
		ContentValues values = new ContentValues();
		values.put(HSCSqlHelper.COLUMN_CHECKLIST_ID, id);
		values.put(HSCSqlHelper.COLUMN_CHECKLIST_NAME, checklistName);
		db.insert(HSCSqlHelper.TABLE_CHECKLISTS, null, values);
		
		List<Long> itemIds = checklist.getItemIds();
		for (Iterator<Long> iterator = itemIds.iterator(); iterator.hasNext();) {
			Long itemId = iterator.next();
			ContentValues itemValue = new ContentValues();
			itemValue.put(HSCSqlHelper.COLUMN_CHECKLIST, id);
			itemValue.put(HSCSqlHelper.COLUMN_ITEM, itemId);
			db.insert(HSCSqlHelper.TABLE_CHECKLIST_ITEM, null, itemValue);
		}
		
		
		
	}*/
	public List<Checklist> getAll(){
		List<Checklist> list = new ArrayList<Checklist>();
		Cursor cursor = db.query(TABLE_NAME, allColumns, null, null, null, null, COLUMN_CHECKLIST_ID);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Checklist checklist = new Checklist(cursor.getLong(0), cursor.getString(1));
			list.add(checklist);
			cursor.moveToNext();
		}
		cursor.close();
		return list;
	}
	/*
	public List<Checklist> getAllChecklists(){
		List<Checklist> checklists = new ArrayList<Checklist>();
		Cursor cursor = db.query(HSCSqlHelper.TABLE_CHECKLISTS, checklistAllColumns, null, null, null, null, HSCSqlHelper.COLUMN_CHECKLIST_ID);
		
		cursor.moveToFirst();
		while(!cursor.isAfterLast()){
			Checklist checklist = cursorToChecklist(cursor);
			
//			List<Long> itemIds = new ArrayList<Long>();
			Cursor cursorChkItm = db.query(HSCSqlHelper.TABLE_CHECKLIST_ITEM, 
											itemColumn, 
											HSCSqlHelper.COLUMN_CHECKLIST + " = " + checklist.getId() , 
											null, null, null, null);
			cursorChkItm.moveToFirst();
			while(!cursorChkItm.isAfterLast()){
				Long itemId = cursorChkItm.getLong(0);
				checklist.addItemId(itemId);
				cursorChkItm.moveToNext();
			}
			
			checklists.add(checklist);
			cursor.moveToNext();
		}
		cursor.close();
		return checklists;
	}
	*/
	/*
	private Checklist cursorToChecklist(Cursor cursor) {
		Checklist checklist = new Checklist(cursor.getLong(0),cursor.getString(1));
//		cursor.close();
		return checklist;
	}*/
	public void delete(){
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
				Log.i(tag, "insert into Checklist");
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
}
