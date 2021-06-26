package com.example.foodrecipes.adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.quanlibinhluan;
import com.example.foodrecipes.model.quanlidanhmuc;
import com.example.foodrecipes.model.quanliuser;

import java.util.ArrayList;

public class QliBinhluanAdapter extends RecyclerView.Adapter<QliBinhluanAdapter.ViewHolder>{
    ArrayList<quanlibinhluan> quanlibinhluanArrayList;
    Context context;

    public QliBinhluanAdapter(ArrayList<quanlibinhluan> quanlibinhluanArrayList, Context context) {
        this.quanlibinhluanArrayList = quanlibinhluanArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_quanlicomment,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(quanlibinhluanArrayList.get(position).getName());
        holder.txtcomment.setText(quanlibinhluanArrayList.get(position).getComment());
        holder.image.setImageResource(quanlibinhluanArrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return quanlibinhluanArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView txtName, txtcomment;
        ImageView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tennguoidungcomment);
            txtcomment = itemView.findViewById(R.id.comment);
            image = itemView.findViewById(R.id.imagequanlicomment);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an Option");
            menu.add(this.getAdapterPosition(),121,0,"Xóa bình luận");


        }


    }
    public void removeItem(int position){
        quanlibinhluanArrayList.remove(position);
        notifyDataSetChanged();
    }

}



