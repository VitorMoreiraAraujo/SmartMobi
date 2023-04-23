package com.example.smartmobi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class TransportesActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    OnibusFragment onibusFragment = new OnibusFragment();
    BicicletaFragment bicicletaFragment = new BicicletaFragment();
    TremFragment tremFragment = new TremFragment();

    MaterialToolbar toolbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportes_layout);

        toolbar = findViewById(R.id.idToolbarTransporte);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                finish();
            }
        });

        bottomNavigationView = findViewById(R.id.idBottomNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.idConteiner, onibusFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mOnibus:
                        getSupportFragmentManager().beginTransaction().replace(R.id.idConteiner, onibusFragment).commit();
                        return true;
                    case R.id.mBicicleta:
                        getSupportFragmentManager().beginTransaction().replace(R.id.idConteiner, bicicletaFragment).commit();
                        return true;
                    case R.id.mTrem:
                        getSupportFragmentManager().beginTransaction().replace(R.id.idConteiner, tremFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}