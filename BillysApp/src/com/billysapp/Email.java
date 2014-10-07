package com.billysapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements OnClickListener
{

	EditText personsEmail, intro, personsName, somethingElse, anotherThing, outro;
	String emailAddress, beginning, name, setupAction, something, out;
	Button sendEmail;
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initaliseVars();
		sendEmail.setOnClickListener(this);
	}
	
	
	private void initaliseVars() 
	{
		personsEmail   =(EditText) findViewById(R.id.etEmail);
		intro          = (EditText) findViewById(R.id.etIntro);
		personsName    = (EditText) findViewById(R.id.etName);
		somethingElse  = (EditText) findViewById(R.id.etSomething);
		anotherThing   = (EditText) findViewById(R.id.etAnotherThing);
		outro          = (EditText) findViewById(R.id.etOut);
		sendEmail      = (Button)   findViewById(R.id.bSendEmail);
	}


	@Override
	public void onClick(View arg0) 
	{
		convertVarsToStrings();
		String emailAddresses[]= {emailAddress};
		String message = "hello"
		+" "
		+ name
		+" "
		+ beginning
		+" "
		+ setupAction
		+" "
		+ something
		+" "
		+ out
		+" "
		+ "thats all";
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddresses);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "this is a test");
		emailIntent.setType("plane/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
	}


	private void convertVarsToStrings() 
	{
		emailAddress = personsEmail.getText().toString();
		 beginning   = intro.getText().toString();
		 name        = personsName.getText().toString();
		 setupAction = somethingElse.getText().toString();
		 something   = anotherThing.getText().toString();
		 out         = outro.getText().toString();
		
	}
	
	@Override
	protected void onPause() 
	{
		super.onPause();
		finish();
	}

}
