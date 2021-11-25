package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Player;
import hu.nye.battleship.model.Ship;
import hu.nye.battleship.model.Shoot;

import static hu.nye.battleship.model.Shoot.enemyShipCount;
import static hu.nye.battleship.model.Shoot.playerShipCount;

public class GameController {


    public static void startGame() {
        Player player = new Player();
        Board board = new Board();
        Ship ship = new Ship();

        Player.playerInformation();
        Board.fillBoard();
        Ship.playerShipsPlacement();
        Ship.enemyShipsPlacement();
        GameController.middleGame();
    }

    public static void middleGame() {
        Board board = new Board();
        Shoot shoot = new Shoot();
        Board.writeBoard();

        do {
            Shoot.playerGuess();
            Shoot.enemyGuess();
            Board.writeBoard();
        } while(enemyShipCount != 0 || playerShipCount != 0);
        GameController.endGame();
    }

    public static void endGame() {

    }

}
