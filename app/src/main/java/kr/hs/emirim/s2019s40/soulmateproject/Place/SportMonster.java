package kr.hs.emirim.s2019s40.soulmateproject.Place;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import kr.hs.emirim.s2019s40.soulmateproject.R;

public class SportMonster extends AppCompatActivity implements Button.OnClickListener{
    LinearLayout starReview, blogReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_monster);

        Button btn = findViewById(R.id.gun_shot_ticket);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.booking.naver.com/booking/5/bizes/27240/items/3645618?area=ple&theme=place"));
                //주소 바꿔야 함
                startActivity(intent);
            }
        });

        this.InitializeView();
    }

    public void InitializeView()
    {
        starReview = (LinearLayout)findViewById(R.id.starView);
        blogReview = (LinearLayout)findViewById(R.id.blogView);

        starReview.setVisibility(View.VISIBLE);
        blogReview.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        starReview.setVisibility(View.VISIBLE);
        blogReview.setVisibility(View.INVISIBLE);

        switch (view.getId()) {
            case R.id.starViewbtn:
                starReview.setVisibility(View.VISIBLE);
                blogReview.setVisibility(View.INVISIBLE);
                break;
            case R.id.blogViewbtn:
                blogReview.setVisibility(View.VISIBLE);
                starReview.setVisibility(View.INVISIBLE);
                break;
        }
    }
}