package com.nrc7.desafiologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.nrc7.desafiologin.login.LoginCallback;
import com.nrc7.desafiologin.login.LoginEvaluator;
import com.nrc7.desafiologin.utils.Utilities;

public class MainActivity extends AppCompatActivity implements LoginCallback {

    private ImageView loginPhoto;
    private EditText userNameEt, passwordEt;
    private Button loginBtn, registerBtn;
    private Utilities utilities = new Utilities();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPhoto = findViewById(R.id.imageView);
        userNameEt = findViewById(R.id.userEditText);
        passwordEt = findViewById(R.id.passEditText);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);

        // Init login logo from Utilities.class
        utilities.initLogo(loginPhoto, Utilities.getLogoUrl());

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LoginEvaluator(MainActivity.this).loginEvaluation(Utilities.getUserPass());
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void isLogged() {
        Toast.makeText(this, "LOGIN EXITOSO!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void notLogged() {
        Toast.makeText(this, "DATOS INCORRECTOS!!", Toast.LENGTH_SHORT).show();
    }
}

