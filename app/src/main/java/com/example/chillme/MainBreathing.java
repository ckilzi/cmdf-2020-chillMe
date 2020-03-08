package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBreathing extends AppCompatActivity implements View.OnClickListener {
    private Button sv_Button;
    private Button d_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_breathing);
        sv_Button=findViewById(R.id.Sama_Vritti_Button);
        d_Button=findViewById(R.id.Diaphragmatic_Button);

        sv_Button.setOnClickListener(this);
        d_Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Sama_Vritti_Button:
                Intent sv_intent= new Intent(MainBreathing.this,SamaVrittiActivity.class);
                startActivity(sv_intent);
                break;
            case R.id.Diaphragmatic_Button:
                Intent diaphragmaticintent= new Intent(MainBreathing.this,DiaphragmaticActivity.class);
                startActivity(diaphragmaticintent);
                break;

        }
    }
}
