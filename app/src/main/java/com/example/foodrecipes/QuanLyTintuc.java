package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodrecipes.adapter.QliDanhmucAdapter;
import com.example.foodrecipes.adapter.QliTintucAdapter;
import com.example.foodrecipes.model.quanlidanhmuc;
import com.example.foodrecipes.model.quanlitintuc;

import java.util.ArrayList;

public class QuanLyTintuc extends AppCompatActivity {
    private QliTintucAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_tintuc);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcv_quanlitintuc);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<quanlitintuc> arrayList = new ArrayList<>();
        arrayList.add(new quanlitintuc("Khoa học đã chứng minh trứng nấu theo cách này dinh dưỡng tăng gấp bội","20/10/2021","http://danviet.vn/khoa-hoc-da-chung-minh-trung-nau-theo-cach-nay-dinh-duong-tang-gap-boi-5020207121004742.htm"));
        arrayList.add(new quanlitintuc("Lạ miệng với món thịt cuộn trứng om xì dầu kiểu Nhật đậm đà, ngọt bùi","20/10/2021","http://danviet.vn/khoa-hoc-da-chung-minh-trung-nau-theo-cach-nay-dinh-duong-tang-gap-boi-5020207121004742.htm"));
        arrayList.add(new quanlitintuc("Bí quyết làm dưa chuột ngâm xì dầu dai giòn sần sật, chua ngọt, đậm đà","20/10/2021","http://danviet.vn/khoa-hoc-da-chung-minh-trung-nau-theo-cach-nay-dinh-duong-tang-gap-boi-5020207121004742.htm"));
        arrayList.add(new quanlitintuc("Chị em cần thuộc \"nằm lòng\" bí quyết này để rau xào luôn xanh mướt, bóng đẹp","20/10/2021","http://danviet.vn/khoa-hoc-da-chung-minh-trung-nau-theo-cach-nay-dinh-duong-tang-gap-boi-5020207121004742.htm"));
        arrayList.add(new quanlitintuc("Thực đơn 3 món ít mà chất, người kén mấy cũng phải khen ngon","20/10/2021","http://danviet.vn/khoa-hoc-da-chung-minh-trung-nau-theo-cach-nay-dinh-duong-tang-gap-boi-5020207121004742.htm"));



        adapter = new QliTintucAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case 121:
                adapter.removeItem(item.getGroupId());
                Toast.makeText(QuanLyTintuc.this, " Đã xóa tin tức", Toast.LENGTH_SHORT).show();
                return true;
            case 122:
                Toast.makeText(QuanLyTintuc.this, "Cập nhật", Toast.LENGTH_SHORT).show();
                return true;
            default:  return super.onContextItemSelected(item);
        }
    }
}