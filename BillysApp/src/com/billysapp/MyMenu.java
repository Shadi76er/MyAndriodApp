package com.billysapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyMenu extends ListActivity
{
	String classes[] = {"MainActivity", "TextPlay", "Email", "DeviceControls", "Camera"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MyMenu.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		String classToLoad= classes[position];
		try {
			Class<?> myClass = Class.forName("com.billysapp."+ classToLoad);
			
			Intent myIntent = new Intent(MyMenu.this, myClass);
			startActivity(myIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.mymenu, menu);
		return true;
	}
	
	

}
