package com.example.chillme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.chillme.ui.MusicActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton jokesButton;
    private ImageButton helpButton;
    private ImageButton breatheButton;
    private ImageButton musicButton;
    private Button profileButton;
    private ArrayList<String> entryList=new ArrayList<>();
    private final int REQUEST_CODE=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mainMenu, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(navView, navController);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

       jokesButton=findViewById(R.id.jokesMenuButton);
       breatheButton=findViewById(R.id.breathingMenuButton);
       helpButton=findViewById(R.id.helpMenuButton);
       musicButton=findViewById(R.id.musicMenuButton);
       profileButton=findViewById(R.id.profileButton);

       jokesButton.setOnClickListener(this);
       breatheButton.setOnClickListener(this);
       helpButton.setOnClickListener(this);
       musicButton.setOnClickListener(this);
       profileButton.setOnClickListener(this);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

    }

    @Override
    public void onClick(View v) {
        Log.d("SWITCH","onClick");
        Intent intent;
        //System.out.println("triggered event");
        switch(v.getId()){
            case R.id.breathingMenuButton:
                intent= new Intent(MainActivity.this, MainBreathing.class);
                startActivity(intent);
                break;
            case R.id.helpMenuButton:
                intent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.musicMenuButton:
                intent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(intent);
                break;
            case R.id.jokesMenuButton:
                intent = new Intent(MainActivity.this,JokesActivity.class);
                startActivity(intent);
                break;
            case R.id.profileButton:
                intent= new Intent(MainActivity.this,UserProfile.class);
                intent.putStringArrayListExtra("existingEntries",entryList);
                startActivityForResult(intent,REQUEST_CODE);
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //check that the result is not malicious
        if(REQUEST_CODE==requestCode){
            assert data!=null;
            entryList= data.getStringArrayListExtra("entryList");
            Log.d("USER","onResutl"+entryList);



        }
    }
}
