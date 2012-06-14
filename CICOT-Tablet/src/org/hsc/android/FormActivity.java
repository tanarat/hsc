package org.hsc.android;

import java.util.ArrayList;
import java.util.List;

import org.hsc.model.Form;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;



public class FormActivity extends ListActivity {
	private List<Form> formList = new ArrayList<Form>();
	private ArrayAdapter<Form> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		adapter = getAdapter();
		setListAdapter(adapter);

	}
	public ArrayAdapter<Form> getAdapter(){

		return new ArrayAdapter<Form>(this,	android.R.layout.simple_list_item_1, formList);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.context_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		
		switch(item.getItemId()) {
		case R.id.item1:
			

			adapter.notifyDataSetChanged();
			Toast.makeText(getApplicationContext(),
					"add", 1000)
					.show();
			break;
			
		default:
			break;
		}
		
		return true;
	}


}
