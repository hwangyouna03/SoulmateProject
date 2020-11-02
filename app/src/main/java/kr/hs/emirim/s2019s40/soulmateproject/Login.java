package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private Button loginbtn;
    TextView tid;
    EditText tpass;
    private FirebaseAuth firebaseAuth;

    //DatabaseReference 가져오기 -> 데이터 읽고 쓰기
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        //버튼 등록하기
        tid = findViewById(R.id.id);
        tpass = findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.login_finish);

        //로그인 버튼을 누르면
        loginbtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // 버튼 누르면 수행 할 명령
                String ID = tid.getText().toString().trim();
                String PW = tpass.getText().toString().trim();
            }
        });
    }
    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder =
                new AlertDialog.Builder(Login.this);
        // alert의 title과 Messege 세팅
        myAlertBuilder.setTitle("Login");
        myAlertBuilder.setMessage("로그인을 하시겠습니까?");
        // 버튼 추가 (Ok 버튼과 Cancle 버튼 )
        myAlertBuilder.setPositiveButton("아니요", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // OK 버튼을 눌렸을 경우
                Toast.makeText(getApplicationContext(), "로그인 입력이 취소되었습니다",
                        Toast.LENGTH_SHORT).show();

            }
        });
        myAlertBuilder.setNegativeButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Cancle 버튼을 눌렸을 경우
                Toast.makeText(getApplicationContext(),"로그인 되었습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Alert를 생성해주고 보여주는 메소드(show를 선언해야 Alert가 생성됨)
        myAlertBuilder.show();
    }

}