package com.example;

import java.util.Scanner;

public class Game {
    public Player p1;
    public Player p2;

    public Game() {
        p1 = new Human();
    }

    public void RunGame(){
        Welcome();
        DeterminePlayerTypes();

    }

    public void Welcome(){
        System.out.println("Welcome to the game!");;
    }

    public void DeterminePlayerTypes(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many players would you like?");
            String response = sc.nextLine();
            if(response == "1"){
                p2 = new AI();
            }
            else{
                p2 = new Human();
            }
        }
    }

    public void GameRounds(){
        
    }
    
}
