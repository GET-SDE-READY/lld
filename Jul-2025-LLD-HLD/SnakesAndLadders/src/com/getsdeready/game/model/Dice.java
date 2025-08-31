package com.getsdeready.game.model;

import java.util.Random;

public class Dice {
    private final int faces;
    private final Random random;

    public Dice(int faces) {
        this.faces = faces;
        random = new Random();
    }

    public int getDiceRoll() {
        // get number from 0 to faces - 1
        int randomNumber = random.nextInt(faces);

        // make the range 1 to faces
        return  randomNumber + 1;
    }
}
