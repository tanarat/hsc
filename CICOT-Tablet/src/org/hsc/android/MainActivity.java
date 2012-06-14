package org.hsc.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hsc.android.db.ENumberDAO;
import org.hsc.android.enumber.ENumberCheckActivity;
import org.hsc.android.enumber.ENumberService;
import org.hsc.android.islamic.ENumberActivity;
import org.hsc.android.islamic.FormListActivity;
import org.hsc.android.islamic.FormTabActivity;
import org.hsc.android.islamic.MainMenuAdapter;
import org.hsc.model.BPartner;
import org.hsc.model.ENumber;
import org.hsc.model.Form;
import org.hsc.model.Paper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import com.androidhive.jsonparsing.JSONParser;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	MyAndroidApp myapp;
	public static final String tag = MainActivity.class.getName();
	// Menu item id
	public static final int MENU_LOAD_DEFAULT_DATA = 0;
	public static final int MENU_SETTING = 1;

	private static final int DIALOG_YES_NO_MESSAGE = 1;

	private ImageButton[] buttons;

	private Integer[] iconsImgs = { R.drawable.menu_eval_form3,
			R.drawable.menu_enumber3 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		myapp = MyAndroidApp.getApp(getApplicationContext());

		buttons = new ImageButton[2];
		buttons[0] = new ImageButton(this);
		buttons[0].setImageResource(iconsImgs[0]);
		buttons[0].setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				evalForm(v);
			}
		});

		buttons[1] = new ImageButton(this);
		buttons[1].setImageResource(iconsImgs[1]);
		buttons[1].setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				enumberSearch(v);
			}
		});

		// myapp = MyAndroidApp.getApp(getApplicationContext());

		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new MainMenuAdapter(this));

	}

	public ImageButton[] getButtons() {
		return buttons;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_LOAD_DEFAULT_DATA, 0, R.string.lbl_menu_loaddata);
		menu.add(0, MENU_SETTING, 1, R.string.lbl_menu_setting);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.i(tag, "Menu Item : " + item.getItemId());

		switch (item.getItemId()) {
		case MENU_LOAD_DEFAULT_DATA:
			showDialog(DIALOG_YES_NO_MESSAGE);
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		// switch (id) {
		// case DIALOG_YES_NO_MESSAGE:
		return new AlertDialog.Builder(this)
				// .setIcon(R.drawable.alert_dialog_icon)
				.setTitle(R.string.alert_dialog_two_buttons_title)
				.setMessage(R.string.msg_warning_message_loaddata)
				.setPositiveButton(R.string.alert_dialog_ok,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int whichButton) {
								loadDefaultDatas();
								message("Load data completed!!");
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
		// }
		// return null;
	}

	public void logout(View view) {
		Intent intent = new Intent(this, MyAndroidActivity.class);
		startActivity(intent);
	}

	

	public void loadDefaultDatas() {

		Log.i(tag, "start load e-number");
		loadENumber();
		Log.i(tag, "finish load e-number");
	}


	public void loadENumber() {
//		ENumberService eNumberService = new ENumberService(myapp.getENumberServiceURL());
		ENumberService eNumberService = myapp.getENumberService();
		List<ENumber> eNumberList = eNumberService.loadENumber();
		ENumberDAO eNumberDAO = myapp.getENumberDAO();
		eNumberDAO.updateENumber(eNumberList);
	}


	public void viewItems(View view) {
		Intent intent = new Intent(this, ItemsActivity.class);
		startActivity(intent);
	}

	public void viewChecklists(View view) {
		Intent intent = new Intent(this, ChecklistsActivity.class);
		startActivity(intent);
	}

	public void viewAuditors(View view) {
		Intent intent = new Intent(this, AuditorsActivity.class);
		startActivity(intent);
	}

	public void viewBPartners(View view) {
		Intent intent = new Intent(this, BPartnersActivity.class);
		startActivity(intent);
	}

	public void newPaper(View view) {
		Intent intent = new Intent(this, PaperActivity.class);
		Paper paper = new Paper();
		paper.setBPartner(new BPartner(1000001, "it bakery"));
		intent.putExtra("paper", paper);
		startActivity(intent);
	}

	public void evalForm(View view) {
		Intent intent = new Intent(this, FormListActivity.class);
		startActivity(intent);
	}

	public void enumberSearch(View view) {
//		Intent intent = new Intent(this, ENumberActivity.class);
		Intent intent = new Intent(this, ENumberCheckActivity.class);
		startActivity(intent);
	}

	private void message(String msg) {
		Toast toast;
		toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
}
