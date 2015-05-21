package com.parse.starter;

import android.app.Application;
<<<<<<< HEAD
=======
import android.util.Log;
>>>>>>> f0d600612cf9806b882b5e5b76c5bbdc95ea8cc0

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;

<<<<<<< HEAD
=======
/**
 * The type Parse application.
 */
>>>>>>> f0d600612cf9806b882b5e5b76c5bbdc95ea8cc0
public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

<<<<<<< HEAD
=======
	  Log.d("APP", "----------");
	  Log.d("APP", "----------");
	  Log.d("APP", "checkpoint");
	  Log.d("APP", "----------");
	  Log.d("APP", "----------");

>>>>>>> f0d600612cf9806b882b5e5b76c5bbdc95ea8cc0
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
