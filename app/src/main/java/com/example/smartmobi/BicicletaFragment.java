package com.example.smartmobi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BicicletaFragment extends Fragment {

    Button mapa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bicicleta_layout, container, false);

        mapa = view.findViewById(R.id.btnMapa);

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("http://cetsp1.cetsp.com.br/mapabasico/map.aspx?map=infraciclo")));
            }
        });


        return view;
    }
}