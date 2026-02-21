package com.getsdeready.snakes.strategy;

import com.getsdeready.snakes.model.Player;

import java.util.List;

public class HighestDiceRollTurnStrategy implements ITurnStrategy {

    private final List<Player> players;

    public HighestDiceRollTurnStrategy(List<Player> players) {
        this.players = players;
    }

    @Override
    public Player getNextPlayer() {
        // p1,p2,p3 are the players
        // p1 played 2 turns, p2 played 2 turns, p3 played 1 turn
        // p3 should take next turn

        // all have taken same turns
        // p1 rolled 3, p2 rolled 1, p3 rolled 5
        // p3 should take next turn

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
