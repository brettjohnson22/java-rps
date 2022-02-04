package com.example;

import java.util.ArrayList;

public abstract class Player {
    public int score;
    public ArrayList<String> options;
    public String chosenGesture;

    public Player() {
        score = 0;
        options = new ArrayList<String>() {
            {
                add("rock");
                add("paper");
                add("scissors");
            }
        };
    }

    abstract void ChooseGesture();
}
