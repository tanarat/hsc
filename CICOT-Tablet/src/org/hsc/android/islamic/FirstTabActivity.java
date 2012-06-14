package org.hsc.android.islamic;

import java.util.Map;

import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.layout;
import org.hsc.model.Form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FirstTabActivity extends NthFormTabActivity {
	private String tag = this.getClass().getName();

	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);


		int index = getIntent().getIntExtra("index", -1);
		form = MyAndroidApp.getApp(getApplicationContext()).getFormList().getForm(index);

		
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(tag, "on pause..........");
		if (form != null) {
			saveFormState();
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(tag,"On resume.....");
		if (form != null) {
			((TextView)findViewById(R.id.field0)).setText(form.getValue("field0"));
			((TextView)findViewById(R.id.field1)).setText(form.getValue("field1"));
			((TextView)findViewById(R.id.field2)).setText(form.getValue("field2"));
			((TextView)findViewById(R.id.field3)).setText(form.getValue("field3"));
			((TextView)findViewById(R.id.field4)).setText(form.getValue("field4"));
			((TextView)findViewById(R.id.field5)).setText(form.getValue("field5"));
			((TextView)findViewById(R.id.field6)).setText(form.getValue("field6"));
			((TextView)findViewById(R.id.field7)).setText(form.getValue("field7"));
			((TextView)findViewById(R.id.field8)).setText(form.getValue("field8"));

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		TextView tv = (TextView)findViewById(R.id.field0);
		String text = String.valueOf(tv.getText());
		form.setValue("field0",text);
		
//		form.setValue("field0", ((TextView)findViewById(R.id.field0)).getText().toString());
		Log.i(tag, "saveFormState() : field0 = "+text);
		form.setValue("field1", ((TextView)findViewById(R.id.field1)).getText().toString());
		form.setValue("field2", ((TextView)findViewById(R.id.field2)).getText().toString());
		form.setValue("field3", ((TextView)findViewById(R.id.field3)).getText().toString());
		form.setValue("field4", ((TextView)findViewById(R.id.field4)).getText().toString());
		form.setValue("field5", ((TextView)findViewById(R.id.field5)).getText().toString());
		form.setValue("field6", ((TextView)findViewById(R.id.field6)).getText().toString());
		form.setValue("field7", ((TextView)findViewById(R.id.field7)).getText().toString());
		form.setValue("field8", ((TextView)findViewById(R.id.field8)).getText().toString());
	}

	
	

}
