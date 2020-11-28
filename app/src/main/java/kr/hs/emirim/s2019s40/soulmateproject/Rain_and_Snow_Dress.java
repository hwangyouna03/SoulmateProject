package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Rain_and_Snow_Dress extends AppCompatActivity {

    ViewPager viewPager;
    Rain_and_Snow_Dress_ViewPager_Adapter adapter;
    List<ViewPager_Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow__dress);

        models = new ArrayList<>();
        models.add(new ViewPager_Model(R.drawable.spring, "S/S", "산뜻한 봄과 더운 여름에 어울리는 예쁜 옷"));
        models.add(new ViewPager_Model(R.drawable.fall, "F/W", "선선한 가을과 추운 겨울에 어울리는 멋진 옷"));

        adapter = new Rain_and_Snow_Dress_ViewPager_Adapter(models,this);

        viewPager = findViewById(R.id.Rain_and_Snow_dress_viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(50, -25, 50, 0);
    }
}