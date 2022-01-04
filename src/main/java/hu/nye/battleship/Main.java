package hu.nye.battleship;

import hu.nye.battleship.service.game.GameController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("hu.nye.battleship");
        GameController gameController = applicationContext.getBean(GameController.class);
        GameController.startGame();

    }
}
