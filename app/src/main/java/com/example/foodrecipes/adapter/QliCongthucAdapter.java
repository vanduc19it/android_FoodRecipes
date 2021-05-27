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
import com.example.foodrecipes.model.quanlicongthuc;
import com.example.foodrecipes.model.quanlidanhmuc;

import java.util.ArrayList;

public class QliCongthucAdapter extends RecyclerView.Adapter<QliCongthucAdapter.ViewHolder>{
    ArrayList<quanlicongthuc> quanlicongthucArrayList;
    Context context;

    public QliCongthucAdapter(ArrayList<quanlicongthuc> quanlicongthucArrayList, Context context) {
        this.quanlicongthucArrayList = quanlicongthucArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_quanlicongthuc,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(quanlicongthucArrayList.get(position).getName());
        holder.txtdanhmuc.setText(quanlicongthucArrayList.get(position).getDanhmuc());
        holder.txtmonan.setText(quanlicongthucArrayList.get(position).getTenmonan());
        holder.image.setImageResource(quanlicongthucArrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return quanlicongthucArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView txtName ,txtdanhmuc,txtmonan;
        ImageView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.nguoidangcongthuc);
            txtdanhmuc = itemView.findViewById(R.id.tencategory1);
            txtmonan = itemView.findViewById(R.id.tenmonan1);
            image = itemView.findViewById(R.id.imageqlicongthuc);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an Option");
            menu.add(this.getAdapterPosition(),121,0,"Xóa công thức");
            menu.add(this.getAdapterPosition(),122,1,"Cập nhật");

        }

    }
    public void removeItem(int position){
        quanlicongthucArrayList.remove(position);
        notifyDataSetChanged();
    }

}







