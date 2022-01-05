package hu.nye.battleship.persistence.xml;

import jakarta.xml.bind.annotation.XmlRootElement;


/**
 * Exact copy of {@link SaveGame} that can be used for XML marshalling/unmarshalling.
 */
@XmlRootElement(name = "board_state")
public class PersistableSaveGame {

    private int playerRowSave;
    private int playerColumnSave;
    private int enemyRowSave;
    private int enemyColumnSave;

    public PersistableSaveGame() {
    }

    /**
     * Exact copy of {@link SaveGame}.
     */
    public PersistableSaveGame(int playerRowSave, int playerColumnSave,
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
