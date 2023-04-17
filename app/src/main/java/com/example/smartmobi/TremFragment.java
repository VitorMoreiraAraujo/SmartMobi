package com.example.smartmobi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TremFragment extends Fragment {

    Button mapaTrem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trem_layout, container, false);


        mapaTrem = view.findViewById(R.id.btnMapaTrem);

        mapaTrem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.metrocptm.com.br/veja-o-mapa-de-estacoes-do-metro-e-cptm/")));
            }
        });
        return view;
    }
}