package day5.ox;

import java.util.ArrayList;
import java.util.List;

public class OXGame {

    private String[][] table = new String[3][3];
    private Player player1;
    private Player player2;
    private boolean status;
    private Player winner;

    public OXGame() {
        initialTable();
        player1 = new Player();
        player2 = new Player();
    }

    public String[][] getTable() {
        return table;
    }

    private void initialTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = "";
            }
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void PlayWith(Player player, int i, int j) {
        if (table[i][j].equals("")){
            table[i][j] = player.getSymbol();
            updateWinner(i, j, player);
        }
    }

    public String getValueAt(int i, int j) {
        return table[i][j];
    }

    public boolean isWinner() {
        return status;
    }

    private void updateWinner(int column,int row, Player player) {
        String symbol = player.getSymbol();
        status = ((table[column][0].equals(symbol)
                && table[column][1].equals(symbol)
                && table[column][2].equals(symbol))
                || (table[0][row].equals(symbol)
                && table[1][row].equals(symbol)
                && table[2][row].equals(symbol))
                ||(table[0][0].equals(symbol)
                && table[1][1].equals(symbol)
                && table[2][2].equals(symbol))
                ||(table[0][2].equals(symbol)
                && table[1][1].equals(symbol)
                && table[2][0].equals(symbol)));
        if (status) {
            winner = player;
        }
    }

    public Player getPlayerWin() {
        return winner;
    }
}
