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
import com.example.foodrecipes.model.quanliuser;

import java.util.ArrayList;

public class QliUserAdapter extends RecyclerView.Adapter<QliUserAdapter.ViewHolder>{
    ArrayList<quanliuser> quanliuserArrayList;
    Context context;

    public QliUserAdapter(ArrayList<quanliuser> quanliuserArrayList, Context context) {
        this.quanliuserArrayList = quanliuserArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_quanliuser,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(quanliuserArrayList.get(position).getName());
        holder.txtemail.setText(quanliuserArrayList.get(position).getEmail());
        holder.image.setImageResource(quanliuserArrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return quanliuserArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView txtName, txtemail;
        ImageView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tennguoidung);
            txtemail = itemView.findViewById(R.id.emailnguoidung);
            image = itemView.findViewById(R.id.imagequanliuser);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnCreateContextMenuListener(this);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select an Option");
            menu.add(this.getAdapterPosition(),121,0,"Xóa tài khoản");
            menu.add(this.getAdapterPosition(),122,1,"Khóa");

        }


    }
    public void removeItem(int position){
        quanliuserArrayList.remove(position);
        notifyDataSetChanged();
    }

}


