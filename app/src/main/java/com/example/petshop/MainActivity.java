package com.example.petshop;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- TEST 1: PETS ---
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        System.out.println("PetShopTest: Cat says " + cat.speak());
        System.out.println("PetShopTest: Dog says " + dog.speak());
        System.out.println("PetShopTest: Scorpion says " + scorpion.speak());


        cat.pet();
        dog.pet();


        // --- TEST 2: MOODS (Lab Exercise)
        Happy happyMood = new Happy();
        Sad sadMood = new Sad();

        System.out.println("PetShopTest: Happy Mood = " + happyMood.getMood());
        System.out.println("PetShopTest: Sad Mood = " + sadMood.getMood());
        System.out.println("PetShopTest: Date = " + happyMood.getDate());
    }
}