package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Homescreen extends ActionBarActivity implements OnClickListener {
	//declaration
	EditText etnumberone;
	EditText etnumbertwo;
	TextView tvresult;
	Button btnaddition;
	Button btnsubstraction;
	Button btndivision;
	operation Oper;
	
	double numberone,numbertwo,etresult;
	String strnumberone, strnumbertwo, strresult;

	@Override
	//main class
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		//initialization
		etnumberone = (EditText) findViewById(R.id.etHomeNumberone);
		etnumbertwo=(EditText) findViewById(R.id.etHomeNumberTwo);
	
		//
		tvresult=(TextView) findViewById(R.id.tvresult);
		
		btnaddition=(Button) findViewById(R.id.btnHomeAdd);
		btnaddition.setOnClickListener( this);
		
		btnsubstraction=(Button) findViewById(R.id.btnHomeSubstraction);
		btnsubstraction.setOnClickListener( this);
		
		btndivision=(Button) findViewById(R.id.btnHmeDivision);
		btndivision.setOnClickListener( this);
		Oper = new operation();
		
		
		}
	
	@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnHomeAdd:	
				
				//getting text from editText
				strnumberone = etnumberone.getText().toString();
				strnumbertwo = etnumbertwo.getText().toString();
				
				//converting string to double
				double numberone=Double.parseDouble(strnumberone);
				 double numbertwo=Double.parseDouble(strnumbertwo);
				 double result = Oper.addition(numberone, numbertwo);
				// calling the method
				 String resul =String.valueOf(result);
				tvresult.setText(resul);
			     
			     break;
			     
			case R.id.btnHomeSubstraction:
				// double to string
				strnumberone= etnumberone.getText().toString();
				strnumbertwo =etnumbertwo.getText().toString();
				
				double numberone1 = Double.parseDouble(strnumberone);
				double numbertwo1= Double.parseDouble(strnumbertwo);
				
				double answer = Oper.subtraction(numberone1,numbertwo1);
				String res= String.valueOf(answer);
				tvresult.setText(res);
			    	 
				break;
				
			case R.id.btnHmeDivision:
				//results= division(numberone, numbertwo);
				strnumberone= etnumberone.getText().toString();
				strnumbertwo =etnumbertwo.getText().toString();
	
				double numberone2 = Double.parseDouble(strnumberone);
				double numbertwo2= Double.parseDouble(strnumbertwo);
				
				double ans = Oper.division(numberone2, numbertwo2);
				String resu= String.valueOf(ans);
				tvresult.setText(resu);
			break;
				

			default:
				break;
		}
	}	
			//Method that take in mathOpperations.
			//Don't create a class because there is already one.
			
	}