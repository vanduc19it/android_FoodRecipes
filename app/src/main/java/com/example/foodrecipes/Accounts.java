package com.example.foodrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Accounts extends AppCompatActivity {

//    private TabLayout mTabLayout;
//    private ViewPager mViewpager;

      TextView xemthongtin;
      Button btnEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);

        xemthongtin = findViewById(R.id.xeminfor);
        xemthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Xemthongtin.class));
            }
        });
        btnEdit = findViewById(R.id.btneditacount);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UpdateAcount.class));
            }
        });

//        mTabLayout = findViewById(R.id.tab_layout);
//        mViewpager = findViewById(R.id.view_pager);

//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        mViewpager.setAdapter(viewPagerAdapter);
//        mTabLayout.setupWithViewPager(mViewpager);
//        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewacount);
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);
////        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
////        recyclerView.addItemDecoration(dividerItemDecoration);
//        ArrayList<AccountRecyclerview> arrayList = new ArrayList<>();
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new AccountRecyclerview(R.drawable.post,"M??n ngon m???i ng??y"));
//        AcountAdapter acountAdapter = new AcountAdapter(arrayList,getApplicationContext());
//        recyclerView.setAdapter(acountAdapter);

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
                        return true;
                }
                return false;
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu,menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.item1:
//                Toast.makeText(this, "Xem th??ng tin",Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.item2:
//                Toast.makeText(this, "S???a th??ng tin",Toast.LENGTH_SHORT).show();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

}