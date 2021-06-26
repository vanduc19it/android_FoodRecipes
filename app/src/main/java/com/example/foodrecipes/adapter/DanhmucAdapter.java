package com.example.foodrecipes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.danhmuc;
import com.example.foodrecipes.model.moinhat;

import java.util.ArrayList;
import java.util.List;

public class DanhmucAdapter extends RecyclerView.Adapter<DanhmucAdapter.DanhmucViewHolder> {
    private List<danhmuc> danhmucList;
    public void setData(List<danhmuc> list){
        this.danhmucList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public DanhmucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_danhmuc,parent,false);

        return new DanhmucViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DanhmucViewHolder holder, int position) {
        danhmuc danhmucs = danhmucList.get(position);
        if( danhmucs == null){
            return;
        }
        holder.image.setImageResource(danhmucs.getImage());
        holder.tendanhmuc.setText(danhmucs.getTendanhmuc());
    }

    @Override
    public int getItemCount() {
        if(danhmucList != null){
            return danhmucList.size();
        }
        return 0;
    }

    public class DanhmucViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView tendanhmuc;

        public DanhmucViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imgdanhmuc);
            tendanhmuc = itemView.findViewById(R.id.txtdanhmuc);
        }
    }
}
