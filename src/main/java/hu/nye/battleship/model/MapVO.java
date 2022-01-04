package hu.nye.battleship.model;

public class MapVO {
    private int playerRow;
    private int playerColumn;
    private int enemyRow;
    private int enemyColumn;

    public static int[][] playerBoard = new int[10][10];
    public static int[][] enemyBoard = new int[10][10];

    public MapVO(int playerRow, int playerColumn, int enemyRow, int enemyColumn) {
        this.playerRow = playerRow;
        this.playerColumn = playerColumn;
        this.enemyRow = enemyRow;
        this.enemyColumn = enemyColumn;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public void setPlayerRow(int playerRow) {
        this.playerRow = playerRow;
    }

    public int getPlayerColumn() {
        return playerColumn;
    }

    public void setPlayerColumn(int playerColumn) {
        this.playerColumn = playerColumn;
    }

    public int getEnemyRow() {
        return enemyRow;
    }

    public void setEnemyRow(int enemyRow) {
        this.enemyRow = enemyRow;
    }

    public int getEnemyColumn() {
        return enemyColumn;
    }

    public void setEnemyColumn(int enemyColumn) {
        this.enemyColumn = enemyColumn;
    }
}
