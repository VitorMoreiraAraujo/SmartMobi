package com.example.smartmobi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class TransitoActivity extends AppCompatActivity {

    MaterialToolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transito_layout);

        drawerLayout = findViewById(R.id.idDrawerLayout);
        navigationView = findViewById(R.id.idNavigationView);
        toolbar = findViewById(R.id.idToolBarTransito);



        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mMaisTransito:
                        getSupportFragmentManager().beginTransaction().replace(R.id.idConteinerDrawer, new MaisTransitoFragment()).commit();
                        break;

                    case R.id.mAlagamento:
                        getSupportFragmentManager().beginTransaction().replace(R.id.idConteinerDrawer, new AlagamentoFragment()).commit();
                        break;
                    case R.id.mMenuPrincipal:
                        startActivity( new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                        finish();
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
    }




    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}