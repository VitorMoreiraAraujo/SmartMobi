package com.example.smartmobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        edtUsuario = findViewById(R.id.idUsuario);
        edtSenha = findViewById(R.id.idSenha);
        btnEntrar = findViewById(R.id.idEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                if (usuario.equals("vitor") && senha.equals("22038")) {

                    startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Senha e/ou Usuario errados!!", Toast.LENGTH_LONG).show();
                    limparJanela();
                }
            }

        });

    }

    public void limparJanela() {
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }
}