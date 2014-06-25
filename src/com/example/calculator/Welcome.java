package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends ActionBarActivity implements OnClickListener {
  Button btnregister,btnlogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		// initializing of variables
		btnregister = (Button) findViewById(R.id.btnregister);
		btnregister.setOnClickListener( this);
		btnlogin =(Button) findViewById(R.id.btnlogin);
		btnlogin.setOnClickListener(this);
				
		
	}
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnlogin:
		Toast.makeText(Welcome.this, "love going wild", Toast.LENGTH_LONG).show();
	     startActivity(new Intent(getApplicationContext(),Login.class));
		
		break;
	case R.id.btnregister:
		Toast.makeText(Welcome.this,"Lets get crazy people", Toast.LENGTH_LONG).show();
		startActivity(new Intent(getApplicationContext(),Register.class));
	default:
		break;
	}
	

}}
