package br.com.etec.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    CardView acessorios, roupas, bonecos, objetos, sanriro, personagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        acessorios = findViewById(R.id.menuacessorio);
        roupas = findViewById(R.id.menuroupas);
        bonecos = findViewById(R.id.menubonecos);
        objetos = findViewById(R.id.menuobjetos);
        sanriro = findViewById(R.id.menusanriro);
        personagens = findViewById(R.id.menupersonagens);

        acessorios.setOnClickListener(this);
        roupas.setOnClickListener(this);
        bonecos.setOnClickListener(this);
        objetos.setOnClickListener(this);
        sanriro.setOnClickListener(this);
       personagens.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.menuacessorio) {
            startActivity(new Intent(getApplicationContext(), AcessoriosActivity.class));

        }
        if (view.getId() == R.id.menuroupas) {
            startActivity(new Intent(getApplicationContext(), RoupasActivity.class));

        }
        if (view.getId() == R.id.menubonecos) {
            startActivity(new Intent(getApplicationContext(), bonecosActivity.class));

        }
        if (view.getId() == R.id.menuobjetos) {
            startActivity(new Intent(getApplicationContext(), ObjetosActivity.class));

        }
        if (view.getId() == R.id.menusanriro) {
            startActivity(new Intent(getApplicationContext(), SanriroActivity.class));

        }
        if (view.getId() == R.id.menupersonagens) {
            startActivity(new Intent(getApplicationContext(), PersonagensActivity.class));

        }

    }
}