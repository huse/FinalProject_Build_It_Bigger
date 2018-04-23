package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.widget.ProgressBar;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by hk640d on 4/23/2018.
 */
public class GettingJokeByAsynTaskTest {
    protected ProgressBar progressBars;
    protected Context contexts;
    @Test
    public void onPostExecute() throws Exception {
    }

    @Test
    public void doInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new GettingJokeByAsynTask(progressBars, contexts).execute();
        Thread.sleep(10000);
        assertTrue("Error: Fetched Joke = " + fragment.joke_loaded, fragment.joke_loaded != null);
    }

}