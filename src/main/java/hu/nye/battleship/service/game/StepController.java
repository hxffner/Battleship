package hu.nye.battleship.service.game;

import static hu.nye.battleship.model.Shoot.enemyShipCount;
import static hu.nye.battleship.model.Shoot.playerShipCount;

public class StepController {

    public static void nextStep() {
        GameController gc = new GameController();
        if(enemyShipCount == 0 && playerShipCount > 0) {
            System.out.print("Gyoztel");
            GameController.endGame();
        }
        else if(playerShipCount == 0 && enemyShipCount > 0) {
            System.out.print("Vesztettel");
            GameController.endGame();
        }
        else if(playerShipCount > 0 && enemyShipCount > 0) {
            GameController.middleGame();
        }

    }
}
