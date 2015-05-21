package com.parse.starter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseUser;


public class ProductDescription extends Activity {

    private int ID;
    boolean buyact = true; //habilitado para comprar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_description);
        ID = this.getIntent().getExtras().getInt("PRODUCT");
        userUI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_product_description, menu);
        return true;
    }

    public void userUI(){
        TextView nameProduct = (TextView) findViewById(R.id.nameproduct);
        TextView descriptionProduct = (TextView) findViewById(R.id.productdescription);
        TextView priceProduct = (TextView) findViewById(R.id.productprice);

        ImageView imageProduct = (ImageView) findViewById(R.id.imgproduct);

        Button details = (Button) findViewById(R.id.details);
        Button chango = (Button) findViewById(R.id.chango);
        ImageButton ok = (ImageButton) findViewById(R.id.okbtn);
        ImageButton no = (ImageButton) findViewById(R.id.nobtn);

        //Ojo que hay codigo repetido
        setTitle(ProductManager.getInstance().getProductByID(ID).getName());

        nameProduct.setText(ProductManager.getInstance().getProductByID(ID).getName());
        descriptionProduct.setText(ProductManager.getInstance().getProductByID(ID).getDesc());
        priceProduct.setText("$" + ProductManager.getInstance().getProductByID(ID).getPrice());

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buyact == true) {
                    showToast("Gracias por su compra.");
                    buyact = false;
                } else {
                    showToast("Ya agregaste este pedido al carrito");
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buyact==false){
                    showToast("Usted ha sacado esa compra.");
                    buyact=true;
                }else{
                    showToast("Este pedido no esta mas en tu carrito");
                }
            }
        });

        chango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder b = new AlertDialog.Builder(ProductDescription.this);
                b.setTitle("Probando la alerta");
                b.setMessage("Estas muy seguro " + ParseUser.getCurrentUser().getUsername() + "?");
                //b.setIcon(R.drawable.error);

                b.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), Main.class);
                        startActivity(intent);
                    }
                });
                b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProductDescription.this,"Me estas haciendo perder el tiempo",Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog alertDialog = b.create();
                alertDialog.show();

            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder b = new AlertDialog.Builder(ProductDescription.this);
                final EditText myText = new EditText(ProductDescription.this);
                myText.setInputType(InputType.TYPE_CLASS_TEXT);
                b.setView(myText);
                b.setTitle("Detalles");
                b.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProductDescription.this, "Estoy probando", Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog = b.create();
                alertDialog.show();

            }
        });


    }



    public void showToast(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }



}
