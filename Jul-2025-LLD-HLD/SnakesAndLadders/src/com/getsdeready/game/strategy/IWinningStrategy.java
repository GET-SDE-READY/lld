package com.getsdeready.game.strategy;

import com.getsdeready.game.model.Player;

import java.util.List;

public interface IWinningStrategy {
    boolean hasWon(Player currentPlayer, int boardSize);
}
