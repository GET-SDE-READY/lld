package com.getsdeready.game.strategy;

import com.getsdeready.game.model.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RoundRobinTurnStrategy implements ITurnStrategy {

    private final Queue<Player> players;

    public RoundRobinTurnStrategy(List<Player> players) {
        this.players = new LinkedList<>(players);
    }

    @Override
    public Player getNextPlayer() {
        // Poll the first player from list
        Player player = this.players.poll();

        // Add the player to last for the next turn
        this.players.add(player);

        // return the player for current turn
        return player;
    }
}
