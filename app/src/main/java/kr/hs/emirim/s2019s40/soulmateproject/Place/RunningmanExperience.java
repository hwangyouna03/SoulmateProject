package kr.hs.emirim.s2019s40.soulmateproject.Place;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import kr.hs.emirim.s2019s40.soulmateproject.R;

public class RunningmanExperience extends AppCompatActivity implements Button.OnClickListener{
    LinearLayout starReview, blogReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runningman_experience);

        Button btn = findViewById(R.id.art_village_ticket);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setTitle("예매").setMessage("이 장소는 현장 결제만 가능므로 예매를 할 수 없습니다." +
                        "죄송합니다 :-(");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
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