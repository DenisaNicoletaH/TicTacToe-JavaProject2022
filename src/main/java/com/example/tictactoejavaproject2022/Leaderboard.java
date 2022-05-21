package com.example.tictactoejavaproject2022;

public class Leaderboard implements Iplayable {

    private int score;

    private int won;





    public Leaderboard (int score,int ties,int won){

        this.score=score;this.won=won;

    }



    public int getScore(int score,int won) {

    return  getScore(score,won);
    }

    public int getPlayer1Score(int score,int won){

        return score;
    }

public int getPlayer2Score(int score,int won){



        return score;
}



    @Override
    public void haveLeaderboard() {

    }

    @Override
    public void getPlayer2Score() {
        getScore(score,won);
    }

    public void getPlayer1Score() {
        getScore(score,won);
    }
}
