package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

//아직 아이디 중복확인 기능이랑 체크박스 기능 안했음
public class Signup extends AppCompatActivity {
    private static final String TAG = "Signup";
    EditText sPassword, sEmail; //sName, sID,
    Button ok;
    private FirebaseAuth firebaseAuth; //파이어베이스 인스턴스 선언
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        firebaseAuth = FirebaseAuth.getInstance(); //파이어베이스 인스턴스 초기화
        findViewById(R.id.ok).setOnClickListener(onClickListener);

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ok:
                    signup();
                    break;
            }
        }
    };


    private void signup() {
        String email = ((EditText) findViewById(R.id.sEmail)).getText().toString();
        String password = ((EditText) findViewById(R.id.sPassword)).getText().toString();
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            Intent intent = new Intent(Signup.this, MainActivity.class);
                            Toast.makeText(getApplicationContext(), "회원가입 성공",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            //성공
                        } else {
                            if(task.getException() != null){
                                Toast.makeText(Signup.this, "회원가입 실패.",
                                        Toast.LENGTH_SHORT).show();
                                //실패
                            }

                        }

                        // ...
                    }
                });
    }
}

    /*private void updateUI(FirebaseUser currentUser) {
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        updateUI(currentUser);

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "createUserWithEmail:성공");
                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    Log.w(TAG, "creatUserWitheEmail:실패", task.getException());
                    Toast.makeText(Signup.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }
            }
        });
    }
    //아이디 중복 확인
    public void overlap(){

    }

    //회원가입 완료버튼 확인여부
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
    //체크박스 그룹 ChooseWord 메서드*/
