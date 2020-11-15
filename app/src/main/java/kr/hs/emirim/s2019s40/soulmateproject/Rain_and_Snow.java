package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rain_and_Snow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain_and_snow);

            Button place = (Button) findViewById(R.id.Place);
            place .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Rain_and_Snow_Place.class);
                    startActivity(intent);
                }
            });
            Button food = (Button) findViewById(R.id.Food);
            food.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Rain_and_Snow_Food.class);
                    startActivity(intent);
                }
            });
            Button dress = (Button) findViewById(R.id.Dress);
            dress.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Rain_and_Snow_Dress.class);
                    startActivity(intent);
                }
            });
    }
}