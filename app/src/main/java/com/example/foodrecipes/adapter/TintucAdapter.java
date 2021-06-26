package com.example.foodrecipes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.tintuc;

import java.util.List;

public class TintucAdapter extends RecyclerView.Adapter<TintucAdapter.TintucViewHolder>{
    private List<tintuc> listTintuc;
    public void setData(List<tintuc> list){
        this.listTintuc = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public TintucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tintuc,parent,false);

        return new TintucViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TintucViewHolder holder, int position) {
        tintuc tintuc =listTintuc.get(position);
        if(tintuc == null){
            return;
        }
        holder.imgtintuc.setImageResource(tintuc.getImage());
        holder.mota.setText(tintuc.getMota());
//        holder.btnxemthem.setOnClickListener(tintuc.getButton());
    }

    @Override
    public int getItemCount() {
        if(listTintuc != null){
            return listTintuc.size();
        }
        return 0;
    }

    public class TintucViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgtintuc;
        private TextView mota;

        public TintucViewHolder(@NonNull View itemView) {
            super(itemView);
            imgtintuc = itemView.findViewById(R.id.tintucimg);
            mota = itemView.findViewById(R.id.motatintuc);

        }
    }
}
