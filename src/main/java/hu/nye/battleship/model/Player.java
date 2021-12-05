package hu.nye.battleship.model;

import java.util.Scanner;

public class Player {

    public static String playerName;

    public static void playerInformation() {
        System.out.println("Kerem, adja meg a nevet!");
        Scanner sc = new Scanner(System.in);
        String pn = sc.nextLine();
        playerName = pn;
        System.out.println("Udvozoljuk, "+playerName+". Sok sikert!");
    }
}
