package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Rain_and_Snow_Food extends AppCompatActivity {

    ViewPager viewPager;
    Rain_and_Snow_Food_ViewPager_Adapter adapter;
    List<ViewPager_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow__food);

        models = new ArrayList<>();
        models.add(new ViewPager_Model(R.drawable.gambas, "감바스", "스페인의 지중해식 요리"));
        models.add(new ViewPager_Model(R.drawable.potatoshrimp_rice, "감자 새우 덮밥", "감자와 새우가 만나 밥을 살포시 덮어줘요"));
        models.add(new ViewPager_Model(R.drawable.kimchi_bulgogi_burrito, "김치 불고기 부리또", "우리나라 안에 맥시코 있다"));
        models.add(new ViewPager_Model(R.drawable.crab_croquette, "게살크로켓", "바삭한 껍질 뒤집어쓴 게맛을 알어?"));
        models.add(new ViewPager_Model(R.drawable.carbonara_tteokbokki, "까르보나라 치즈 떡볶이", "매콤한 떡볶이의 시대는 가라, 고소하고 풍미 깊은 까르보나라 떡볶이의 시대!"));

        models.add(new ViewPager_Model(R.drawable.chicken_kebabs, "닭꼬치", "닭을 꽂았더니 생기는 일"));
        models.add(new ViewPager_Model(R.drawable.kkanpung_tofu, "두부 깐풍기", "겉바속촉의 대명사"));
        models.add(new ViewPager_Model(R.drawable.sirloinsteak, "등심 스테이크", "스테이크 먹고 싶은 사람? 너두? 야 나두"));
        models.add(new ViewPager_Model(R.drawable.ricecake_skewer, "떡꼬치", "초등학교 앞 맛있었던 추억의 간식"));
        models.add(new ViewPager_Model(R.drawable.milkyounabe, "밀푀유 나베", "차곡차곡 쌓았더니 꽃이 폈어요"));

        models.add(new ViewPager_Model(R.drawable.ricebuger, "참치 마요 밥버거", "누가 빵으로 된 버거 먹냐. 밥버거가 최고지"));
        models.add(new ViewPager_Model(R.drawable.ricepizza, "밥피자", "누가 도우로 된 피자 먹냐. 밥피자가 최고지" +
                "\n전자레인지 or 오븐 필요"));
        models.add(new ViewPager_Model(R.drawable.sangria, "무알콜 상그리아", "에슐리 무알콜 홍차 와인에도 뒤지지 않는 맛"));
        models.add(new ViewPager_Model(R.drawable.beefbrisketbean_sprouts, "소고기 숙주 볶음", "부드러운 고기와 아삭한 숙주의 맛남"));
        models.add(new ViewPager_Model(R.drawable.squid_stirfry, "오징어 볶음", "쫄깃한 오징어가 붉은 옷을 입었다"));

        models.add(new ViewPager_Model(R.drawable.jstyle_stirfiry_udon, "야끼 우동", "일본 왜가. 여기가 일본인데"));
        models.add(new ViewPager_Model(R.drawable.jstyle_steamedeggs, "일본식 계란찜", "부드러움의 끝판왕 등장" +
                "\n찜기 필요"));
        models.add(new ViewPager_Model(R.drawable.abalone_porridge, "전복죽", "전복 폐하 오셨나이까"));
        models.add(new ViewPager_Model(R.drawable.chickensteak, "치킨 스테이크", "닭으로 어디까지 요리 할 수 있을까"));
        models.add(new ViewPager_Model(R.drawable.kalguksu, "칼국수", "소면 보다는 굵고 우동보단 얇은 칼국수"));

        models.add(new ViewPager_Model(R.drawable.corncheese, "콘치즈", "이거 하나면 점심, 아니 하루종일 버틴다" +
                "\n전자레인지 필요"));
        models.add(new ViewPager_Model(R.drawable.toumba_pasta, "투움바 파스타", "파스타의 새로운 변신?!"));
        models.add(new ViewPager_Model(R.drawable.hotchocolate, "핫초코", "달달하고 따뜻하게 몸 녹여주는 최고의 자기"));
        models.add(new ViewPager_Model(R.drawable.seafood_nurungjisoup, "해물 누룽지탕", "바삭한 누룽지와 바다맛 가득 해산물의 만남"));

        adapter = new Rain_and_Snow_Food_ViewPager_Adapter(models,this);

        viewPager = findViewById(R.id.Rain_and_Snow_food_viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, -25, 50, 0);
    }
}