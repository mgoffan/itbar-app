package com.androidbegin.itbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.androidbegin.itbar.R;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
         final EditText legajo = (EditText) findViewById(R.id.legajoregistertxt);
         final EditText nombre = (EditText) findViewById(R.id.nametxt);
         final EditText telefono = (EditText) findViewById(R.id.phonetxt);
         final EditText mail = (EditText) findViewById(R.id.mailtxt);
         final EditText pass = (EditText) findViewById(R.id.passtxt);
         final EditText repeatpass = (EditText) findViewById(R.id.repeatpasstxt);
        Button registrar = (Button) findViewById(R.id.registerinregisterbtn);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().equals(repeatpass.getText().toString())){
                    ParseUser user = new ParseUser();
                    user.setUsername(legajo.getText().toString());
                    user.setPassword(pass.getText().toString());
                    user.setEmail(mail.getText().toString());
                    Log.i("Kevin", legajo.getText().toString());
                    user.getCurrentUser().put("name", nombre.getText().toString());
                    user.getCurrentUser().put("phone",telefono.getText().toString());
                    user.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e==null){
                                Toast.makeText(getApplicationContext(),"Registrado! Gracias!",Toast.LENGTH_LONG).show();
                            }else{
                                Toast.makeText(getApplicationContext(),"Tuvimos un error.", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
