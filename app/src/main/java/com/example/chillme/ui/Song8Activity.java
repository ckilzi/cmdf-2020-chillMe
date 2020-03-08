package com.example.chillme.ui;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;
import com.example.chillme.model.MyCanvas;

public class Song8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyCanvas canvas=new MyCanvas(this, Color.rgb(255,153,204));

        setContentView(canvas);

        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.sweet);
        mp8.start();
    }
}
