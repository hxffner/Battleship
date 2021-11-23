package hu.nye.battleship.model;

import java.util.Random;
import java.util.Scanner;

import static hu.nye.battleship.model.Board.enemyBoard;
import static hu.nye.battleship.model.Board.playerBoard;

public class Shoot {
    public static int enemyShipCount = 5;
    public static int playerShipCount = 5;

    public static void playerGuess() {
                System.out.println("Ird be az X Y koordinatakat oda ahova loni akarsz");
                Scanner scX = new Scanner(System.in);
                int shootX = scX.nextInt();
                Scanner scY = new Scanner(System.in);
                int shootY = scY.nextInt();
                if (enemyBoard[shootX][shootY] == 0) {
                    enemyBoard[shootX][shootY] = 3;
                    System.out.println("Sajnos melle lottel");
                } else if (enemyBoard[shootX][shootY] == 1) {
                    enemyBoard[shootX][shootY] = 2;
                    System.out.println("Eltalaltad");
                    enemyShipCount--;
                } else if (enemyBoard[shootX][shootY] == 2 || enemyBoard[shootX][shootY] == 3) {
                    System.out.println("Ide mar lottel");
                }
        }


    public static void enemyGuess() {
        Random random = new Random();
        int randSX = random.nextInt(10);
        int randSY = random.nextInt(10);
        if (playerBoard[randSX][randSY] == 0) {
            playerBoard[randSX][randSY] = 3;
        } else if (playerBoard[randSX][randSY] == 1) {
            playerBoard[randSX][randSY] = 2;
            playerShipCount--;
        } else if (playerBoard[randSX][randSY] == 2 || playerBoard[randSX][randSY] == 3) {}

    }

}
