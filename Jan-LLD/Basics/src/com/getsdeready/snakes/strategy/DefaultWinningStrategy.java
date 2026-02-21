package com.getsdeready.snakes.strategy;

import com.getsdeready.snakes.model.Player;

public class DefaultWinningStrategy implements IWinningStrategy {

    @Override
    public boolean hasWon(Player currentPlayer, int boardSize) {
        return currentPlayer.getCurrentPosition() >= boardSize;
    }
}
