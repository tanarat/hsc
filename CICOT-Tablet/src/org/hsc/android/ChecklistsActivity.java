package org.hsc.android;

import java.util.List;



import org.hsc.model.Auditor;
import org.hsc.model.Checklist;
import org.hsc.model.Item;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ChecklistsActivity extends ListActivity {
	private MyAndroidApp myapp;
	private String tag = this.getClass().getName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		myapp = MyAndroidApp.getApp(this);
//		List<Checklist> checklists = myapp.getAllChecklists();
//        ArrayAdapter<Checklist> adapter = new ArrayAdapter<Checklist>(this, android.R.layout.simple_list_item_1,checklists);
//        setListAdapter(adapter);
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(ChecklistsActivity.this, ItemsActivity.class);
				myIntent.putExtra("position", position);
				ChecklistsActivity.this.startActivity(myIntent);
		        
			}
		});
	}

}
