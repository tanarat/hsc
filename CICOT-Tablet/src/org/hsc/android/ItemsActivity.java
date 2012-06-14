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

public class ItemsActivity extends ListActivity {
	private MyAndroidApp myapp;
	private String tag = this.getClass().getName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		int position = intent.getIntExtra("position", -1);
		List<Item> items;
		myapp = MyAndroidApp.getApp(this);
		if(position == -1){
//			items = myapp.getAllItems();	
		}else{
//			Checklist checklist = myapp.getChecklist(position);
////			List<Long> itemIds = checklist.getItemIds();
////			items = myapp.getItems(itemIds);
//			items = checklist.getItems();
		}
//        ArrayAdapter<Item> adapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1,items);
//        setListAdapter(adapter);
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(ItemsActivity.this, ItemNoteActivity.class);
				myIntent.putExtra("position", position);
				ItemsActivity.this.startActivity(myIntent);
		        
			}
		});
	}

}
