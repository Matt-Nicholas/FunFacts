package com.mattnicholas.funfacts;

import java.util.Random;

public class FactBook {
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Banging your head against a wall burns 150 calories an hour.",
            "In the UK, it is illegal to eat mince pies on Christmas Day!",
            "Pteronophobia is the fear of being tickled by feathers!",
            "When hippos are upset, their sweat turns red.",
            "\"Facebook Addiction Disorder\" is a mental disorder identified by Psychologists.",
            "The average woman uses her height in lipstick every 5 years.",
            "Cherophobia is the fear of fun.",
            "Human saliva has a boiling point three times that of regular water.",
            "Billy goats urinate on their own heads to smell more attractive to females.",
            "If Pinokio says “My Noes Will Grow Now”, it would cause a paradox."
    };
    public String getFact(){
        // Randomly select a fact
        Random randGen = new Random();
        int randNum = randGen.nextInt(mFacts.length);

        return mFacts[randNum];
    }
}
