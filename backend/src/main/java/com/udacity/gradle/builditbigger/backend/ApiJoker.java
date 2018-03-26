package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 3/25/2018.
 */
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

import java.io.IOException;

public class ApiJoker   extends AbstractGoogleJsonClient {
    /**
     * @param builder builder
     * @since 1.14
     */
    protected ApiJoker(Builder builder) {
        super(builder);
    }

    public ApiJoker.GetJoke getJoke() throws IOException {
        ApiJoker.GetJoke result = new ApiJoker.GetJoke();
        this.initialize(result);
        return result;
    }
    public static final String URL = "";
    public static final String PATH = "";
    public static final String BATCH = "";

    public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {
       /* public Builder(HttpTransport transport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
            super(transport, jsonFactory, "https://myApplicationId.appspot.com/_ah/api/", "myJokeApi/v1/", httpRequestInitializer, false);
            this.setBatchPath("batch");
        }*/
        public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                       com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            super(
                    transport,
                    jsonFactory,
                    URL,
                    PATH,
                    httpRequestInitializer,
                    false);
            setBatchPath(BATCH);
        }
        @Override
        public AbstractGoogleJsonClient build() {
            return null;
        }
    }

    public class GetJoke extends ApiJokeRequest<MyBean> {
        private static final String REST_PATH = "myjokebean";

        protected GetJoke() {
            super(ApiJoker.this, "GET", "myjokebean", (Object) null, MyBean.class);
        }
    }
}