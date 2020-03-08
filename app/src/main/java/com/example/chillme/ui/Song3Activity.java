package com.example.chillme.ui;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;

public class Song3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song3);

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.beyondtheline);
        mp3.start();
    }
}
