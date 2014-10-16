package com.example.formula_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class FormulaList extends Activity {
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formula_list);
		
		Intent intent2 = getIntent();
        String message = intent2.getStringExtra(Physics.EXTRA_MESSAGE);
		
        int i=Integer.parseInt(message);
		
		image = (ImageView) findViewById(R.id.imageView1);
		if(i==1)
			image.setImageResource(R.drawable.i1);
		else if(i==2)
			image.setImageResource(R.drawable.i2);
		else if(i==3)
			image.setImageResource(R.drawable.i3);
		else if(i==4)
			image.setImageResource(R.drawable.i4);
		else if(i==5)
			image.setImageResource(R.drawable.i5);
		else if(i==6)
			image.setImageResource(R.drawable.i6);
		else if(i==7)
			image.setImageResource(R.drawable.i7);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_formula_list, menu);
		return true;
	}

}
