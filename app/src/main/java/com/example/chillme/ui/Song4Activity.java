package com.example.chillme.ui;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;

public class Song4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song4);

        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.birthofahero);
        mp4.start();
    }
}
