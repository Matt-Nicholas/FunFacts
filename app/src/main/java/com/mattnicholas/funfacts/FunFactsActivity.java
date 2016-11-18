package com.mattnicholas.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked so update the fact
                String[] fact = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an                                adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach                            Earth.",
                        "Some bamboo plants can grow almost a meter in just one                              day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid                                 was being built.",
                "Banging your head against a wall burns 150 calories an hour.",
                        "In the UK, it is illegal to eat mince pies on Christmas                    Day!","Pteronophobia is the fear of being tickled by feathers!", "When hippos are upset, their sweat turns red.","\"Facebook Addiction Disorder\" is a mental disorder identified by Psychologists.", "The average woman uses her height in lipstick every 5 years.", "Cherophobia is the fear of fun.", "Human saliva has a boiling point three times that of regular water.", "Billy goats urinate on their own heads to smell more attractive to females.", "If Pinokio says “My Noes Will Grow Now”, it would cause a paradox."};
                // Randomly select a fact
                Random randGen = new Random();
                int randNum = randGen.nextInt(fact.length);
                // Update the screen with our dynamic fact
                mFactTextView.setText(fact[randNum]);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
