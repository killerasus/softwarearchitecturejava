package com.solid;

import java.util.Random;

public class Basketball extends Game {

    private Random rand = new Random();

    protected Basketball(String team1, String team2) {
        super(team1, team2);
    }

    @Override
    protected void initializeGame() {
        System.out.printf("Playing a game of Basketball: %s X %s%n", team1, team2);
    }

    @Override
    protected void playing() {
        for(int i = 0; i < 40; i++) {
            if(rand.nextInt() % 2 == 0) {
                score1 += rand.nextInt(3) + 1;
            } else {
                score2 += rand.nextInt(3) + 1;
            }
        }
    }

    @Override
    protected void showResults() {
        System.out.printf("End of Basketball game: %s %d X %d %s%n", team1, score1, score2, team2);
    }

}
