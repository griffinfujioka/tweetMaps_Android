package com.example.twitter_oauth_app;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	private View.OnClickListener buttonLoginOnClickListener = new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	 
	        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
	        if (!sharedPreferences.getBoolean(ConstantValues.PREFERENCE_TWITTER_IS_LOGGED_IN,false))
	        {
	            new TwitterAuthenticateTask().execute();
	        }
	        else
	        {
	            Intent intent = new Intent(MainActivity.this, TwitterActivity.class);
	            startActivity(intent);
	        }
	 
	    }
	};

}
