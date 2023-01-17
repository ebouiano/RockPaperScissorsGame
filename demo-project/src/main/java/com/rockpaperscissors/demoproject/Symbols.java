package com.rockpaperscissors.demoproject;

enum Symbols {
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    private String symbol;

    private Symbols(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }
}