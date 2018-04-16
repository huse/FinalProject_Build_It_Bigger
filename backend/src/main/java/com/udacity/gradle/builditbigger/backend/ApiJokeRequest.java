package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 3/25/2018.
 */

public class ApiJokeRequest <T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

    protected ApiJokeRequest(
            ApiJoker client, String method, String uriTemplate, Object content, Class<T> responseClass) {
        super(
                client,
                method,
                uriTemplate,
                content,
                responseClass);
    }
    @com.google.api.client.util.Key
    private java.lang.String stringQuotaUser;

    public java.lang.String getStringQuotaUser() {
        return stringQuotaUser;
    }

    public ApiJokeRequest<T> setStringQuotaUser(java.lang.String stringQuotaUser) {
        this.stringQuotaUser = stringQuotaUser;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String StringUserIp;

    public java.lang.String getStringUserIp() {
        return StringUserIp;
    }

    public ApiJokeRequest<T> setStringUserIp(java.lang.String stringUserIp) {
        this.StringUserIp = stringUserIp;
        return this;
    }
    @com.google.api.client.util.Key
    private java.lang.String stringAlter;

    public java.lang.String getStringAlter() {
        return stringAlter;
    }

    public ApiJokeRequest<T> setStringAlter(java.lang.String stringAlter) {
        this.stringAlter = stringAlter;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String stringFields;

    public java.lang.String getStringFields() {
        return stringFields;
    }

    public ApiJokeRequest<T> setStringFields(java.lang.String stringFields) {
        this.stringFields = stringFields;
        return this;
    }

    @com.google.api.client.util.Key("oauth_token")
    private java.lang.String stringOauthToken;

    public java.lang.String getStringOauthToken() {
        return stringOauthToken;
    }

    public ApiJokeRequest<T> setStringOauthToken(java.lang.String stringOauthToken) {
        this.stringOauthToken = stringOauthToken;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Boolean StringPrettyPrint;

    public java.lang.Boolean getStringPrettyPrint() {
        return StringPrettyPrint;
    }

    public ApiJokeRequest<T> setStringPrettyPrint(java.lang.Boolean stringPrettyPrint) {
        this.StringPrettyPrint = stringPrettyPrint;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String stringKey;

    public java.lang.String getStringKey() {
        return stringKey;
    }

    public ApiJokeRequest<T> setStringKey(java.lang.String stringKey) {
        this.stringKey = stringKey;
        return this;
    }


    @Override
    public ApiJokeRequest<T> setRequestHeaders(com.google.api.client.http.HttpHeaders headers) {
        return (ApiJokeRequest<T>) super.setRequestHeaders(headers);
    }

    @Override
    public ApiJokeRequest<T> set(String parameterName, Object value) {
        return (ApiJokeRequest<T>) super.set(parameterName, value);
    }
    @Override
    public final ApiJoker getAbstractGoogleClient() {
        return (ApiJoker) super.getAbstractGoogleClient();
    }

    @Override
    public ApiJokeRequest<T> setDisableGZipContent(boolean disableGZipContent) {
        return (ApiJokeRequest<T>) super.setDisableGZipContent(disableGZipContent);
    }


}
