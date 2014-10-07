package com.billysapp;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class DeviceControls extends Activity implements OnClickListener
{
	Button lightButton;
	Button doorButton;
	Button alarmButton;
	Button bathButton;
	Button cameraButton;
	Button curtianButton;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.device_controls);
		setAppButtons();
		lightButton.setOnClickListener(this);
		doorButton.setOnClickListener(this);
		alarmButton.setOnClickListener(this);
		bathButton.setOnClickListener(this);
		cameraButton.setOnClickListener(this);
		curtianButton.setOnClickListener(this);
		
	}


	private void setAppButtons() 
	{
		lightButton   = (Button) findViewById(R.id.lights);
		doorButton    = (Button) findViewById(R.id.doors);
		alarmButton   = (Button) findViewById(R.id.alarm);
		bathButton    = (Button) findViewById(R.id.bath);
		cameraButton  = (Button) findViewById(R.id.camera);
		curtianButton = (Button) findViewById(R.id.curtains);
	}
	
	@Override
	public void onClick(View v) {
		Boolean check = true;
		switch(v.getId()){
		case R.id.lights:
			break;
		case R.id.doors:
			break;
		case R.id.alarm:
			break;
		case R.id.bath:
			break;
		case R.id.camera:
			break;
		case R.id.curtains:
			break;
		}
	}
}
	

