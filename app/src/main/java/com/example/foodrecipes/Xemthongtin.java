package com.example.foodrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodrecipes.adapter.MyfoodAdapter;
import com.example.foodrecipes.model.Myfood;
import com.example.foodrecipes.model.moinhat;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Xemthongtin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xemthongtin);


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_thongtin);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
//        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<Myfood> arrayList = new ArrayList<>();
        arrayList.add(new Myfood("Phan Van Phung","Miến xào heo",R.drawable.account,R.drawable.moinhat1));
        arrayList.add(new Myfood("Phan Van Phung","Miến xào heo",R.drawable.account,R.drawable.moinhat1));
        arrayList.add(new Myfood("Phan Van Phung","Miến xào heo",R.drawable.account,R.drawable.moinhat1));
        arrayList.add(new Myfood("Phan Van Phung","Miến xào heo",R.drawable.account,R.drawable.moinhat1));
        MyfoodAdapter myfoodAdapter = new MyfoodAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(myfoodAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.taikhoan);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(),search_foods.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.post:
                        startActivity(new Intent(getApplicationContext(),add_foods.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.chat:
                        startActivity(new Intent(getApplicationContext(),Messages.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.taikhoan:
                        startActivity(new Intent(getApplicationContext(),Xemthongtin.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
}