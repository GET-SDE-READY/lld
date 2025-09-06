import com.getsdeready.game.model.*;
import com.getsdeready.game.strategy.DefaultWinningStrategy;
import com.getsdeready.game.strategy.RoundRobinTurnStrategy;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create board
        Board board = new Board(1, 40);

        // Snake - (37, 3), (24, 11)
        board.getCells().get(36).setBoardItem(new Snake(36, 2));
        board.getCells().get(23).setBoardItem(new Snake(23, 10));

        // Ladders - (4, 14), (12, 28)
        board.getCells().get(3).setBoardItem(new Ladder(3, 13));
        board.getCells().get(11).setBoardItem(new Ladder(11, 27));

        // create players
        List<Player> players = new ArrayList<>(3);

        for (int i = 0; i < 3; ++i) {
            players.add(new Player(i));
        }

        Dice dice = new Dice(6);

        Game game = new Game(1, board, dice,
                new DefaultWinningStrategy(),
                new RoundRobinTurnStrategy(players));
        game.init();
    }
}