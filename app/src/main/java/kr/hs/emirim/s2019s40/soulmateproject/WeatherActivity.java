package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;

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

public class WeatherActivity extends AppCompatActivity {
    EditText search;
    Button searchbtn;
    String data;
    TextView weatherInfo;

    String key = "L%2Bm7ze74i5sYkrhcP%2BlwK2ZpbdwQdZ%2FdyP2kiXUqqzBkeXGz78m2UEAayYcamlmomQ%2BKw%2BJ3sVIW9YnQl2f9cg%3D%3D";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        //xml component 가져오기
        search = findViewById(R.id.search);
        weatherInfo = findViewById(R.id.weatherInfo);
        searchbtn = findViewById(R.id.searchbtn);


    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.searchbtn:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        data = getXmlData();
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
        String location = URLEncoder.encode(str); //지역 검색을 위한 변수를 한글을 인식하도록 utf-8 방식으로 encoding


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
                            xpp.next();
                            buffer.append(xpp.getText());
                            buffer.append("\n");//줄바꿈 문자 추가
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
                        else if(tag.equals("ta")){
                            buffer.append("최저 기온: ");
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
                            if("rnYn" == "0"){
                                buffer.append("강수 없음");
                            }
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
        //파싱 끝
        buffer.append("**** 날씨 형태 ****\n" +
                "(0-강수 없음 / 1- 비 / 2- 비/눈 / 3- 눈 / 4- 소나기)");
        return buffer.toString();//StringBuffer 문자열 객체 반환

    }//getXmlData method....
}

