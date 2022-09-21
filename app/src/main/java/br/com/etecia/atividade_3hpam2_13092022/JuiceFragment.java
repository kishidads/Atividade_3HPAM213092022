package br.com.etecia.atividade_3hpam2_13092022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class JuiceFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_juice, container, false);

        return view;

        List<Juice> id_recyclerViewJuice;

            //Inserindo os livros no arrayList vazio
            id_recyclerViewJuice = new ArrayList<>();

            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));
            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));
            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));
            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));
            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));
            id_recyclerViewJuice.add(new Juice("Teste", "Teste", "Teste", R.drawable.img_juice));

            //declarando a variavel xml enviando para o java
            RecyclerView mRecyclerView = findViewById(R.id.id_recyclerViewJuice);

            //Instânciando o adaptador com os valores necessários
            RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), id_recyclerViewJuice);
            //Criando o layout para inserção dos valores

            //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
            // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

            //GriLayoutManager necessário a inserção de colunas
            mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

            //Para melhorar a performance do RecyclerView na listagem com um tamanho fixo
            mRecyclerView.setHasFixedSize(true);

            //Inserindo os valores na lista do RecyclerView
            mRecyclerView.setAdapter(mAdapter);

    }
}