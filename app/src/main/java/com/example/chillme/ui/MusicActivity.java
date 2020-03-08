package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button music_b1, music_b2, music_b3, music_b4, music_b5, music_b6, music_b7, music_b8, music_b9;

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

//        music_b1.setOnClickListener(new View.OnClickListener(){
//            @Override public void onClick(View view){
//                mp.start();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.musicB1:
                Intent song1_intent = new Intent(MusicActivity.this, Song1Activity.class);
                startActivity(song1_intent);
                break;
            case R.id.musicB2:
                Intent song2_intent = new Intent(MusicActivity.this, Song2Activity.class);
                startActivity(song2_intent);
                break;
            case R.id.musicB3:
                Intent song3_intent = new Intent(MusicActivity.this, Song3Activity.class);
                startActivity(song3_intent);
                break;
            case R.id.musicB4:
                Intent song4_intent = new Intent(MusicActivity.this, Song4Activity.class);
                startActivity(song4_intent);
                break;
            case R.id.musicB5:
                Intent song5_intent = new Intent(MusicActivity.this, Song5Activity.class);
                startActivity(song5_intent);
                break;
            case R.id.musicB6:
                Intent song6_intent = new Intent(MusicActivity.this, Song6Activity.class);
                startActivity(song6_intent);
                break;
            case R.id.musicB7:
                Intent song7_intent = new Intent(MusicActivity.this, Song7Activity.class);
                startActivity(song7_intent);
                break;
            case R.id.musicB8:
                Intent song8_intent = new Intent(MusicActivity.this, Song8Activity.class);
                startActivity(song8_intent);
                break;
            case R.id.musicB9:
                Intent song9_intent = new Intent(MusicActivity.this, Song9Activity.class);
                startActivity(song9_intent);
                break;
        }
    }



}
