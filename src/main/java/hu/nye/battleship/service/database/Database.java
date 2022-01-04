package hu.nye.battleship.service.database;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.*;

import static hu.nye.battleship.model.Player.playerName;

@Component
public class Database {

    private static Connection connection;

    public Database(Connection connection) {
        this.connection = connection;
    }

    public static void playerWin() {
        try {
            PreparedStatement preparedStmt = connection.prepareStatement("INSERT INTO player(Name,Win,Lose)" + "VALUES (?, ?, ?)");
            preparedStmt.setString (1, playerName);
            preparedStmt.setInt(2,1);
            preparedStmt.setInt(3,0);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ System.out.println(e);}
    }

    public static void playerLose() {
        try {


            PreparedStatement preparedStmt = connection.prepareStatement("INSERT INTO player(Name,Win,Lose)" + "VALUES (?, ?, ?)");
            preparedStmt.setString (1, playerName);
            preparedStmt.setInt(2,0);
            preparedStmt.setInt(3,1);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ System.out.println(e);}
    }


    public static void highscore() {
        try {
            String highscore = "SELECT *" +
                    "FROM player";
            PreparedStatement preparedStmt = connection.prepareStatement(highscore);
            ResultSet rs = preparedStmt.executeQuery();
                while (rs.next()) {
                    System.out.print(rs.getString(1));
                    System.out.print(": ");
                    System.out.print(rs.getInt(2));
                    System.out.println();
                }

        }
        catch(Exception e){ System.out.println(e);}
    }


}
