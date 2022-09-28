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

        View view = inflater.inflate(R.layout.juice_fragment, container, false);

        List<Juice> id_recyclerViewJuice;

        id_recyclerViewJuice = new ArrayList<>();

        id_recyclerViewJuice.add(new Juice("Cenoura", "Teste", "Teste", R.drawable.img_carrotjuice));
        id_recyclerViewJuice.add(new Juice("Laranja", "Teste", "Teste", R.drawable.img_orangejuice));
        id_recyclerViewJuice.add(new Juice("Verde", "Teste", "Teste", R.drawable.img_greenjuice));
        id_recyclerViewJuice.add(new Juice("Ervas", "Teste", "Teste", R.drawable.img_herbjuice));
        id_recyclerViewJuice.add(new Juice("Amoras", "Teste", "Teste", R.drawable.img_berriesjuice));
        id_recyclerViewJuice.add(new Juice("Toranja", "Teste", "Teste", R.drawable.img_grapefruitjuice));

        RecyclerView mRecyclerView = view.findViewById(R.id.id_recyclerViewJuice);

        JuiceRecyclerViewAdapter mAdapter = new JuiceRecyclerViewAdapter(getContext(), id_recyclerViewJuice);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}