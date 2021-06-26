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
import com.example.foodrecipes.model.quanlidanhmuc;

import java.util.ArrayList;

public class QliDanhmucAdapter extends RecyclerView.Adapter<QliDanhmucAdapter.ViewHolder>{
    ArrayList<quanlidanhmuc> quanlidanhmucArrayList;
    Context context;

    public QliDanhmucAdapter(ArrayList<quanlidanhmuc> quanlidanhmucArrayList, Context context) {
        this.quanlidanhmucArrayList = quanlidanhmucArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_quanlidanhmuc,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(quanlidanhmucArrayList.get(position).getTendanhmuc());
        holder.image.setImageResource(quanlidanhmucArrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return quanlidanhmucArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView txtName;
        ImageView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tendanhmucmonan);
            image = itemView.findViewById(R.id.imagequanlidanhmuc);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an Option");
            menu.add(this.getAdapterPosition(),121,0,"Xóa danh mục");
            menu.add(this.getAdapterPosition(),122,1,"Sửa danh mục");

        }


    }
    public void removeItem(int position){
        quanlidanhmucArrayList.remove(position);
        notifyDataSetChanged();
    }

}

