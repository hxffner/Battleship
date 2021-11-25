package hu.nye.battleship;

import hu.nye.battleship.service.game.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gc = new GameController();
        GameController.startGame();
    }
}
