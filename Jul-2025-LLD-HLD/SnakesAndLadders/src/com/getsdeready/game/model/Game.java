package com.getsdeready.game.model;

import com.getsdeready.game.strategy.ITurnStrategy;
import com.getsdeready.game.strategy.IWinningStrategy;

import java.util.List;

public class Game {
    private final int id;
    private final Board board;
    private final Dice dice;
    private boolean hasWon;
    private final IWinningStrategy winningStrategy;
    private final ITurnStrategy turnStrategy;

    public Game(int id, Board board, Dice dice,
                IWinningStrategy winningStrategy,
                ITurnStrategy turnStrategy) {
        this.id = id;
        this.board = board;
        this.dice = dice;
        this.hasWon = false;
        this.winningStrategy = winningStrategy;
        this.turnStrategy = turnStrategy;
    }

    public void init() {
        Player currentPlayer = null;
        while (!hasWon) {
            currentPlayer = turnStrategy.getNextPlayer();
            board.move(currentPlayer, dice);
            hasWon = winningStrategy.hasWon(currentPlayer, board.getCells().size());
        }

        System.out.println("Player " + currentPlayer.getId() + " has won the game");
    }

}
