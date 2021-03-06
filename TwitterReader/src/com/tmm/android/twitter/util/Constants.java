package com.tmm.android.twitter.util;

import android.view.Menu;

public class Constants {
	
	//Menu item IDs
	public static final int ACTIVITY_PROFILE = Menu.FIRST;
	public static final int ACTIVITY_FRIENDS = Menu.FIRST + 1;
	public static final int ACTIVITY_REPLIES = Menu.FIRST + 2;
	public static final int ACTIVITY_LOGIN = Menu.FIRST + 3; 
	public static final int ACTIVITY_REFRESH = Menu.FIRST + 4;
	public static final int ACTIVITY_MENU_SCREEN = Menu.FIRST + 5;
	public static final int ACTIVITY_LATEST_TWEETS = Menu.FIRST + 6;
	
	//context menu item IDs
	public static final int CONTEXT_PROFILE = Menu.FIRST;
	public static final int CONTEXT_TWEETS = Menu.FIRST+1;
	public static final int CONTEXT_REPLY = Menu.FIRST+2;
	public static final int CONTEXT_RETWEET = Menu.FIRST+3;
	
	public static final String CONSUMER_KEY = "quS6oy4CAhlC2xE0xx6EHg";
	public static final String CONSUMER_SECRET = "k9Tr46qiMSDS97Lys9ENHJMJgJ5sMRaa9JADIZzgyAY";
	
	
	//SharedPreference user logon ID
	public static final String PREFS_NAME = "TwitterLogin";

}