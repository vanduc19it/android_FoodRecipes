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
import com.example.foodrecipes.model.quanlitintuc;

import java.util.ArrayList;

public class QliTintucAdapter extends RecyclerView.Adapter<QliTintucAdapter.ViewHolder>{
    ArrayList<quanlitintuc> quanlitintucArrayList;
    Context context;

    public QliTintucAdapter(ArrayList<quanlitintuc> quanlitintucArrayList, Context context) {
        this.quanlitintucArrayList = quanlitintucArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_quanlitintuc,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txttieude.setText(quanlitintucArrayList.get(position).getTieude());
        holder.txtnguon.setText(quanlitintucArrayList.get(position).getNguon());
        holder.txtdate.setText(quanlitintucArrayList.get(position).getNgaydang());
    }

    @Override
    public int getItemCount() {
        return quanlitintucArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView txttieude, txtdate,txtnguon;

        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txttieude = itemView.findViewById(R.id.tieude);
            txtdate = itemView.findViewById(R.id.ngaydang);
            txtnguon = itemView.findViewById(R.id.nguon);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an Option");
            menu.add(this.getAdapterPosition(),121,0,"Xóa tin tức");
            menu.add(this.getAdapterPosition(),122,1,"Cập nhật");

        }


    }
    public void removeItem(int position){
        quanlitintucArrayList.remove(position);
        notifyDataSetChanged();
    }

}


