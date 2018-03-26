package com.udacity.gradle.builditbigger.backend;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;

/**
 * Created by hk640d on 3/25/2018.
 */

public class ApiJokeRequest <T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

    /**
     * @param abstractGoogleJsonClient Google JSON client
     * @param requestMethod            HTTP Method
     * @param uriTemplate              URI template for the path relative to the base URL. If it starts with a "/"
     *                                 the base path from the base URL will be stripped out. The URI template can also be a
     *                                 full URL. URI template expansion is done using
     *                                 {@link UriTemplate#expand(String, String, Object, boolean)}
     * @param jsonContent              POJO that can be serialized into JSON content or {@code null} for none
     * @param responseClass            response class to parse into
     */
    protected ApiJokeRequest(AbstractGoogleJsonClient abstractGoogleJsonClient, String requestMethod, String uriTemplate, Object jsonContent, Class<T> responseClass) {
        super(abstractGoogleJsonClient, requestMethod, uriTemplate, jsonContent, responseClass);
    }
}
