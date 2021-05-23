package com.example.foodrecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.Myfood;
import com.example.foodrecipes.search;

import java.util.ArrayList;

public class MyfoodAdapter extends RecyclerView.Adapter<MyfoodAdapter.ViewHolder>{
    ArrayList<Myfood> myfoods;
    Context context;

    public MyfoodAdapter(ArrayList<Myfood> myfoods, Context context) {
        this.myfoods = myfoods;
        this.context = context;
    }

    @NonNull
    @Override
    public MyfoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_myfood,parent,false);
        return new MyfoodAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyfoodAdapter.ViewHolder holder, int position) {
        holder.txtName.setText(myfoods.get(position).getName());
        holder.image.setImageResource(myfoods.get(position).getImgfood());
        holder.txtMota.setText(myfoods.get(position).getMota());
        holder.avata.setImageResource(myfoods.get(position).getImgperson());

    }

    @Override
    public int getItemCount() {
        return myfoods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtMota;
        ImageView avata,image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            avata = itemView.findViewById(R.id.avata);
            image = itemView.findViewById(R.id.anhfood);
            txtName = itemView.findViewById(R.id.tennguoidang);
            txtMota = itemView.findViewById(R.id.motamonan);

        }
    }
}

