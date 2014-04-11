package com.example.twitter_oauth_app;

import android.os.AsyncTask;

class TwitterAuthenticateTask extends AsyncTask<String, String, RequestToken> {
	 
    @Override
    protected void onPostExecute(RequestToken requestToken) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requestToken.getAuthenticationURL()));
        startActivity(intent);
    }
 
    @Override
    protected RequestToken doInBackground(String... params) {
        return TwitterUtil.getInstance().getRequestToken();
    }
}