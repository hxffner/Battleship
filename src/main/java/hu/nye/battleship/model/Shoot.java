package hu.nye.battleship.model;

import static hu.nye.battleship.model.Board.enemyBoard;
import static hu.nye.battleship.model.Board.playerBoard;

import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Service;

/**
 * Shooting implementation.
 */
@Service
public class Shoot {
    public static int enemyShipCount = 5;
    public static int playerShipCount = 5;

    /**
     *  Player guesses where the enemy ships are.
     */
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

    /**
     * Enemy guesses where the player ships are.
     */
    public static void enemyGuess() {
        Random random = new Random();
        int randsX = random.nextInt(10);
        int randsY = random.nextInt(10);
        if (playerBoard[randsX][randsY] == 0) {
            playerBoard[randsX][randsY] = 3;
        } else if (playerBoard[randsX][randsY] == 1) {
            playerBoard[randsX][randsY] = 2;
            playerShipCount--;
        } else if (playerBoard[randsX][randsY] == 2 || playerBoard[randsX][randsY] == 3) {
            //Ez itt a checkstyle miatt van ideirva, mivel nem engedi, hogy ures legyen a {}.
        }
    }
}
