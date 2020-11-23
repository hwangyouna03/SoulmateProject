package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText search;
    Button weatherbtn;
    String data;
    TextView weatherInfo;


    //화면 크기에 따라 일정한 비율로 맞추기 구현해야함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Sunny로 이동
        Button sunny = (Button) findViewById(R.id.SunnyActivity);
        sunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sunny.class);
                startActivity(intent);
            }
        });
        //Cloudy로 이동
        Button cloudy = (Button) findViewById(R.id.CloudyActivity);
        cloudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cloudy.class);
                startActivity(intent);
            }
        });
        //RainandSnow로 이동
        Button rain_and_snow = (Button) findViewById(R.id.Rain_and_Snow_Activity);
        rain_and_snow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Rain_and_Snow.class);
                startActivity(intent);
            }
        });

        //회원가입으로 이동
        Button signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : start Signup

            }

        });
        signup.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Signup.class);

                startActivity(intent);
            }
        });

        //로그인으로 이동
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : start Login

            }

        });
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);

                startActivity(intent);
            }

        });
        //날씨 검색으로 이동
        Button weatherbtn = (Button) findViewById(R.id.weatherbtn);
        weatherbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : start WeatherActivity

            }

        });
        weatherbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);

                startActivity(intent);
            }

        });
    }


}










