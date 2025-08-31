package com.getsdeready.game.strategy;

import com.getsdeready.game.model.Player;

public class DefaultWinningStrategy implements IWinningStrategy {

    @Override
    public boolean hasWon(Player currentPlayer, int boardSize) {
        return currentPlayer.getCurrentPosition() >= boardSize;
    }
}
