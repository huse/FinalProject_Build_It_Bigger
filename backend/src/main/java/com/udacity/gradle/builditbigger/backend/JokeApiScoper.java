package com.udacity.gradle.builditbigger.backend;

/**
 * Created by hk640d on 4/11/2018.
 */

public class JokeApiScoper {
    private JokeApiScoper() {
    }

    public static final String USER_EMAIL = "https://www.googleapis.com/auth/userinfo.email";

    public static java.util.Set<String> allUtilSet() {
        java.util.Set<String> set = new java.util.HashSet<String>();
        set.add(USER_EMAIL);
        return java.util.Collections.unmodifiableSet(set);
    }


}
