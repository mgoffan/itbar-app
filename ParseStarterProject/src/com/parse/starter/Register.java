<<<<<<< HEAD
package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText legajo = (EditText) findViewById(R.id.legajoregistertxt);
        final EditText name = (EditText) findViewById(R.id.nametxt);
        final EditText mail = (EditText) findViewById(R.id.mailtxt);
        final EditText phone = (EditText) findViewById(R.id.phonetxt);
        final EditText pass = (EditText) findViewById(R.id.passtxt);
        final EditText rpass = (EditText) findViewById(R.id.repeatpasstxt);
        Button register = (Button) findViewById(R.id.registerinregisterbtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass.getText().toString().equals(rpass.getText().toString()) || !legajo.getText().toString().equals("") || !phone.getText().toString().equals("")){
                    ParseUser user = new ParseUser();
                    user.setUsername(legajo.getText().toString());
                    user.setPassword(pass.getText().toString());
                    user.setEmail(mail.getText().toString());
                    user.put("name", name.getText().toString());
                    user.put("phone",phone.getText().toString());
                    user.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e==null){
                                Toast.makeText(getApplicationContext(),"Se ha registrado correctamente",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(getApplicationContext(),"Ha ocurrido un error imprevisto",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }else{
                    Toast.makeText(getApplicationContext(),"Creo que hiciste algo mal.",Toast.LENGTH_SHORT).show();
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
=======
package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


/**
 * The type Register.
 */
public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText legajo = (EditText) findViewById(R.id.legajoregistertxt);
        final EditText name = (EditText) findViewById(R.id.nametxt);
        final EditText mail = (EditText) findViewById(R.id.mailtxt);
        final EditText phone = (EditText) findViewById(R.id.phonetxt);
        final EditText pass = (EditText) findViewById(R.id.passtxt);
        final EditText rpass = (EditText) findViewById(R.id.repeatpasstxt);
        Button register = (Button) findViewById(R.id.registerinregisterbtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pass.getText().toString().equals(rpass.getText().toString()) || !legajo.getText().toString().equals("") || !phone.getText().toString().equals("")){
                    ParseUser user = new ParseUser();
                    user.setUsername(legajo.getText().toString());
                    user.setPassword(pass.getText().toString());
                    user.setEmail(mail.getText().toString());
                    user.put("name", name.getText().toString());
                    user.put("phone",phone.getText().toString());
                    user.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e==null){
                                Toast.makeText(getApplicationContext(),"Se ha registrado correctamente",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(getApplicationContext(),"Ha ocurrido un error imprevisto",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }else{
                    Toast.makeText(getApplicationContext(),"Creo que hiciste algo mal.",Toast.LENGTH_SHORT).show();
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
>>>>>>> f0d600612cf9806b882b5e5b76c5bbdc95ea8cc0
