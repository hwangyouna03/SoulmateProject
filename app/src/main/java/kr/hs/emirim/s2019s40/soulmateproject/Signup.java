package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder =
                new AlertDialog.Builder(Signup.this);
        // alert의 title과 Messege 세팅
        myAlertBuilder.setTitle("Signup");
        myAlertBuilder.setMessage("회원가입을 하시겠습니까?");
        // 버튼 추가 (Ok 버튼과 Cancle 버튼 )
        myAlertBuilder.setPositiveButton("아니요", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // OK 버튼을 눌렸을 경우
                Toast.makeText(getApplicationContext(), "회원가입 입력이 취소되었습니다",
                        Toast.LENGTH_SHORT).show();

            }
        });
        myAlertBuilder.setNegativeButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Cancle 버튼을 눌렸을 경우
                Toast.makeText(getApplicationContext(),"완료되었습니다",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Alert를 생성해주고 보여주는 메소드(show를 선언해야 Alert가 생성됨)
        myAlertBuilder.show();
    }
}