package com.example.formula_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class Chem_Formula_List extends Activity {
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chem__formula__list);
		
		Intent intent2 = getIntent();
        String message = intent2.getStringExtra(Chem.EXTRA_MESSAGE);
		
        int i=Integer.parseInt(message);
		
		image = (ImageView) findViewById(R.id.imageView1);
		if(i==8)
			image.setImageResource(R.drawable.i8);
		else if(i==9)
			image.setImageResource(R.drawable.i9);
		else if(i==10)
			image.setImageResource(R.drawable.i10);
		else if(i==11)
			image.setImageResource(R.drawable.i11);
		else if(i==12)
			image.setImageResource(R.drawable.i12);
		else if(i==13)
			image.setImageResource(R.drawable.i13);
		else if(i==14)
			image.setImageResource(R.drawable.i14);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_chem__formula__list, menu);
		return true;
	}

}
