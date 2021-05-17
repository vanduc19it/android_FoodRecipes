package com.example.foodrecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipes.R;
import com.example.foodrecipes.model.ListData;

import java.util.List;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListDataViewHolder>{
    public static final int TYPE_DANHMUC = 1;
    public static final int TYPE_TINTUC = 2;
    public static final int TYPE_MOINHAT = 3;
    public static final int TYPE_YEUTHICH = 4;


    private List<ListData> listData;
    private Context mcontext;

    public void setData(Context context, List<ListData> listData){
        this.mcontext = context;
        this.listData = listData;
        notifyDataSetChanged();
    }
  @Override
    public int getItemViewType(int position) {
        return listData.get(position).getType();
    }

    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_data, parent,false);
        return new ListDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {
        ListData list = listData.get(position);
        if(list == null){
            return;
        }

        if(TYPE_DANHMUC == holder.getItemViewType()) {
            GridLayoutManager layoutManager = new GridLayoutManager(mcontext,5,GridLayoutManager.VERTICAL,false);
            holder.rcvItem.setLayoutManager(layoutManager);
            holder.rcvItem.setFocusable(false);
            DanhmucAdapter danhmucAdapter = new DanhmucAdapter();
            danhmucAdapter.setData(list.getMliDanhmucs());
            holder.rcvItem.setAdapter(danhmucAdapter);
        } else if(TYPE_TINTUC == holder.getItemViewType()){
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext, RecyclerView.HORIZONTAL,false);
                holder.rcvItem.setLayoutManager(linearLayoutManager);
                holder.rcvItem.setFocusable(false);
                TintucAdapter tintucAdapter = new TintucAdapter();
                tintucAdapter.setData(list.getMlistTintuc());
                holder.rcvItem.setAdapter(tintucAdapter);
        } else  if(TYPE_MOINHAT == holder.getItemViewType()){
              //  LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext, RecyclerView.VERTICAL,false);
                GridLayoutManager layoutManager = new GridLayoutManager(mcontext,2,GridLayoutManager.VERTICAL,false);
                holder.rcvItem.setLayoutManager(layoutManager);
                holder.rcvItem.setFocusable(false);
                MoinhatAdapter moinhatAdapter = new MoinhatAdapter();
                moinhatAdapter.setData(list.getMlistMoinhat());
                holder.rcvItem.setAdapter(moinhatAdapter);
        }else  if(TYPE_YEUTHICH == holder.getItemViewType()){
            //  LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext, RecyclerView.VERTICAL,false);
            GridLayoutManager layoutManager = new GridLayoutManager(mcontext,2,GridLayoutManager.VERTICAL,false);
            holder.rcvItem.setLayoutManager(layoutManager);
            holder.rcvItem.setFocusable(false);
            YeuthichAdapter yeuthichAdapter = new YeuthichAdapter();
            yeuthichAdapter.setData(list.getmYeuthichList());
            holder.rcvItem.setAdapter(yeuthichAdapter);
        }

    }

    @Override
    public int getItemCount() {
        if( listData != null){
            return listData.size();
        }
        return 0;
    }

    public class ListDataViewHolder extends RecyclerView.ViewHolder {

        private RecyclerView rcvItem;
        public ListDataViewHolder(@NonNull View itemView) {
            super(itemView);
            rcvItem = itemView.findViewById(R.id.rcv_item);
        }
    }
}
