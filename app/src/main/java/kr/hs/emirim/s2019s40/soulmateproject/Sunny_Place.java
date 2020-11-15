package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Sunny_Place extends AppCompatActivity {
    RecyclerView recyclerView;
    List<RecyclerView_Model> items;
    RecyclerView_Model[] item;
    int size = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunny_place);

        recyclerView = (RecyclerView) findViewById(R.id.Sunny_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        item = new RecyclerView_Model[size];
        item[0] = new RecyclerView_Model(R.drawable.wind_hill, "바람의 언덕", "리사이클러뷰 제대로 되나");
        item[1] = new RecyclerView_Model(R.drawable.botania, "외도 보타니아", "리사이클러뷰 제대로 되나");
        item[2] = new RecyclerView_Model(R.drawable.art_village, "원예 예술촌", "이국적인 풍경 가득" +
                "\n경남 남해군 삼동면 예술길 39 원예예술촌");
        item[3] = new RecyclerView_Model(R.drawable.pretty_france, "쁘띠 프랑스", "리사이클러뷰 제대로 되나");
        item[4] = new RecyclerView_Model(R.drawable.santorini, "산토리니", "리사이클러뷰 제대로 되나");
        item[5] = new RecyclerView_Model(R.drawable.songdo_marine_cablecar, "송도 해상 케이블카", "리사이클러뷰 제대로 되나");
        item[6] = new RecyclerView_Model(R.drawable.swiss_temapark, "에델바이스 스위스 테마파크", "리사이클러뷰 제대로 되나");
        item[7] = new RecyclerView_Model(R.drawable.cheese_temapark, "임실 치즈 테마파크", "리사이클러뷰 제대로 되나");
        item[8] = new RecyclerView_Model(R.drawable.jadengarden, "제이든 가든", "리사이클러뷰 제대로 되나");
        item[9] = new RecyclerView_Model(R.drawable.flying_gyeongju, "플라잉 경주", "리사이클러뷰 제대로 되나");
        item[10] = new RecyclerView_Model(R.drawable.hwanseon_cave, "환선굴", "리사이클러뷰 제대로 되나");

        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_sunny_place));
    }
}