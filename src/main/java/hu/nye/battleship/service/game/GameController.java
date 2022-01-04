package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Player;
import hu.nye.battleship.model.Ship;
import hu.nye.battleship.model.Shoot;

import org.springframework.stereotype.Service;

@Service
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
        StepController sc = new StepController();
        Board.writeBoard();

        Shoot.playerGuess();
        Shoot.enemyGuess();
        StepController.nextStep();

    }

    public static void endGame() {

    }

}
