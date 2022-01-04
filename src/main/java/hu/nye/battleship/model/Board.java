package hu.nye.battleship.model;

import org.springframework.stereotype.Service;

@Service
public class Board {

    public static int playerRow;
    public static int playerColumn;
    public static int[][] playerBoard = new int[10][10];
    public static int enemyRow;
    public static int enemyColumn;
    public static int[][] enemyBoard = new int[10][10];



    public static void fillBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                playerBoard[i][j] = 0;
                enemyBoard[i][j] = 0;
            }
        }
    }

    public static void writeBoard() {
        System.out.print("  ");
        for (char i = 'A'; i < 10 + 65; i++) {
            System.out.print(i + " ");
        }
        System.out.print("      ");
        for (char i = 'A'; i < 10 + 65; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (playerRow = 0, enemyRow = 0; playerRow < 10 && enemyRow < 10; playerRow++, enemyRow++) {
            System.out.print(playerRow);
            for (playerColumn = 0; playerColumn < 10; playerColumn++) {
                if (playerBoard[playerRow][playerColumn] == 0) {
                    System.out.print(" O");
                } else if (playerBoard[playerRow][playerColumn] == 1) {
                    System.out.print(" *");
                } else if (playerBoard[playerRow][playerColumn] == 2) {
                    System.out.print(" +");
                } else if (playerBoard[playerRow][playerColumn] == 3) {
                    System.out.print(" X");
                }
            }

            System.out.print("     ");
            System.out.print(enemyRow);

            for(enemyColumn = 0; enemyColumn < 10;enemyColumn++) {
                if(enemyBoard[enemyRow][enemyColumn] == 0) {
                    System.out.print(" O");
                }
                else if(enemyBoard[enemyRow][enemyColumn] == 1) {
                    System.out.print(" O");
                }
                else if(enemyBoard[enemyRow][enemyColumn] == 2) {
                    System.out.print(" +");
                }
                else if(enemyBoard[enemyRow][enemyColumn] == 3) {
                    System.out.print(" X");
                }
            }
            System.out.println("");
        }

    }
}
