package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MenuPrincipalActivity2 extends AppCompatActivity {
    MaterialCardView cardNavios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
        cardNavios = findViewById(R.id.cardNavios);

        cardNavios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei em Galeria",Toast.LENGTH_SHORT).show();
            }
        });
    }
}