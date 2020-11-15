package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Cloudy_Food extends AppCompatActivity {

    ViewPager viewPager;
    Cloudy_Food_ViewPager_Adapter adapter;
    List<ViewPager_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloudy_food);

        models = new ArrayList<>();
        models.add(new ViewPager_Model(R.drawable.potatopizza, "감자 피자", "감자가 넓게 퍼지면 어떻게 될까" +
                "\nNo오븐"));
        models.add(new ViewPager_Model(R.drawable.kimchi_friedrice, "김치 볶음밥", "김치와 밥의 환상적인 만남이 이루어지는 곳"));
        models.add(new ViewPager_Model(R.drawable.chickensoup, "닭볶음탕", "붉은 옷을 입은 닭의 화려한 변신"));
        models.add(new ViewPager_Model(R.drawable.strawberryade, "딸기 에이드", "달달한 딸기와 탄산의 만남" +
                "\n믹서기 필요"));

        models.add(new ViewPager_Model(R.drawable.morningbread_hambuger, "모닝빵 햄버거", "한입 가득 햄버거"));
        models.add(new ViewPager_Model(R.drawable.baconeggcup, "베이컨 에그컵", "간단하게 브런치로 딱 좋은" +
                "\n오븐필요"));
        models.add(new ViewPager_Model(R.drawable.brownie, "브라우니", "초코 가득, 입안 가득 퍼지는 부드러움" +
                "\n핸드믹서, 오븐, 오븐용 사각틀필요"));

        models.add(new ViewPager_Model(R.drawable.blueberry_yogurt_smoothie, "블루베리 요거트 스무디", "동글한 블루베리와 상큼한 요거트의 만남" +
                "\n믹서기 필요"));
        models.add(new ViewPager_Model(R.drawable.pannepasta, "빠네 파스타", "고소하고 부드러운 소스와 폭신한 빵"));
        models.add(new ViewPager_Model(R.drawable.porkbelly_kimpop, "삼겹살 김밥", "그냥 먹어도 맛있는 김밥에 고기가 들어가면?"));
        models.add(new ViewPager_Model(R.drawable.beefvegetable_mari, "소고기 채소 말이", "채소를 품은 소고기"));
        models.add(new ViewPager_Model(R.drawable.okonomiyaki, "오꼬노미야끼", "비행기 타지 않아도 일본으로 갈 수 있다!"));

        models.add(new ViewPager_Model(R.drawable.chopsteak, "찹스테이크", "찹찹 넘어가는 스테이크"));
        models.add(new ViewPager_Model(R.drawable.pikachu_porkcutlet, "피카츄 돈가스", "초딩 시절을 떠올리게 하는 추억의 간식"));
        models.add(new ViewPager_Model(R.drawable.chicken_company, "계열사", "부암동 수요미식회에 방영된 치킨 맛집" +
                "\n\n서울 종로구 백석 동길 7")); //외식 부분↓
        models.add(new ViewPager_Model(R.drawable.dochef, "도셰프", "화덕 피자와 파스타가 맛있는 분위기 있는 레스토랑" +
                "\n\n서울 서초구 강남대로 89길 14\n논현역 3번 출구에서 182m"));

        models.add(new ViewPager_Model(R.drawable.dongigan, "동기간", "토종닭 백숙이 깔끔하고 맛있는 곳" +
                "\n\n경기 가평군 가평읍 보납로 459-158 동기간"));
        models.add(new ViewPager_Model(R.drawable.mukmyeok_sanbang, "목멱 산방", "자연과 함께 맛보는 비빔밥" +
                "\n\n서울 중구 퇴계로 20길 71 1층 목멱산방 \n명동역 3번 출구에서 441m"));
        models.add(new ViewPager_Model(R.drawable.buger_lab, "버거 랩", "주문 후 바로 조리하는 따뜻하고 맜있는 햄버거" +
                "\n\n서울 관악구 신림로 12길 5"));
        models.add(new ViewPager_Model(R.drawable.suchiichiza, "스시이치자", "초밥이 땡기는 날" +
                "\n\n서울 관악구 신림동길 31 1층 스시이치자 \n신림역 5번 출구에서 558m"));
        models.add(new ViewPager_Model(R.drawable.star_table, "아롱별식탁", "나만 알고 싶은 혼밥하기 좋은 곳" +
                "\n\n서울 관악구 봉천로 14길 27 아롱별 식탁 \n신림역 7번 출구에서 348m"));

        models.add(new ViewPager_Model(R.drawable.amar, "아마르", "어떤메뉴를 주문해도 실패하지않는 상도동 레스토랑" +
                "\n\n서울 동작구 상도로 181 \n장승배기역 2번 출구에서 80m"));
        models.add(new ViewPager_Model(R.drawable.gin_maratang, "진 마라탕", "한국 입맛에 딱 맞는 맛있는 마라탕" +
                "\n\n서울 관악구 신림로 23길 16 1층"));
        models.add(new ViewPager_Model(R.drawable.koyako, "코야코", "대학로 떡볶이 저렴한 맛집" +
                "\n\n서울 종로구 동숭길 68 1층 코야코\n혜화역 2번 출구에서 283m"));
        models.add(new ViewPager_Model(R.drawable.honkong_banjeom, "홍콩반점0410(노량진점)", "쫄깃한 탕수육이 일품인 중국집" +
                "\n\n서울 동작구 만양로 110 2층\n노량진역 3번 출구에서 225m"));

        adapter = new Cloudy_Food_ViewPager_Adapter(models,this);

        viewPager = findViewById(R.id.Cloudy_food_viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, -25, 50, 0);
    }
}