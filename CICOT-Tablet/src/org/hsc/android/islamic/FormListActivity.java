package org.hsc.android.islamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hsc.android.ChecklistsActivity;
import org.hsc.android.ItemsActivity;
import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.db.FormDAO;
import org.hsc.model.Checklist;
import org.hsc.model.Form;
import org.hsc.model.FormList;

import com.google.gson.Gson;
import com.tani.app.ui.IconContextMenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

//public class FormListActivity extends ListActivity {
public class FormListActivity extends Activity{
//	private List<Form> formList = null;
	private FormList formList ;
	private int selectedPosition = -1;
	private MyAndroidApp myapp;
	private FormDAO formDAO;
	private String tag = this.getClass().getName();
//	private ArrayAdapter<Form> adapter;
	private Resources res;
	
	
	ListView listView;
	LazyAdapter adapter;
	
	// XML node keys
		static final String KEY_SONG = "song"; // parent node
		static final String KEY_ID = "id";
		static final String KEY_TITLE = "title";
		static final String KEY_ARTIST = "artist";
		static final String KEY_DURATION = "duration";
		static final String KEY_THUMB_URL = "thumb_url";

	// Menu item id
	public static final int MENU_NEW = 0;

	private IconContextMenu iconContextMenu = null;

	private final int CONTEXT_MENU_ID = 1;

	private final int MENU_VIEW = 11;
	private final int MENU_RENAME = 12;
	private final int MENU_EDIT = 13;
	private final int MENU_SEND = 14;
	
	private static final int DIALOG_INPUT_FORM_NAME = 2;
	private static final int DIALOG_SEND_FAIL = 3;
	private static final int DIALOG_SEND_SUCCESS = 4;

	public void loadFormList() {

		formList = myapp.getFormList();
//		adapter = new ArrayAdapter<Form>(this,
//				android.R.layout.simple_list_item_1, formList.getFormList());
//		setListAdapter(adapter);
//		adapter.notifyDataSetChanged();
	
	}
	

	
	

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		loadFormList();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_list);
		myapp = MyAndroidApp.getApp(getApplicationContext());
//		formDAO = MyAndroidApp.getApp(this).getFormDAO();
		
		res = getResources();
		loadFormList();
		
		initContextMenu();

//		ListView lv = getListView();
		listView = (ListView)findViewById(R.id.list);
		adapter = new LazyAdapter(this, formList.getFormList());
		listView.setAdapter(adapter);
		
//		lv.setTextFilterEnabled(true);
//
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				setSelectedPosition(position);
//				Form form = adapter.getItem(selectedPosition);
//				System.out.println(form.toString());
//				viewForm(form);
//				viewForm(selectedPosition);
				editForm(selectedPosition);
			}
		});
//
		listView.setOnItemLongClickListener(itemLongClickHandler);

	}




	private void initContextMenu() {
		// init the menu
		iconContextMenu = new IconContextMenu(this, CONTEXT_MENU_ID);
		iconContextMenu.addItem(res, R.string.menu_edit, R.drawable.icon_form_edit_1,
				MENU_EDIT);
//		iconContextMenu.addItem(res, R.string.menu_view, R.drawable.icon_form_view_1,
//				MENU_VIEW);
		iconContextMenu.addItem(res, R.string.menu_rename, R.drawable.icon_form_rename_1,
				MENU_RENAME);
		iconContextMenu.addItem(res, R.string.menu_send2server, R.drawable.icon_form_send2server,
				MENU_SEND);
//		iconContextMenu.addItem(res, R.string.menu_delete, R.drawable.ic_4,
//				MENU_ITEM_4_ACTION);

		// set onclick listener for context menu
		iconContextMenu
				.setOnClickListener(new IconContextMenu.IconContextMenuOnClickListener() {
					@Override
					public void onClick(int menuId) {
						Form form;
						switch (menuId) {
						case MENU_VIEW: // view form
//							setSelectedPosition(selectedPosition);
//							form = adapter.getItem(selectedPosition);
							viewForm(selectedPosition);
							break;
						case MENU_RENAME: // rename
//							renameForm();
							showDialog(MENU_RENAME);
//							Toast.makeText(getApplicationContext(),
//									"You've clicked on menu item 2", 1000)
//									.show();
							break;
						case MENU_EDIT:
//							form = adapter.getItem(selectedPosition);
							editForm(selectedPosition);
//							Toast.makeText(getApplicationContext(),
//									"You've clicked on menu item 3", 1000)
//									.show();
							break;
						case MENU_SEND:
							send2server();
//							Toast.makeText(getApplicationContext(),
//									"You've clicked on menu item 4", 1000)
//									.show();
							break;
						}
					}
				});
	}
	private static String url = "http://203.146.127.162:6080/hsc-rest/rest/form";
