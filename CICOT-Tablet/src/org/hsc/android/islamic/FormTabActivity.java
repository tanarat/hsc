package org.hsc.android.islamic;

import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.R.array;
import org.hsc.android.R.layout;
import org.hsc.android.R.string;
import org.hsc.android.db.FormDAO;
import org.hsc.model.Form;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class FormTabActivity extends TabActivity{
	public static String tag = FormTabActivity.class.getName();
	private Resources res ;
	private Form form = null;
	private TabHost tabHost = null;
	private MyAndroidApp myapp;
	private FormDAO formDAO;
	private String[] tabNames ;
	private Drawable[] tabIcons ;
	
	private NthFormTabActivity[] tabActivities = {new FirstTabActivity(), new SecondTabActivity(), new ThirdTabActivity(), new ForthTabActivity(),
										new FifthTabActivity(), new SixthTabActivity(), new SeventhTabActivity()};
//	private Class[] tabActivitys = {FirstTabActivity.class,SecondTabActivity.class,
//							ThirdTabActivity.class,ForthTabActivity.class,FifthTabActivity.class,
//							SixthTabActivity.class,SeventhTabActivity.class};
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    setContentView(R.layout.tab);
	    myapp = MyAndroidApp.getApp(getApplicationContext());
	    formDAO = myapp.getFormDAO();
	    Intent tabIntent = this.getIntent();
//	    form = (Form)tabIntent.getSerializableExtra("form");
	    int index = tabIntent.getIntExtra("index", -1);
	 
	    System.out.println("adddddd      " + index);
	    
	    System.out.println("number of form in the list : " + myapp.getFormList().getNumberOfForm() );
	    form = myapp.getFormList().getForm(index);
	    
	    TextView tvFormName = (TextView)findViewById(R.id.tvFormName);
	    if(form.getName() != null){
	    	tvFormName.setText(form.getName());
	    }else{
	    	tvFormName.setText(R.string.lbl_form_name_new);
	    }
	    
	    res = getResources(); // Resource object to get Drawables
	    tabNames = res.getStringArray(R.array.tabName);
	    tabIcons = new Drawable[tabNames.length];
//	    for(int i = 0; i < tabIcons.length; i++){
	    	tabIcons[0] = res.getDrawable(R.drawable.icon_tab_40);
	    	tabIcons[1] = res.getDrawable(R.drawable.icon_tab_41);
	    	tabIcons[2] = res.getDrawable(R.drawable.icon_tab_42);
	    	tabIcons[3] = res.getDrawable(R.drawable.icon_tab_43);
	    	tabIcons[4] = res.getDrawable(R.drawable.icon_tab_44);
	    	tabIcons[5] = res.getDrawable(R.drawable.icon_tab_45);
	    	tabIcons[6] = res.getDrawable(R.drawable.icon_tab_46);
//	    }
	    
	    
	    
	    
	    tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
//	    Intent intent;  // Reusable Intent for each tab


	    for(int i = 0; i < tabNames.length; i++){
			CharSequence tabName = tabNames[i];
			Intent intent = new Intent();
		    intent.putExtra("index", index);
			intent.setClass(this, tabActivities[i].getClass());
			spec = tabHost.newTabSpec(tabNames[i]);
			spec.setIndicator(tabName, tabIcons[i]);
			spec.setContent(intent);
			tabHost.addTab(spec);
	    
	    }

	    tabHost.setCurrentTab(0);
	}
	// Menu item id
		public static final int MENU_SAVE = 0;
//		public static final int MENU_SETTING = 1;
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_SAVE, 0, R.string.lbl_menu_save);
//		menu.add(0,MENU_SETTING,1,R.string.lbl_menu_setting);

		return true;
	}
	private static final int DIALOG_CONFIRM_SAVE = 1;
	private static final int DIALOG_INPUT_FORM_NAME = 2;
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case MENU_SAVE:
			showDialog(DIALOG_CONFIRM_SAVE);
//			showDialog(DIALOG_INPUT_FORM_NAME);
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		// Set an EditText view to get user input   
        final EditText inputName = new EditText(this); 
		switch (id) {
		case DIALOG_CONFIRM_SAVE:
			return new AlertDialog.Builder(this)
					// .setIcon(R.drawable.alert_dialog_icon)
					.setTitle(R.string.alert_dialog_two_buttons_title)
					.setMessage(R.string.msg_confirm_message_save)
					.setPositiveButton(R.string.alert_dialog_ok,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									
									if(form.getName() == null || form.getName().length() == 0){
										showDialog(DIALOG_INPUT_FORM_NAME);
									}else{
										save();
									}
										
									
									/* User clicked OK so do some stuff */
								}
							})
					.setNegativeButton(R.string.alert_dialog_cancel,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {

									/* User clicked Cancel so do some stuff */
								}
							}).create();
		case DIALOG_INPUT_FORM_NAME:
			return new AlertDialog.Builder(this)
			.setView(inputName)
			.setTitle(R.string.alert_dialog_input_form_name_title)
			.setMessage(R.string.msg_input_form_name)
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					form.setName(inputName.getText().toString());
					save();
				}
			})
			.setNegativeButton(R.string.alert_dialog_cancel,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {

									/* User clicked Cancel so do some stuff */
								}
							})
			.create();
		}
		return null;
	}
	private void message(String msg) {
		Toast toast;
		toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
	private void save(){
//		for(int i = 0; i < tabActivities.length; i++){
//			tabActivities[i].saveFormState();
//		}
		if(formDAO.save(form)){
			message(res.getString(R.string.msg_save_complete));
			Intent myIntent = new Intent(FormTabActivity.this, FormListActivity.class);
			FormTabActivity.this.startActivity(myIntent);
		}else{
			message(res.getString(R.string.msg_save_fail));
		}
		
	}
}
