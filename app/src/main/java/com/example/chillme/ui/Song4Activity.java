package com.example.chillme.ui;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.R;
import com.example.chillme.model.MyCanvas;

public class Song4Activity extends AppCompatActivity {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyCanvas canvas=new MyCanvas(this,Color.GREEN);
        setContentView(canvas);

        mp= MediaPlayer.create(canvas.getContext(), R.raw.cute);
        mp.start();
    }




    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
    }
}
