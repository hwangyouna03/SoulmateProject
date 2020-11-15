package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Cloudy_Place extends AppCompatActivity {
    RecyclerView recyclerView;
    List<RecyclerView_Model> items;
    RecyclerView_Model[] item;
    int size = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloudy_place);

        recyclerView = (RecyclerView) findViewById(R.id.Cloudy_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        items = new ArrayList<>();
        item = new RecyclerView_Model[size];
        item[0] = new RecyclerView_Model(R.drawable.dgrandblue_studio, "딥 그랑 블루 스튜디오", "리사이클러뷰 제대로 되나");
        item[1] = new RecyclerView_Model(R.drawable.runningman_experience, "런닝맨 체험관", "리사이클러뷰 제대로 되나");
        item[2] = new RecyclerView_Model(R.drawable.rolleralla, "롤러랄라", "리사이클러뷰 제대로 되나");
        item[3] = new RecyclerView_Model(R.drawable.roof_and_cloud, "루프앤클라우드", "리사이클러뷰 제대로 되나");
        item[4] = new RecyclerView_Model(R.drawable.live_fire_range, "명동 실탄 사격장", "리사이클러뷰 제대로 되나");
        item[5] = new RecyclerView_Model(R.drawable.sports_monster, "스포츠 몬스터 스타필드", "리사이클러뷰 제대로 되나");
        item[6] = new RecyclerView_Model(R.drawable.cheese_temapark, "임실치즈 테마파크", "리사이클러뷰 제대로 되나");
        item[7] = new RecyclerView_Model(R.drawable.youth_workshop, "청년공방", "리사이클러뷰 제대로 되나");
        item[8] = new RecyclerView_Model(R.drawable.camp_vr, "캠프VR", "리사이클러뷰 제대로 되나");
        item[9] = new RecyclerView_Model(R.drawable.togin_market, "통인시장", "리사이클러뷰 제대로 되나");
        item[10] = new RecyclerView_Model(R.drawable.gold_cafe, "사금 체험 카페", "리사이클러뷰 제대로 되나");
        item[11] = new RecyclerView_Model(R.drawable.hwanseon_cave, "환선굴", "리사이클러뷰 제대로 되나");


        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_cloudy_place));
    }
}