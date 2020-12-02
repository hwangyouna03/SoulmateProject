package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


import kr.hs.emirim.s2019s40.soulmateproject.DressViewPager_Model;
import kr.hs.emirim.s2019s40.soulmateproject.R;
import kr.hs.emirim.s2019s40.soulmateproject.RainAndSnowSSOnePieceAdapter;
import kr.hs.emirim.s2019s40.soulmateproject.RainAndSnowSSPantsAdapter;
import kr.hs.emirim.s2019s40.soulmateproject.RainAndSnowSSTopAdapter;


public class RainAndSnowSS extends AppCompatActivity {
    ViewPager top_viewPager, one_piece_viewPager, pants_viewPager;

    RainAndSnowSSTopAdapter top_adapter;
    RainAndSnowSSOnePieceAdapter one_piece_adapter;
    RainAndSnowSSPantsAdapter pants_adapter;

    List<DressViewPager_Model> top_models, one_piece_models, pants_models;

    LinearLayout top, one_piece, pants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow_s_s);

        top = findViewById(R.id.RSSS_topLayout);
        one_piece = findViewById(R.id.RSSS_one_pieceLayout);
        pants = findViewById(R.id.RSSS_pantsLayout);

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
        top_models.add(new DressViewPager_Model(R.drawable.loosefit_shortsleeve, "루즈 핏 반팔"));
        top_models.add(new DressViewPager_Model(R.drawable.over_fit_shortsleeve, "오버핏 반팔"));
        top_models.add(new DressViewPager_Model(R.drawable.seminack, "세미넥 니트 가디건"));
        top_models.add(new DressViewPager_Model(R.drawable.pastel, "파스텔 라운드 니트 가디건"));
        top_models.add(new DressViewPager_Model(R.drawable.colour, "소매 와이드 배색 오픈 가디건"));

        top_adapter = new RainAndSnowSSTopAdapter(top_models,this);

        top_viewPager = findViewById(R.id.RSSS_topViewPager);
        top_viewPager.setAdapter(top_adapter);
        top_viewPager.setPadding(50, -15, 50, 0);
        //shirt 끝

        one_piece_models = new ArrayList<>();
        one_piece_models.add(new DressViewPager_Model(R.drawable.simple_longsleeve, "심플 긴팔 트레이닝"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.peach_pang, "피치 팡팡 반팔 트레이닝"));

        one_piece_adapter = new RainAndSnowSSOnePieceAdapter(one_piece_models,this);

        one_piece_viewPager = findViewById(R.id.RSSS_one_pieceViewPager);
        one_piece_viewPager.setAdapter(one_piece_adapter);
        one_piece_viewPager.setPadding(50, -15, 50, 0);
        //onepiece끝

        pants_models = new ArrayList<>();
        pants_models.add(new DressViewPager_Model(R.drawable.easy_half, "이지 하프 데님"));
        pants_models.add(new DressViewPager_Model(R.drawable.bermuda, "핀턱 버뮤다 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.thin_pants, "얇은 코튼 5부"));
        pants_models.add(new DressViewPager_Model(R.drawable.skirt_pants, "스판 린넨랩 치마바지"));

        pants_adapter = new RainAndSnowSSPantsAdapter(pants_models,this);

        pants_viewPager = findViewById(R.id.RSSS_pantsViewPager);
        pants_viewPager.setAdapter(pants_adapter);
        pants_viewPager.setPadding(50, -15, 50, 0);
        //pants끝
    }
}