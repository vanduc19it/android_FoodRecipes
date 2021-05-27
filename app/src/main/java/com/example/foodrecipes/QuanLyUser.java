package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodrecipes.adapter.QliDanhmucAdapter;
import com.example.foodrecipes.adapter.QliUserAdapter;
import com.example.foodrecipes.model.quanlidanhmuc;
import com.example.foodrecipes.model.quanliuser;

import java.util.ArrayList;

public class QuanLyUser extends AppCompatActivity {
    private QliUserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_user);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_quanliuser);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<quanliuser> arrayList = new ArrayList<>();
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));
        arrayList.add(new quanliuser("Phùng vip pro ","phungpro@gmail.com",R.drawable.douong));




        adapter = new QliUserAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case 121:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyUser.this, " Đã xóa tài khoản", Toast.LENGTH_SHORT).show();
                return true;
            case 122:
                Toast.makeText(QuanLyUser.this, "Đã khóa tài khoản", Toast.LENGTH_SHORT).show();
                return true;
            default:  return super.onContextItemSelected(item);
        }
    }
}