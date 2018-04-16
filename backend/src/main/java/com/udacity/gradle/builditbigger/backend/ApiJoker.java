package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 3/25/2018.
 */
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;

public class ApiJoker   extends AbstractGoogleJsonClient {

    static {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.21 of google-api-client to run version " +
                        "1.23.0 of the myJokeApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
    }

    public static final String BASE_DEFAULT_URL = "https://myApplicationId.appspot.com/_ah/api/";

    public static final String SERVICE_DEFAULT_URL = "myJokeApi/v1/";

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
        initialize(result);
        return result;
    }
    @Override
    protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
        super.initialize(httpClientRequest);
    }
    public class GettingJokes extends ApiJokeRequest<MyBean> {

        private static final String PATH_REST = "myjokebean";

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
        }


        @Override
        public JokeBuilder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (JokeBuilder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override
        public ApiJoker build() {
            return new ApiJoker(this);
        }
        @Override
        public JokeBuilder setBatchPath(String batchPath) {
            return (JokeBuilder) super.setBatchPath(batchPath);
        }

        @Override
        public JokeBuilder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            return (JokeBuilder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override
        public JokeBuilder setApplicationName(String applicationName) {
            return (JokeBuilder) super.setApplicationName(applicationName);
        }

        @Override
        public JokeBuilder setSuppressPatternChecks(boolean suppressPatternChecks) {
            return (JokeBuilder) super.setSuppressPatternChecks(suppressPatternChecks);
        }

        @Override
        public JokeBuilder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
            return (JokeBuilder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
        }

        @Override
        public JokeBuilder setSuppressAllChecks(boolean suppressAllChecks) {
            return (JokeBuilder) super.setSuppressAllChecks(suppressAllChecks);
        }
        @Override
        public JokeBuilder setRootUrl(String rootUrl) {
            return (JokeBuilder) super.setRootUrl(rootUrl);
        }

        @Override
        public JokeBuilder setServicePath(String servicePath) {
            return (JokeBuilder) super.setServicePath(servicePath);
        }



        public JokeBuilder setJoke(
                JokeApiRequestStarter myjokeapiRequestInitializer) {
            return (JokeBuilder) super.setGoogleClientRequestInitializer(myjokeapiRequestInitializer);
        }
    }
}