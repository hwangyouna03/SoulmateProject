package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {
    EditText search;
    Button btn;
    String data;
    TextView weatherInfo;

    String key="L%2Bm7ze74i5sYkrhcP%2BlwK2ZpbdwQdZ%2FdyP2kiXUqqzBkeXGz78m2UEAayYcamlmomQ%2BKw%2BJ3sVIW9YnQl2f9cg%3D%3D";

    //화면 크기에 따라 일정한 비율로 맞추기 구현해야함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml component 가져오기
        search = findViewById(R.id.search);
        weatherInfo = findViewById(R.id.WeatherInfo);
        btn = findViewById(R.id.btn);

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
    }
    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.btn:
                new Thread(new Runnable() {
                    @Override
                       public void run() {
                        data=getXmlData();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                weatherInfo.setText(data);
                            }
                        });
                    }
                }).start();
                break;
        }
    }

    String getXmlData(){
        StringBuffer buffer=new StringBuffer();
        String str= search.getText().toString();//EditText에 작성된 Text얻어오기
        String location = URLEncoder.encode(str);

        String queryUrl="http://apis.data.go.kr/1360000/VilageFcstMsgService/getLandFcst?" +
                "serviceKey=L%2Bm7ze74i5sYkrhcP%2BlwK2ZpbdwQdZ%2FdyP2kiXUqqzBkeXGz78m2UEAayYcamlmomQ%2BKw%2BJ3sVIW9YnQl2f9cg%3D%3D" +
                "&numOfRows=1&pageNo=1&regId=" + location;
        try{
            URL url= new URL(queryUrl);//문자열로 된 요청 url을 URL 객체로 생성.
            InputStream is= url.openStream(); //url위치로 입력스트림 연결

            XmlPullParserFactory factory= XmlPullParserFactory.newInstance();//xml파싱을 위한
            XmlPullParser xpp= factory.newPullParser();
            xpp.setInput( new InputStreamReader(is, "UTF-8") ); //inputstream 으로부터 xml 입력받기

            String tag;

            xpp.next();
            int eventType= xpp.getEventType();
            while( eventType != XmlPullParser.END_DOCUMENT ){
                switch( eventType ){
                    case XmlPullParser.START_DOCUMENT:
                        buffer.append("파싱 시작...\n\n");
                        break;

                    case XmlPullParser.START_TAG:
                        tag= xpp.getName();//테그 이름 얻어오기

                        if(tag.equals("item")) ;// 첫번째 검색결과
                            else if(tag.equals("regId")){
                                buffer.append("지역 코드: ");
                                if(tag.equals("regId" == "11B10101")) { //이거 현재 안되고 있는 중
                                    buffer.append("서울");
                                }
                            xpp.next();
                            buffer.append(xpp.getText());//읽어와서 문자열버퍼에 추가
                            buffer.append("\n"); //줄바꿈 문자 추가
                            }
                            else if(tag.equals("numEf")){
                                buffer.append("발효 번호: ");
                                xpp.next();
                                buffer.append(xpp.getText());
                                buffer.append("\n");//줄바꿈 문자 추가
                            }
                            else if(tag.equals("announceTime")){
                                buffer.append("발표시간: ");
                                xpp.next();
                                buffer.append(xpp.getText());
                                buffer.append("\n");//줄바꿈 문자 추가
                            }
                            else if(tag.equals("rnSt")){
                                buffer.append("강수 확률: ");
                                xpp.next();
                                buffer.append(xpp.getText());
                                buffer.append("\n");//줄바꿈 문자 추가
                            }
                            else if(tag.equals("rnYn")){
                                buffer.append("강수 형태:");
                                xpp.next();
                                buffer.append(xpp.getText());
                                buffer.append("\n");//줄바꿈 문자 추가
                            }
                            else if(tag.equals("wf")){
                                buffer.append("날씨:");
                                xpp.next();
                                buffer.append(xpp.getText());
                            }
                            break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag= xpp.getName(); //테그 이름 얻어오기

                        if(tag.equals("item")) buffer.append("\n");// 첫번째 검색결과종료..줄바꿈
                        break;
                }

                eventType= xpp.next();
            }

        } catch (Exception e){
                e.printStackTrace();
        }

        buffer.append("파싱 끝\n");
        return buffer.toString();//StringBuffer 문자열 객체 반환

    }//getXmlData method....
}









