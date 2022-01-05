package hu.nye.battleship.ui;

import static hu.nye.battleship.model.Board.enemyBoard;
import static hu.nye.battleship.model.Board.playerBoard;

/**
 * Represents the raw board(Board without any changes).
 */
public class RawMapPrinter {
    /**
     * Fills the Board with water.
     */
    public static void fillBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                playerBoard[i][j] = 0;
                enemyBoard[i][j] = 0;
            }
        }
    }
}
