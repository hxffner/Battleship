package hu.nye.battleship.service.game;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.Player;
import hu.nye.battleship.model.Ship;
import hu.nye.battleship.model.Shoot;
import hu.nye.battleship.service.database.Database;
import hu.nye.battleship.ui.RawMapPrinter;
import org.springframework.stereotype.Service;

/**
 * Game Controller use other classes to control the game process.
 */
@Service
public class GameController {

    /**
     * Starts the game.
     */
    public static void startGame() {
        Player.playerInformation();
        RawMapPrinter.fillBoard();
        Ship.playerShipsPlacement();
        Ship.enemyShipsPlacement();
        GameController.middleGame();
    }
    /**
     * Implements the middle part of the game.
     */

    public static void middleGame() {
        Board.writeBoard();
        Shoot.playerGuess();
        Shoot.enemyGuess();
        StepController.nextStep();
    }
    /**
     * Ends the game.
     */

    public static void endGame() {
        Database.highscore();
    }

}
