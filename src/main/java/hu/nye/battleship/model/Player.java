package hu.nye.battleship.model;

import java.util.Scanner;

public class Player {

    public static void playerInformation() {
        System.out.println("Kérem, adja meg a nevét!");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        System.out.println("Üdvözöljük, "+playerName+". Sok sikert!");
    }
}
