package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityUnitTestCase;
import android.widget.ProgressBar;

import com.hpr.hus.passingjokelib.MainActivityJoke;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class GettingJokeByAsynTaskTest extends ActivityUnitTestCase<MainActivity> {


    public GettingJokeByAsynTaskTest(){
        super(MainActivity.class);

    }


    @Test
    public void doInBackground()  throws Exception{
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        String testResult = null;
        GettingJokeByAsynTask gettingJokeByAsynTask = new GettingJokeByAsynTask (null);
        gettingJokeByAsynTask.execute();
        Thread.sleep(10000);

        try {
            testResult = gettingJokeByAsynTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(testResult);
    }
    @Test
    public void testingGettingJokeByAsynTaskClass() {
        String testResult = null;
        GettingJokeByAsynTask gettingJokeByAsynTask = new GettingJokeByAsynTask (null);
        gettingJokeByAsynTask.execute();

        try {
            testResult = gettingJokeByAsynTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(testResult);
    }
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}