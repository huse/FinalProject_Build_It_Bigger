package com.hpr.hus.passingjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import static com.hpr.hus.libjoke.jokeClass.getJokes;



public class MainActivityJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);

        TextView textView= findViewById(R.id.joke_tv);
        textView.setText(getJokes());
    }
}
