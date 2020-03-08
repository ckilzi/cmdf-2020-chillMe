package com.example.chillme;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class UserProfile extends AppCompatActivity {
    private Button goToMain;
    private Button add;
    private TextInputEditText input;
    private TextView entriesText;
    private ArrayList<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        goToMain=findViewById(R.id.goToMain);
        add=findViewById(R.id.add);
        input=findViewById(R.id.input);
        entriesText=findViewById(R.id.entriesText);
        final Intent intent=getIntent();
        list=intent.getStringArrayListExtra("existingEntries");

        goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("entryList", list);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String newEntry=String.valueOf(input.getText());
                if(newEntry!=""){
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();

                    list.add(String.valueOf(input.getText()));
                    list.add(dtf.format(now));
                }
                input.setText("");
                String entries="";
                for(String item:list){
                    entries=item+"\n"+entries;
                }
                entriesText.setText(entries);
            }
        });
    }


}
