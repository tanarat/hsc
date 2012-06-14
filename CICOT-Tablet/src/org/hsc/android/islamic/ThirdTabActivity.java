package org.hsc.android.islamic;
import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.model.Form;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.TextView;


public class ThirdTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);


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
			
			((TextView)findViewById(R.id.field41)).setText(form.getValue("field41"));
			((TextView)findViewById(R.id.field42)).setText(form.getValue("field42"));
			
			String selectStr43 = form.getValue("field43");
			if(selectStr43 != null && !selectStr43.equals("-1")){
				int selectedIndex43 = Integer.parseInt(selectStr43);
				RadioGroup grp43 = (RadioGroup)findViewById(R.id.field43);
				grp43.check(grp43.getChildAt(selectedIndex43).getId());
			}
			
			String selectStr44 = form.getValue("field44");
			if(selectStr44 != null && !selectStr44.equals("-1")){
				int selectedIndex44 = Integer.parseInt(selectStr44);
				RadioGroup grp44 = (RadioGroup)findViewById(R.id.field44);
				grp44.check(grp44.getChildAt(selectedIndex44).getId());
			}
			
			String selectStr45 = form.getValue("field45");
			if(selectStr45 != null && !selectStr45.equals("-1")){
				int selectedIndex45 = Integer.parseInt(selectStr45);
				RadioGroup grp45 = (RadioGroup)findViewById(R.id.field45);
				grp45.check(grp45.getChildAt(selectedIndex45).getId());
			}
			
			String selectStr46 = form.getValue("field46");
			if(selectStr46 != null && !selectStr46.equals("-1")){
				int selectedIndex46 = Integer.parseInt(selectStr46);
				RadioGroup grp46 = (RadioGroup)findViewById(R.id.field46);
				grp46.check(grp46.getChildAt(selectedIndex46).getId());
			}

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		form.setValue("field41", ((TextView)findViewById(R.id.field41)).getText().toString());
		form.setValue("field42", ((TextView)findViewById(R.id.field42)).getText().toString());
		
		RadioGroup radioGrp43 = (RadioGroup)findViewById(R.id.field43);
		int selectedIndex43 = radioGrp43.indexOfChild(findViewById(radioGrp43.getCheckedRadioButtonId()));
		form.setValue("field43", String.valueOf(selectedIndex43));
		System.out.println("Selected 43 : " + form.getValue("field43"));
		
		RadioGroup radioGrp44 = (RadioGroup)findViewById(R.id.field44);
		int selectedIndex44 = radioGrp44.indexOfChild(findViewById(radioGrp44.getCheckedRadioButtonId()));
		form.setValue("field44", String.valueOf(selectedIndex44));
		System.out.println("Selected 44 : " + form.getValue("field44"));
		
		RadioGroup radioGrp45 = (RadioGroup)findViewById(R.id.field45);
		int selectedIndex45 = radioGrp45.indexOfChild(findViewById(radioGrp45.getCheckedRadioButtonId()));
		form.setValue("field45", String.valueOf(selectedIndex45));
		System.out.println("Selected 45 : " + form.getValue("field45"));
		
		RadioGroup radioGrp46 = (RadioGroup)findViewById(R.id.field46);
		int selectedIndex46 = radioGrp46.indexOfChild(findViewById(radioGrp46.getCheckedRadioButtonId()));
		form.setValue("field46", String.valueOf(selectedIndex46));
		System.out.println("Selected 46 : " + form.getValue("field46"));
	}


}
