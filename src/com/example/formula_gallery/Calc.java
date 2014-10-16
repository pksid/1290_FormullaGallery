package com.example.formula_gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;
import java.math.*;

public class Calc extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	EditText E1;
	Stack<String> st=new Stack<String>();
	Stack<Integer> ln=new Stack<Integer>();
	Stack<Integer> cp=new Stack<Integer>();
	int cln,n1;
	int cpl;
	String messag;
	String oprt;
	String ans;
	int f=0; //flag variable

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc);
		 Intent intent = getIntent();
	     messag = intent.getStringExtra(CnstMenuActivity.EXTRA_MESSAGE);
	     
	     E1=(EditText)findViewById(R.id.editText1);
	     E1.setText(messag);
	     
	}
	
public void sendMessage(View view) {
    	

		
		 Button btn = (Button)view;
		 String s="hello";
		 if(btn.getText().toString().equals("cnst"))
		 {
		 String txt=E1.getText().toString();
 			sendIntent(txt);
    		}
		 else{
		E1.setText(btn.getText().toString());	 
		 }
		 }
public void showText(View view) {
	
try{
 E1=(EditText)findViewById(R.id.editText1);
 E1.setHighlightColor(9);
	
	Button btn = (Button)view;
	String s1="";
	
	if(btn.getText().toString().equals("DL"))
	{
		int l=(int)E1.getText().length();
		if(l>0){
		int m=ln.pop();
		E1.setText(E1.getText().delete(l-m, l));
		}
	}
	else if(btn.getText().toString().equals("clear"))
	{
		
		if(((int)E1.getText().length())>0){
		
		E1.setText(s1);
		ln.clear();	
	}
	}
	else if(btn.getText().toString().equals("bin"))
	{

	int ddec=Integer.parseInt(E1.getText().toString());
	ln.clear();
	E1.setText(Integer.toBinaryString(ddec));
	ln.push((int)E1.getText().length());
	
	
	}
	else if(btn.getText().toString().equals("sin"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString((Math.sin(Math.toRadians(ddec)))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("asin"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.ceil(Math.toDegrees(Math.asin(ddec)))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("sinh"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.sinh(Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	
	else if(btn.getText().toString().equals("cos"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.cos(Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("acos"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.ceil(Math.toDegrees(Math.acos(ddec)))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("cosh"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.cosh(Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("tan"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.tan(Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("atan"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.ceil(Math.toDegrees(Math.atan(ddec)))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	else if(btn.getText().toString().equals("tanh"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString(Math.tanh(Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}





	else if(btn.getText().toString().equals("deg"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString((Math.toDegrees(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	}
	
	else if(btn.getText().toString().equals("rad"))
	{

	double ddec=Double.parseDouble(E1.getText().toString());
	ln.clear();
	E1.setText(Double.toString((Math.toRadians(ddec))));
	ln.push((int)E1.getText().length());
	ans=E1.getText().toString();
	
	}
	
	else if(btn.getText().toString().equals("hex"))
	{
		int ddec=Integer.parseInt(E1.getText().toString());
		ln.clear();
		E1.setText(Integer.toHexString(ddec).toString());
		ln.push((int)E1.getText().length());
		
	}
	else if(btn.getText().toString().equals("sval"))
	{
		ln.clear();
		E1.setText(messag);
		//Double ddec=Double.parseDouble(E1.getText().toString());
		ln.push((int)E1.getText().length());
		
	}
	
	else if(btn.getText().toString().equals("x!"))
	{
	double d=Double.parseDouble(E1.getText().toString());
	E1.setText(Double.toString(fact(d)));
	ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("nPr"))
	{
		
		int n1=Integer.parseInt(E1.getText().toString());
		cp.push(n1);
		E1.setText(E1.getText().append(btn.getTag().toString()));
		oprt=btn.getTag().toString();
		cpl=E1.getText().length();
		f=1;
	}
	else if(btn.getText().toString().equals("nCr"))
	{
		
		int n1=Integer.parseInt(E1.getText().toString());
		cp.push(n1);
		E1.setText(E1.getText().append(btn.getTag().toString()));
		oprt=btn.getTag().toString();
		cpl=E1.getText().length();
		f=1;
	}
	else if(btn.getText().toString().equals("mod"))
	{
		
		int n1=Integer.parseInt(E1.getText().toString());
		cp.push(n1);
		E1.setText(E1.getText().append(btn.getText().toString()));
		oprt=btn.getTag().toString();
		cpl=E1.getText().length();
		f=1;
	}
	
	
	else if(btn.getText().toString().equals("x²"))
	{
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.pow(ddec, 2))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("x³"))
	{
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.pow(ddec, 3))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("xª"))
	{
		
		cln=btn.getTag().toString().length();
		ln.push(cln);
		E1.setText(E1.getText().append(btn.getTag().toString()));
		
	}
	else if(btn.getText().toString().equals("10ª"))
	{
		
				double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.pow(10, ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	} 
	else if(btn.getText().toString().equals("eª"))
	{
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.exp(ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("log"))
	{
		
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.log10(ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	
	else if(btn.getText().toString().equals("ln"))
	{
		
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.log(ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("log2"))
	{
		
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.log(ddec)/Math.log(2))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	else if(btn.getText().toString().equals("sqrt"))
	{
		
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.sqrt(ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	
	else if(btn.getText().toString().equals("cbrt"))
	{
		
		
		double ddec=Double.parseDouble(E1.getText().toString());
		ln.clear();
		E1.setText(Double.toString((Math.cbrt(ddec))));
		ln.push((int)E1.getText().length());
		ans=E1.getText().toString();
	}
	
	else if(btn.getText().toString().equals("ans"))
	{
		E1.setText(E1.getText().append(ans));
		
	}
	
	else if(btn.getText().toString().equals("="))
	{
		if(f==1){
		if(oprt.equals("P")){
			String str=E1.getText().toString();
			int r=Integer.parseInt(str.substring(cpl));
			int n=cp.pop();
			E1.setText(Double.toString(calNPr(n,r)));
			ans=E1.getText().toString();
		}
		else if(oprt.equals("mod")){
			String str=E1.getText().toString();
			int r=Integer.parseInt(str.substring(cpl));
			int n=cp.pop();
			E1.setText(Integer.toString(n%r));
			ans=E1.getText().toString();
		}
		
		else if(oprt.equals("C")){
			int l=E1.getText().length();
			String str=E1.getText().toString();
			int r=Integer.parseInt(str.substring(cpl));
			int n=cp.pop();
			E1.setText((Double.toString(calNCr(n,r))));
			ans=E1.getText().toString();
		}
		f=0;
		}
		
		else{
			String exp=E1.getText().toString();
			
			Infix eval=new Infix();
			if(exp.charAt(0)=='+'||exp.charAt(0)=='-')
			{
				E1.setText(Double.toString(eval.infix("0"+exp)));
				ans=E1.getText().toString();
			}
			else
			{
				E1.setText(Double.toString(eval.infix(exp)));
				ans=E1.getText().toString();
			}
		
		
		}
	}
	else{
		cln=btn.getText().length();
		int l=E1.getText().length();
		ln.push(cln);
		//st.push(E1.getText().toString());
		
		 E1.setText(E1.getText().append(btn.getText().toString()));
		 //int l1=E1.getText().length();
		 //st.push(E1.getText().subSequence(l, l1).toString());
		 
	}
}
catch(Exception ex)
{
	Context context = getApplicationContext();
	CharSequence text = "Plese Enter the right operand";
	int duration = Toast.LENGTH_SHORT;
	
	Toast toast = Toast.makeText(context, text, duration);
	toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
	toast.show();
}
	
	}
	     	
   
    public void sendIntent(String s)
    {
    	Intent intent = new Intent(this, CnstMenuActivity.class);
    	intent.putExtra(EXTRA_MESSAGE, s);
    	startActivity(intent);
    }

    double fact(double k)
    {
    	double fact=1;
    	if(k==0)
    	{
    		return fact;
    	}
    	else{
    	for(int i=1;i<=k;i++)
    	{
    		fact=fact*i;
    	
 	
    	}
    	return fact;
    	}
    	    	}
    double calNCr(int n, int r)
    {
    	
    	return fact(n)/(fact(n)*fact(n-r));
    }
    double calNPr(int n, int r)
    {
    	
    	return fact(n)/(fact(n-r));
    }
    	

}