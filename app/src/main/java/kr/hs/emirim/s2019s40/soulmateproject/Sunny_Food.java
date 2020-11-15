package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Sunny_Food extends AppCompatActivity {

    ViewPager viewPager;
    Sunny_Food_ViewPager_Adapter adapter;
    List<ViewPager_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunny_food);

            models = new ArrayList<>();
            models.add(new ViewPager_Model(R.drawable.two_dotsbakery, "2DotsBakery", "맛있는 빵과 어울리는 커피 맛집" +
                    "\n\n서울 관악구 신림동 1639-4 \n신림역4번 출구에서220m"));
            models.add(new ViewPager_Model(R.drawable.blt_steak, "BLT 스테이크", "수요미식회에 소개된 뉴욕 3대 스테이크" +
                    "\n\n서울 종로구 청계천로 279 2층 \n동대문역9번 출구에서7m"));
            models.add(new ViewPager_Model(R.drawable.fearless_rabbit_kit, "겁없는토끼부엌", "예약없인 맛보지 못하는 토끼부엌 로제파스타" +
                    "\n\n서울 서초구 청두곶길 6-1 1층 겁없는토끼부엌 \n사당역11번 출구에서356m"));
            models.add(new ViewPager_Model(R.drawable.nipongneapong, "니뽕내뽕 본점", "국밥보다 파스타보다 뜨뜻한 크림로제 짬뽕" +
                    "\n\n서울 광진구 동이로 20길 60 연일 빌딩\n건대입구역 6번 출구에서 195m"));
            models.add(new ViewPager_Model(R.drawable.legs_house, "다리집", "오징어 튀김, 떡볶이가 맛있는 다리집" +
                    "\n\n부산 수영구 남천바다로 10번길 70 101호\n금련산역 5번 출구에서 299m"));

            models.add(new ViewPager_Model(R.drawable.the_melting_pot, "더 멜팅 팟", "다운타우너 보다 더 맛있는 샤로수길수제버거" +
                    "\n\n서울 관악구 관악로 14길 2\n서울대입구역 1번 출구에서 459m"));
            models.add(new ViewPager_Model(R.drawable.tokyo_walk, "동경산책", "처음 음식 나오기 전에 김마끼밥" +
                    "\n\n서울 송파구 백제고분로 45길 15 1층 102호 \n송파나루역 1번 출구에서 320m\""));
            models.add(new ViewPager_Model(R.drawable.heary_meal, "든든한끼", "따뜻한 한 상, 든든한끼" +
                    "\n\n서울 관악구 신원로 3가길 7 101호\n신림역 3번 출구에서 421m"));
            models.add(new ViewPager_Model(R.drawable.designery_cafe, "디자이너리 카페", "도림천을 내려다보는 신림동 루프탑 카페" +
                    "\n\n서울 관악구 과천로 71-1 4F\n신림역 5번 출구에서 515m"));
            models.add(new ViewPager_Model(R.drawable.lasistar, "라시에스타", "화덕 피자와 파스타가 유명한 이탈리안 레스토랑" +
                    "\n\n서울 동작구 동작대로 21 양지 빌딩 6층 라시에스타\n사당역 10번 추구에서 20m"));

            models.add(new ViewPager_Model(R.drawable.red_brick, "레드브릭", "화덕 피자 맛있는 곳" +
                    "\n\n서울 서초구 서래로 6길 17 만유 빌딩 \n고속터미널 5번 출구에서 818m"));
            models.add(new ViewPager_Model(R.drawable.bison_burger, "바이슨 버거", "신선한 재료로 정직하게 조리하는 수제버거" +
                    "\n\n서울 동작구 상도로 47 1층\n신대방삼거리역 4번 출구에서 80m"));
            models.add(new ViewPager_Model(R.drawable.vault_stakhouse, "볼트 스테이크 하우스", "미쉐린 가이드 2020" +
                    "\n\n서울 강남구 압구정로 72길 22\n압구정로데오역 3번 출구에서 540m"));
            models.add(new ViewPager_Model(R.drawable.bimbom, "빙봉", "간단하고 깔끔한 브런치" +
                    "\n\n서울 성동구 서울숲2길 18-14 1층\n뚝섬역 8번 출구에서 610m"));

            models.add(new ViewPager_Model(R.drawable.mountain_farm, "산골농원", "솥뚜껑에 끓여먹는 닭볶음탕" +
                    "\n\n경기 가평군 설악면 어비산길 99번지 75-7"));
            models.add(new ViewPager_Model(R.drawable.suhebok_maratang, "수해복 마라탕", "열받는 날 화끈한 마라탕" +
                    "\n\n경기 수원시 영통구 아주로 40-5 2층"));
            models.add(new ViewPager_Model(R.drawable.alexs_place, "알렉스 플레이스", "정통 미국식 햄버거 전문 레스토랑" +
                    "\n\n서울 동작구 여의대방로 24라길 32\n보라매역 2번 출구에서 200m"));
            models.add(new ViewPager_Model(R.drawable. apple_house, "애플 하우스", "인기 있는 즉석 떡볶이 맛집" +
                    "\n\n서울 서초구 신반포로 50\n구반포역 3번 출구에서 287m"));
            models.add(new ViewPager_Model(R.drawable.yankee_chicken, "양키 통닭", "편하게 맥주와 통닭을 즐길 수 있는 공간" +
                    "\n\n서울 영등포구 도림로 139길 13\n문래역 1번 출구에서 460m"));

            models.add(new ViewPager_Model(R.drawable.zero_nine_kitchen, "영구 키친", "정성껏 면을 뽑아 맛있게" +
                    "\n\n서울 관악구 청룡2길 19 1층\n봉천역 1번 출구에서 256m"));
            models.add(new ViewPager_Model(R.drawable.otoya, "오토야", "일본 가정식이 유명한 신림 존맛 일식집" +
                    "\n\n서울 관악구 신림로 303 호림빌딩 1층\n신림역 3번 출구 에서 260m"));
            models.add(new ViewPager_Model(R.drawable.all_the_plate, "올더 플레이트", "세계 요리 모인 퓨전 레스토랑" +
                    "\n\n서울 관악구 관악로 14길 22 2층\n서울대입구역 1번 출구에서 276m"));
            models.add(new ViewPager_Model(R.drawable.wolfgangs_steakhouse, "울프강 스테이크 하우스", "청담동 스테이크 맛있는 곳" +
                    "\n\n서울 강남구 선릉로 152길 21\n압구정로데오역 4번 출구에서 365m"));
            models.add(new ViewPager_Model(R.drawable.itali_papa, "이테리 파파", "최선을 다해 만드는 맛있는 이태리요리 가게" +
                    "\n\n서울 관악구 관악로 12길 3-8 1층\n서울대입구역 2번 출구에서 26m"));

            models.add(new ViewPager_Model(R.drawable.tanks_takbokgi, "탱크 떡볶이", "매콤달콤한 국물 떡볶이" +
                    "\n\n서울 강남구 압구정로 150 신운빌딩 1층\n압구정역 5번 출구에서 287m"));
            models.add(new ViewPager_Model(R.drawable.loghouse_dakgalbi, "통나무집 닭갈비", "중소벤쳐기업부 인증 백년가게" +
                    "\n\n강원 춘천시 신북읍 신샘밭로 763"));
            models.add(new ViewPager_Model(R.drawable.premium_sum, "프리미엄 섬", "고급스럽게 식사할 수 있는 프라이빗 가게" +
                    "\n\n서울 관악구 관악로 195 109-110\n서울대입구역 6번 출구에서 181m"));
            models.add(new ViewPager_Model(R.drawable.p_f_changs, "피에프 창", "맛있는 녀석들에도 나온 미국식 중국요리" +
                    "\n\n서울 강남구 여동대로 513 코엑스\n보은사역 7번 출구에서 102m"));

            adapter = new Sunny_Food_ViewPager_Adapter(models,this);

            viewPager = findViewById(R.id.Sunny_food_viewPager);
            viewPager.setAdapter(adapter);
            viewPager.setPadding(50, -15, 50, 0);
    }
}
