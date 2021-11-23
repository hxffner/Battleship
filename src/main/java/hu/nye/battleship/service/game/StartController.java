package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Player;
import hu.nye.battleship.model.Ship;

public class StartController {

    public static void startGame() {
        Player player = new Player();
        Board board = new Board();
        Ship ship = new Ship();
        MiddleController mc = new MiddleController();
        Player.playerInformation();
        Board.fillBoard();
        Ship.playerShipsPlacement();
        Ship.enemyShipsPlacement();
        MiddleController.middleGame();
    }
}
