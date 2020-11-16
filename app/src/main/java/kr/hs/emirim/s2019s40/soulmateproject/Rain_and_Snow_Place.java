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
    int size = 10;

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
        item[0] = new RecyclerView_Model(R.drawable.the_zoo, "애니멀 뮤지엄 The Zoo", "동물들과 종을 넘은 교감" +
                "\n서울 강동구 양재대로 1299 우용빌딩 2층");
        item[1] = new RecyclerView_Model(R.drawable.runningman_experience, "런닝맨 체험관", "TV 프로그램 속 주인공이 되는 신개념 체험 컨텐츠" +
                "\n서울 종로구 인사동5길 41 하나빌딩 지하1층");
        item[2] = new RecyclerView_Model(R.drawable.dynamic_maze, "다이나믹 메이즈", "상상 그 이상. 복잡한 미로를 탈출하라!" +
                "서울 종로구 인사동길 12 대일빌딩 지하1층");
        item[3] = new RecyclerView_Model(R.drawable.real_gun_shot, "명동 실탄 사격장\n만 14세 이용가능", "탕! 탕! 탕!스트레스 한방에 날려버리자!" +
                "\n서울 중구 명동8가길 27 션샤인빌딩 3층");
        item[4] = new RecyclerView_Model(R.drawable.vaunce_trampolinepark, "바운스 트렘폴린 파크", "온몸으로 즐기는 중력과 싸움" +
                "\n서울 강남구 영동대로 325 지하 3층");
        item[5] = new RecyclerView_Model(R.drawable.ring_craftshop, "세모 네모 동그라미 반지공방", "세상에서 단 하나 뿐인 내거" +
                "서울 강남구 강남대로106길 14");
        item[6] = new RecyclerView_Model(R.drawable.sports_monster, "스포츠 몬스터 스타필드", "네가지 스타일의 즐거움을 만날 수 있는 공간" +
                "\n경기 하남시 미사대로 750 스타필드 하남 4층");
        item[7] = new RecyclerView_Model(R.drawable.black_cafe, "암흑카페\n폐쇄공포증 이용불가", "빛 없는 깜깜한 어둠을 헤쳐나가자" +
                "\n서울 서대문구 연세로5길 26 준빌딩 8층");
        item[8] = new RecyclerView_Model(R.drawable.youth_workshop, "청년공방 본점", "누구나 쉽게 구부리고 제작 할 수 있는 특별한 네온사인" +
                "\n경기 수원시 팔달구 권광로187번길 10-3 4층 청년공방");
        item[9] = new RecyclerView_Model(R.drawable.camp_vr, "캠프VR", "눈앞에서 펼쳐지는 서바이벌 게임의 향연" +
                "\n서울 관악구 신림로 340 9층 캠프VR 신림점");

        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_rain_and_snow__place));
    }
}