//Form Action 
	public void send2server(){
		
		
		Form form = adapter.getItem(selectedPosition);
		Gson gson = new Gson();
		String jsonStr = gson.toJson(form);
		System.out.println(jsonStr);
		
//		Toast.makeText(getApplicationContext(),
//				"Sending form " + form.getName() + " to server" , 1000)
//				.show();
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(url);
		StringEntity input;
		try {
			input = new StringEntity(jsonStr);
			
			postRequest.setEntity(input);
	 
			HttpResponse response = httpClient.execute(postRequest);
			
			if (response.getStatusLine().getStatusCode() != 201) {
//				throw new RuntimeException("Failed : HTTP error code : "
//					+ response.getStatusLine().getStatusCode());
//				showDialog(DIALOG_SEND_FAIL);
//				return;
			}
	 
			BufferedReader br = new BufferedReader(
	                        new InputStreamReader((response.getEntity().getContent())));
	 
			String output = br.readLine();;
			System.out.println("Output from Server .... " + output);
//			output = br.readLine();
			long ref = Long.parseLong(output);
			System.out.println("ref no. : " + ref);
			form.setRef(ref);
			
			myapp.saveForm(form);
			adapter.notifyDataSetChanged();
//			formDAO.save(form);
//			while ((output = br.readLine()) != null) {
//				System.out.println(output);
//			}
			showDialog(DIALOG_SEND_SUCCESS);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			showDialog(DIALOG_SEND_FAIL);
			System.out.println("error : UnsupportedEncodingException " );
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			showDialog(DIALOG_SEND_FAIL);
			System.out.println("error : ClientProtocolException " );
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			showDialog(DIALOG_SEND_FAIL);
			System.out.println("error : IOException " );
			e.printStackTrace();
		}
	}
	
	public void addForm(Form form){
//		formList.addForm(form);
//		form.setField0("bp name......");
		int addIndex = formList.getNumberOfForm();
		adapter.add(form);
		adapter.notifyDataSetChanged();
		Toast.makeText(getApplicationContext(),
				"add new form at " + addIndex  , 1000)
				.show();
		editForm(addIndex);
	}
	public void editForm(int index) {
		Intent myIntent = new Intent(FormListActivity.this, FormTabActivity.class);
		myIntent.putExtra("index", index);
		FormListActivity.this.startActivity(myIntent);
	}
	public void viewForm(Form form) {
		Intent myIntent = new Intent(FormListActivity.this, FormViewActivity.class);
		myIntent.putExtra("form", form);
		FormListActivity.this.startActivity(myIntent);
	}
	public void viewForm(int index){
		Intent myIntent = new Intent(FormListActivity.this, FormViewActivity.class);
		myIntent.putExtra("index", index);
		FormListActivity.this.startActivity(myIntent);
	}
	public void renameForm(Form form,String newName) {
		form.setName(newName);
		adapter.notifyDataSetChanged();

//		Form form = formList.get(selectedPosition);
//		myapp.renameForm(form,newName);
//		Log.i(tag, "rename form id : " + form.getId() + " new name : " + newName);
////		ContentValues values = new ContentValues();
////		values.put(FormDAO.COLUMN_FORM_NAME, form.getName());
////		formDAO.update(form.getId(), values);
//		loadFormList();
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_NEW, 0, R.string.lbl_menu_new);
		// menu.add(0,MENU_SETTING,1,R.string.lbl_menu_setting);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case MENU_NEW:
//			Form form = new Form();
//			editForm(form);
			boolean ok = showDialog(DIALOG_INPUT_FORM_NAME, null);
			
//			addForm();
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * list item long click handler used to show the context menu
	 */
	private OnItemLongClickListener itemLongClickHandler = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> parent, View view,
				int position, long id) {
			setSelectedPosition(position);
			showDialog(CONTEXT_MENU_ID);
			return true;
		}
	};

	/**
	 * create context menu
	 */
	@Override
	protected Dialog onCreateDialog(int id) {
		final EditText inputName = new EditText(this);
		switch (id) {
		case CONTEXT_MENU_ID:
			return iconContextMenu.createMenu("คุณต้องการ"); 
		case MENU_RENAME:
			return new AlertDialog.Builder(this)
			.setView(inputName)
			.setTitle(R.string.alert_dialog_input_form_name_title)
			.setMessage(R.string.msg_input_form_name)
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
//					Form form = formList.getForm(selectedPosition);
					Log.i(tag, "selectedPosition : " + selectedPosition);
					renameForm((Form)adapter.getItem(selectedPosition),inputName.getText().toString());
//					renameForm(inputName.getText().toString());
//					Form form = formList.get(selectedPosition);
//					form.setName(inputName.getText().toString());
//					formDAO.save(form);
//					loadFormList();
//					save();
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
			
			
		case DIALOG_INPUT_FORM_NAME:
			return new AlertDialog.Builder(this)
			.setView(inputName)
			.setTitle(R.string.alert_dialog_input_form_name_title)
			.setMessage(R.string.msg_input_form_name)
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Form form = new Form(inputName.getText().toString());
					addForm(form);
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
			
		case DIALOG_SEND_FAIL:
			return new AlertDialog.Builder(this)
//			.setView(inputName)
			.setTitle("การส่งข้อมูลผิดพลาด")
			.setMessage("ไม่สามารถส่งข้อมูลได้")
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				}
			})
			.create();
		case DIALOG_SEND_SUCCESS:
			return new AlertDialog.Builder(this)
//			.setView(inputName)
			.setTitle("การส่งข้อมูลสำเร็จ")
			.setMessage("ส่งข้อมูลใบประเมินไปยังเซิฟเวอร์เรียบร้อย")
			.setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				}
			})
			.create();	
			
		default:
//			return super.onCreateDialog(id);
			return null;
		}

	}

	public int getSelectedPosition() {
		return selectedPosition;
	}

	public void setSelectedPosition(int selectedPosition) {
		this.selectedPosition = selectedPosition;
	}

}
