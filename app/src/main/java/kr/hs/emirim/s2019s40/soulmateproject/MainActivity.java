package kr.hs.emirim.s2019s40.soulmateproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : start login

            }
        });
        signup.setOnClickListener(new Button.OnClickListener() {
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
