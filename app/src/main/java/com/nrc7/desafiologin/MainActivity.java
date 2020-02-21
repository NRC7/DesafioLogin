package com.nrc7.desafiologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView loginPhoto;
    EditText userNameEt, passwordEt;
    Button loginBtn;

    public static final String LOGO_URL = "http://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPhoto = findViewById(R.id.imageView);
        userNameEt = findViewById(R.id.userEditText);
        passwordEt = findViewById(R.id.passEditText);
        loginBtn = findViewById(R.id.button);

        // Init login logo
        initLogo(loginPhoto);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.user_success, Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Put logo image into an imageview
    private void initLogo(ImageView imageView) {
        if (imageView != null) {
            Picasso.get()
                    .load(LOGO_URL)
                    .into(imageView);
            Log.d("NRC7", "initLogo: IMAGE OK");
        } else {
            Log.d("NRC7", "initLogo: IMAGE NULL");
        }
    }
}

