package com.example.chillme.ui;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;

public class Song2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.adaytoremember);
        mp2.start();
    }
}
