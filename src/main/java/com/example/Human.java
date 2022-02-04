package com.example;

import java.util.Scanner;

public class Human extends Player{

    public Human() {
        super();
    }

    @Override
    void ChooseGesture() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose your gesture: ");
            chosenGesture = sc.nextLine();
        }
    }
    
}
