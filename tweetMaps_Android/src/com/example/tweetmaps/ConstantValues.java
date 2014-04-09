package com.example.tweetmaps;

public enum ConstantValues {
	TWITTER_CONSUMER_KEY("NL0aeIMRGDbmcaMvqDpLE6sPK"),
	TWITTER_CONSUMER_SECRET("yYe8Rw13BL18FZv8i5AS8IFcrA9gqSpO0z03TUKmAYs5Ul8QjN"),
	TWITTER_CALLBACK_URL("twitterapp://connect"); 
	
	private final String text;
	
	private ConstantValues(final String text) {
        this.text = text;
    }
	
	@Override
    public String toString() {
        return text;
    }
}
