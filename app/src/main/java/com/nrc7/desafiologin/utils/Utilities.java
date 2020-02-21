package com.nrc7.desafiologin.utils;

import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Utilities {

    private static final String BG_IMAGE="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/872px-Android_robot.svg.png";
    private static final String LOGO_URL = "https://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png";
    private static final String USER_PASS = "123456";

    public Utilities() {
    }

    public void initLogo(ImageView imageView, String url) {
        if (imageView != null && url != null) {
            Picasso.get()
                    .load(url)
                    .into(imageView);
            Log.d("NRC7", "initLogo: IMAGE OK");
        } else {
            Log.d("NRC7", "initLogo: IMAGE NULL");
        }
    }

    public static String getBgImage() {
        return BG_IMAGE;
    }

    public static String getLogoUrl() {
        return LOGO_URL;
    }

    public static String getUserPass() {
        return USER_PASS;
    }
}
