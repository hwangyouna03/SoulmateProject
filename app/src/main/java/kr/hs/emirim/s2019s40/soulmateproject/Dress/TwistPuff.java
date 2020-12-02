package kr.hs.emirim.s2019s40.soulmateproject.Dress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import kr.hs.emirim.s2019s40.soulmateproject.DressCodiAdapter;
import kr.hs.emirim.s2019s40.soulmateproject.DressCodiModel;
import kr.hs.emirim.s2019s40.soulmateproject.R;
import kr.hs.emirim.s2019s40.soulmateproject.ViewPager_Model;

public class TwistPuff extends AppCompatActivity{
    private ViewPager viewPager, anotherViewPager;
    private DressCodiAdapter pagerAdapter;

    private List<ViewPager_Model> another_models;
    private List<DressCodiModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twist_puff);

        Button btn = findViewById(R.id.webSite);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://url.kr/P2ehkn"));
                startActivity(intent);
            }
        });

        models = new ArrayList<>();
        models.add(new DressCodiModel(R.drawable.twist_puff1));
        models.add(new DressCodiModel(R.drawable.twist_puff2));
        models.add(new DressCodiModel(R.drawable.twist_puff3));

        viewPager = findViewById(R.id.viewPager);
        pagerAdapter = new DressCodiAdapter(models,this);
        viewPager.setAdapter(pagerAdapter);


    }
}