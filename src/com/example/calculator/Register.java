package com.example.calculator;

import android.support.v7.app.ActionBarActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
;

public class Register extends ActionBarActivity implements OnClickListener {
	//declaration
	EditText etfirstname;
	EditText etsecondname;
	EditText etemail;
	EditText etidnumber;
	Button btnsubmit;
	Button btncancel;
	

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initializing
		etfirstname=(EditText) findViewById(R.id.etfirstname);
		etsecondname=(EditText) findViewById(R.id.etsecondname);
		etemail=(EditText) findViewById(R.id.etemail);
		etidnumber=(EditText) findViewById(R.id.etidnumber);
		btnsubmit= (Button) findViewById(R.id.btnregsubmit);
		btnsubmit.setOnClickListener(this); 
		btncancel= (Button) findViewById(R.id.btnregcancel);
		btncancel.setOnClickListener(this);
		
		}

	
		@SuppressLint("ShowToast")
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnregsubmit:
			     Toast.makeText(Register.this, "love going wild", Toast.LENGTH_SHORT).show();
			     startActivity(new Intent(getApplicationContext(),Register.class));
				
				break;
			case R.id.btnlogin:
				Toast.makeText(Register.this, "Lets get mad people", Toast.LENGTH_SHORT);
				startActivity(new Intent(getApplicationContext(),Login.class));

			default:
				break;
			}
	// methods		


			
		
	}
	}

