package com.example.chillme.data;

import com.example.chillme.model.Joke;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Joke> questionArrayList);

}
