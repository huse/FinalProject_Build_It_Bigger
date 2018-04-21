package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.hpr.hus.libjoke.jokeClass;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {


    @ApiMethod(name = "gettingJokes")
    public MyBean gettingJokes(){
        MyBean response = new MyBean();
        jokeClass joker = new jokeClass();
        response.setData(joker.gettingJokesFromJokeClass());
        return response;
    }

}
