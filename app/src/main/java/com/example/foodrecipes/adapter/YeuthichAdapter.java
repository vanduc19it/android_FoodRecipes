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
import com.example.foodrecipes.model.yeuthich;

import java.util.ArrayList;
import java.util.List;

public class YeuthichAdapter extends RecyclerView.Adapter<YeuthichAdapter.YeuthichViewHolder> {
    private List<yeuthich> yeuthichList ;
    public void setData(List<yeuthich> list){
        this.yeuthichList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public YeuthichViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_yeuthich,parent,false);

        return new YeuthichViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YeuthichViewHolder holder, int position) {
        yeuthich yeuthichs = yeuthichList.get(position);
        if( yeuthichs == null){
            return;
        }
        holder.imgperson.setImageResource(yeuthichs.getImgperson());
        holder.imgyeuthich.setImageResource(yeuthichs.getImgyeuthich());
        holder.mota.setText(yeuthichs.getMota());
        holder.name.setText(yeuthichs.getNameperson());
    }

    @Override
    public int getItemCount() {
        if(yeuthichList != null){
            return yeuthichList.size();
        }
        return 0;
    }

    public class YeuthichViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgyeuthich,imgperson;
        private TextView name,mota;

        public YeuthichViewHolder(@NonNull View itemView) {
            super(itemView);
            imgyeuthich = itemView.findViewById(R.id.imgyeuthich);
            name = itemView.findViewById(R.id.PersonName);
            mota = itemView.findViewById(R.id.motayeuthich);
            imgperson = itemView.findViewById(R.id.imgperson1);
        }
    }
}