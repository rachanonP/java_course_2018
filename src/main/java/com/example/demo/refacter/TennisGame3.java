package com.example.demo.refacter;

public class TennisGame3 implements TennisGame{

    private int player2;
    private int player1;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score;
        if (player1 == player2) {
            if (player1 < 3)
                return getPlayerScore(player1) + "-All";
            else
                return "Deuce";
        } else if (player1 < 4 && player2 < 4 && !(player1 + player2 == 6)) {
            return getPlayerScore(player1) + "-" + getPlayerScore(player2);
        } else {
            score = getPlayerNameScoreMore();
            if (player1 - player2 == 1) {
                return "Advantage " + score;
            } else if (player1 - player2 == -1) {
                return "Advantage " + score;
            }
            return "Win for " + score;
        }
    }

    private String getPlayerScore(int score) {
        String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return point[score];
    }

    private String getPlayerNameScoreMore() {
        if (player1 > player2)
            return player1Name;
        else
            return player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1 += 1;
        else
            this.player2 += 1;

    }

}
