package com.example.smartmobi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuPrincipalActivity extends AppCompatActivity {

    CardView cardView;
    MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardView = findViewById(R.id.idCardView);

        toolbar = findViewById(R.id.idToolbarMenu);




        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SobreActivity.class));
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
                break;
            case R.id.mSobre:
                startActivity( new Intent(getApplicationContext(), SobreActivity.class));
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}