package com.example.chillme.ui;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;

public class Song6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song6);

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.memories);
        mp6.start();
    }
}
