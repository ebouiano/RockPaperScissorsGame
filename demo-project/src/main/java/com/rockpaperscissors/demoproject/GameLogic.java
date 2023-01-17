package com.rockpaperscissors.demoproject;

import java.util.Random;

public class GameLogic {
    
    public String decideWinner (PlayRequest request, String computer) {
        String winner;
        if (request.getPlayer().equals(computer)) {
            winner = Results.DRAW.toString();
        } else if (request.getPlayer().equals(Symbols.ROCK.toString()) && computer.equals(Symbols.SCISSORS.toString()) ||
                request.getPlayer().equals(Symbols.PAPER.toString()) && computer.equals(Symbols.ROCK.toString()) ||
                request.getPlayer().equals(Symbols.SCISSORS.toString()) && computer.equals(Symbols.PAPER.toString())) {
            winner = Results.PLAYER.toString();
        } else {
            winner = Results.COMPUTER.toString();
        }
        return winner;
    }

    public String generateSymbol(){
        String[] symbols = {Symbols.PAPER.toString(), Symbols.ROCK.toString(), Symbols.SCISSORS.toString()};
        int index = new Random().nextInt(symbols.length);
        String computer = symbols[index];
        return computer;
    }
}

