package com.komaniaueue.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

	Button btnRegjistro;
	Button btnTest;
	EditText edtFirstName;
	EditText edtLastname;
	EditText edtUsername;
	EditText edtPassword;
	EditText edtEmail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity_layout);
		
		btnRegjistro = (Button) findViewById(R.id.btnRegjistro);
		btnTest = (Button) findViewById(R.id.btnTest);
		edtFirstName = (EditText) findViewById(R.id.edtFirstName);
		edtLastname = (EditText) findViewById(R.id.edtLastname);
		edtUsername = (EditText) findViewById(R.id.edtUsername);
		edtPassword = (EditText) findViewById(R.id.edtPassword);
		edtEmail = (EditText) findViewById(R.id.edtEmail);
		btnRegjistro.setOnClickListener(this);
		btnTest.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v == btnRegjistro) {
			Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
			intent.putExtra("FirstName", edtFirstName.getText().toString());
			intent.putExtra("LastName", edtLastname.getText().toString());
			intent.putExtra("Username", edtUsername.getText().toString());					
			intent.putExtra("Password", edtPassword.getText().toString());
			intent.putExtra("Email", edtEmail.getText().toString());
			startActivity(intent);
		} else if (v == btnTest) {
			Intent callIntent = new Intent(Intent.ACTION_CALL, 
										  Uri.parse("tel:049123123"));			
			Intent mapIntent = new Intent(Intent.ACTION_VIEW, 
				      					 Uri.parse("geo:0,0?q=ICK Kosovo"));
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, 
				      					  Uri.parse("http://milotshala.wordpress.com/"));
			Intent youTubeIntent = new Intent(Intent.ACTION_VIEW, 
				      						 Uri.parse("https://www.youtube.com/watch?v=Z4PKrVDg09s"));
			
			Intent smsIntent = new Intent(Intent.ACTION_VIEW);
			smsIntent.setData(Uri.parse("sms:"));
			smsIntent.putExtra("sms_body", "test");
			
			
			startActivity(smsIntent);
		}
	}
}











