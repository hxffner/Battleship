package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Player;
import hu.nye.battleship.model.Ship;
import hu.nye.battleship.model.Shoot;

import hu.nye.battleship.service.database.Database;
import hu.nye.battleship.ui.RawMapPrinter;
import org.springframework.stereotype.Service;


@Service
public class GameController {


    public static void startGame() {
        Player.playerInformation();
        RawMapPrinter.fillBoard();
        Ship.playerShipsPlacement();
        Ship.enemyShipsPlacement();
        GameController.middleGame();
    }

    public static void middleGame() {
        Board.writeBoard();
        Shoot.playerGuess();
        Shoot.enemyGuess();
        StepController.nextStep();
    }

    public static void endGame() {
        Database.highscore();
    }

}
