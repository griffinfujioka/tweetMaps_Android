package com.example.twitter_oauth_app;

import twitter4j.auth.RequestToken;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

	Button loginButton; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		initializeComponent(); 
	}
	
	private void initializeComponent() {
		loginButton = (Button) findViewById(R.id.loginButton);

		loginButton.setOnClickListener(buttonLoginOnClickListener);
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
	            Intent intent = new Intent(LoginActivity.this, TwitterActivity.class);
	            startActivity(intent);
	        }
	 
	    }
	};

	class TwitterAuthenticateTask extends AsyncTask<String, String, RequestToken> {

        @Override
        protected void onPostExecute(RequestToken requestToken) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requestToken.getAuthenticationURL()));
            startActivity(intent);
            
            System.out.println("Successfully logged in to Twitter."); 
        }

        @Override
        protected RequestToken doInBackground(String... params) {
            return TwitterUtil.getInstance().getRequestToken();
        }
    }
}
