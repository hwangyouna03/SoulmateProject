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
    /*//xml component 선언
    Button loginbtn;
    TextView login_ID;
    EditText login_PW;
    private FirebaseAuth firebaseAuth;

    //DatabaseReference 가져오기 -> 데이터 읽고 쓰기
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        //xml레이아웃에 설정된 뷰들을 가져옴
        login_ID = findViewById(R.id.login_ID);
        login_PW = findViewById(R.id.login_PW);
        loginbtn = (Button) findViewById(R.id.login_finish);



    }


    //로그인 버튼 확인 여부
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
                Toast.makeText(getApplicationContext(), "로그인 되었습니다",
                        Toast.LENGTH_SHORT).show();

                //사용자 정보 액세스
                //사용자가 성공적으로 로그인되면 getCurrentUser 메서드를 이용하여 사용자의 계정 테이터를 가져옴
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String name = user.getDisplayName();
                    String semail = user.getEmail();
                    Uri PhotoUrl = user.getPhotoUrl();

                    boolean emailVerified = user.isEmailVerified();

                    String uid = user.getUid();
                }
            }


        });
        myAlertBuilder.setNegativeButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Cancle 버튼을 눌렸을 경우
                Toast.makeText(getApplicationContext(), "로그인 입력이 취소되었습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Alert를 생성해주고 보여주는 메소드(show를 선언해야 Alert가 생성됨)
        myAlertBuilder.show();
    }


    @Override
    public void onStart() {
        super.onStart();

        //기존 사용자 정보로 로그인
        String email = login_ID.getText().toString().trim();
        String password = login_PW.getText().toString().trim();
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Log.d(TAG, "로그인 성공");
                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    // If sign in fails, display a message to the user.
                    //Log.w(TAG, "로그인 실패", task.getException());
                    Toast.makeText(Login.this, "로그인 오류.",
                            Toast.LENGTH_SHORT).show();
                    updateUI(null);

                }

            }

            private void updateUI(FirebaseUser user) {
            }

        });

    }

}*/
    Button loginbtn;
    TextView login_ID;
    EditText login_PW;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        //버튼 등록하기
        loginbtn = findViewById(R.id.login_finish);
        login_ID = findViewById(R.id.login_ID);
        login_PW = findViewById(R.id.login_PW);


        //로그인 버튼이 눌리면
        loginbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String email = login_ID.getText().toString().trim();
                String pwd = login_PW.getText().toString().trim();
                firebaseAuth.signInWithEmailAndPassword(email,pwd)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Intent intent = new Intent(Login.this, MainActivity.class);
                                    startActivity(intent);

                                }else{
                                    Toast.makeText(Login.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
    }
}





