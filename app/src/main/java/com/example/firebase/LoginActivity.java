package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.PrimitiveIterator;

public class LoginActivity extends AppCompatActivity {
    private TextView login;
    private EditText Email;
    private EditText Password;
    private TextView forgotPassword;
    private Button btnlogin;
    private TextView textViewSignUp;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.textViewSignUp);
        login = findViewById(R.id.logo);
        Email = findViewById(R.id.inputEmail);
        Password = findViewById(R.id.inputEmail);
        forgotPassword = findViewById(R.id.forgotPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this , RegisterActivity.class));
            }
        });
    }
}