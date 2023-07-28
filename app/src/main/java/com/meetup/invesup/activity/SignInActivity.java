package com.meetup.invesup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.meetup.invesup.R;
/**
 * Created by Nikhil Gardi on 27/06/2023
 */
public class SignInActivity extends AppCompatActivity {
    private EditText userNameEdt, passwordEdt;
    private TextView signUpText;
    private ImageView signInBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        userNameEdt = findViewById(R.id.idEdtUserName);
        passwordEdt = findViewById(R.id.idEdtPassword);
        signUpText = findViewById(R.id.idTextSignUp);
        signInBtn = findViewById(R.id.idBtnSignIn);

        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameEdt.getText().toString();
                String password = passwordEdt.getText().toString();

                // checking if the entered text is empty or not.
               /* if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(password)) {
                Toast.makeText(SignInActivity.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // calling a method to register a user.
                    registerUser(userName, password);
                }*/

                registerUser(userName, password);


            }
        });


    }

    public void registerUser(String userName,String password)
    {
        Intent i=new Intent(SignInActivity.this,DashBoardActivity.class);
        startActivity(i);
    }
}