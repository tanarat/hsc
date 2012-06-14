package org.hsc.android.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.hsc.model.Auditor;
import org.hsc.model.Item;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ItemDAO {
	public String tag = ItemDAO.class.getName();
	private SQLiteDatabase db;
	
	public static String TABLE_NAME = "Item";
	public static final String COLUMN_ITEM_ID = "_id";
	public static final String COLUMN_ITEM_NO = "item_no";
	public static final String COLUMN_ITEM_NAME = "item_name";
	public static String[] allColumns = {COLUMN_ITEM_ID,COLUMN_ITEM_NO,COLUMN_ITEM_NAME};
	
	public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
			COLUMN_ITEM_ID + " integer primary key , " +
			COLUMN_ITEM_NO + " text not null, " +
			COLUMN_ITEM_NAME + " text not null)";
	


	public ItemDAO(SQLiteDatabase db){
		this.db = db;
	}

	
	public void insertItem(Item item) {
		ContentValues values = new ContentValues();
		values.put(COLUMN_ITEM_ID, item.getId());
		values.put(COLUMN_ITEM_NO, item.getItemNo());
		values.put(COLUMN_ITEM_NAME, item.getItemName());
		db.insert(TABLE_NAME, null, values);
	}
	public List<Item> getAll(){
		List<Item> list = new ArrayList<Item>();
		Cursor cursor = db.query(TABLE_NAME, allColumns, null, null, null, null, COLUMN_ITEM_ID);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			Item item = new Item(cursor.getLong(0), cursor.getString(1),cursor.getString(2));
			list.add(item);
			cursor.moveToNext();
		}
		cursor.close();
		return list;
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
				Log.i(tag, "insert into Item");
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
