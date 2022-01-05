package hu.nye.battleship.service.game;

import static hu.nye.battleship.model.Shoot.enemyShipCount;
import static hu.nye.battleship.model.Shoot.playerShipCount;

import hu.nye.battleship.service.database.Database;
import org.springframework.stereotype.Service;

/**
 * Step Controller use other classes to control the step process.
 */
@Service
public class StepController {

    /**
     * Initializes the next step.
     */
    public static void nextStep() {
        GameController gc = new GameController();
        if (enemyShipCount == 0 && playerShipCount > 0) {
            System.out.print("Gyoztel");
            Database.playerWin();
            GameController.endGame();
        } else if (playerShipCount == 0 && enemyShipCount > 0) {
            System.out.print("Vesztettel");
            Database.playerLose();
            GameController.endGame();
        } else if (playerShipCount > 0 && enemyShipCount > 0) {
            GameController.middleGame();
        }

    }
}
