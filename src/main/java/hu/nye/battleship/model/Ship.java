package hu.nye.battleship.model;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

import static hu.nye.battleship.model.Board.enemyBoard;
import static hu.nye.battleship.model.Board.playerBoard;

@Service
public class Ship {

    public static void playerShipsPlacement() {
        for(int i = 0;i<5;) {
            System.out.println("Irja be a " +(i+1)+". hajo X Y koordinatajat");
            Scanner scX = new Scanner(System.in);
            int tempX = scX.nextInt();
            Scanner scY = new Scanner(System.in);
            int tempY = scY.nextInt();
            if(playerBoard[tempX][tempY] == 0 && (tempX >= 0 && tempX < 9) && (tempY >= 0 && tempY < 9)) {
                playerBoard[tempX][tempY] = 1;
                i++;
            }
            else if(playerBoard[tempX][tempY] == 0 && (tempX < 0 || tempX >= 9) || (tempY < 0 || tempY >= 9)) {
                System.out.println("Rosszak a koordinatak");
            }
            else if(playerBoard[tempX][tempY] == 1) {
                System.out.println("Itt mar talalhato egy hajo");
            }
        }
    }

    public static void enemyShipsPlacement() {
        for(int i=0;i<5;) {
            Random random = new Random();
            int randX = random.nextInt(10);
            int randY = random.nextInt(10);
            if(enemyBoard[randX][randY] == 0) {
                enemyBoard[randX][randY] = 1;
                i++;
            }
            else if(enemyBoard[randX][randY] == 1) {
                System.out.println("Itt mar talalhato egy hajo");
            }
        }
    }
}
