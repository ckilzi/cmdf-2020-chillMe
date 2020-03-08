package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Song7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song7);

        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.onceagain);
        mp7.start();
    }
}
