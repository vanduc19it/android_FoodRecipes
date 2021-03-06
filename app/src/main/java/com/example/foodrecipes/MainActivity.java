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
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
//        arrayList.add(new moinhat(R.drawable.post,"M??n ngon m???i ng??y"));
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
        danhmucList.add(new danhmuc(R.drawable.thit_heo,"Th???t heo"));
        danhmucList.add(new danhmuc(R.drawable.thit_bo,"Th???t b??"));
        danhmucList.add(new danhmuc(R.drawable.mon_trung,"M??n tr???ng"));
        danhmucList.add(new danhmuc(R.drawable.mon_lau,"M??n l???u"));
        danhmucList.add(new danhmuc(R.drawable.monga,"M??n g??"));
        danhmucList.add(new danhmuc(R.drawable.monca,"M??n c??"));
        danhmucList.add(new danhmuc(R.drawable.douong,"????? u???ng"));
        danhmucList.add(new danhmuc(R.drawable.lambanh,"L??m b??nh"));
        danhmucList.add(new danhmuc(R.drawable.mon_chay,"??n chay"));
        danhmucList.add(new danhmuc(R.drawable.an_sang,"??n s??ng"));



        List<tintuc> tintucList = new ArrayList<>();
        tintucList.add(new tintuc(R.drawable.tintuc1,"Khoa h???c ???? ch???ng minh "
                + System.getProperty ("line.separator")
                + "tr???ng n???u theo c??ch n??y"
                + System.getProperty ("line.separator")
                + "dinh d?????ng t??ng g???p b???i"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc2,"L??? mi???ng v???i m??n th???t "
                + System.getProperty ("line.separator")
                + "cu???n tr???ng om x?? d???u "
                + System.getProperty ("line.separator")
                + "ki???u Nh???t ?????m ????, ng???t b??i"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc3,"B?? quy???t l??m d??a chu???t "
                + System.getProperty ("line.separator")
                + "ng??m x?? d???u dai gi??n"
                + System.getProperty ("line.separator")
                + "s???n s???t, chua ng???t, ?????m ????"
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc4,"G???i ?? 6 m??n ??n c???c ngon, "
                + System.getProperty ("line.separator")
                + "nh??n r???t sang,.."
                + System.getProperty ("line.separator")
        ));
        tintucList.add(new tintuc(R.drawable.tintuc5,"Ch??m n???u th???c ????n 4 "
                + System.getProperty ("line.separator")
                + "m??n n??y, ch???ng con d???"
                + System.getProperty ("line.separator")
                + "nghi???n c??m nh??"
                + System.getProperty ("line.separator")
        ));


        List<moinhat> moinhats = new ArrayList<>();
        moinhats.add(new moinhat("Phan Van Phung","Mi???n x??o heo",R.drawable.account,R.drawable.moinhat1));
        moinhats.add(new moinhat("Phung pro","Th???t Kho M???m ru???c",R.drawable.account,R.drawable.moinhat2));
        moinhats.add(new moinhat("Phung vip","C??? c???i kho tr???ng th???t",R.drawable.account,R.drawable.moinhat3));
        moinhats.add(new moinhat("Phung vip1","Th???t ba ch??? kho ti??u",R.drawable.account,R.drawable.moinhat4));


        List<yeuthich> yeuthichList = new ArrayList<>();
        yeuthichList.add(new yeuthich(R.drawable.yeuthich1,R.drawable.account,"Van Duc","N???m Kim ch??m h???p n?????c t????ng"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich2,R.drawable.account,"Van Duc","?????u H?? Non"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich3,R.drawable.account,"Van Duc","B??nh s???a ch??a xo??i"));
        yeuthichList.add(new yeuthich(R.drawable.yeuthich4,R.drawable.account,"Van Duc","C?? Phe Dalgona"));

        listData.add(new ListData(ListDataAdapter.TYPE_DANHMUC,danhmucList,null,null,null));
        listData.add(new ListData(ListDataAdapter.TYPE_TINTUC,null,tintucList,null,null));
        listData.add(new ListData(ListDataAdapter.TYPE_MOINHAT,null,null,moinhats,null));
        listData.add(new ListData(ListDataAdapter.TYPE_YEUTHICH,null,null,null,yeuthichList));



        return listData;
    }

}