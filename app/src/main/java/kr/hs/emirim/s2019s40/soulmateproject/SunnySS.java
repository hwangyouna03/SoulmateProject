package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class SunnySS extends AppCompatActivity {
    ViewPager top_viewPager, one_piece_viewPager, pants_viewPager;

    SunnySSTopAdapter top_adapter;
    SunnySSOnePieceAdapter one_piece_adapter;
    SunnySSPantsAdapter pants_adapter;

    List<DressViewPager_Model> top_models, one_piece_models, pants_models;

    LinearLayout top, one_piece, pants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunny_s_s);

        top = findViewById(R.id.SSS_topLayout);
        one_piece = findViewById(R.id.SSS_one_pieceLayout);
        pants = findViewById(R.id.SSS_pantsLayout);

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
        top_models.add(new DressViewPager_Model(R.drawable.four_season_short_top, "포 시즌 루즈반팔티"));
        top_models.add(new DressViewPager_Model(R.drawable.if_you_can_see, "보일 듯 말듯 반팔티"));
        top_models.add(new DressViewPager_Model(R.drawable.over_fit_shortsleeve, "오버핏 반팔"));
        top_models.add(new DressViewPager_Model(R.drawable.dot, "도트패턴로브롱가디건"));

        top_adapter = new SunnySSTopAdapter(top_models,this);

        top_viewPager = findViewById(R.id.SSS_topViewPager);
        top_viewPager.setAdapter(top_adapter);
        top_viewPager.setPadding(50, -15, 50, 0);
        //shirt 끝

        one_piece_models = new ArrayList<>();
        one_piece_models.add(new DressViewPager_Model(R.drawable.loose_binding, "루즈 바인딩 반팔 롱 원피스"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.loosefit_onepiece1, "루즈 핏 멜로디 셔츠"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.frill_onepiece, "프릴 주름 롱"));
        one_piece_models.add(new DressViewPager_Model(R.drawable.flowerbeach, "플라워비치로브롱원피스"));

        one_piece_adapter = new SunnySSOnePieceAdapter(one_piece_models,this);

        one_piece_viewPager = findViewById(R.id.SSS_one_pieceViewPager);
        one_piece_viewPager.setAdapter(one_piece_adapter);
        one_piece_viewPager.setPadding(50, -15, 50, 0);
        //onepiece끝

        pants_models = new ArrayList<>();
        pants_models.add(new DressViewPager_Model(R.drawable.pig_munt, "피그먼트 에이숏트"));
        pants_models.add(new DressViewPager_Model(R.drawable.half_washing, "하프워싱 숏팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.right_lab, "라이트랩 커트팬츠"));
        pants_models.add(new DressViewPager_Model(R.drawable.skirt_pants, "스판린넨랩 치마 바지"));
        pants_models.add(new DressViewPager_Model(R.drawable.dorin, "도린 핀턱 쇼츠"));

        pants_adapter = new SunnySSPantsAdapter(pants_models,this);

        pants_viewPager = findViewById(R.id.SSS_pantsViewPager);
        pants_viewPager.setAdapter(pants_adapter);
        pants_viewPager.setPadding(50, -15, 50, 0);
        //pants끝
    }
}