package org.hsc.android;

import java.util.List;

import org.hsc.model.Auditor;
import org.hsc.model.BPartner;
import org.hsc.model.Checklist;
import org.hsc.model.Paper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class PaperActivity extends Activity {
	private String tag = this.getClass().getName();
	private Spinner mSpinner,mSpinner2,mSpinner3,mSpinner4;
	private MyAndroidApp myapp;
	private String bpNames[];
	private String auditTypes[];
	private String checklists[];
	private String auditors[];
	
	private int checklistIndex = -1;
	private Paper paper;
	
	public PaperActivity() {
		super();
		// TODO Auto-generated constructor stub
		myapp = MyAndroidApp.getApp(this);
//		List<BPartner> bpList = myapp.getAllBPartners();
//		bpNames= new String[bpList.size()];
//		for (int i = 0; i < bpNames.length; i++) {
//			bpNames[i] = bpList.get(i).getName();
//		}
		
		auditTypes = Paper.AUDIT_TYPES;
//		List<Checklist> chkList = myapp.getAllChecklists();
//		checklists = new String[chkList.size()];
//		for (int i = 0; i < checklists.length; i++) {
//			checklists[i] = chkList.get(i).getName();
//		}
		
//		List<Auditor> auditorList = myapp.getAllAuditors();
//		auditors = new String[auditorList.size()];
//		for (int i = 0; i < auditors.length; i++) {
//			auditors[i] = auditorList.get(i).getName();
//		}

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paper);
		Intent intent = this.getIntent();
		Paper paper = (Paper) intent.getSerializableExtra("paper");
        if(paper == null){
        	paper = new Paper();
        }
        viewPaper(paper);

	}
	
	private void viewPaper(Paper paper){
		BPartner bpartner = paper.getBPartner();
//		String bpName[] = {bpartner.getName()};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, bpNames); 
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner = (Spinner)findViewById(R.id.spinner1);
        mSpinner.setAdapter(adapter);
        mSpinner.setSelection(2);
        mSpinner.setEnabled(false);
        
        
        ArrayAdapter<String> auditTypeAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, auditTypes); 
        auditTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner2 = (Spinner)findViewById(R.id.spinner2);
        mSpinner2.setAdapter(auditTypeAdapter);

        ArrayAdapter<String> checklistAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, checklists); 
        checklistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner3 = (Spinner)findViewById(R.id.spinner3);
        mSpinner3.setAdapter(checklistAdapter);
//        mSpinner3.setOnItemSelectedListener(this);
        mSpinner3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				checklistIndex = arg2;
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        	
		});
        
        ArrayAdapter<String> auditorAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, auditors); 
        auditorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner4 = (Spinner)findViewById(R.id.spinner4);
        mSpinner4.setAdapter(auditorAdapter);
	}
	public void selectBPartner(View view){
		Intent intent = new Intent(this, BPartnersActivity.class);
		startActivity(intent);
	}
	
	public void process(View v) {
		// TODO Auto-generated method stub
		Log.i(tag, "process clicked..................");
		Intent intent = new Intent(this, ItemsActivity.class);
		intent.putExtra("position", checklistIndex);
		startActivity(intent);
	}
	
	
	

}
