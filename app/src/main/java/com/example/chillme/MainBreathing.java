package com.example.chillme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainBreathing extends AppCompatActivity implements View.OnClickListener {
    private Button Sama_Vritti_Button;
    private Button Diaphragmic_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_breathing);
        Sama_Vritti_Button=findViewById(R.id.Sama_Vritti_Button);
        Diaphragmic_Button=findViewById(R.id.Diaphragmatic_Button);

        Sama_Vritti_Button.setOnClickListener(this);
        Diaphragmic_Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Sama_Vritti_Button:
                Intent intent= new Intent(MainBreathing.this,SamaVrittiActivity.class);
                startActivity(intent);
                break;
            case R.id.Diaphragmatic_Button:
                Intent diaphragmaticintent= new Intent(MainBreathing.this,DiaphragmaticActivity.class);
                startActivity(diaphragmaticintent);
                break;

        }
    }
}
