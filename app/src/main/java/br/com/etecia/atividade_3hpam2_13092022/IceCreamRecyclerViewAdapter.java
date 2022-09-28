package br.com.etecia.atividade_3hpam2_13092022;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IceCreamRecyclerViewAdapter extends RecyclerView.Adapter<IceCreamRecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<IceCream> mData;

    public IceCreamRecyclerViewAdapter(Context mContext, List<IceCream> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.icecream_cardview, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.titulo.setText(mData.get(position).getTitulo());
        holder.img.setImageResource(mData.get(position).getMiniatura());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, IceCream_Activity.class);

                intent.putExtra("Titulo", mData.get(position).getTitulo());
                intent.putExtra("Descricao", mData.get(position).getDescricao());
                intent.putExtra("Categoria", mData.get(position).getCategoria());
                intent.putExtra("Miniatura", mData.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        ImageView img;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            titulo= itemView.findViewById(R.id.cardTitulo);
            img = itemView.findViewById(R.id.cardImg);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}

