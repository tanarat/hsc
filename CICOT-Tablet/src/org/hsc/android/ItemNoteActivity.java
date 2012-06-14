package org.hsc.android;



import org.hsc.model.ItemNote;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemNoteActivity extends Activity implements OnClickListener {
	private Button prvBtn, nxtBtn;
	private ItemNote[] itemNotes;
	private TextView questionTxt;
	private EditText remarkTxt;
	private CheckBox conformCh;
	// private int itemPos;
//	private ChecklistItem item;

	private void setComponentValue() {
		prvBtn = (Button) findViewById(R.id.prvBtn);
//		prvBtn.setEnabled(checklist.getCurrentItemPos() != 0);
		prvBtn.setOnClickListener(this);
		nxtBtn = (Button) findViewById(R.id.nxtBtn);
		nxtBtn.setOnClickListener(this);
//		nxtBtn.setEnabled(checklist.getCurrentItemPos() != checklist.getLastItemPos());
		
		
		questionTxt = (TextView) findViewById(R.id.questionTxt);
//		questionTxt.setText(item.getItemNo() + " " + item.getQuestion());

		conformCh = (CheckBox) findViewById(R.id.conformCh);
//		conformCh.setChecked(item.isConform());
		conformCh.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
//				item.setConform(conformCh.isChecked());
				remarkTxt.setEnabled(!isChecked);
				
				LinearLayout layout = (LinearLayout) findViewById(R.id.reasonList);
				int count =layout.getChildCount();
				for (int i = 0; i < count; i++) {
					layout.getChildAt(i).setEnabled(!isChecked);
				}
				
			}
		});

		remarkTxt = (EditText) findViewById(R.id.remarkTxt);
//		remarkTxt.setText(item.getRemarkTxt());
//		remarkTxt.setEnabled(!item.isConform());
		remarkTxt.addTextChangedListener(new TextWatcher() {
			
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
//				item.setRemarkTxt(remarkTxt.getText().toString());
			}
		});
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.reasonList);
		layout.removeAllViews();
//		String reasons[] = item.getReasons();
//		boolean checked[] = item.getReasonsCheck();
//		for (int i = 0; i < reasons.length; i++) {
//			CheckBox ch = new CheckBox(this);
//			ch.setText(reasons[i]);
//			ch.setChecked(checked[i]);
//			ch.setOnCheckedChangeListener(new ReasonsCheckHandler());
//			ch.setEnabled(!item.isConform());
//			layout.addView((ch));
//		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item);
//		MyApp app = (MyApp) getApplication();
//		checklist = app.getChecklist();
//		item = checklist.getCurrentItem();
		setComponentValue();

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		System.out.println("on stop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		System.out.println("on destroy");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		System.out.println("on pause");
//		item.setRemarkTxt(remarkTxt.getText().toString());
		
	}

	private class ReasonsCheckHandler implements OnCheckedChangeListener {

		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			// TODO Auto-generated method stub
			String btnTxt = (String) buttonView.getText();
			int index = Integer.parseInt(btnTxt.charAt(0) + "");
			index = index - 1;
//			item.check(index, isChecked);
		}

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button btn = (Button) v;
		if (btn == nxtBtn) {
			System.out.println("move previous");
//			item = checklist.getNextItem();
		} else {
			System.out.println("move next");
//			item = checklist.getPrevItem();
		}
		setComponentValue();
	}

}
