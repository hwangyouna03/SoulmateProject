package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;



public class SunnyFW extends AppCompatActivity {
    ViewPager top_viewPager, one_piece_viewPager, pants_viewPager;

    SunnyFWTopAdapter top_adapter;
    SunnyFWOnePieceAdapter one_piece_adapter;
    SunnyFWPantsAdapter pants_adapter;

    List<DressViewPager_Model> top_models, one_piece_models, pants_models;

    LinearLayout top, one_piece, pants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunny_f_w);

        top = findViewById(R.id.SFW_topLayout);
        one_piece = findViewById(R.id.SFW_one_pieceLayout);
        pants = findViewById(R.id.SFW_pantsLayout);

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
        top_models.add(new DressViewPager_Model(R.drawable.box_sleeve1, "박스 슬라이브티"));
        top_models.add(new DressViewPager_Model(R.drawable.date_box1, "데이트 박스티"));
        top_models.add(new DressViewPager_Model(R.drawable.seminack, "세미넥 니트 가디건"));
        top_models.add(new DressViewPager_Model(R.drawable.rollring, "롤링 루즈 슬릿 니트 가디건"));
        top_models.add(new DressViewPager_Model(R.drawable.ridot_dangara1, "라잇단가라티"));


        top_adapter = new SunnyFWTopAdapter(top_models,this);

        top_viewPager = findViewById(R.id.SFW_topViewPager);
        top_viewPager.setAdapter(top_adapter);
        top_viewPager.setPadding(50, -15, 50, 0);
        //shirt 끝

        one_piece_models = new ArrayList<>();
        one_piece_models.add(new DressViewPager_Model(R.drawable.fluff_mantoman_onepiece1, "퍼프기모 맨투맨 롱 원피스"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.fluff_hode_onepiece1, "벨라 퍼프 기모 후드 원피스"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.cable_cara_onepiece, "케이브 카라 니트롱"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.im_bear, "아임 베어 기모 트레이닝"));

        one_piece_adapter = new SunnyFWOnePieceAdapter(one_piece_models,this);

        one_piece_viewPager = findViewById(R.id.SFW_one_pieceViewPager);
        one_piece_viewPager.setAdapter(one_piece_adapter);
        one_piece_viewPager.setPadding(50, -15, 50, 0);
        //onepiece끝

        pants_models = new ArrayList<>();
        pants_models.add(new DressViewPager_Model(R.drawable.exhaust_pants1, "탄탄핏 코튼 기모 배기 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.popori, "포포리 트레이닝 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.abo, "아보"));
        pants_models.add(new DressViewPager_Model(R.drawable.wakeu, "와크 코듀로이 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.check_wide1, "도톰 체크 모직 와이드 팬츠"));

        pants_adapter = new SunnyFWPantsAdapter(pants_models,this);

        pants_viewPager = findViewById(R.id.SFW_pantsViewPager);
        pants_viewPager.setAdapter(pants_adapter);
        pants_viewPager.setPadding(50, -15, 50, 0);
        //pants끝
    }
}