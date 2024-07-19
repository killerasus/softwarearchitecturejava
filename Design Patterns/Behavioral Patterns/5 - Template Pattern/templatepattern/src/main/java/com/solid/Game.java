package com.solid;

public abstract class Game {

    protected String team1;
    protected String team2;
    protected int score1 = 0;
    protected int score2 = 0;

    protected Game(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    protected abstract void initializeGame();
    protected abstract void playing();
    protected abstract void showResults();

    public void play() {
        initializeGame();
        playing();
        showResults();
    }
}
