package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ParseAnalytics.trackAppOpenedInBackground(getIntent());

		drawUI();

	}


	public void drawUI(){
		setContentView(R.layout.activity_ingreso);

		setTitle("ITBAr");

		final EditText usuario = (EditText) findViewById(R.id.usuariotxt);
		final EditText contra = (EditText) findViewById(R.id.contratxt);

		Button ingresar = (Button) findViewById(R.id.enterbtn);
		Button register = (Button) findViewById(R.id.registerbtn);

		RelativeLayout back = (RelativeLayout) findViewById(R.id.back);

		final ImageView imagen = (ImageView) findViewById(R.id.imagen);
		
		/*
		how to make my android ui responsive
		*/
		back.setBackgroundResource(R.drawable.fondo_ppal_itbar);
		//back.setLayoutParams(new TableLayout.LayoutParams(valor1,valor2));


		ingresar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ParseUser.logInInBackground(usuario.getText().toString(), contra.getText().toString(), new LogInCallback() {
					@Override
					public void done(ParseUser user, ParseException e) {
						if(user!=null){
							Intent intent = new Intent(ParseStarterProjectActivity.this,Main.class);
							startActivity(intent);
							imagen.setBackgroundResource(R.drawable.ok);
							Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
							finish();
						}else{
							imagen.setBackgroundResource(R.drawable.error);
							Toast.makeText(getApplicationContext(),"Oops!",Toast.LENGTH_SHORT).show();
						}
					}
				});
			}
		});

		register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(),Register.class));
			}
		});
	}


}
