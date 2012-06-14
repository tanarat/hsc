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
import android.widget.TableLayout;
import android.widget.TextView;

public class FormViewActivity extends Activity {
	private String tag = this.getClass().getName();
	private Form form;
	private MyAndroidApp myapp;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_view);
		myapp = MyAndroidApp.getApp(getApplicationContext());
		Intent intent = this.getIntent();
//		form = (Form) intent.getSerializableExtra("form");
		int index = intent.getIntExtra("index", -1);
		System.out.println("index.. " + index);
		form = myapp.getFormList().getForm(index);
		
		if (form != null) {
			TextView tvFormName = (TextView)findViewById(R.id.formName);
			tvFormName.setText(form.getName());
			
//			System.out.println("bp name : " + form.getField0());
//			form.setName("sompong");
//			form.setField0("somchai");
//			System.out.println("form name has changed to : " + form.getName());
//			System.out.println("bp name has changed to : " + form.getField0());
			
			
//			TextView tv = new TextView(this, null);
//			addContentView(tv, null);
//			Map<String, String> formValues = form.getValues();
//			if (formValues != null) {
//				TextView tvBPName = (TextView) findViewById(R.id.bpname);
//				setValue(tvBPName, formValues.get("bpName"));
//				// tvBPName.setText(formValues.get("bpName"));
//			}
		}
	}

	private void setValue(View view, String txt) {
		if (txt != null) {

			if (view instanceof TextView)
				((TextView) view).setText(txt);
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
//		Log.i(tag, "on pause..........");
//		if (form != null) {
//			Map<String, String> formValues = form.getValues();
//
//			TextView tvBPName = (TextView) findViewById(R.id.bpname);
//			formValues.put("bpName", tvBPName.getText().toString());
//			Log.i(tag, "put bpName :" + tvBPName.getText().toString());
//
//		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	

}
