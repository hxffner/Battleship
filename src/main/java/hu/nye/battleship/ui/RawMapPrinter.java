package hu.nye.battleship.ui;

import static hu.nye.battleship.model.Board.enemyBoard;
import static hu.nye.battleship.model.Board.playerBoard;

public class RawMapPrinter {

    public static void fillBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                playerBoard[i][j] = 0;
                enemyBoard[i][j] = 0;
            }
        }
    }
}
