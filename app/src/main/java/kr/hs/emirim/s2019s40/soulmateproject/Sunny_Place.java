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
    int size = 10;

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
        item[0] = new RecyclerView_Model(R.drawable.wind_hill, "바람의 언덕", "풍차와 목가적인 언덕의 아름다운 풍경이 어우러진 곳." +
                "\n경남 거제시 남부면 갈곶리 산14-47");
        item[1] = new RecyclerView_Model(R.drawable.botania, "외도 보타니아", "남해안 천혜 비경의 결정체" +
                "\n경남 거제시 일운면 외도길 17 외도해상농원");
        item[2] = new RecyclerView_Model(R.drawable.art_village, "원예 예술촌", "이국적인 풍경 가득" +
                "\n경남 남해군 삼동면 예술길 39 원예예술촌");
        item[3] = new RecyclerView_Model(R.drawable.pretty_france, "쁘띠 프랑스", "국내 유일 프랑스 테마파크" +
                "\n경기 가평군 청평면 호반로 1063");
        item[4] = new RecyclerView_Model(R.drawable.songdo_marine_cablecar, "송도 해상 케이블카", "바다 위 환상적인 감동의 파노라마" +
                "\n부산 서구 송도해변로 171");
        item[5] = new RecyclerView_Model(R.drawable.swiss_temapark, "에델바이스 스위스 테마파크", "한국 속 작은 스위스 마을" +
                "\n경기 가평군 설악면 다락재로 226-57");
        item[6] = new RecyclerView_Model(R.drawable.cheese_temapark, "임실 치즈 테마파크", "퐁당 치즈 속으로" +
                "\n경기 가평군 설악면 다락재로 226-57");
        item[7] = new RecyclerView_Model(R.drawable.jadengarden, "제이든 가든", "순백의 아름다움을 지닌 새하얀 유럽정원" +
                "\n경기 가평군 설악면 다락재로 226-57");
        item[8] = new RecyclerView_Model(R.drawable.flying_gyeongju, "플라잉 경주", "경주에서 펼쳐지는 설레는 하늘여행" +
                "\n강원 춘천시 남산면 햇골길 80 제이드가든수목원");
        item[9] = new RecyclerView_Model(R.drawable.hwanseon_cave, "환선굴", "신비로운 땅 밑 세계" +
                "\n강원 삼척시 신기면 환선로 800 대이동굴관리소");

        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_sunny_place));
    }
}