package hu.nye.battleship.service.game;

import hu.nye.battleship.service.database.Database;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

import static hu.nye.battleship.model.Shoot.enemyShipCount;
import static hu.nye.battleship.model.Shoot.playerShipCount;

@Service
public class StepController {

    public static void nextStep() {
        GameController gc = new GameController();
        if(enemyShipCount == 0 && playerShipCount > 0) {
            System.out.print("Gyoztel");
            Database.playerWin();
            GameController.endGame();
        }
        else if(playerShipCount == 0 && enemyShipCount > 0) {
            System.out.print("Vesztettel");
            Database.playerLose();
            GameController.endGame();
        }
        else if(playerShipCount > 0 && enemyShipCount > 0) {
            GameController.middleGame();
        }

    }
}
