package org.hsc.android.islamic;
import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.layout;
import org.hsc.model.Form;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SixthTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixth);


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

			((TextView)findViewById(R.id.field67)).setText(form.getValue("field67"));
			((TextView)findViewById(R.id.field68)).setText(form.getValue("field68"));
			
			String selectStr69 = form.getValue("field69");
			if(selectStr69 != null && !selectStr69.equals("-1")){
				int selectedIndex69 = Integer.parseInt(selectStr69);
				RadioGroup grp69 = (RadioGroup)findViewById(R.id.field69);
				grp69.check(grp69.getChildAt(selectedIndex69).getId());
			}
			
			String selectStr70 = form.getValue("field70");
			if(selectStr70 != null && !selectStr70.equals("-1")){
				int selectedIndex70 = Integer.parseInt(selectStr70);
				RadioGroup grp70 = (RadioGroup)findViewById(R.id.field70);
				grp70.check(grp70.getChildAt(selectedIndex70).getId());
			}
			
			String selectStr71 = form.getValue("field71");
			if(selectStr71 != null && !selectStr71.equals("-1")){
				int selectedIndex71 = Integer.parseInt(selectStr71);
				RadioGroup grp71 = (RadioGroup)findViewById(R.id.field71);
				grp71.check(grp71.getChildAt(selectedIndex71).getId());
			}
			
			String selectStr72 = form.getValue("field72");
			if(selectStr72 != null && !selectStr72.equals("-1")){
				int selectedIndex72 = Integer.parseInt(selectStr72);
				RadioGroup grp72 = (RadioGroup)findViewById(R.id.field72);
				grp72.check(grp72.getChildAt(selectedIndex72).getId());
			}
			
			String selectStr73 = form.getValue("field73");
			if(selectStr73 != null && !selectStr73.equals("-1")){
				int selectedIndex73 = Integer.parseInt(selectStr73);
				RadioGroup grp73 = (RadioGroup)findViewById(R.id.field73);
				grp73.check(grp73.getChildAt(selectedIndex73).getId());
			}
			
			

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		form.setValue("field67", ((TextView)findViewById(R.id.field67)).getText().toString());
		form.setValue("field68", ((TextView)findViewById(R.id.field68)).getText().toString());
		
		RadioGroup radioGrp69 = (RadioGroup)findViewById(R.id.field69);
		int selectedIndex69 = radioGrp69.indexOfChild(findViewById(radioGrp69.getCheckedRadioButtonId()));
		form.setValue("field69", String.valueOf(selectedIndex69));
		System.out.println("Selected 69 : " + form.getValue("field69"));
		
		RadioGroup radioGrp70 = (RadioGroup)findViewById(R.id.field70);
		int selectedIndex70 = radioGrp70.indexOfChild(findViewById(radioGrp70.getCheckedRadioButtonId()));
		form.setValue("field70", String.valueOf(selectedIndex70));
		System.out.println("Selected 70 : " + form.getValue("field70"));
		
		RadioGroup radioGrp71 = (RadioGroup)findViewById(R.id.field71);
		int selectedIndex71 = radioGrp71.indexOfChild(findViewById(radioGrp71.getCheckedRadioButtonId()));
		form.setValue("field71", String.valueOf(selectedIndex71));
		System.out.println("Selected 71 : " + form.getValue("field71"));
		
		RadioGroup radioGrp72 = (RadioGroup)findViewById(R.id.field72);
		int selectedIndex72 = radioGrp72.indexOfChild(findViewById(radioGrp72.getCheckedRadioButtonId()));
		form.setValue("field72", String.valueOf(selectedIndex72));
		System.out.println("Selected 72 : " + form.getValue("field72"));
		
		RadioGroup radioGrp73 = (RadioGroup)findViewById(R.id.field73);
		int selectedIndex73 = radioGrp73.indexOfChild(findViewById(radioGrp73.getCheckedRadioButtonId()));
		form.setValue("field73", String.valueOf(selectedIndex73));
		System.out.println("Selected 73 : " + form.getValue("field73"));
	}

}
