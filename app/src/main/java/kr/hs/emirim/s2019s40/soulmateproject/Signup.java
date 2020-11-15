package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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
    EditText sPassword, sEmail, sName;
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
//    private void overlap(){
//        Button check = (Button) findViewById(R.id.check) ;
//        check.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//                if (user != null) {
//                    String name = user.getDisplayName();
//                    String email = user.getEmail();
//
//                    boolean emailVerified = user.isEmailVerified();
//
//                    String uid = user.getUid();
//                    Toast.makeText(getApplicationContext(), "가입되어있는 이메일주소입니다.",
//                            Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//    }

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
                            Toast.makeText(getApplicationContext(), "회원가입되었습니다.",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            //성공
                        } else {
                            if(task.getException() != null){
                                Toast.makeText(Signup.this, "회원가입 양식을 다 작성하였는지 확인해주십시오.",
                                        Toast.LENGTH_SHORT).show();
                                //실패
                            }

                        }

                        // ...
                    }
                });
    }

}

