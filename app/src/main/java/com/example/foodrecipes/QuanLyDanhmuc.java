package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodrecipes.adapter.QliDanhmucAdapter;
import com.example.foodrecipes.model.quanlidanhmuc;

import java.util.ArrayList;

public class QuanLyDanhmuc extends AppCompatActivity {
    private QliDanhmucAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_danhmuc);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_quanlidanhmuc);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<quanlidanhmuc> arrayList = new ArrayList<>();
        arrayList.add(new quanlidanhmuc(R.drawable.thit_bo,"Thịt bò "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_heo,"Thịt lợn "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_bo,"Thịt bò "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_heo,"Thịt lợn "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_bo,"Thịt bò "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_heo,"Thịt lợn "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_bo,"Thịt bò "));
        arrayList.add(new quanlidanhmuc(R.drawable.thit_heo,"Thịt lợn "));



        adapter = new QliDanhmucAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);


    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case 121:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyDanhmuc.this, " CAtegory deleted!", Toast.LENGTH_SHORT).show();
                return true;
            case 122:
                Toast.makeText(QuanLyDanhmuc.this, "Category updated ", Toast.LENGTH_SHORT).show();
                return true;
            default:  return super.onContextItemSelected(item);
        }
    }
}