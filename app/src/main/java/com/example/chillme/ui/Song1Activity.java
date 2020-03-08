package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Song1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song1);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.adventure);
        mp1.start();
    }
}
