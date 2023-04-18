package com.example.smartmobi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuPrincipalActivity extends AppCompatActivity {

    CardView cardTransporte, cardNoticia, cardBicicleta, cardTransito;
    MaterialToolbar toolbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardTransporte = findViewById(R.id.idCardViewT);
        cardNoticia = findViewById(R.id.idCardViewNoticia);
        cardBicicleta = findViewById(R.id.idCardViewBicicleta);
        cardTransito = findViewById(R.id.idCardViewTransito);



        toolbar = findViewById(R.id.idToolbarMenu);
        setSupportActionBar(toolbar);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        cardTransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TransportesActivity.class));
                finish();
            }
        });

        cardNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NoticiasActivity.class));
                finish();
            }
        });

        cardBicicleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BicicletasActivity.class));
                finish();
            }
        });

        cardTransito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TransitoActivity.class));
                finish();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mLogin:
                startActivity( new Intent(getApplicationContext(), LoginActivity.class));
                finish();
                break;
            case R.id.mSobre:
                startActivity( new Intent(getApplicationContext(), SobreActivity.class));
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}