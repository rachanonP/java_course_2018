package day5.ox;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OXGameTest {

    @Test
    public void new_game_table_empty() {
        String[][] expectedTable = generateEmptyTable();
        OXGame oxGame = new OXGame();
        String[][] table = oxGame.getTable();
        assertArrayEquals(expectedTable, table);
    }

    @Test
    public void new_game_2_user_score_is_zero() {
        OXGame oxGame = new OXGame();
        Player player1 = oxGame.getPlayer1();
        Player player2 = oxGame.getPlayer2();
        assertEquals(0, player1.getScore());
        assertEquals(0, player2.getScore());
    }

    @Test
    public void player1_play_first_round() {
        OXGame oxGame = new OXGame();
        Player player1 = new Player("X");
        oxGame.PlayWith(player1, 0, 0);
        assertEquals("X", oxGame.getValueAt(0, 0));
    }

    @Test
    public void player2_play_first_round_1() {
        OXGame oxGame = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        oxGame.PlayWith(player1, 0, 0);
        oxGame.PlayWith(player2, 1, 0);
        assertEquals("X", oxGame.getValueAt(0, 0));
        assertEquals("O", oxGame.getValueAt(1, 0));
    }

    @Test
    public void player1_win_at_horizontal_2() {
        OXGame oxGame = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        oxGame.PlayWith(player1, 1, 0);
        oxGame.PlayWith(player2, 0, 0);
        oxGame.PlayWith(player1, 1, 1);
        oxGame.PlayWith(player2, 2, 0);
        oxGame.PlayWith(player1, 1, 2);
        assertTrue(oxGame.isWinner());
    }


    @Test
    public void player1_win_at_horizontal_3() {
        OXGame oxGame = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        oxGame.PlayWith(player1, 2, 0);
        oxGame.PlayWith(player2, 1, 0);
        oxGame.PlayWith(player1, 2, 1);
        oxGame.PlayWith(player2, 1, 1);
        oxGame.PlayWith(player1, 2, 2);
        assertTrue(oxGame.isWinner());
    }

    @Test
    public void who_win() {
        OXGame oxGame = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        oxGame.PlayWith(player2, 2, 0);
        oxGame.PlayWith(player1, 1, 0);
        oxGame.PlayWith(player2, 2, 1);
        oxGame.PlayWith(player1, 1, 1);
        oxGame.PlayWith(player2, 2, 2);
        Player playerWin = oxGame.getPlayerWin();
        assertEquals(player2, playerWin);
    }


//    @Test
//    public void player1_win_at_horizontal() {
//        OXGame oxGame = new OXGame();
//        Player player1 = new Player("X");
//        Player player2 = new Player("O");
//        oxGame.PlayWith(player1, 0, 0);
//        oxGame.PlayWith(player2, 1, 0);
//        oxGame.PlayWith(player1, 0, 1);
//        oxGame.PlayWith(player2, 2, 0);
//        oxGame.PlayWith(player1, 0, 2);
//        assertTrue(oxGame.isWinner());
//    }
//
//    @Test
//    public void player1_win_at_vertical() {
//        OXGame oxGame = new OXGame();
//        Player player1 = new Player("X");
//        Player player2 = new Player("O");
//        oxGame.PlayWith(player1, 0, 0);
//        oxGame.PlayWith(player2, 0, 1);
//        oxGame.PlayWith(player1, 1, 0);
//        oxGame.PlayWith(player2, 0, 2);
//        oxGame.PlayWith(player1, 2, 0);
//        assertTrue(oxGame.isWinner());
//    }
//
//    @Test
//    public void player1_win_at_diagonal_right_to_left() {
//        OXGame oxGame = new OXGame();
//        Player player1 = new Player("X");
//        Player player2 = new Player("O");
//        oxGame.PlayWith(player1, 0, 2);
//        oxGame.PlayWith(player2, 1, 0);
//        oxGame.PlayWith(player1, 1, 1);
//        oxGame.PlayWith(player2, 0, 1);
//        oxGame.PlayWith(player1, 2, 0);
//        assertTrue(oxGame.isWinner());
//    }

    private String[][] generateEmptyTable() {
        String[][] table = new String[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = "";
            }
        }
        return table;
    }

}
