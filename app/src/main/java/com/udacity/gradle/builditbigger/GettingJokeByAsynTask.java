package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.ApiJoker;

import java.io.IOException;

/**
 * Created by hk640d on 3/23/2018.
 */

public class GettingJokeByAsynTask extends AsyncTask<Void, Void, String> {
    private ApiJoker apiJoker = null;
    private TaskCompletionInterface taskCompletedCallback;

    protected Context contexts;
    protected ProgressBar progressBars;

    /*public GettingJokeByAsynTask(ProgressBar progressBar,Context context) {
        this.contexts =context;
        this.progressBars =progressBar;
    }*/

    public GettingJokeByAsynTask(TaskCompletionInterface callback) {
        taskCompletedCallback = callback;
    }

    /*public GettingJokeByAsynTask(){

    }*/
    public interface TaskCompletionInterface {
        void completingTasks(String joke);
    }
    @Override
    protected void onPostExecute(String result) {
        Log.v("hhh3", "onPostExecute 1");

        if (progressBars !=null){
            progressBars.setVisibility(View.GONE);
        }
        /*Intent intent = new Intent(contexts, MainActivity.class);
        intent.putExtra(MainActivity.JOKE_INTENT, result);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        contexts.startActivity(intent);*/

        Log.v("hhh3", "onPostExecute 2");
        if (taskCompletedCallback != null) {
            taskCompletedCallback.completingTasks(result);
        }
         /*Intent intent2 = new Intent(contexts, MainActivityJoke.class);
        contexts.startActivity(intent2);*/
        Log.v("hhh3", "onPostExecute 3");

    }

    @Override
    protected String doInBackground(Void... params) {
        Log.v("hhh", "doInBackground 1");

        if(apiJoker == null) {
            ApiJoker.JokeBuilder builder = new ApiJoker.JokeBuilder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://localhost:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            Log.v("hhh", "doInBackground 2: " + builder.toString());

            apiJoker = builder.build();
            Log.v("hhh", "doInBackground 3: " + apiJoker.toString());

        }
        try {
            String result = apiJoker.gettingJoke().execute().getData();
            Log.v("hhh", "doInBackground 4: "+ result);

            return result;
        } catch (IOException e) {
            Log.v("hhh", "doInBackground 5:   " + e.getMessage());

            return e.getMessage();
        }

    }
}
