package hu.nye.battleship.service.database;

import static hu.nye.battleship.model.Player.playerName;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

/**
 * Database implementation.
 * Saves the player's name win/lose count to an existing database.
 */
@Component
public class Database {

    private static Connection connection;

    public Database(Connection connection) {
        this.connection = connection;
    }

    /**
     * Saves the player's name win count to an existing database.
     */
    public static void playerWin() {
        try {
            PreparedStatement preparedStmt = connection.prepareStatement(
                    "INSERT INTO player(Name,Win,Lose)" + "VALUES (?, ?, ?)");
            preparedStmt.setString(1, playerName);
            preparedStmt.setInt(2, 1);
            preparedStmt.setInt(3, 0);
            preparedStmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Saves the player's name lose count to an existing database.
     */
    public static void playerLose() {
        try {
            PreparedStatement preparedStmt = connection.prepareStatement(
                    "INSERT INTO player(Name,Win,Lose)" + "VALUES (?, ?, ?)");
            preparedStmt.setString(1, playerName);
            preparedStmt.setInt(2, 0);
            preparedStmt.setInt(3, 1);
            preparedStmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
     * Writes out the highscore from the Database.
     */
    public static void highscore() {
        try {
            String highscore = "SELECT *" + "FROM player";
            PreparedStatement preparedStmt = connection.prepareStatement(highscore);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(": ");
                System.out.print(rs.getInt(2));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
