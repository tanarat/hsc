package org.hsc.android.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class HSCSqlHelper extends SQLiteOpenHelper{
	public String tag = this.getClass().getName();
//	Database Name
	private static final String DATABASE_NAME = "hsc.db";
//	Database version
	private static final int DATABASE_VERSION = 1;
	public HSCSqlHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public synchronized void close() {
		// TODO Auto-generated method stub
		super.close();
	}

	@Override
	public void onOpen(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		super.onOpen(db);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		Create table Form
		FormDAO.createTable(db);
//		Create table ENumber
		ENumberDAO.createTable(db);
		

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
