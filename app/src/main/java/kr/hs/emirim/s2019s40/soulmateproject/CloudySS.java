package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;



public class CloudySS extends AppCompatActivity {
    ViewPager top_viewPager, one_piece_viewPager, pants_viewPager;

    CloudySSTopAdapter top_adapter;
    CloudySSOnePieceAdapter one_piece_adapter;
    CloudySSPantsAdapter pants_adapter;

    List<DressViewPager_Model> top_models, one_piece_models, pants_models;

    LinearLayout top, one_piece, pants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloudy_s_s);

        top = findViewById(R.id.CSS_topLayout);
        one_piece = findViewById(R.id.CSS_one_pieceLayout);
        pants = findViewById(R.id.CSS_pantsLayout);

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
        top_models.add(new DressViewPager_Model(R.drawable.urban_ulspan_paulr, "어반 울스 판 폴라티"));
        top_models.add(new DressViewPager_Model(R.drawable.loosefit_shortsleeve, "루즈 핏 반팔"));
        top_models.add(new DressViewPager_Model(R.drawable.loosefit_onepiece1, "루즈핏 멜로디 셔츠"));
        top_models.add(new DressViewPager_Model(R.drawable.frill_onepiece, "프릴 주름롱"));
        top_models.add(new DressViewPager_Model(R.drawable.pocket_boxy, "포켓박시반팔"));
        top_models.add(new DressViewPager_Model(R.drawable.zipup_crop1, "매드 크롭후드 집업"));

        top_adapter = new CloudySSTopAdapter(top_models,this);

        top_viewPager = findViewById(R.id.CSS_topViewPager);
        top_viewPager.setAdapter(top_adapter);
        top_viewPager.setPadding(50, -15, 50, 0);
        //shirt 끝

        one_piece_models = new ArrayList<>();
        one_piece_models.add(new DressViewPager_Model(R.drawable.simple_longsleeve, "심플 긴팔 트레이닝"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.peach_pang, "피치 팡팡 반팔 트레이닝"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.peoples, "피플즈 투피스세트"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.comfor, "후리스 후드 점퍼"));


        one_piece_adapter = new CloudySSOnePieceAdapter(one_piece_models,this);

        one_piece_viewPager = findViewById(R.id.CSS_one_pieceViewPager);
        one_piece_viewPager.setAdapter(one_piece_adapter);
        one_piece_viewPager.setPadding(50, -15, 50, 0);
        //onepiece끝

        pants_models = new ArrayList<>();
        pants_models.add(new DressViewPager_Model(R.drawable.wide_pants1, "와이드 팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.thin_pants, "얇은 코튼 5부"));
        pants_models.add(new DressViewPager_Model(R.drawable.pintuck, "핀턱 와이드 5부"));
        pants_models.add(new DressViewPager_Model(R.drawable.hurmming, "허밍 린넨 4부 팬츠"));

        pants_adapter = new CloudySSPantsAdapter(pants_models,this);

        pants_viewPager = findViewById(R.id.CSS_pantsViewPager);
        pants_viewPager.setAdapter(pants_adapter);
        pants_viewPager.setPadding(50, -15, 50, 0);
        //pants끝
    }
}