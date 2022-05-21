package com.example.tictactoejavaproject2022;

public class Leaderboard implements Iplayable {

    private int scoreX=0;
    private int scoreO=0;
    private int won;





    public Leaderboard (int scoreX,int scoreO,int won){

        this.scoreX=scoreX;
        this.scoreO=scoreO;

    }


//???
    public int getScore(int score,int won) {

    return  getScore(score,won);
    }

    public int getPlayer1Score(int scoreX,int won){

        return scoreX;
    }

    public int getPlayer2Score(int scoreO,int won){


        return scoreO;
}



    @Override
    public void haveLeaderboard() {

    }

    @Override
    public void getPlayer2Score() {
        getScore(scoreO,won);
    }

    public void getPlayer1Score() {
        getScore(scoreX,won);
    }
}
