package org.hsc.android.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.hsc.model.Item;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ChecklistItemDAO {
	private String tag = this.getClass().getCanonicalName();
	private SQLiteDatabase db;
	
	public static String TABLE_NAME = "ChecklistItem";
	public static String COLUMN_CHECKLIST_ITEM_ID = "id";
	public static String COLUMN_CHECKLIST_ITEM_CHECKLIST = "checklist";
	public static String COLUMN_CHECKLIST_ITEM_ITEM = "item";
	public static String[] allColumns = {COLUMN_CHECKLIST_ITEM_ID,COLUMN_CHECKLIST_ITEM_CHECKLIST,COLUMN_CHECKLIST_ITEM_ITEM};
	
	public static String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
			COLUMN_CHECKLIST_ITEM_ID + " integer primary key , " +
			COLUMN_CHECKLIST_ITEM_CHECKLIST + " integer not null, " +
			COLUMN_CHECKLIST_ITEM_ITEM + " integer not null)"; 

	public ChecklistItemDAO(SQLiteDatabase db){
		this.db = db;
	}
	public List<Long> getItemIds(Long checklistId) {
		String checklistIds[] = {checklistId+""};
		String columns[] = {COLUMN_CHECKLIST_ITEM_ITEM};
		Cursor	cursor = db.query(TABLE_NAME, columns,
					COLUMN_CHECKLIST_ITEM_CHECKLIST + " = ?", checklistIds, null,
					null,COLUMN_CHECKLIST_ITEM_ITEM);
		
		List<Long> itemIds = new ArrayList<Long>();

		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Long itemId = cursor.getLong(0);
			itemIds.add(itemId);
			cursor.moveToNext();
		}
		cursor.close();
		return itemIds;
	}
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
				Log.i(tag, "insert into ChecklistItem");
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
