package com.example.demo.refacter;


public class TennisGame1 implements TennisGame{

    private int minusScore1 = 0;
    private int minusScore2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            minusScore1 += 1;
        else
            minusScore2 += 1;
    }

    public String getScore() {
        String score;
        if (minusScore1 == minusScore2) {
            if (minusScore1 < 3){
                return getPlayerScore(minusScore1) + "-All";
            } else {
                return "Deuce";
            }

        } else if (minusScore1 >= 4 || minusScore2 >= 4) {
            int minusResult = minusScore1 - minusScore2;
            if (minusResult == 1)
                return "Advantage player1";
            else if (minusResult == -1)
                return "Advantage player2";
            else if (minusResult >= 2)
                return "Win for player1";
            else
                return "Win for player2";
        }

        return getPlayerScore(minusScore1)+"-"+getPlayerScore(minusScore2);
        
    }

    private String getPlayerScore(int tempScore) {
        String[] score = {"Love", "Fifteen", "Thirty", "Forty"};
        return score[tempScore];
    }
}

