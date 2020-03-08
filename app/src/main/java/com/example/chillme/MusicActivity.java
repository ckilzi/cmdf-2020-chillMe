package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;

public class music_layout extends AppCompatActivity implements View.OnClickListener {

    private Button music_b1, music_b2, music_b3, music_b4, music_b5, music_b6, music_b7, music_b8, music_b9;
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.adventure);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_layout);

        music_b1 = findViewById(R.id.musicB1);
        music_b2 = findViewById(R.id.musicB2);
        music_b3 = findViewById(R.id.musicB3);
        music_b4 = findViewById(R.id.musicB4);
        music_b5 = findViewById(R.id.musicB5);
        music_b6 = findViewById(R.id.musicB6);
        music_b7 = findViewById(R.id.musicB7);
        music_b8 = findViewById(R.id.musicB8);
        music_b9 = findViewById(R.id.musicB9);

        music_b1.setOnClickListener(this);
        music_b2.setOnClickListener(this);
        music_b3.setOnClickListener(this);
        music_b4.setOnClickListener(this);
        music_b5.setOnClickListener(this);
        music_b6.setOnClickListener(this);
        music_b7.setOnClickListener(this);
        music_b8.setOnClickListener(this);
        music_b9.setOnClickListener(this);
    }

    private void updateSong(){
        Log.d("DEBUG","yay!");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.musicB1:
                mp.start();
                Log.d("DEBUG","playing B1 song");
                updateSong();
                break;
            case R.id.musicB2:
                mp.start();
                Log.d("DEBUG","playing B2 song");
                updateSong();
                break;
        }
    }




}
