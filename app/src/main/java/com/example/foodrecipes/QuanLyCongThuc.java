package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodrecipes.adapter.QliBinhluanAdapter;
import com.example.foodrecipes.adapter.QliCongthucAdapter;
import com.example.foodrecipes.model.quanlibinhluan;
import com.example.foodrecipes.model.quanlicongthuc;

import java.util.ArrayList;

public class QuanLyCongThuc extends AppCompatActivity {
    private QliCongthucAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_cong_thuc);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_quanlicongthuc);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<quanlicongthuc> arrayList = new ArrayList<>();
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        arrayList.add(new quanlicongthuc(R.drawable.douong,"Phùng vip pro ","Thịt bò","thịt bò kho xả"));
        adapter = new QliCongthucAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case 121:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyCongThuc.this, " Đã xóa công thức", Toast.LENGTH_SHORT).show();
                return true;
            case 122:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyCongThuc.this, " Đã cập nhật", Toast.LENGTH_SHORT).show();
                return true;
            default:  return super.onContextItemSelected(item);
        }
    }
}