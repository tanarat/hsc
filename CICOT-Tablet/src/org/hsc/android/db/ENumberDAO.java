package org.hsc.android.db;

import java.util.List;

import org.hsc.model.ENumber;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ENumberDAO {
	private static String tag = ENumberDAO.class.getName(); 
	private static SQLiteDatabase db;
	
	public static String TABLE_NAME = "ENumber";
	
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_ENUMBER = "e_number";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_DESCRIPTION = "description";
	public static final String COLUMN_HALAL_STATUS = "halal_status";
	public static final String COLUMN_UPDATED = "updated";
	
	public static String[] allColumns = {COLUMN_ID,COLUMN_ENUMBER,COLUMN_NAME,COLUMN_DESCRIPTION,COLUMN_HALAL_STATUS,COLUMN_UPDATED};
	
	public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
			COLUMN_ID + " integer primary key autoincrement, " +
			COLUMN_ENUMBER + " text not null unique, " +
			COLUMN_NAME + " text not null, " +
			COLUMN_DESCRIPTION + " text, " + 
			COLUMN_HALAL_STATUS + " integer, " + 
			COLUMN_UPDATED + " text )";
			

	public static final String DROP_TABLE = "Drop TABLE IF EXISTS " + TABLE_NAME ;
	
	public ENumberDAO(SQLiteDatabase db) {
		this.db = db;
	}
	public ENumber get(String enumber){
		Cursor cursor = db.query(TABLE_NAME, allColumns, COLUMN_ENUMBER + " = ?", new String[]{enumber}, null, null, null);
		ENumber enumberObj = null;
		
		Log.i(tag,"search e-number, found : " + cursor.getCount() + " row");
		if(cursor.moveToNext()){
			Log.i(tag, "found e-number : " + enumber);
			enumberObj = new ENumber(
								cursor.getString(1), //enumber
								cursor.getString(2), //name
								cursor.getString(3), //desc
								cursor.getInt(4),	 //halal status
								null				 //updated
					);
		}else{
			Log.i(tag, "not found e-number : " + enumber);
		}
		return enumberObj;
	}
	public static void createTable(SQLiteDatabase db){
		dropTable(db);
		db.execSQL(CREATE_TABLE);
		Log.w(tag,"Create table : " + TABLE_NAME);
	}
	public static void dropTable(SQLiteDatabase db){
		db.execSQL(DROP_TABLE);
		Log.w(tag, "Drop table : " + TABLE_NAME);
		
		
	}
	public void delete(SQLiteDatabase db){
		Log.i(tag, "Delete all rows from table " + TABLE_NAME);
		db.delete(TABLE_NAME, null, null);
	}
	public void loadSample(){
		ContentValues values = new ContentValues();
		values.put(COLUMN_ENUMBER, 100);
		values.put(COLUMN_NAME, "Curcumin/Turmeric");
		values.put(COLUMN_DESCRIPTION, "Color Halal only if they are 100% but in food industry they are not available 100% but made with fat based emulsifiers such as Polysorbate 80");
		values.put(COLUMN_HALAL_STATUS, ENumber.STATUS_MUSHBOOH_OR_UNKNOWN);
		db.insert(TABLE_NAME, null, values);
		
		values.put(COLUMN_ENUMBER, 107);
		values.put(COLUMN_NAME, "Yellow 2G");
		values.put(COLUMN_DESCRIPTION, "Colors It is a synthetic chemical dye obtained from coal tar and yellow Azo dye and it is soluble in water.");
		values.put(COLUMN_HALAL_STATUS, ENumber.STATUS_HALAL);
		db.insert(TABLE_NAME, null, values);
		
		values.put(COLUMN_ENUMBER, 124);
		values.put(COLUMN_NAME, "Ponceau 4R / Cochineal Red A");
		values.put(COLUMN_DESCRIPTION, "Color Cochineal Red A is a Haram Color. Ponceau 4R is a synthetic color. It is Halal if used in dry form from Halal sources but liquid form is Halal if Halal solvents are used");
		values.put(COLUMN_HALAL_STATUS, ENumber.STATUS_NOT_HALAL);
		db.insert(TABLE_NAME, null, values);
	}
	public void updateENumber(List<ENumber> eNumberList) {
		// TODO Auto-generated method stub
		db.delete(TABLE_NAME, null, null);
		Log.i(tag, "Delete all row in table " + TABLE_NAME);
		for(int i = 0; i < eNumberList.size(); i++){
			ContentValues values = new ContentValues();
			ENumber eNumber = eNumberList.get(i);
			values.put(COLUMN_ENUMBER, eNumber.getEnumber());
			values.put(COLUMN_NAME, eNumber.getName());
			values.put(COLUMN_DESCRIPTION, eNumber.getDescription());
			values.put(COLUMN_HALAL_STATUS, eNumber.getHalalStatus());
			db.insert(TABLE_NAME, null, values);
			Log.i(tag, "Insert : " + values.toString());
		}
	}
}
