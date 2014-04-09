package com.example.tweetmaps;

import twitter4j.auth.RequestToken;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

public class TwitterTask extends AsyncTask<String, Void, RequestToken> {

	@Override
	protected RequestToken doInBackground(String... arg0) {
		return TwitterUtil.getInstance().getRequestToken(); 
	}
	
	@Override
    protected void onPostExecute(RequestToken requestToken) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requestToken.getAuthenticationURL()));
        //startActivity(intent);
    }

}
