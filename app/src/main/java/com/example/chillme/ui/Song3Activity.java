package com.example.chillme.ui;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;
import com.example.chillme.model.MyCanvas;

public class Song3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyCanvas canvas=new MyCanvas(this, Color.YELLOW);
        setContentView(canvas);

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.beyondtheline);
        mp3.start();
    }
}
