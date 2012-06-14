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


public class ForthTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forth);


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

			
			String selectStr47 = form.getValue("field47");
			if(selectStr47 != null && !selectStr47.equals("-1")){
				int selectedIndex47 = Integer.parseInt(selectStr47);
				RadioGroup grp47 = (RadioGroup)findViewById(R.id.field47);
				grp47.check(grp47.getChildAt(selectedIndex47).getId());
			}
			
			String selectStr48 = form.getValue("field48");
			if(selectStr48 != null && !selectStr48.equals("-1")){
				int selectedIndex48 = Integer.parseInt(selectStr48);
				RadioGroup grp48 = (RadioGroup)findViewById(R.id.field48);
				grp48.check(grp48.getChildAt(selectedIndex48).getId());
			}
			
			String selectStr49 = form.getValue("field49");
			if(selectStr49 != null && !selectStr49.equals("-1")){
				int selectedIndex49 = Integer.parseInt(selectStr49);
				RadioGroup grp49 = (RadioGroup)findViewById(R.id.field49);
				grp49.check(grp49.getChildAt(selectedIndex49).getId());
			}
			
			String selectStr50 = form.getValue("field50");
			if(selectStr50 != null && !selectStr50.equals("-1")){
				int selectedIndex50 = Integer.parseInt(selectStr50);
				RadioGroup grp50 = (RadioGroup)findViewById(R.id.field50);
				grp50.check(grp50.getChildAt(selectedIndex50).getId());
			}
			
			String selectStr51 = form.getValue("field51");
			if(selectStr51 != null && !selectStr51.equals("-1")){
				int selectedIndex51 = Integer.parseInt(selectStr51);
				RadioGroup grp51 = (RadioGroup)findViewById(R.id.field51);
				grp51.check(grp51.getChildAt(selectedIndex51).getId());
			}
			
			String selectStr52 = form.getValue("field52");
			if(selectStr52 != null && !selectStr52.equals("-1")){
				int selectedIndex52 = Integer.parseInt(selectStr52);
				RadioGroup grp52 = (RadioGroup)findViewById(R.id.field52);
				grp52.check(grp52.getChildAt(selectedIndex52).getId());
			}
			
			String selectStr53 = form.getValue("field53");
			if(selectStr53 != null && !selectStr53.equals("-1")){
				int selectedIndex53 = Integer.parseInt(selectStr53);
				RadioGroup grp53 = (RadioGroup)findViewById(R.id.field53);
				grp53.check(grp53.getChildAt(selectedIndex53).getId());
			}
			
			String selectStr54 = form.getValue("field54");
			if(selectStr54 != null && !selectStr54.equals("-1")){
				int selectedIndex54 = Integer.parseInt(selectStr54);
				RadioGroup grp54 = (RadioGroup)findViewById(R.id.field54);
				grp54.check(grp54.getChildAt(selectedIndex54).getId());
			}

			String selectStr55 = form.getValue("field55");
			if(selectStr55 != null && !selectStr55.equals("-1")){
				int selectedIndex55 = Integer.parseInt(selectStr55);
				RadioGroup grp55 = (RadioGroup)findViewById(R.id.field55);
				grp55.check(grp55.getChildAt(selectedIndex55).getId());
			}

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		RadioGroup radioGrp47 = (RadioGroup)findViewById(R.id.field47);
		int selectedIndex47 = radioGrp47.indexOfChild(findViewById(radioGrp47.getCheckedRadioButtonId()));
		form.setValue("field47", String.valueOf(selectedIndex47));
		System.out.println("Selected 47 : " + form.getValue("field47"));
		
		RadioGroup radioGrp48 = (RadioGroup)findViewById(R.id.field48);
		int selectedIndex48 = radioGrp48.indexOfChild(findViewById(radioGrp48.getCheckedRadioButtonId()));
		form.setValue("field48", String.valueOf(selectedIndex48));
		System.out.println("Selected 48 : " + form.getValue("field48"));
		
		RadioGroup radioGrp49 = (RadioGroup)findViewById(R.id.field49);
		int selectedIndex49 = radioGrp49.indexOfChild(findViewById(radioGrp49.getCheckedRadioButtonId()));
		form.setValue("field49", String.valueOf(selectedIndex49));
		System.out.println("Selected 49 : " + form.getValue("field49"));
		
		RadioGroup radioGrp50 = (RadioGroup)findViewById(R.id.field50);
		int selectedIndex50 = radioGrp50.indexOfChild(findViewById(radioGrp50.getCheckedRadioButtonId()));
		form.setValue("field50", String.valueOf(selectedIndex50));
		System.out.println("Selected 50 : " + form.getValue("field50"));
		
		RadioGroup radioGrp51 = (RadioGroup)findViewById(R.id.field51);
		int selectedIndex51 = radioGrp51.indexOfChild(findViewById(radioGrp51.getCheckedRadioButtonId()));
		form.setValue("field51", String.valueOf(selectedIndex51));
		System.out.println("Selected 51 : " + form.getValue("field51"));
		
		RadioGroup radioGrp52 = (RadioGroup)findViewById(R.id.field52);
		int selectedIndex52 = radioGrp52.indexOfChild(findViewById(radioGrp52.getCheckedRadioButtonId()));
		form.setValue("field52", String.valueOf(selectedIndex52));
		System.out.println("Selected 52 : " + form.getValue("field52"));
		
		RadioGroup radioGrp53 = (RadioGroup)findViewById(R.id.field53);
		int selectedIndex53 = radioGrp53.indexOfChild(findViewById(radioGrp53.getCheckedRadioButtonId()));
		form.setValue("field53", String.valueOf(selectedIndex53));
		System.out.println("Selected 53 : " + form.getValue("field53"));
		
		RadioGroup radioGrp54 = (RadioGroup)findViewById(R.id.field54);
		int selectedIndex54 = radioGrp54.indexOfChild(findViewById(radioGrp54.getCheckedRadioButtonId()));
		form.setValue("field54", String.valueOf(selectedIndex54));
		System.out.println("Selected 54 : " + form.getValue("field54"));
		
		RadioGroup radioGrp55 = (RadioGroup)findViewById(R.id.field55);
		int selectedIndex55 = radioGrp55.indexOfChild(findViewById(radioGrp55.getCheckedRadioButtonId()));
		form.setValue("field55", String.valueOf(selectedIndex55));
		System.out.println("Selected 55 : " + form.getValue("field55"));
	}


}
