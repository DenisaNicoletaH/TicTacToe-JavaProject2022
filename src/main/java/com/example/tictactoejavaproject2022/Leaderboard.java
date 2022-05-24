package com.example.tictactoejavaproject2022;

public class Leaderboard implements Iplayable {

    private int scoreX=0;
    private int scoreO=0;
    private int won;
    private int incrementedScoreX=0;
    private int incrementedScoreO=0;


    public void setPlayer1Score(int scoreX) {

        this.scoreX=scoreX;

    }


    public void setPlayer2Score(int scoreO) {

        this.scoreO=scoreO;

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
