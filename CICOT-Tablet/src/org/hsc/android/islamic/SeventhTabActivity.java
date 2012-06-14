package org.hsc.android.islamic;
import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.layout;
import org.hsc.model.Form;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;


public class SeventhTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seventh);


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

			String chkStr74 = form.getValue("field74");
			if(chkStr74 != null){
				((CheckBox)findViewById(R.id.field74)).setChecked(new Boolean(chkStr74));
			}
			
			String chkStr75 = form.getValue("field75");
			if(chkStr75 != null){
				((CheckBox)findViewById(R.id.field75)).setChecked(new Boolean(chkStr75));
			}
			
			String chkStr76 = form.getValue("field76");
			if(chkStr76 != null){
				((CheckBox)findViewById(R.id.field76)).setChecked(new Boolean(chkStr76));
			}
			
			String chkStr77 = form.getValue("field77");
			if(chkStr77 != null){
				((CheckBox)findViewById(R.id.field77)).setChecked(new Boolean(chkStr77));
			}
			
			String chkStr78 = form.getValue("field78");
			if(chkStr78 != null){
				((CheckBox)findViewById(R.id.field78)).setChecked(new Boolean(chkStr78));
			}
			
			String chkStr79 = form.getValue("field79");
			if(chkStr79 != null){
				((CheckBox)findViewById(R.id.field79)).setChecked(new Boolean(chkStr79));
			}
			
			((TextView)findViewById(R.id.field80)).setText(form.getValue("field80"));
			
			String selectStr81 = form.getValue("field81");
			if(selectStr81 != null && !selectStr81.equals("-1")){
				int selectedIndex81 = Integer.parseInt(selectStr81);
				RadioGroup grp81 = (RadioGroup)findViewById(R.id.field81);
				grp81.check(grp81.getChildAt(selectedIndex81).getId());
			}
			
			String selectStr82 = form.getValue("field82");
			if(selectStr82 != null && !selectStr82.equals("-1")){
				int selectedIndex82 = Integer.parseInt(selectStr82);
				RadioGroup grp82 = (RadioGroup)findViewById(R.id.field82);
				grp82.check(grp82.getChildAt(selectedIndex82).getId());
			}
			
			String chkStr83 = form.getValue("field83");
			if(chkStr83 != null){
				((CheckBox)findViewById(R.id.field83)).setChecked(new Boolean(chkStr83));
			}
			
			((TextView)findViewById(R.id.field84)).setText(form.getValue("field84"));
			
			String chkStr85 = form.getValue("field85");
			if(chkStr85 != null){
				((CheckBox)findViewById(R.id.field85)).setChecked(new Boolean(chkStr85));
			}
			
			((TextView)findViewById(R.id.field86)).setText(form.getValue("field86"));
			

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		CheckBox cb74 = (CheckBox)findViewById(R.id.field74);
		form.setValue("field74", String.valueOf(cb74.isChecked()));
		
		CheckBox cb75 = (CheckBox)findViewById(R.id.field75);
		form.setValue("field75", String.valueOf(cb75.isChecked()));
		
		CheckBox cb76 = (CheckBox)findViewById(R.id.field76);
		form.setValue("field76", String.valueOf(cb76.isChecked()));
		
		CheckBox cb77 = (CheckBox)findViewById(R.id.field77);
		form.setValue("field77", String.valueOf(cb77.isChecked()));
		
		CheckBox cb78 = (CheckBox)findViewById(R.id.field78);
		form.setValue("field78", String.valueOf(cb78.isChecked()));
		
		CheckBox cb79 = (CheckBox)findViewById(R.id.field79);
		form.setValue("field79", String.valueOf(cb79.isChecked()));
		
		form.setValue("field80", ((TextView)findViewById(R.id.field80)).getText().toString());
		
		RadioGroup radioGrp81 = (RadioGroup)findViewById(R.id.field81);
		int selectedIndex81 = radioGrp81.indexOfChild(findViewById(radioGrp81.getCheckedRadioButtonId()));
		form.setValue("field81", String.valueOf(selectedIndex81));
		System.out.println("Selected 81 : " + form.getValue("field81"));
		
		RadioGroup radioGrp82 = (RadioGroup)findViewById(R.id.field82);
		int selectedIndex82 = radioGrp82.indexOfChild(findViewById(radioGrp82.getCheckedRadioButtonId()));
		form.setValue("field82", String.valueOf(selectedIndex82));
		System.out.println("Selected 82 : " + form.getValue("field82"));
		
		CheckBox cb83 = (CheckBox)findViewById(R.id.field83);
		form.setValue("field83", String.valueOf(cb83.isChecked()));
		
		form.setValue("field84", ((TextView)findViewById(R.id.field84)).getText().toString());
		
		CheckBox cb85 = (CheckBox)findViewById(R.id.field85);
		form.setValue("field85", String.valueOf(cb85.isChecked()));
		
		form.setValue("field86", ((TextView)findViewById(R.id.field86)).getText().toString());
	}

}
