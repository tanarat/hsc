package org.hsc.android.islamic;
import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.layout;
import org.hsc.android.db.FormDAO;
import org.hsc.model.Form;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.TextView;


public class FifthTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;


	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifth);


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

			
			String selectStr56 = form.getValue("field56");
			if(selectStr56 != null && !selectStr56.equals("-1")){
				int selectedIndex56 = Integer.parseInt(selectStr56);
				RadioGroup grp56 = (RadioGroup)findViewById(R.id.field56);
				grp56.check(grp56.getChildAt(selectedIndex56).getId());
			}
			
			String selectStr57 = form.getValue("field57");
			if(selectStr57 != null && !selectStr57.equals("-1")){
				int selectedIndex57 = Integer.parseInt(selectStr57);
				RadioGroup grp57 = (RadioGroup)findViewById(R.id.field57);
				grp57.check(grp57.getChildAt(selectedIndex57).getId());
			}
			
			String selectStr58 = form.getValue("field58");
			if(selectStr58 != null && !selectStr58.equals("-1")){
				int selectedIndex58 = Integer.parseInt(selectStr58);
				RadioGroup grp58 = (RadioGroup)findViewById(R.id.field58);
				grp58.check(grp58.getChildAt(selectedIndex58).getId());
			}
			
			String selectStr59 = form.getValue("field59");
			if(selectStr59 != null && !selectStr59.equals("-1")){
				int selectedIndex59 = Integer.parseInt(selectStr59);
				RadioGroup grp59 = (RadioGroup)findViewById(R.id.field59);
				grp59.check(grp59.getChildAt(selectedIndex59).getId());
			}
			
			String selectStr60 = form.getValue("field60");
			if(selectStr60 != null && !selectStr60.equals("-1")){
				int selectedIndex60 = Integer.parseInt(selectStr60);
				RadioGroup grp60 = (RadioGroup)findViewById(R.id.field60);
				grp60.check(grp60.getChildAt(selectedIndex60).getId());
			}
			
			String selectStr61 = form.getValue("field61");
			if(selectStr61 != null && !selectStr61.equals("-1")){
				int selectedIndex61 = Integer.parseInt(selectStr61);
				RadioGroup grp61 = (RadioGroup)findViewById(R.id.field61);
				grp61.check(grp61.getChildAt(selectedIndex61).getId());
			}
			
			((TextView)findViewById(R.id.field62)).setText(form.getValue("field62"));
			
			String selectStr63 = form.getValue("field63");
			if(selectStr63 != null && !selectStr63.equals("-1")){
				int selectedIndex63 = Integer.parseInt(selectStr63);
				RadioGroup grp63 = (RadioGroup)findViewById(R.id.field63);
				grp63.check(grp63.getChildAt(selectedIndex63).getId());
			}
			
			String selectStr64 = form.getValue("field64");
			if(selectStr64 != null && !selectStr64.equals("-1")){
				int selectedIndex64 = Integer.parseInt(selectStr64);
				RadioGroup grp64 = (RadioGroup)findViewById(R.id.field64);
				grp64.check(grp64.getChildAt(selectedIndex64).getId());
			}

			String selectStr65 = form.getValue("field65");
			if(selectStr65 != null && !selectStr65.equals("-1")){
				int selectedIndex65 = Integer.parseInt(selectStr65);
				RadioGroup grp65 = (RadioGroup)findViewById(R.id.field65);
				grp65.check(grp65.getChildAt(selectedIndex65).getId());
			}
			
			String selectStr66 = form.getValue("field66");
			if(selectStr66 != null && !selectStr66.equals("-1")){
				int selectedIndex66 = Integer.parseInt(selectStr66);
				RadioGroup grp66 = (RadioGroup)findViewById(R.id.field66);
				grp66.check(grp66.getChildAt(selectedIndex66).getId());
			}

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		RadioGroup radioGrp56 = (RadioGroup)findViewById(R.id.field56);
		int selectedIndex56 = radioGrp56.indexOfChild(findViewById(radioGrp56.getCheckedRadioButtonId()));
		form.setValue("field56", String.valueOf(selectedIndex56));
		System.out.println("Selected 56 : " + form.getValue("field56"));
		
		RadioGroup radioGrp57 = (RadioGroup)findViewById(R.id.field57);
		int selectedIndex57 = radioGrp57.indexOfChild(findViewById(radioGrp57.getCheckedRadioButtonId()));
		form.setValue("field57", String.valueOf(selectedIndex57));
		System.out.println("Selected 57 : " + form.getValue("field57"));
		
		RadioGroup radioGrp58 = (RadioGroup)findViewById(R.id.field58);
		int selectedIndex58 = radioGrp58.indexOfChild(findViewById(radioGrp58.getCheckedRadioButtonId()));
		form.setValue("field58", String.valueOf(selectedIndex58));
		System.out.println("Selected 58 : " + form.getValue("field58"));
		
		RadioGroup radioGrp59 = (RadioGroup)findViewById(R.id.field59);
		int selectedIndex59 = radioGrp59.indexOfChild(findViewById(radioGrp59.getCheckedRadioButtonId()));
		form.setValue("field59", String.valueOf(selectedIndex59));
		System.out.println("Selected 59 : " + form.getValue("field59"));
		
		RadioGroup radioGrp60 = (RadioGroup)findViewById(R.id.field60);
		int selectedIndex60 = radioGrp60.indexOfChild(findViewById(radioGrp60.getCheckedRadioButtonId()));
		form.setValue("field60", String.valueOf(selectedIndex60));
		System.out.println("Selected 60 : " + form.getValue("field60"));
		
		RadioGroup radioGrp61 = (RadioGroup)findViewById(R.id.field61);
		int selectedIndex61 = radioGrp61.indexOfChild(findViewById(radioGrp61.getCheckedRadioButtonId()));
		form.setValue("field61", String.valueOf(selectedIndex61));
		System.out.println("Selected 61 : " + form.getValue("field61"));
		
		form.setValue("field62", ((TextView)findViewById(R.id.field62)).getText().toString());
		
		RadioGroup radioGrp63 = (RadioGroup)findViewById(R.id.field63);
		int selectedIndex63 = radioGrp63.indexOfChild(findViewById(radioGrp63.getCheckedRadioButtonId()));
		form.setValue("field63", String.valueOf(selectedIndex63));
		System.out.println("Selected 63 : " + form.getValue("field63"));
		
		RadioGroup radioGrp64 = (RadioGroup)findViewById(R.id.field64);
		int selectedIndex64 = radioGrp64.indexOfChild(findViewById(radioGrp64.getCheckedRadioButtonId()));
		form.setValue("field64", String.valueOf(selectedIndex64));
		System.out.println("Selected 64 : " + form.getValue("field64"));
		
		RadioGroup radioGrp65 = (RadioGroup)findViewById(R.id.field65);
		int selectedIndex65 = radioGrp65.indexOfChild(findViewById(radioGrp65.getCheckedRadioButtonId()));
		form.setValue("field65", String.valueOf(selectedIndex65));
		System.out.println("Selected 65 : " + form.getValue("field65"));
		
		RadioGroup radioGrp66 = (RadioGroup)findViewById(R.id.field66);
		int selectedIndex66 = radioGrp66.indexOfChild(findViewById(radioGrp66.getCheckedRadioButtonId()));
		form.setValue("field66", String.valueOf(selectedIndex66));
		System.out.println("Selected 66 : " + form.getValue("field66"));
	}

}
