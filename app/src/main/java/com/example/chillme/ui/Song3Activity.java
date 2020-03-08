package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Song3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song3);

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.beyondtheline);
        mp3.start();
    }
}
