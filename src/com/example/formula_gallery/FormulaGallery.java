package com.example.formula_gallery;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FormulaGallery extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formula_gallery);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_formula_gallery, menu);
		return true;
	}
	
	public void sendMessage(View view) {
        // Do something in response to button
    	Intent intent1 = new Intent(this, Formula.class);
    	
    	startActivity(intent1);

    }
    public void sendMessage2(View view) {
        // Do something in response to button
    	Intent intent2 = new Intent(this, PeriodicTable.class);
    	
    	startActivity(intent2);

    }
    public void sendMessage3(View view) {
        // Do something in response to button
    	Intent intent3 = new Intent(this, Calc.class);
    	
    	startActivity(intent3);

    }


}
