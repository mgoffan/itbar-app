package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseUser;

import java.util.ArrayList;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userUI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void userUI(){
        setTitle("ITBAr - " + ParseUser.getCurrentUser().getUsername());
        TextView menu1 = (TextView) findViewById(R.id.menutitle1txt);
        TextView menu2 = (TextView) findViewById(R.id.menutitle2txt);
        TextView menu3 = (TextView) findViewById(R.id.menutitle3txt);
        TextView menu4 = (TextView) findViewById(R.id.menutitle4txt);

        HorizontalScrollView scrollView = (HorizontalScrollView) findViewById(R.id.scrollView);
        scrollView.setHorizontalFadingEdgeEnabled(false);

        Button menu1btn = (Button) findViewById(R.id.button);
        Button menu2btn = (Button) findViewById(R.id.button2);
        Button menu3btn = (Button) findViewById(R.id.button3);
        Button menu4btn = (Button) findViewById(R.id.button4);

        //Aca tendria que levantar cosas de Parse
        Product p1 = ProductManager.getInstance().getP1();
        Product p2 = ProductManager.getInstance().getP2();
        Product p3 = ProductManager.getInstance().getP3();
        Product p4 = ProductManager.getInstance().getP4();


        menu1.setText(p1.getName());
        menu2.setText(p2.getName());
        menu3.setText(p3.getName());
        menu4.setText(p4.getName());

        pressedButtonMenu(menu1btn,p1);
        pressedButtonMenu(menu2btn,p2);
        pressedButtonMenu(menu3btn,p3);
        pressedButtonMenu(menu4btn,p4);

    }

    public void pressedButtonMenu(Button btn, final Product p){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ProductDescription.class);
                intent.putExtra("PRODUCT", p.getID());
                startActivity(intent);
                //Aca no iria algo??
                overridePendingTransition(R.animator.animation1, R.animator.animation2);
            }
        });
    }


}
