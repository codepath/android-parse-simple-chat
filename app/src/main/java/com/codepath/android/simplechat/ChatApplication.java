package com.codepath.android.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models here
        ParseObject.registerSubclass(Message.class);

        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YOUR_APPLICATION_ID")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://myparseapp.herokuapp.com/parse/")
                .clientKey("YOUR_CLIENT_KEY").build());
    }
}
