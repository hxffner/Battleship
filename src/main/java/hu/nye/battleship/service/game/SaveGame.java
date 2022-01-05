package hu.nye.battleship.service.game;

import static hu.nye.battleship.model.Board.enemyColumn;
import static hu.nye.battleship.model.Board.enemyRow;
import static hu.nye.battleship.model.Board.playerColumn;
import static hu.nye.battleship.model.Board.playerRow;



/**
 * Saving information.
 */
public class SaveGame {


    private int playerRowSave = playerRow;
    private int playerColumnSave = playerColumn;
    private int enemyRowSave = enemyRow;
    private int enemyColumnSave = enemyColumn;

    /**
     * Saving information.
     */
    public SaveGame(int playerRowSave, int playerColumnSave,
                    int enemyRowSave, int enemyColumnSave) {
        this.playerRowSave = playerRowSave;
        this.playerColumnSave = playerColumnSave;
        this.enemyRowSave = enemyRowSave;
        this.enemyColumnSave = enemyColumnSave;
    }

    public int getPlayerRowSave() {
        return playerRowSave;
    }

    public void setPlayerRowSave(int playerRowSave) {
        this.playerRowSave = playerRowSave;
    }

    public int getPlayerColumnSave() {
        return playerColumnSave;
    }

    public void setPlayerColumnSave(int playerColumnSave) {
        this.playerColumnSave = playerColumnSave;
    }

    public int getEnemyRowSave() {
        return enemyRowSave;
    }

    public void setEnemyRowSave(int enemyRowSave) {
        this.enemyRowSave = enemyRowSave;
    }

    public int getEnemyColumnSave() {
        return enemyColumnSave;
    }

    public void setEnemyColumnSave(int enemyColumnSave) {
        this.enemyColumnSave = enemyColumnSave;
    }
}
