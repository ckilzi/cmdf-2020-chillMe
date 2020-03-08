package com.example.chillme.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.chillme.controller.AppController;
import com.example.chillme.model.Joke;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JokesBank {
    ArrayList<Joke> jokeArrayList = new ArrayList<>();
    private String url = "https://raw.githubusercontent.com/15Dkatz/official_joke_api/master/jokes/index.json";

    public List<Joke> getJokes(final AnswerListAsyncResponse callBack) {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        for (int i = 0; i < response.length(); i++) {
                            Joke joke = new Joke();
                            //create question

                            try {
                                JSONObject jjoke=response.getJSONObject(i);
                                joke.setCategory(jjoke.getString("type"));
                                joke.setSetup(jjoke.getString("setup"));
                                joke.setPunchline(jjoke.getString("punchline"));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            //add question
                            jokeArrayList.add(joke);

                            Log.d("Hello", "onResponse" + joke);

                        }
                        if (null != callBack) {
                            callBack.processFinished(jokeArrayList);
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("JSON stuff", "onError" + error);
            }
        });
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);


        return jokeArrayList;

    }
}
