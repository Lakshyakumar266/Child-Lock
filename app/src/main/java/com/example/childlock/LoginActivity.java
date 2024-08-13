package com.example.childlock;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

//        Go To Signup Page
        Button goSignUpPage = findViewById(R.id.Go_signUp);
        goSignUpPage.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });

//        Form Handle
        EditText nameInput = findViewById(R.id.email);
        EditText passwordInput = findViewById(R.id.Password);
        CheckBox rememberMe = findViewById(R.id.rememberMe);
        Button forgotPasswordButton = findViewById(R.id.forgotPassword);
        Button loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(view -> {
            String name = nameInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (rememberMe.isChecked()) {System.out.println("handle remember me");}

            if (name.equals("admin") && password.equals("admin")) {
                System.out.println("Login Successful");
            }
        });

        forgotPasswordButton.setOnClickListener(view -> {
            // Handle forgot password
        });

    }
}