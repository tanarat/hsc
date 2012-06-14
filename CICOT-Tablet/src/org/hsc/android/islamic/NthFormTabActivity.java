package org.hsc.android.islamic;

import org.hsc.android.MyAndroidApp;
import org.hsc.model.Form;

import android.app.Activity;
import android.os.Bundle;

public abstract class NthFormTabActivity extends Activity{
	protected String tag = this.getClass().getName();
	protected Form form;

	public abstract void saveFormState();
	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		setContentView(getLayoutRes());
//		int index = getIntent().getIntExtra("index", -1);
//		form = MyAndroidApp.getApp(getApplicationContext()).getFormList().getForm(index);
//
//	}
//
//	@Override
//	protected void onPause() {
//		if(form != null){
//			saveFormField();
//		}
//	}
//	@Override
//	protected void onResume() {
//		if(form != null){
//			extractFormField();
//		}
//	}
	
//	public abstract void extractFormField();
//	public abstract int getLayoutRes();
	
	
}
