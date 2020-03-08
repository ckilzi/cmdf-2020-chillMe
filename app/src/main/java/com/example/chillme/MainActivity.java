package com.example.chillme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.chillme.ui.MusicActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button jokesButton;
    private Button helpButton;
    private Button breatheButton;
    private Button musicButton;
    private Button profileButton;


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
                break;
            case R.id.helpMenuButton:
                break;
            case R.id.musicMenuButton:
                Intent music_intent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(music_intent);

                break;
            case R.id.jokesMenuButton:

                intent= new Intent(MainActivity.this,JokesActivity.class);
                startActivity(intent);
                break;
            case R.id.profileButton:
                intent= new Intent(MainActivity.this,UserProfile.class);
                startActivity(intent);
                break;
        }
    }
}
