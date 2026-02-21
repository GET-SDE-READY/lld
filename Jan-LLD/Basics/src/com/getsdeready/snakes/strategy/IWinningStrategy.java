package com.getsdeready.snakes.strategy;

import com.getsdeready.snakes.model.Player;

public interface IWinningStrategy {

    boolean hasWon(Player currentPlayer, int boardSize);
}
