package com.rockpaperscissors.demoproject;


/**
 * A class representing the result of a game.
 */
public class Result {
    /** The name of the player. */
    private String player;
    /** The name of the computer. */
    private String computer;
    /** The name of the winner. */
    private String winner;

    /**
     * Constructs a new Result with the given player, computer, and winner names.
     * @param player the name of the player
     * @param computer the name of the computer
     * @param winner the name of the winner
     */
    public Result(String player, String computer, String winner) {
        this.player = player;
        this.computer = computer;
        this.winner = winner;
    }

    /**
     * Returns the name of the player.
     * @return the name of the player
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Returns the name of the computer.
     * @return the name of the computer
     */
    public String getComputer() {
        return computer;
    }

    /**
     * Returns the name of the winner.
     * @return the name of the winner
     */
    public String getWinner() {
        return winner;
    }
}

enum Results {
    COMPUTER("computer"), PLAYER("player"), DRAW("draw");
    private String result;

    private Results(String result) {
        this.result = result;
    }

    @Override
    public String toString(){
        return result;
    }
}

