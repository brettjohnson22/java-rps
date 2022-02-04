package com.example;

import java.util.Random;

public class AI extends Player {

    public AI() {
        super();
    }

    @Override
    void ChooseGesture() {
        Random rand = new Random();
        // TODO Auto-generated method stub
        int number = rand.nextInt(3); 
        chosenGesture = options.get(number);
    }
    
}
