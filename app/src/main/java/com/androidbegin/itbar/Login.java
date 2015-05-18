package com.androidbegin.itbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.androidbegin.itbar.R;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class Login extends Activity {
	// Declare Variables
	Button loginbutton;
	Button signup;
	String usernametxt;
	String passwordtxt;
    String testingtxt;
	EditText password;
	EditText username;
    EditText testing;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from main.xml
		setContentView(R.layout.activity_login);
		// Locate EditTexts in main.xml
		setTitle("ITBAr");
		username = (EditText) findViewById(R.id.usertxt);
		password = (EditText) findViewById(R.id.passtxt);
        		// Locate Buttons in main.xml
		loginbutton = (Button) findViewById(R.id.enterbtn);
		signup = (Button) findViewById(R.id.registerinregisterbtn);

		// Login Button Click Listener
		loginbutton.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// Retrieve the text entered from the EditText
				usernametxt = username.getText().toString();
				passwordtxt = password.getText().toString();

				// Send data to Parse.com for verification
				ParseUser.logInInBackground(usernametxt, passwordtxt,new LogInCallback() {
							public void done(ParseUser user, ParseException e) {
								if (user != null) {
									// If user exist and authenticated, send user to Welcome.class
									Intent intent = new Intent(Login.this,Welcome.class);
									startActivity(intent);
									Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_LONG).show();
									finish();
								} else {
									Toast.makeText(getApplicationContext(),"El usuario no existe. Por favor, registrese",Toast.LENGTH_LONG).show();
								}
							}
						});
			}
		});
		// Sign up Button Click Listener
		signup.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				startActivity(new Intent(getApplicationContext(),Register.class));
			}
		});

	}
}
