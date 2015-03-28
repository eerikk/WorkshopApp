package com.lionsandwich.funfacts;

import java.util.Random;

/**
 * Created by Eerik on 22.03.2015.
 */
public class FactBook {
    //Member variable (properties about the object)
    public  String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was built."
    };
    //Method (abilities : things the object can do)
    public String getFact(){


        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();  //construct a new Random number generator
        int    randomNumber    = randomGenerator.nextInt(mFacts.length);

        // Convert the randomNr to a text faxt

        fact = mFacts[randomNumber];

        return fact;
    }
}
