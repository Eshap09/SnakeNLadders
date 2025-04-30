package org.example;

public class Dice {
    int faces;

    public Dice(int faces) {
        this.faces = faces;
    }

    public int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
