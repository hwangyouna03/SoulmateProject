package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Cloudy_Dress extends AppCompatActivity {

    ViewPager viewPager;
    Cloudy_Dress_ViewPager_Adapter adapter;
    List<ViewPager_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloudy_dress);

        models = new ArrayList<>();
        models.add(new ViewPager_Model(R.drawable.helpforme, "목적지", "어디로 여행을 갈지 골라보자"));
        models.add(new ViewPager_Model(R.drawable.helpforme, "숙소", "근처 숙소들을 찾아보고 숙소 가격을 알아보자"));
        models.add(new ViewPager_Model(R.drawable.helpforme, "장보기", "무엇을 사고 대충 비용이 얼마나 드는지 알아보자"));
        models.add(new ViewPager_Model(R.drawable.helpforme, "이동수단", "어떤 이동수단을 사용하고 비용이 얼마나 드는지 알아보자"));

        adapter = new Cloudy_Dress_ViewPager_Adapter(models,this);

        viewPager = findViewById(R.id.Cloudy_dress_viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, -25, 50, 0);
    }
}