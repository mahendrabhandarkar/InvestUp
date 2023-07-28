package com.meetup.invesup.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.meetup.invesup.MainActivity;
import com.meetup.invesup.R;

/**
 * Created by Nikhil Gardi on 27/06/2023
 */
public class SignUpActivity extends AppCompatActivity {
    private TextView signInText;
    private ImageView signUpBtn;
    private EditText userNameEdt, passwordEdt,passwordConEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signInText = findViewById(R.id.idTextSignIn);
        signUpBtn = findViewById(R.id.idBtnSignUp);
        userNameEdt = findViewById(R.id.idEdtUserName);
        passwordEdt = findViewById(R.id.idEdtPassword);
        passwordConEdt = findViewById(R.id.idEdtConPassword);

        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(i);
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameEdt.getText().toString();
                String password = passwordEdt.getText().toString();
                String conPassword = passwordConEdt.getText().toString();

                // checking if the entered text is empty or not.
                if (TextUtils.isEmpty(userName)) {
                    Toast.makeText(SignUpActivity.this, "Please Enter User Name", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(password)) {
                    Toast.makeText(SignUpActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(conPassword)) {
                    Toast.makeText(SignUpActivity.this, "Please Re Enter Password", Toast.LENGTH_SHORT).show();
                }
                else if (!password.equals(conPassword)) {
                    Toast.makeText(SignUpActivity.this, "Password and Confirm Password Does not Match", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // calling a method to register a user.
                    registerUser(userName, password);
                }


            }


        });


    }

    public void registerUser(String userName,String password)
    {
        Toast.makeText(SignUpActivity.this, "Success", Toast.LENGTH_SHORT).show();
    }
}