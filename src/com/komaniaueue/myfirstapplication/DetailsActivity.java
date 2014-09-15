package com.komaniaueue.myfirstapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_activity);
		
		Intent arguments = getIntent();
		
		TextView txtFirstName = (TextView) findViewById(R.id.txtFirstName);
		TextView txtLastname = (TextView) findViewById(R.id.txtLastname);
		TextView txtUsername = (TextView) findViewById(R.id.txtUsername);
		TextView txtPassword = (TextView) findViewById(R.id.txtPassword);
		TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
		
		txtFirstName.setText(arguments.getStringExtra("FirstName"));
		txtLastname.setText(arguments.getStringExtra("LastName"));
		txtUsername.setText(arguments.getStringExtra("Username"));			
		txtPassword.setText(arguments.getStringExtra("Password"));
		txtEmail.setText(arguments.getStringExtra("Email"));
	}
}
