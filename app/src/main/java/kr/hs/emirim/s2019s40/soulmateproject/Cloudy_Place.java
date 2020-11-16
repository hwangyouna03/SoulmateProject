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
    int size = 10;

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
        item[0] = new RecyclerView_Model(R.drawable.dgrandblue_studio, "딥 그랑 블루 스튜디오", "물속에서 일어나는 환상을 찍다" +
                "\n서울 성동구 상원6길 11\n뚝섬역4번 출구에서286m");
        item[1] = new RecyclerView_Model(R.drawable.runningman_experience, "런닝맨 체험관", "TV 프로그램 속 주인공이 되는 신개념 체험 컨텐츠" +
                "\n서울 종로구 인사동5길 41 하나빌딩 지하1층");
        item[2] = new RecyclerView_Model(R.drawable.roof_and_cloud, "루프 앤 클라우드", "다양한 체험을 즐길 수 있는 곳" +
                "\n경기 용인시 기흥구 신고매로 59 4층");
        item[3] = new RecyclerView_Model(R.drawable.real_gun_shot, "명동 실탄 사격장\n만 14세 이용가능", "탕! 탕! 탕!스트레스 한방에 날려버리자!" +
                "\n서울 중구 명동8가길 27 션샤인빌딩 3층");
        item[4] = new RecyclerView_Model(R.drawable.sports_monster, "스포츠 몬스터 스타필드", "네가지 스타일의 즐거움을 만날 수 있는 공간" +
                "\n경기 하남시 미사대로 750 스타필드 하남 4층");
        item[5] = new RecyclerView_Model(R.drawable.cheese_temapark, "임실 치즈 테마파크", "퐁당 치즈 속으로" +
                "\n경기 가평군 설악면 다락재로 226-57");
        item[6] = new RecyclerView_Model(R.drawable.youth_workshop, "청년공방 본점", "누구나 쉽게 구부리고 제작 할 수 있는 특별한 네온사인" +
                "\n경기 수원시 팔달구 권광로187번길 10-3 4층 청년공방");
        item[7] = new RecyclerView_Model(R.drawable.camp_vr, "캠프VR", "눈앞에서 펼쳐지는 서바이벌 게임의 향연" +
                "\n서울 관악구 신림로 340 9층 캠프VR 신림점");
        item[8] = new RecyclerView_Model(R.drawable.togin_market, "통인시장", "오랜 전통을 이어가는 엽전 시장" +
                "\n서울 종로구 자하문로15길 18");
        item[9] = new RecyclerView_Model(R.drawable.hwanseon_cave, "환선굴", "신비로운 땅 밑 세계" +
                "\n강원 삼척시 신기면 환선로 800 대이동굴관리소");


        for (int i = 0; i < size; i++) {
            items.add(item[i]);
        }
        recyclerView.setPadding(10, 20, 10, 0);
        recyclerView.setAdapter(new Sunny_RecyclerView_Adapter(getApplicationContext(), items, R.layout.activity_cloudy_place));
    }
}