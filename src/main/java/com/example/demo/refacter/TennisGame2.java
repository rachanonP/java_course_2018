package com.example.demo.refacter;

public class TennisGame2 implements TennisGame{

    private int player1Point = 0;
    private int player2Point = 0;
    private String player1Result = "";
    private String player2Result = "";

    public TennisGame2(String player1Name, String player2Name) {

    }

    private String sayScore(int point){
        String[] scores = {"Love", "Fifteen", "Thirty", "Forty"};
        return scores[point];
    }

    public String getScore() {

        if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            return  "Win for player1";
        }

        if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            return  "Win for player2";
        }

        if (player1Point > player2Point && player2Point >= 3) {
            return  "Advantage player1";
        }

        if (player2Point > player1Point && player1Point >= 3) {
            return  "Advantage player2";
        }

        if (player1Point == player2Point && player1Point > 2) {
            return  "Deuce";
        }

        if (player1Point == player2Point && player1Point < 3) {
            return sayScore(player1Point) + "-All";
        }

        return sayScore(player1Point) + "-" + sayScore(player2Point);
    }

    public void setPlayer1Score() {
        player1Point++;
    }

    public void setPlayer2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            setPlayer1Score();
        else
            setPlayer2Score();
    }

}
