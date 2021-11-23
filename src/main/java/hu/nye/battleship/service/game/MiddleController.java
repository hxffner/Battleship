package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Shoot;

import static hu.nye.battleship.model.Shoot.enemyShipCount;
import static hu.nye.battleship.model.Shoot.playerShipCount;

public class MiddleController {

    public static void middleGame() {
        Board board = new Board();
        Shoot shoot = new Shoot();
        EndController ec = new EndController();
        Board.writeBoard();

        do {
            Shoot.playerGuess();
            Shoot.enemyGuess();
            Board.writeBoard();
        } while(enemyShipCount != 0 || playerShipCount != 0);

        EndController.endGame();
    }
}
