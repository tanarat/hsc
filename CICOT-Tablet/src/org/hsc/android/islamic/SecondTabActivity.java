package org.hsc.android.islamic;
import java.util.Date;
import java.util.StringTokenizer;

import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.layout;
import org.hsc.model.Form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;


public class SecondTabActivity extends NthFormTabActivity{
	private String tag = this.getClass().getName();
	private Form form;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);


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
			DatePicker datePicker = (DatePicker)findViewById(R.id.field9);
			String dateStr = form.getValue("field9");
			if(dateStr != null){
				StringTokenizer dateToken = new StringTokenizer(dateStr,"-");
				int year = Integer.parseInt((String)dateToken.nextElement())+1900;
				int month = Integer.parseInt((String)dateToken.nextElement());
				int date = Integer.parseInt((String)dateToken.nextElement());
				datePicker.init(year, month, date, null);
			}
			
			TimePicker startTimePicker = (TimePicker)findViewById(R.id.field10);
			String startTimeStr = form.getValue("field10");
			if(startTimeStr != null){
				StringTokenizer timeToken = new StringTokenizer(startTimeStr,":");
				int hour = Integer.parseInt((String)timeToken.nextToken());
				int minute = Integer.parseInt((String)timeToken.nextToken());
				startTimePicker.setCurrentHour(hour);
				startTimePicker.setCurrentMinute(minute);
			}
			
			TimePicker endTimePicker = (TimePicker)findViewById(R.id.field11);
			String endTimeStr = form.getValue("field11");
			if(endTimeStr != null){
				StringTokenizer timeToken = new StringTokenizer(endTimeStr,":");
				int hour = Integer.parseInt((String)timeToken.nextToken());
				int minute = Integer.parseInt((String)timeToken.nextToken());
				endTimePicker.setCurrentHour(hour);
				endTimePicker.setCurrentMinute(minute);
			}
			
			String objSelectStr = form.getValue("field12");
			if(objSelectStr != null && !objSelectStr.equals("-1")){
				int objSelectedIndex = Integer.parseInt(objSelectStr);
				RadioGroup grp = (RadioGroup)findViewById(R.id.field12);
				grp.check(grp.getChildAt(objSelectedIndex).getId());
			}
			
			((TextView)findViewById(R.id.field13)).setText(form.getValue("field13"));
			((TextView)findViewById(R.id.field14)).setText(form.getValue("field14"));
			((TextView)findViewById(R.id.field15)).setText(form.getValue("field15"));
			((TextView)findViewById(R.id.field16)).setText(form.getValue("field16"));
			((TextView)findViewById(R.id.field17)).setText(form.getValue("field17"));
			((TextView)findViewById(R.id.field18)).setText(form.getValue("field18"));
			((TextView)findViewById(R.id.field19)).setText(form.getValue("field19"));
			((TextView)findViewById(R.id.field20)).setText(form.getValue("field20"));
			((TextView)findViewById(R.id.field21)).setText(form.getValue("field21"));
			((TextView)findViewById(R.id.field22)).setText(form.getValue("field22"));
			((TextView)findViewById(R.id.field23)).setText(form.getValue("field23"));
			((TextView)findViewById(R.id.field24)).setText(form.getValue("field24"));
			((TextView)findViewById(R.id.field25)).setText(form.getValue("field25"));
			((TextView)findViewById(R.id.field26)).setText(form.getValue("field26"));
			((TextView)findViewById(R.id.field27)).setText(form.getValue("field27"));
			((TextView)findViewById(R.id.field28)).setText(form.getValue("field28"));
			((TextView)findViewById(R.id.field29)).setText(form.getValue("field29"));
			((TextView)findViewById(R.id.field30)).setText(form.getValue("field30"));
			((TextView)findViewById(R.id.field31)).setText(form.getValue("field31"));
			((TextView)findViewById(R.id.field32)).setText(form.getValue("field32"));
			((TextView)findViewById(R.id.field33)).setText(form.getValue("field33"));
			((TextView)findViewById(R.id.field34)).setText(form.getValue("field34"));
			((TextView)findViewById(R.id.field35)).setText(form.getValue("field35"));
			((TextView)findViewById(R.id.field36)).setText(form.getValue("field36"));
			((TextView)findViewById(R.id.field37)).setText(form.getValue("field37"));
			((TextView)findViewById(R.id.field38)).setText(form.getValue("field38"));
