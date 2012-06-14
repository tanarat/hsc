package org.hsc.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LogoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		try {
			Thread.sleep(2000);
			Intent intent = new Intent(this,MainActivity.class);
			startActivity(intent);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
