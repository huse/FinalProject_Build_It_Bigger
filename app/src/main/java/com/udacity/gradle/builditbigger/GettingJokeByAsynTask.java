package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
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
    private Context ct;
    private ProgressBar pb;

    private ApiJoker apiServe = null;
    public GettingJokeByAsynTask( Context ct, ProgressBar pb){
        this.ct =ct;
        this.pb = pb;
    }



    @Override
    protected String doInBackground(Void... voids) {
        if(apiServe == null) {  // Only do this once
            ApiJoker.Builder builder = new ApiJoker.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            apiServe = builder.build();
        }
        try {
            return apiServe.getJoke().execute().toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
