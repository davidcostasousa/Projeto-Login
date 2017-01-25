package com.example.david.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.david.login.R.id.txtCadastro;

public class Tela_Cadastro extends AppCompatActivity {
    EditText editNome, editEmail2, editSenha2;
    Button btnCancelar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela__cadastro);

        editNome = (EditText)findViewById(R.id.editNome);
        editEmail2 = (EditText)findViewById(R.id.editEmail2);
        editSenha2 = (EditText)findViewById(R.id.editSenha2);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnRegistrar = (Button)findViewById(R.id.btnCriarConta);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
