package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodrecipes.adapter.QliBinhluanAdapter;
import com.example.foodrecipes.adapter.QliUserAdapter;
import com.example.foodrecipes.model.quanlibinhluan;
import com.example.foodrecipes.model.quanliuser;

import java.util.ArrayList;

public class QuanLyComment extends AppCompatActivity {
    private QliBinhluanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_comment);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_quanlicomment);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<quanlibinhluan> arrayList = new ArrayList<>();
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        arrayList.add(new quanlibinhluan("Phùng vip pro ","ngon quá ai da",R.drawable.douong));
        adapter = new QliBinhluanAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case 121:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyComment.this, " Đã xóa bình luận", Toast.LENGTH_SHORT).show();
                return true;
            default:  return super.onContextItemSelected(item);
        }
    }
}