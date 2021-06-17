package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText UserName;
    private EditText Email;
    private EditText Password;
    private EditText ConfirmPassword;
    private TextView register;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView btn = findViewById(R.id.alreadyHaveAccount);
        UserName = findViewById(R.id.inputUserName);
        Email = findViewById(R.id.inputEmail);
        Password = findViewById(R.id.inputPassword);
        ConfirmPassword = findViewById(R.id.inputConfirmPassword);
        register = findViewById(R.id.logo);
        btnRegister = findViewById(R.id.btnRegister);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
            }
        });
    }
}