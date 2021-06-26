package com.example.foodrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class search_foods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_foods);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
//        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<search> arrayList = new ArrayList<>();
        arrayList.add(new search(R.drawable.post,"Món ngon mỗi ngày"));
        arrayList.add(new search(R.drawable.post,"Món Hàn"));
        arrayList.add(new search(R.drawable.post,"Chè"));
        arrayList.add(new search(R.drawable.post,"Eatclean"));
        arrayList.add(new search(R.drawable.post,"Ăn sáng"));
        arrayList.add(new search(R.drawable.post,"Nước ép"));
        arrayList.add(new search(R.drawable.post,"Pudding"));
        arrayList.add(new search(R.drawable.post,"Lẩu thái"));
        arrayList.add(new search(R.drawable.post,"Món ngon mỗi ngày"));
        arrayList.add(new search(R.drawable.post,"Món Hàn"));
        arrayList.add(new search(R.drawable.post,"Chè"));
        arrayList.add(new search(R.drawable.post,"Eatclean"));
        arrayList.add(new search(R.drawable.post,"Ăn sáng"));
        arrayList.add(new search(R.drawable.post,"Nước ép"));
        arrayList.add(new search(R.drawable.post,"Pudding"));
        arrayList.add(new search(R.drawable.post,"Lẩu thái"));
        searchAdapter searchAdapter = new searchAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(searchAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.search);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
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
                        startActivity(new Intent(getApplicationContext(),Accounts.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}