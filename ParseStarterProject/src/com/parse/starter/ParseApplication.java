package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;

/**
 * The type Parse application.
 */
public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

	  Log.d("APP", "----------");
	  Log.d("APP", "----------");
	  Log.d("APP", "checkpoint");
	  Log.d("APP", "----------");
	  Log.d("APP", "----------");

    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(this);


    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
