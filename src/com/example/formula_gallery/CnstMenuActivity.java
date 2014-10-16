package com.example.formula_gallery;


import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;


public class CnstMenuActivity extends Activity {
	String msg;

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cnst_menu);
		// Show the Up button in the action bar.
				getActionBar().setDisplayHomeAsUpEnabled(true);
				// Make sure we're running on Honeycomb or higher to use ActionBar APIs
		        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
		        // Show the Up button in the action bar.
		        getActionBar().setDisplayHomeAsUpEnabled(true);
		        }
		        
		     // Make sure we're running on Honeycomb or higher to use ActionBar APIs
		        Intent intent = getIntent();
		        msg = intent.getStringExtra(Calc.EXTRA_MESSAGE);
		        
		        
		    
		       
		        
		        
	}
public void sendMesg(View view) {
    	
    	//B1=(Button)findViewById(R.id.b1);

		//E1=(EditText)findViewById(R.id.editText1);
		 Button btn = (Button)view;
		 String s=btn.getTag().toString();
		 sendIntentM(s);
		 finish();
		 }
public void sendIntentM(String s)
{
	Intent intentp = new Intent(this, Calc.class);
	intentp.putExtra(EXTRA_MESSAGE, s);
	startActivity(intentp);
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_cnst_menu, menu);
		return true;
	}

}

