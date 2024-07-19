package com.solid;

public class Main {
    public static void main(String[] args) {
        Game football = new Football("Botafogo", "Vasco");
        football.play();
        Game basketball = new Basketball("Bulls", "Lakers");
        basketball.play();
    }
}