//			((TextView)findViewById(R.id.field39)).setText(form.getValue("field39"));
			
			String resSelectStr = form.getValue("field39");
			if(resSelectStr != null && !resSelectStr.equals("-1")){
				int resSelectedIndex = Integer.parseInt(resSelectStr);
				RadioGroup grp = (RadioGroup)findViewById(R.id.field39);
				grp.check(grp.getChildAt(resSelectedIndex).getId());
			}
			
			((TextView)findViewById(R.id.field40)).setText(form.getValue("field40"));

		}else{
			Log.i(tag, "On resume.. form is null");
		}
	}


	@Override
	public void saveFormState() {
		// TODO Auto-generated method stub
		DatePicker datePicker = (DatePicker)findViewById(R.id.field9);
		StringBuilder dateStr = new StringBuilder();
		dateStr.append(datePicker.getYear()-1900 + "-");
		dateStr.append(datePicker.getMonth() + "-");
		dateStr.append(datePicker.getDayOfMonth());
		form.setValue("field9", dateStr.toString());
		System.out.println("Date : " + form.getValue("field9"));
		
		TimePicker startTP = (TimePicker)findViewById(R.id.field10);
		StringBuilder timeStr = new StringBuilder();
		timeStr.append(startTP.getCurrentHour() + ":");
		timeStr.append(startTP.getCurrentMinute() );
		form.setValue("field10", timeStr.toString());
		System.out.println("Start Time : " + form.getValue("field10"));
		
		TimePicker endTP = (TimePicker)findViewById(R.id.field11);
		StringBuilder endTimeStr = new StringBuilder();
		endTimeStr.append(endTP.getCurrentHour() + ":");
		endTimeStr.append(endTP.getCurrentMinute() );
		form.setValue("field11", endTimeStr.toString());
		System.out.println("End Time : " + form.getValue("field11"));
		
		RadioGroup objRadioGrp = (RadioGroup)findViewById(R.id.field12);
		int selectedIndex = objRadioGrp.indexOfChild(findViewById(objRadioGrp.getCheckedRadioButtonId()));
		form.setValue("field12", String.valueOf(selectedIndex));
		System.out.println("Selected obj : " + form.getValue("field12"));
		
		
		form.setValue("field13", ((TextView)findViewById(R.id.field13)).getText().toString());
		form.setValue("field14", ((TextView)findViewById(R.id.field14)).getText().toString());
		form.setValue("field15", ((TextView)findViewById(R.id.field15)).getText().toString());
		form.setValue("field16", ((TextView)findViewById(R.id.field16)).getText().toString());
		form.setValue("field17", ((TextView)findViewById(R.id.field17)).getText().toString());
		form.setValue("field18", ((TextView)findViewById(R.id.field18)).getText().toString());
		form.setValue("field19", ((TextView)findViewById(R.id.field19)).getText().toString());
		form.setValue("field20", ((TextView)findViewById(R.id.field20)).getText().toString());
		form.setValue("field21", ((TextView)findViewById(R.id.field21)).getText().toString());
		form.setValue("field22", ((TextView)findViewById(R.id.field22)).getText().toString());
		form.setValue("field23", ((TextView)findViewById(R.id.field23)).getText().toString());
		form.setValue("field24", ((TextView)findViewById(R.id.field24)).getText().toString());
		form.setValue("field25", ((TextView)findViewById(R.id.field25)).getText().toString());
		form.setValue("field26", ((TextView)findViewById(R.id.field26)).getText().toString());
		form.setValue("field27", ((TextView)findViewById(R.id.field27)).getText().toString());
		form.setValue("field28", ((TextView)findViewById(R.id.field28)).getText().toString());
		form.setValue("field29", ((TextView)findViewById(R.id.field29)).getText().toString());
		form.setValue("field30", ((TextView)findViewById(R.id.field30)).getText().toString());
		form.setValue("field31", ((TextView)findViewById(R.id.field31)).getText().toString());
		form.setValue("field32", ((TextView)findViewById(R.id.field32)).getText().toString());
		form.setValue("field33", ((TextView)findViewById(R.id.field33)).getText().toString());
		form.setValue("field34", ((TextView)findViewById(R.id.field34)).getText().toString());
		form.setValue("field35", ((TextView)findViewById(R.id.field35)).getText().toString());
		form.setValue("field36", ((TextView)findViewById(R.id.field36)).getText().toString());
		form.setValue("field37", ((TextView)findViewById(R.id.field37)).getText().toString());
		form.setValue("field38", ((TextView)findViewById(R.id.field38)).getText().toString());
		
		RadioGroup resRadioGrp = (RadioGroup)findViewById(R.id.field39);
		int resSelectedIndex = resRadioGrp.indexOfChild(findViewById(resRadioGrp.getCheckedRadioButtonId()));
		form.setValue("field39", String.valueOf(resSelectedIndex));
		System.out.println("Res Selected obj : " + form.getValue("field39"));
		
		form.setValue("field40", ((TextView)findViewById(R.id.field40)).getText().toString());
	}


}
