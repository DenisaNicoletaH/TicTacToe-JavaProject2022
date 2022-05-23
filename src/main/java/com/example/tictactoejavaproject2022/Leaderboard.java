package com.example.tictactoejavaproject2022;

public class Leaderboard implements Iplayable {

    private int scoreX=0;
    private int scoreO=0;
    private int won;





    @Override
    public void haveLeaderboard() {

    }

    @Override
    public int getPlayer2Score() {
        scoreO++;
        return scoreO;
    }

    public int getPlayer1Score() {
        scoreX++;
        return scoreX;
    }
}
