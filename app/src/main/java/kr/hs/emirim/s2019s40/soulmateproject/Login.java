package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    Button loginbtn;
    TextView login_ID;
    EditText login_PW;
    private FirebaseAuth firebaseAuth; //파이어베이스 인스턴스 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance(); //파이어베이스 인스턴스 초기화
        //버튼 등록하기
        loginbtn = findViewById(R.id.login_finish);
        login_ID = findViewById(R.id.login_ID);
        login_PW = findViewById(R.id.login_PW);


        //로그인 버튼이 눌리면
        loginbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //signInWithEmailAndPassword 메서드를 이용하여 이메일 주소와 비밀번호를 가져와
                //유효성 검사를 한 후 사용자를 로그인 시킴
                String email = login_ID.getText().toString().trim(); //email, pwd 정보 가져옴
                String pwd = login_PW.getText().toString().trim();
                firebaseAuth.signInWithEmailAndPassword(email,pwd)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){ //성공했을 때 메인으로 이동
                                    Intent intent = new Intent(Login.this, MainActivity.class);
                                    startActivity(intent);

                                }else{ //실패 했을때 오류 출력
                                    Toast.makeText(Login.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
    }
}





