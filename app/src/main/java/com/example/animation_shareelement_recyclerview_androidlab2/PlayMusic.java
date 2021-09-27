package com.example.animation_shareelement_recyclerview_androidlab2;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class PlayMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_app_screen1);

        Fade fade = new Fade();
        View decor= getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);


    }
}