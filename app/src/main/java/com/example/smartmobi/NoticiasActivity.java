package com.example.smartmobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NoticiasActivity extends AppCompatActivity {
    ListView listaNoticia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticias_layout);

        listaNoticia = findViewById(R.id.idListView);

        Adapter adapter = new Adapter();
        listaNoticia.setAdapter(adapter);

        listaNoticia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sptrans.com.br/noticias/ponto-no-tunel-santo-papa-joao-paulo-ii-na-regiao-do-anhangabau-sera-desativado-nos-dias-21-e-22/") );
                intent.putExtra("a", i);
                startActivity(intent);
            }
        });
    }

    public class Adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView NoticiaTitulo;
            ImageView NoticiaImagem, NoticiaLogo;


            View v = getLayoutInflater().inflate(R.layout.modelo_noticia, null);

            NoticiaTitulo = v.findViewById(R.id.mTitulo);
            NoticiaLogo = v.findViewById(R.id.mLogo);
            NoticiaImagem = v.findViewById(R.id.mImagem);


            return v;
        }
    }
}