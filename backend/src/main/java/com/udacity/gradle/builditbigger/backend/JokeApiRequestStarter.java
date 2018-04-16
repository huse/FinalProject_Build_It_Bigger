package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 4/11/2018.
 */

public class JokeApiRequestStarter extends com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer {



    public JokeApiRequestStarter(String key, String userIp) {
        super(key, userIp);
    }
    public JokeApiRequestStarter(String key) {
        super(key);
    }
    public JokeApiRequestStarter() {
        super();
    }


    protected void startJokeApiRequests(ApiJokeRequest<?> requests) throws java.io.IOException {
    }


    @Override
    public final void initializeJsonRequest(com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<?> requesties) throws java.io.IOException {
        super.initializeJsonRequest(requesties);
        startJokeApiRequests((ApiJokeRequest<?>) requesties);
    }


}