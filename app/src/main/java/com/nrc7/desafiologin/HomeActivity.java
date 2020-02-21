package com.nrc7.desafiologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.nrc7.desafiologin.utils.Utilities;

public class HomeActivity extends AppCompatActivity {

    private Utilities utilities = new Utilities();
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageView = findViewById(R.id.bgImageView);

        // Init bg image from Utilities.class
        utilities.initLogo(imageView, Utilities.getBgImage());
    }

}
