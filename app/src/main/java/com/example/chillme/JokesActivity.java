package com.example.chillme;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chillme.data.AnswerListAsyncResponse;
import com.example.chillme.data.JokesBank;
import com.example.chillme.model.Joke;

import java.util.ArrayList;
import java.util.List;

public class JokesActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Joke> jokeList;
    private Button questionButton;
    private Button moreJokesButton;
    private TextView setupText;
    private TextView punchlineText;

    private Joke currentJoke;
    private int currentJokeIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_output);

        questionButton=findViewById(R.id.questionButton);
        moreJokesButton=findViewById(R.id.nextJoke);
        setupText=findViewById(R.id.setupText);
        punchlineText=findViewById(R.id.punchlineText);



        questionButton.setOnClickListener(this);
        moreJokesButton.setOnClickListener(this);



        jokeList=new JokesBank().getJokes(new AnswerListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<Joke> jokeArrayList) {
                currentJokeIndex=(int) (Math.random()*jokeArrayList.size());
                updateJoke(currentJokeIndex);
            }
        });
    }


    private void updateJoke(int jokeIndex){
        currentJoke=jokeList.get(jokeIndex);
        String setup=currentJoke.getSetup();
        setupText.setText(setup);

        Log.d("DEBUG","setup "+setup);
        punchlineText.setText("");
    }
    private void showPunchLine(){
        String punchline=currentJoke.getPunchline();
        punchlineText.setText(punchline);
        Log.d("DEBUG","punchline "+punchline);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextJoke:
                currentJokeIndex=(currentJokeIndex+1+(int)(Math.random()*jokeList.size()))%jokeList.size();
                updateJoke(currentJokeIndex);
                Log.d("DEBUG","nextJoke");
                break;
            case R.id.questionButton:
                showPunchLine();
                Log.d("DEBUG","punchLine");
                break;
        }
    }

}
