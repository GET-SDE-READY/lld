package com.getsdeready.snakes;


import com.getsdeready.snakes.model.*;
import com.getsdeready.snakes.strategy.DefaultWinningStrategy;
import com.getsdeready.snakes.strategy.HighestDiceRollTurnStrategy;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Board board = new Board(100);

        // add snakes
        board.getCells().get(36).setBoardItem(new Snake(36, 2));
        board.getCells().get(54).setBoardItem(new Snake(54, 15));

        // add ladders
        board.getCells().get(3).setBoardItem(new Ladder(3, 27));
        board.getCells().get(25).setBoardItem(new Ladder(25, 63));


        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 3; ++i) {
            players.add(new Player(i));
        }

        Dice dice = new Dice(6);

        Game game = new Game(board, dice,
                new DefaultWinningStrategy(), new HighestDiceRollTurnStrategy(players));

        game.init();
    }
}
