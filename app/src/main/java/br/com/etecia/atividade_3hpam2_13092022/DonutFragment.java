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

public class DonutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.donut_fragment, container, false);

        List<Donut> id_recyclerViewDonut;

        id_recyclerViewDonut = new ArrayList<>();

        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));
        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));
        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));
        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));
        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));
        id_recyclerViewDonut.add(new Donut("Teste", "Teste", "Teste", R.drawable.img_donut));

        RecyclerView mRecyclerView = view.findViewById(R.id.id_recyclerViewDonut);

        DonutRecyclerViewAdapter mAdapter = new DonutRecyclerViewAdapter(getContext(), id_recyclerViewDonut);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}