package com.rockpaperscissors.demoproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlayMethodTest {

    
    @Test
    public void testPlayerWins() {
        Result result = new Result("rock", "scissors", "player");
        assertEquals("player", result.getWinner());
    }

    

    @Test
    public void testDraw() {
        Result result = new Result("rock", "rock", "draw");
        assertEquals("draw", result.getWinner());
    }

    @Test
    public void testComputerWins() {
        Result result = new Result("rock", "paper", "computer");
        assertEquals("computer", result.getWinner());
    }
}
