package org.hsc.android.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


import org.hsc.model.BPartner;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class BPartnerDAO {
	private String tag = this.getClass().getCanonicalName();
	private SQLiteDatabase db;
	
	
	public static String TABLE_NAME = "BPartner";
	public static String COLUMN_BPARTNER_ID = "id";
	public static String COLUMN_BPARTNER_NAME = "name";
	public static String[] allColumns = {COLUMN_BPARTNER_ID,COLUMN_BPARTNER_NAME};
	
	public static String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
			COLUMN_BPARTNER_ID + " integer primary key , " +
			COLUMN_BPARTNER_NAME + " text not null)"; 

	public BPartnerDAO(SQLiteDatabase db){
		this.db = db;
	}
	

	public void insert(BPartner bpartner){
		ContentValues values = new ContentValues();
		values.put(COLUMN_BPARTNER_ID, bpartner.getId());
		values.put(COLUMN_BPARTNER_NAME, bpartner.getName());
		db.insert(TABLE_NAME, null, values);
	}
	public List<BPartner> getAll(){
		List<BPartner> list = new ArrayList<BPartner>();
		Cursor cursor = db.query(TABLE_NAME, allColumns, null, null, null, null, COLUMN_BPARTNER_ID);
		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			BPartner bpartner = new BPartner(cursor.getLong(0), cursor.getString(1));
			list.add(bpartner);
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
				Log.i(tag, "insert into BPartner");
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
