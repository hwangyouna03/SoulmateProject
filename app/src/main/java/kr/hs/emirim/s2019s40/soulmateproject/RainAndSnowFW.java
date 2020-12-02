package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;



public class RainAndSnowFW extends AppCompatActivity {
    ViewPager top_viewPager, one_piece_viewPager, pants_viewPager;

    RainAndSnowFWTopAdapter top_adapter;
    RainAndSnowFWOnePieceAdapter one_piece_adapter;
    RainAndSnowFWPantsAdapter pants_adapter;

    List<DressViewPager_Model> top_models, one_piece_models, pants_models;

    LinearLayout top, one_piece, pants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow_f_w);

        top = findViewById(R.id.RSFW_topLayout);
        one_piece = findViewById(R.id.RSFW_one_pieceLayout);
        pants = findViewById(R.id.RSFW_pantsLayout);

        top.setVisibility(View.VISIBLE);
        one_piece.setVisibility(View.INVISIBLE);
        pants.setVisibility(View.INVISIBLE);

        Button btn1 = findViewById(R.id.top);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                top.setVisibility(View.VISIBLE);
                one_piece.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
            }
        });
        Button btn2 = findViewById(R.id.one_piece);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one_piece.setVisibility(View.VISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
            }
        });
        Button btn3 = findViewById(R.id.pants);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pants.setVisibility(View.VISIBLE);
                one_piece.setVisibility(View.INVISIBLE);
                top.setVisibility(View.INVISIBLE);
            }
        });
        top_models = new ArrayList<>();
        top_models.add(new DressViewPager_Model(R.drawable.overfluff, "오버핏 피치 기모 티셔츠"));
        top_models.add(new DressViewPager_Model(R.drawable.sheep_gimo, "무한 매력의 양기모"));
        top_models.add(new DressViewPager_Model(R.drawable.gimo_v, "기모 브이 퍼프 긴팔"));
        top_models.add(new DressViewPager_Model(R.drawable.autumnsheep1, "어텀 양 기모 루즈핏 긴팔"));
        top_models.add(new DressViewPager_Model(R.drawable.lam_wools, "램스 울스 꽈베기 니트 가다건"));
        top_models.add(new DressViewPager_Model(R.drawable.mohe, "모헤어헤짐 니트 가디건"));
        top_models.add(new DressViewPager_Model(R.drawable.bigtwist, "빅 꽈베기 가오리 오픈 가디건"));

        top_adapter = new RainAndSnowFWTopAdapter(top_models,this);

        top_viewPager = findViewById(R.id.RSFW_topViewPager);
        top_viewPager.setAdapter(top_adapter);
        top_viewPager.setPadding(50, -15, 50, 0);
        //shirt 끝

        one_piece_models = new ArrayList<>();
        one_piece_models.add(new DressViewPager_Model(R.drawable.im_bear, "아임 베어 기모 트레이닝"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.peoples, "피플즈 투피스세트"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.comfor, "후리스 후드 점퍼"));

        one_piece_adapter = new RainAndSnowFWOnePieceAdapter(one_piece_models,this);

        one_piece_viewPager = findViewById(R.id.RSFW_one_pieceViewPager);
        one_piece_viewPager.setAdapter(one_piece_adapter);
        one_piece_viewPager.setPadding(50, -15, 50, 0);
        //onepiece끝

        pants_models = new ArrayList<>();
        pants_models.add(new DressViewPager_Model(R.drawable.slim_bootscut1, "기모 밴드 슬림 부츠컷"));
        pants_models.add(new DressViewPager_Model(R.drawable.pintuck, "모직 핀턱 기모 와이드 슬랙스"));
        pants_models.add(new DressViewPager_Model(R.drawable.check_wide1, "도톰 체크 모직 와이드 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.exhaust_pants1, "탄탄핏 코튼 기모 배기 팬츠"));

        pants_adapter = new RainAndSnowFWPantsAdapter(pants_models,this);

        pants_viewPager = findViewById(R.id.RSFW_pantsViewPager);
        pants_viewPager.setAdapter(pants_adapter);
        pants_viewPager.setPadding(50, -15, 50, 0);
        //pants끝
    }
}