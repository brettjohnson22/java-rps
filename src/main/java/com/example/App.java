package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Human p1 = new Human();
        p1.ChooseGesture();
        AI p2 = new AI();
        p2.ChooseGesture();
        System.out.println("Hello");
    }
}
