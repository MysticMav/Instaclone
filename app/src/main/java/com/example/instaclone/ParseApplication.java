package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7W77B2DCg9qRwb3Osnr40Sa7DfjYnkO4pQQH2oM1")
                .clientKey("arnVdJiOGeQXrsQHGGpqfwwmpMuS0KB1hg4stbiB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}





















