package kr.hs.emirim.s2019s40.soulmateproject.Place;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import kr.hs.emirim.s2019s40.soulmateproject.R;

public class FlyingGyeonju extends AppCompatActivity implements Button.OnClickListener{
    LinearLayout starReview, blogReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flying_gyeonju);

        Button btn = findViewById(R.id.flying_qyeogonju_ticket);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setTitle("예매").setMessage("예매 사이트를 찾을 수 없습니다." +
                        "죄송합니다 :-(");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        this.InitializeView();
    }

    public void InitializeView()
    {
        starReview = findViewById(R.id.starView);
        blogReview = findViewById(R.id.blogView);

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