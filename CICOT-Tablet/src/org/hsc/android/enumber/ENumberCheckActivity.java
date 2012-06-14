package org.hsc.android.enumber;

import org.hsc.android.MyAndroidApp;
import org.hsc.android.R;
import org.hsc.android.db.ENumberDAO;
import org.hsc.model.ENumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ENumberCheckActivity extends Activity{
	MyAndroidApp myapp;
//	ENumberDAO eNumberDAO;
	private int[] imgStatus = { R.drawable.halal1, R.drawable.haram1,
			R.drawable.unknown1, R.drawable.exclaim1, R.drawable.certified };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.enumber);

		myapp = MyAndroidApp.getApp(getApplicationContext());
//		eNumberDAO = myapp.getENumberDAO();

	}

	public void search(View view) {
		EditText searchTxt = (EditText) findViewById(R.id.searchTxt);
		String eNumberSearch = searchTxt.getText().toString();

		
		ENumberService eNumberService = myapp.getENumberService();
		ENumber eNumberFound = eNumberService.get(eNumberSearch);
		
		TextView txtCode = (TextView) findViewById(R.id.txtCode);
		TextView txtName = (TextView) findViewById(R.id.txtName);
		TextView txtDesc = (TextView) findViewById(R.id.txtDesc);
		TextView txtStatus = (TextView) findViewById(R.id.txtStatus);
		ImageView imgStatusView = (ImageView) findViewById(R.id.imgStatus);
		if (eNumberFound != null) {
			txtCode.setText(eNumberFound.getEnumber());
			txtName.setText(eNumberFound.getName());
			txtDesc.setText(eNumberFound.getDescription());
			txtStatus.setText(String.valueOf(ENumber.getStatusText(eNumberFound
					.getHalalStatus()-1)));
			imgStatusView.setImageResource(imgStatus[eNumberFound
					.getHalalStatus()-1]);
		}else{
			txtCode.setText("Unknow E-Number");
			txtName.setText("");
			txtDesc.setText("");
			txtStatus.setText("");
			imgStatusView.setImageResource(R.drawable.unknown1);
		}
	}
	
}
