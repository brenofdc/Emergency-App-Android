package com.example.john.emergency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageButton Favorito;
    public ImageButton Configuracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Favorito = (ImageButton)findViewById(R.id.Favoritos);
        Configuracao = (ImageButton)findViewById(R.id.Configuracoes);
    }

    public void abrirfavoritos (View view){

        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.MainLayout);
        viewGroup.removeAllViews();
        viewGroup.addView(View.inflate(this, R.layout.activity_favorite, null));

    }

    public void abrirConfiguracoes (View view){

        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.MainLayout);
        viewGroup.removeAllViews();
        viewGroup.addView(View.inflate(this, R.layout.activity_settings, null));

    }
}
