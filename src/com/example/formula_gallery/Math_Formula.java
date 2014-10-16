package com.example.formula_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class Math_Formula extends Activity {
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_math__formula);
		
		Intent intent2 = getIntent();
        String message = intent2.getStringExtra(Chem.EXTRA_MESSAGE);
		
        int i=Integer.parseInt(message);
		
		image = (ImageView) findViewById(R.id.imageView1);
		if(i==15)
			image.setImageResource(R.drawable.i15);
		else if(i==16)
			image.setImageResource(R.drawable.i16);
		else if(i==17)
			image.setImageResource(R.drawable.i17);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_math__formula, menu);
		return true;
	}

}
