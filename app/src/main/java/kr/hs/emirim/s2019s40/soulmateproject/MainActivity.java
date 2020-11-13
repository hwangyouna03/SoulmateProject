package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    //화면 크기에 따라 일정한 비율로 맞추기 구현해야함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}

             //firebaseAuth.signInWithEmailAndPassword(ID, PW)
                     //.addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>()){
                    //public void onComplete(@NonNull Task<AuthResult> task) {
                        //if(task.isSuccessful()){
                            //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            //startActivity(intent);

                        //}else{
                            //Toast.makeText(MainActivity.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                       // }
                    //}
               // });
                //}
