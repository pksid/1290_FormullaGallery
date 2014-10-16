package com.example.formula_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Chem extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.FormulaGallery.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chem);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_chem, menu);
		return true;
	}

	public void sendMessage(View view) {
        // Do something in response to button
		String s=view.getTag().toString();
    	Intent intent2 = new Intent(this, Chem_Formula_List.class);
    	intent2.putExtra(EXTRA_MESSAGE, s);
    	startActivity(intent2);
    }
}

