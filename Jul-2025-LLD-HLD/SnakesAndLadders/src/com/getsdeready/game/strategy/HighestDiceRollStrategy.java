package com.getsdeready.game.strategy;

import com.getsdeready.game.model.Player;

import java.util.List;

public class HighestDiceRollStrategy implements ITurnStrategy {

    private final List<Player> players;

    public HighestDiceRollStrategy(List<Player> players) {
        this.players = players;
    }

    // p1 = 2 // turns
    // p2 = 1 // turns
    // p3 = 1 // turn not taken

    // sorting on lowest turns
    // p2, p3, p1

    // p2 = 4 // dice rolls in last round
    // p3 = 4 // dice rolls in last round

    // sort p2, p3 on the dice rolls
    // p3, p2, p1
    @Override
    public Player getNextPlayer() {

        // sort the players on lowest turns and highest dice roll
        this.players.sort((p1, p2) -> {
            int cmp = p1.getTurns() - p2.getTurns();
            if (cmp == 0) {
                return p1.getLastDiceRoll() - p2.getLastDiceRoll();
            }
            return cmp;
        });

        return players.get(0);
    }
}
