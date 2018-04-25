package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 3/25/2018.
 */
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
//import android.util.Log;

import java.lang.annotation.Target;
import java.util.logging.Logger;

public class ApiJoker   extends AbstractGoogleJsonClient {
Logger log= Logger.getLogger("InfoLogging");

    static {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 21,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.21 of google-api-client to run version " +
                        "1.23.0 of the myJokeApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
    }
//https://build-it-bigger-backend-146014.appspot.com
    public static final String BASE_DEFAULT_URL = "http://localhost:8080/_ah/api/";

    public static final String SERVICE_DEFAULT_URL = "myApi/v1/";

    public static final String BATCH = "batch";


    public ApiJoker(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                     com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
        this(new JokeBuilder(transport, jsonFactory, httpRequestInitializer));
    }


    ApiJoker(JokeBuilder builder) {
        super(builder);
    }



    public GettingJokes gettingJoke() throws java.io.IOException {

        GettingJokes result = new GettingJokes();
        log.info("hhh"+ "gettingJoke 1: " + result);

        initialize(result);
        log.info("hhh"+ "gettingJoke 2: " + result);
       // Log.v("hhh", "gettingJoke 1: " + result);
        return result;
    }
    @Override
    protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
        log.info("hhh"+ "initialize 1: " + httpClientRequest);

        super.initialize(httpClientRequest);
    }

    public class GettingJokes extends ApiJokeRequest<MyBean> {

        private static final String PATH_REST = "mybean";

        protected GettingJokes() {
            super(ApiJoker.this, "GET", PATH_REST, null, MyBean.class);
        }

        @Override
        public GettingJokes setStringQuotaUser(java.lang.String stringQuotaUser) {
            return (GettingJokes) super.setStringQuotaUser(stringQuotaUser);
        }

        @Override
        public GettingJokes setStringUserIp(java.lang.String stringUserIp) {
            return (GettingJokes) super.setStringUserIp(stringUserIp);
        }

        @Override
        public GettingJokes set(String parameterName, Object value) {
            return (GettingJokes) super.set(parameterName, value);
        }
        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
            return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
            return super.buildHttpRequestUsingHead();
        }

        @Override
        public GettingJokes setStringAlter(java.lang.String stringAlter) {
            return (GettingJokes) super.setStringAlter(stringAlter);
        }

        @Override
        public GettingJokes setStringFields(java.lang.String stringFields) {
            return (GettingJokes) super.setStringFields(stringFields);
        }

        @Override
        public GettingJokes setStringKey(java.lang.String stringKey) {
            return (GettingJokes) super.setStringKey(stringKey);
        }

        @Override
        public GettingJokes setStringOauthToken(java.lang.String stringOauthToken) {
            return (GettingJokes) super.setStringOauthToken(stringOauthToken);
        }

        @Override
        public GettingJokes setStringPrettyPrint(java.lang.Boolean stringPrettyPrint) {
            return (GettingJokes) super.setStringPrettyPrint(stringPrettyPrint);
        }


    }

    public static final class JokeBuilder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {
        Logger log= Logger.getLogger("InfoLogging");
        public JokeBuilder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                           com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {

            super(
                    transport,
                    jsonFactory,
                    BASE_DEFAULT_URL,
                    SERVICE_DEFAULT_URL,
                    httpRequestInitializer,
                    false);
            setBatchPath(BATCH);

            log= Logger.getLogger("InfoLogging");
            log.info("hhh"+ "JokeBuilder CONSTRUCTOR: ");
        }


        @Override
        public JokeBuilder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
            log.info("hhh"+ "JokeBuilder setGoogleClientRequestInitializer: ");

            return (JokeBuilder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override
        public ApiJoker build() {
            log.info("hhh"+ "JokeBuilder build: ");

            return new ApiJoker(this);
        }
        @Override
        public JokeBuilder setBatchPath(String batchPath) {
            log.info("hhh"+ "JokeBuilder setBatchPath: ");

            return (JokeBuilder) super.setBatchPath(batchPath);
        }

        @Override
        public JokeBuilder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            log.info("hhh"+ "JokeBuilder setHttpRequestInitializer: ");

            return (JokeBuilder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override
        public JokeBuilder setApplicationName(String applicationName) {
            log.info("hhh"+ "JokeBuilder setApplicationName: ");

            return (JokeBuilder) super.setApplicationName(applicationName);
        }

        @Override
        public JokeBuilder setSuppressPatternChecks(boolean suppressPatternChecks) {
            log.info("hhh"+ "JokeBuilder setSuppressPatternChecks: ");

            return (JokeBuilder) super.setSuppressPatternChecks(suppressPatternChecks);
        }

        @Override
        public JokeBuilder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
            log.info("hhh"+ "JokeBuilder setSuppressRequiredParameterChecks: ");

            return (JokeBuilder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
        }

        @Override
        public JokeBuilder setSuppressAllChecks(boolean suppressAllChecks) {
            log.info("hhh"+ "JokeBuilder setSuppressAllChecks: ");

            return (JokeBuilder) super.setSuppressAllChecks(suppressAllChecks);
        }
        @Override
        public JokeBuilder setRootUrl(String rootUrl) {
//            log.info("hhh"+ "JokeBuilder setRootUrl: ");

            return (JokeBuilder) super.setRootUrl(rootUrl);
        }

        @Override
        public JokeBuilder setServicePath(String servicePath) {
//            log.info("hhh"+ "JokeBuilder setServicePath: ");

            return (JokeBuilder) super.setServicePath(servicePath);
        }



        public JokeBuilder setJoke(
                JokeApiRequestStarter myjokeapiRequestInitializer) {
            return (JokeBuilder) super.setGoogleClientRequestInitializer(myjokeapiRequestInitializer);
        }
    }
}