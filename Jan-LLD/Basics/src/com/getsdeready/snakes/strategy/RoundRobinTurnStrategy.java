package com.getsdeready.snakes.strategy;


import com.getsdeready.snakes.model.Player;

import java.util.List;
import java.util.Queue;

public class RoundRobinTurnStrategy implements ITurnStrategy {

    private final Queue<Player> players;

    public RoundRobinTurnStrategy(List<Player> players) {
        this.players = new LinkedList<>(players);
    }


    @Override
    public Player getNextPlayer() {
        // get the next player from queue
        Player nextPlayer = this.players.poll();

        // put this player at the end of queue
        this.players.add(nextPlayer);

        // return next player
        return nextPlayer;
    }
}
