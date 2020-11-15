package kr.hs.emirim.s2019s40.soulmateproject.Food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.hs.emirim.s2019s40.soulmateproject.R;

public class TwoDotsBakery extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dots_bakery);

        Button map = (Button) findViewById(R.id.two_dots_bakery_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.me/G0C8OCMO"));
                startActivity(intent);
            }
        });


//        Button blog_link1 = (Button) findViewById(R.id.sillmcafe);
//        blog_link1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/thdud0156/222105896079"));
//                startActivity(intent);
//            }
//        });
    }
}