package kr.hs.emirim.s2019s40.soulmateproject.Place;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;

import kr.hs.emirim.s2019s40.soulmateproject.R;

public class VauncePark extends AppCompatActivity implements OnMapReadyCallback {
    MapView mapView;
    static NaverMap naverMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaunce_park);

        Button btn = findViewById(R.id.vaunce_ticket);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.booking.naver.com/booking/5/bizes/263799/items/3668406?area=ple&theme=place"));
                startActivity(intent);
            }
        });
        Button btn1 = findViewById(R.id.vaunce_map);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1664062070?c=14142923.5871498,4509832.4419681,13,0,0,0,dh"));
                startActivity(intent);
            }
        });

        Button blog1 = findViewById(R.id.blog1);
        blog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/dongjin398/222138380117"));
                startActivity(intent);
            }
        });
        Button blog2 = findViewById(R.id.blog2);
        blog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/rubyjuju0620/221781749691"));
                startActivity(intent);
            }
        });
        Button blog3 = findViewById(R.id.blog3);
        blog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/so6198/221946086119"));
                startActivity(intent);
            }
        });
        Button blog4 = findViewById(R.id.blog4);
        blog4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/bllong2/221453911975"));
                startActivity(intent);
            }
        });
        Button blog5 = findViewById(R.id.blog5);
        blog5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cafe.naver.com/jangsatong/4016"));
                startActivity(intent);
            }
        });

        mapView = (MapView) findViewById(R.id.maps);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        this.naverMap = naverMap;

        CameraPosition cameraPosition = new CameraPosition(
                new LatLng(37.5,127.06),
                10
        );
        naverMap.setCameraPosition(cameraPosition);
    }
    @Override
    public void onStart()
    {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause()
    {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop()
    {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory()
    {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}