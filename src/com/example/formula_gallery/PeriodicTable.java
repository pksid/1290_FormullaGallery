package com.example.formula_gallery;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class PeriodicTable extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.FormulaGallery.MESSAGE";
	SQLiteDatabase db;
	final Context context = this;
	Dialog dialog;
	Button B1,B2,B3,B4,B5,B6,B7,B8,btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_periodic_table);
		DataHelper dh=new DataHelper(this,"BusinessDirectory", null,DataHelper.Version);
        db=dh.getReadableDatabase();
        
        
        dialog = new Dialog(context);
		dialog.setContentView(R.layout.custom);
		dialog.setTitle("Info...");
		B1 = (Button) dialog.findViewById(R.id.b1);
		B2 = (Button) dialog.findViewById(R.id.b2);
		B3 = (Button) dialog.findViewById(R.id.b3);
		B4 = (Button) dialog.findViewById(R.id.b4);
		B5 = (Button) dialog.findViewById(R.id.b5);
		B6 = (Button) dialog.findViewById(R.id.b6);
		B7 = (Button) dialog.findViewById(R.id.b7);
		B8 = (Button) dialog.findViewById(R.id.b8);
		
		
	btn = (Button) dialog.findViewById(R.id.dialogButtonOK);
		
		btn.setOnClickListener(new View.OnClickListener()
		{
		public void onClick(View view) {
		dialog.dismiss();
		}
		});
	}


	

		public void sendMessage(View view) {
			String s=view.getTag().toString();
			Cursor c=db.rawQuery("select * from PT1 where atomic_number ="+s, null);
    		if (c.moveToFirst())
    		{    			
    			B1.setText("Atomic Number: "+s);
    			B2.setText("Symbol: "+c.getString(1));
    			B3.setText("Name: "+c.getString(2));
    			B4.setText("Atomic Wt:"+c.getString(3));
    			B5.setText("Melting Pt:"+c.getString(4));
    			B6.setText("Boiling Pt: "+c.getString(5));
    			B7.setText("Electronic Config: "+c.getString(6));
    			B8.setText("Oxidation States: "+c.getString(7));
        		
    			dialog.show();
    			
    		}
    		
		}
		
}