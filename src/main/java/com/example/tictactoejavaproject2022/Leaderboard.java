package com.example.tictactoejavaproject2022;

public class Leaderboard extends Winner implements IScore {

    //Attributes
    private int scoreX=0;
    private int scoreO=0;



    //Methods
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


    //Keep count
    //X
    @Override
    public int getIncrementedScoreXPlayer1() {
        scoreX++;
        return scoreX;
    }

    //O
    public int getIncrementedScoreOPlayer2() {
        scoreO++;
        return scoreO;
    }


}