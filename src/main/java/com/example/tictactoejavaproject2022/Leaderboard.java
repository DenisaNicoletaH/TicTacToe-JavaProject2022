package com.example.tictactoejavaproject2022;

public class Leaderboard extends Winner implements IScore {

    private int scoreX=0;
    private int scoreO=0;




    public void setPlayer1Score(int scoreX) {

        this.scoreX=scoreX;

    }


    public void setPlayer2Score(int scoreO) {

        this.scoreO=scoreO;

    }

    public int getPlayer1Score() {

        return scoreX;

    }


    public int getPlayer2Score() {

        return scoreO;

    }


    @Override
    public void haveLeaderboard() {

    }

    //O
    @Override
    public int getIncrementedScoreXPlayer1() {
        scoreX++;
        return scoreX;
    }

    //X
    public int getIncrementedScoreOPlayer2() {
        scoreO++;
        return scoreO;
    }


}