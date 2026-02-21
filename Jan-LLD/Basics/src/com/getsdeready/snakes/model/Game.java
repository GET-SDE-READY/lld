package com.getsdeready.snakes.model;

import com.getsdeready.snakes.strategy.ITurnStrategy;
import com.getsdeready.snakes.strategy.IWinningStrategy;

public class Game {

    private final Board board;
    private final Dice dice;
    private final IWinningStrategy winningStrategy;
    private final ITurnStrategy turnStrategy;
    private boolean hasWon;

    public Game(Board board,
                Dice dice,
                IWinningStrategy winningStrategy,
                ITurnStrategy turnStrategy) {
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
