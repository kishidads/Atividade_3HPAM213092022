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

public class IceCreamFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.icecream_fragment, container, false);

        List<IceCream> id_recyclerViewIceCream;

        id_recyclerViewIceCream = new ArrayList<>();

        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));
        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));
        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));
        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));
        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));
        id_recyclerViewIceCream.add(new IceCream("Teste", "Teste", "Teste", R.drawable.img_icecream));

        RecyclerView mRecyclerView = view.findViewById(R.id.id_recyclerViewIceCream);

        IceCreamRecyclerViewAdapter mAdapter = new IceCreamRecyclerViewAdapter(getContext(), id_recyclerViewIceCream);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}