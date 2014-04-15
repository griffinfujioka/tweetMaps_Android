package com.example.twitter_oauth_app;

import android.view.Menu;

public class ConstantValues {
	public static String TWITTER_CONSUMER_KEY = "R2XwAvgabWEL2hUne6vhTQ";
	public static String TWITTER_CONSUMER_SECRET = "7vpFE5vmivLahIZm0rMZFYvYuhsg8tG4xFdIWhGbE";
	public static String TWITTER_CALLBACK_URL = "twitter_oath-app://connect";
	public static String URL_PARAMETER_TWITTER_OAUTH_VERIFIER = "oauth_verifier";
    public static String PREFERENCE_TWITTER_OAUTH_TOKEN="TWITTER_OAUTH_TOKEN";
    public static String PREFERENCE_TWITTER_OAUTH_TOKEN_SECRET="TWITTER_OAUTH_TOKEN_SECRET";
    public static String PREFERENCE_TWITTER_IS_LOGGED_IN="TWITTER_IS_LOGGED_IN";
  //SharedPreference user logon ID
  	public static final String PREFS_NAME = "TwitterLogin";
  	
  	public static final int ACTIVITY_LATEST_TWEETS = Menu.FIRST + 6;
}
