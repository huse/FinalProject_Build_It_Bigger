package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.hpr.hus.passingjokelib.MainActivityJoke;

import static com.hpr.hus.libjoke.jokeClass.gettingJokesFromJokeClass;


public class MainActivity extends AppCompatActivity implements GettingJokeByAsynTask.TaskCompletionInterface {
    public final static String JOKE_INTENT = "JOKE_INTENT";
    GettingJokeByAsynTask gettingJokeByAsynTask;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* getSupportFragmentManager().beginTransaction().
                add(R.id.fragment,new MainActivityFragment()).commit();*/


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    protected ProgressBar progressBars;
    @SuppressWarnings("unchecked")
    public void tellJoke(View view) {
       // Toast.makeText(this, gettingJokesFromJokeClass(), Toast.LENGTH_SHORT).show();
        /*Intent intent = new Intent(this, MainActivityJoke.class);
        startActivity(intent);*/
        Log.v("hhh","tellJoke method");
//new GettingJokeByAsynTask(progressBars,this).execute();


        if (gettingJokeByAsynTask == null) {
            gettingJokeByAsynTask = new GettingJokeByAsynTask(this);
            gettingJokeByAsynTask.execute();
        }



    }

public String passingJoke(){
        return (gettingJokesFromJokeClass());
}

    @Override
    public void completingTasks(String joke) {
        jokeDelivered();

        Intent intent = new Intent(this, MainActivityJoke.class);
        intent.putExtra(MainActivityJoke.JOKE, joke);
        startActivity(intent);
    }

    private void jokeDelivered() {


        MainActivityFragment fragment = (MainActivityFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment);

        if (fragment != null) {
            fragment.setJokeRequested();
        }
    }
}
