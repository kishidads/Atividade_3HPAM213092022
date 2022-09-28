package br.com.etecia.atividade_3hpam2_13092022;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class IceCream_Activity extends AppCompatActivity {

    private TextView cardTitulo, cardDescricao, cardCategoria;
    private ImageView cardImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icecream_card);

        cardTitulo = findViewById(R.id.cardTitulo);
        cardDescricao = findViewById(R.id.cardDescricao);
        cardCategoria = findViewById(R.id.cardCategoria);
        cardImg = findViewById(R.id.cardImg);

        //Intent que irá receber os valores da outra janela.
        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String titulo, descricao, categoria;
        int miniatura;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        miniatura = intent.getExtras().getInt("Miniatura");

        cardTitulo.setText(titulo);
        cardDescricao.setText(descricao);
        cardCategoria.setText(categoria);
        cardImg.setImageResource(miniatura);

    }
}