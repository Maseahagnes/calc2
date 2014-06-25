package com.example.calculator;

import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity implements OnClickListener {
	//declaration
	EditText etemail;
	EditText etpassword;
	Button btnsubmit;
	Button btncancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//initializing of values
		
		etemail=(EditText) findViewById(R.id.etemail);
		etpassword=(EditText) findViewById(R.id.etpassword);
		
		btnsubmit=(Button) findViewById(R.id.btnloginsubmit);
        btnsubmit.setOnClickListener(this);
        
        btncancel=(Button) findViewById(R.id.btnlogincancel);
        btncancel.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnloginsubmit:
		Toast.makeText(Login.this, "welcome to kisii", Toast.LENGTH_SHORT).show();
	     startActivity(new Intent(getApplicationContext(),Homescreen.class));
	     break;
	     
	case R.id.btnlogincancel:
		Toast.makeText(Login.this, "love getting more crazy", Toast.LENGTH_SHORT).show();
	      startActivity(new Intent(getApplicationContext(),Welcome.class));
		break;

	default:
		break;
	}

	
	}

}
