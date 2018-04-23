package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ProgressBar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by hk640d on 4/22/2018.
 */
@RunWith(AndroidJUnit4.class)
public class GettingJokeByAsynTaskTest {
    /*@Before
    public void setUp() throws Exception {
    }

    @Test
    public void onPostExecute() throws Exception {
    }*/
    protected ProgressBar progressBars;
    protected Context contexts;
    @Test
    public void doInBackground() throws Exception {
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new GettingJokeByAsynTask(progressBars,contexts).execute();
        Thread.sleep(10000);
        assertTrue("Failure: Joke = " + fragment.joke_loaded, fragment.joke_loaded != null);
    }

}