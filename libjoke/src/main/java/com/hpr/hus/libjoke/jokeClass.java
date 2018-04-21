package com.hpr.hus.libjoke;

import java.util.Random;

public class jokeClass {
    public static String getJokes(){
        return "What did one snowman say to the other?  Do you smell carrots?";
    }

    //array of jokes
    private static final String jokes[] = {
            "What did one snowman say to the other?\n Do you smell carrots?",
            "What is a sea monster's favorite snack? \n Ships and dip.",
            "How do robots eat guacamole? \n With computer chips.",
            "A ham sandwich walks into a bar and orders a beer, bartender says \n sorry, we don't serve food here.",
            "Why did the Clydesdale give the pony a glass of water?\n Because he was a little horse.",
            "What do you call a fish without eyes?\n Fsh.",
            "What do you call an alligator detective? \n An investi-gator"

    };
    public static String gettingJokesFromJokeClass(){
        Random rand = new Random();
        int value = rand.nextInt(jokes.length - 1);
        return jokes[value];
    }
}
