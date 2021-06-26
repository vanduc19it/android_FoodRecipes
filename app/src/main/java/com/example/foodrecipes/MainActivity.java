package com.example.foodrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.foodrecipes.adapter.ListDataAdapter;
import com.example.foodrecipes.model.ListData;
import com.example.foodrecipes.model.danhmuc;
import com.example.foodrecipes.model.moinhat;
import com.example.foodrecipes.model.tintuc;
import com.example.foodrecipes.model.yeuthich;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvHome;
    private ListDataAdapter listDataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
            rcvHome = findViewById(R.id.rcv_home);
            listDataAdapter = new ListDataAdapter();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            rcvHome.setLayoutManager(linearLayoutManager);
            listDataAdapter.setData(this,getListDatas());
            rcvHome.setAdapter(listDataAdapter);
//        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.home);
//        recyclerView.setHasFixedSize(true);
//        GridLayoutManager layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
//        recyclerView.setLayoutManager(layoutManager);
////        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
////        recyclerView.addItemDecoration(dividerItemDecoration);
//        ArrayList<moinhat> arrayList = new ArrayList<>();
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//        arrayList.add(new moinhat(R.drawable.post,"Món ngon mỗi ngày"));
//
//        homeAdapter homeAdapter = new homeAdapter(arrayList,getApplicationContext());
//        recyclerView.setAdapter(homeAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.trangchu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu:
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
                        startActivity(new Intent(getApplicationContext(),Accounts.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    private List<ListData> getListDatas() {
        List<ListData> listData = new ArrayList<>();

        List<danhmuc> danhmucList = new ArrayList<>();
        danhmucList.add(new danhmuc(R.drawable.thit_heo,"Thịt heo"));
        danhmucList.add(new danhmuc(R.drawable.thit_bo,"Thịt bò"));
        danhmucList.add(new danhmuc(R.drawable.mon_trung,"Món trứng"));
        danhmucList.add(new danhmuc(R.drawable.mon_lau,"Món lẩu"));
        danhmucList.add(new danhmuc(R.drawable.monga,"Món gà"));
        danhmucList.add(new danhmuc(R.drawable.monca,"Món cá"));
        danhmucList.add(new danhmuc(R.drawable.douong,"Đồ uống"));
        danhmucList.add(new danhmuc(R.drawable.lambanh,"Làm bánh"));
        danhmucList.add(new danhmuc(R.drawable.mon_chay,"Ăn chay"));
        danhmucList.add(new danhmuc(R.drawable.an_sang,"Ăn sáng"));



        List<tintuc> tintucList = new ArrayList<>();
        tintucList.add(new tintuc(R.drawable.tintuc1,"Khoa học đã chứng minh "
                + System.getProperty ("line.separator")
                + "trứng nấu theo cách này"
                + System.getProperty ("line.separator")
                + "dinh dưỡng tăng gấp bội"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc2,"Lạ miệng với món thịt "
                + System.getProperty ("line.separator")
                + "cuộn trứng om xì dầu "
                + System.getProperty ("line.separator")
                + "kiểu Nhật đậm đà, ngọt bùi"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc3,"Bí quyết làm dưa chuột "
                + System.getProperty ("line.separator")
                + "ngâm xì dầu dai giòn"
                + System.getProperty ("line.separator")
                + "sần sật, chua ngọt, đậm đà"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc4,"Gợi ý 6 món ăn cực ngon, "
                + System.getProperty ("line.separator")
                + "nhìn rất sang,.."
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc5,"Chăm nấu thực đơn 4 "
                + System.getProperty ("line.separator")
                + "món này, chồng con dễ"
                + System.getProperty ("line.separator")
                + "nghiện cơm nhà"
                + System.getProperty ("line.separator")
        ));


        List<moinhat> moinhats = new ArrayList<>();
        moinhats.add(new moinhat("Phan Van Phung","Miến xào heo",R.drawable.account,R.drawable.moinhat1));
        moinhats.add(new moinhat("Phung pro","Thịt Kho Mắm ruốc",R.drawable.account,R.drawable.moinhat2));
        moinhats.add(new moinhat("Phung vip","Củ cải kho trắng thịt",R.drawable.account,R.drawable.moinhat3));
        moinhats.add(new moinhat("Phung vip1","Thịt ba chỉ kho tiêu",R.drawable.account,R.drawable.moinhat4));


        List<yeuthich> yeuthichList = new ArrayList<>();
        yeuthichList.add(new yeuthich(R.drawable.yeuthich1,R.drawable.account,"Van Duc","Nấm Kim châm hấp nước tương"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich2,R.drawable.account,"Van Duc","Đậu Hũ Non"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich3,R.drawable.account,"Van Duc","Bánh sữa chưa xoài"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich4,R.drawable.account,"Van Duc","Cà Phe Dalgona"));

        listData.add(new ListData(ListDataAdapter.TYPE_DANHMUC,danhmucList,null,null,null));
        listData.add(new ListData(ListDataAdapter.TYPE_TINTUC,null,tintucList,null,null));
        listData.add(new ListData(ListDataAdapter.TYPE_MOINHAT,null,null,moinhats,null));
        listData.add(new ListData(ListDataAdapter.TYPE_YEUTHICH,null,null,null,yeuthichList));



        return listData;
    }

}