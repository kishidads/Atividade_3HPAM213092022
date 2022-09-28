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

public class CakeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.cake_fragment, container, false);

        List<Cake> id_recyclerViewCake;

        id_recyclerViewCake = new ArrayList<>();

        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));
        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));
        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));
        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));
        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));
        id_recyclerViewCake.add(new Cake("Teste", "Teste", "Teste", R.drawable.img_cake));

        RecyclerView mRecyclerView = view.findViewById(R.id.id_recyclerViewCake);

        CakeRecyclerViewAdapter mAdapter = new CakeRecyclerViewAdapter(getContext(), id_recyclerViewCake);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}