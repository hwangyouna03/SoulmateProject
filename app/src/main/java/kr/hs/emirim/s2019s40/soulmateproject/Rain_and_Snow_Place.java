package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Rain_and_Snow_Place extends AppCompatActivity {
    RecyclerView recyclerView;
    List<RecyclerView_Model> items;
    RecyclerView_Model[] item;
    int size = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow__place);

        recyclerView = (RecyclerView) findViewById(R.id.Rain_and_Snow_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        item = new RecyclerView_Model[size];
        item[0] = new RecyclerView_Model(R.drawable.star_table, "별침대", "리사이클러뷰 제대로 되나");
        item[1] = new RecyclerView_Model(R.drawable.the_zoo, "더 주 실내 동물원", "리사이클러뷰 제대로 되나");
        item[2] = new RecyclerView_Model(R.drawable.dgrandblue_studio, "딥 그랑 블루 스튜디오", "리사이클러뷰 제대로 되나");
        item[3] = new RecyclerView_Model(R.drawable.runningman_experience, "런닝맨 체험관", "리사이클러뷰 제대로 되나");
        item[4] = new RecyclerView_Model(R.drawable.multi_plus, "멀티 플러스", "리사이클러뷰 제대로 되나");
        item[5] = new RecyclerView_Model(R.drawable.live_fire_range, "실탄 사격장", "리사이클러뷰 제대로 되나");
        item[6] = new RecyclerView_Model(R.drawable.vaunce_trampolinepark, "바운스 트렘폴린 파크", "리사이클러뷰 제대로 되나");
        item[7] = new RecyclerView_Model(R.drawable.ring_craftshop, "세모네모동그라미", "리사이클러뷰 제대로 되나");
        item[8] = new RecyclerView_Model(R.drawable.sports_monster, "스포츠 몬스터 스타필드", "리사이클러뷰 제대로 되나");
        item[9] = new RecyclerView_Model(R.drawable.black_cafe, "암흑카페", "리사이클러뷰 제대로 되나");
        item[10] = new RecyclerView_Model(R.drawable.youth_workshop, "청년공장", "리사이클러뷰 제대로 되나");
        item[11] = new RecyclerView_Model(R.drawable.camp_vr, "캠프VR", "리사이클러뷰 제대로 되나");

        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_rain_and_snow__place));
    }
}