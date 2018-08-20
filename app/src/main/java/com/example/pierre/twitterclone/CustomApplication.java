package com.example.pierre.twitterclone;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

public class CustomApplication extends Application{

    public static String CONSUMER_KEY = "Eq2KSnwQxYZQV6B2DMxUJHYnW";
    public static String CONSUMER_SECRET = "5P00Td9GYeiDhRLKu65bx7f8WZ9mosa2zdZ2pUpWEZeMFslG88";


    public void onCreate() {
        super.onCreate();

        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("CONSUMER_KEY", "CONSUMER_SECRET"))
                .debug(true)
                .build();
        Twitter.initialize(config);

        Twitter.initialize(this);
    }
}