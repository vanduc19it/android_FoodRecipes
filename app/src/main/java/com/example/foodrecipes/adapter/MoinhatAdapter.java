package com.example.foodrecipes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.moinhat;

import java.util.ArrayList;
import java.util.List;

public class MoinhatAdapter extends RecyclerView.Adapter<MoinhatAdapter.MoinhatViewHolder> {
    private List<com.example.foodrecipes.model.moinhat> moinhatList;
    public void setData(List<moinhat> list){
        this.moinhatList = list;
        notifyDataSetChanged();
    }
 @NonNull
    @Override
    public MoinhatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_moinhat,parent,false);

        return new MoinhatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoinhatViewHolder holder, int position) {
        moinhat moiNhat = moinhatList.get(position);
        if(moiNhat == null){
            return;
        }
        holder.imgperson.setImageResource(moiNhat.getImgperson());
        holder.nameperson.setText(moiNhat.getNameperson());
        holder.imgmoinhat.setImageResource(moiNhat.getImgmoinhat());
        holder.motamoinhat.setText(moiNhat.getMotamoinhat());
    }

    @Override
    public int getItemCount() {
        if(moinhatList != null){
            return moinhatList.size();
        }
        return 0;
    }

    public class MoinhatViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgperson,imgmoinhat;
        private TextView nameperson,motamoinhat;

        public MoinhatViewHolder(@NonNull View itemView) {
            super(itemView);
            imgperson = itemView.findViewById(R.id.imgperson);
            imgmoinhat = itemView.findViewById(R.id.imgmoinhat);
            nameperson = itemView.findViewById(R.id.editTextTextPersonName);
            motamoinhat= itemView.findViewById(R.id.motamoinhat);
        }
    }
}
