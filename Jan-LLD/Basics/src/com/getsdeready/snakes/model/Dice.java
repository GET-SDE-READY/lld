package com.getsdeready.snakes.model;

import java.util.Random;

public class Dice {

    private final int faces;
    private final Random random;

    public Dice(int faces) {
        this.faces = faces;
        this.random = new Random();
    }

    public int getDiceThrow() {
        // generates a random number between 0 - (faces - 1)
        int randomNumber = random.nextInt(faces);

        return randomNumber + 1; // (1 - faces)
    }
}
