package com.example.demo.refacter;

public class TennisGame3 {

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
        if (player1 < 4 && player2 < 4 && !(player1 + player2 == 6)) {
            String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = point[player1];
            return (player1 == player2) ? score + "-All" : score + "-" + point[player2];
        } else {
            if (player1 == player2)
                return "Deuce";
            score = player1 > player2 ? player1Name : player2Name;
            return ((player1 - player2)*(player1 - player2) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1 += 1;
        else
            this.player2 += 1;

    }

}
