package com.solid;

import java.util.Random;

public class Football extends Game {

    private Random rand = new Random();

    public Football(String team1, String team2) {
        super(team1, team2);
    }

    @Override
    protected void initializeGame() {
        System.out.printf("Playing a game of Football: %s X %s%n", team1, team2);
    }

    @Override
    protected void playing() {
        for(int i = 0; i < 10; i++) {
            if(rand.nextInt() % 2 == 0){
                score1++;
            } else {
                score2++;
            }
        }
    }

    @Override
    protected void showResults() {
        System.out.printf("End of Football game: %s %d X %d %s%n", team1, score1, score2, team2);
    }

}
