package com.rockpaperscissors.demoproject;

import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;





@RequestMapping("/api")
@RestController
public class RockPaperScissorsController {

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // allow requests from the angular frontend application
                registry.addMapping("/api/play").allowedOrigins("http://localhost:4200");
            }
        };
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    
    @PostMapping("/play")
    public Result play(@RequestBody PlayRequest request) {
        // Generate a random symbol for the computer
        String[] symbols = {"rock", "paper", "scissors"};
        int index = new Random().nextInt(symbols.length);
        String computer = symbols[index];

        // Apply the rules of rock, paper, scissors to determine the winner
        String winner;
        if (request.getPlayer().equals(computer)) {
            winner = "draw";
        } else if (request.getPlayer().equals("rock") && computer.equals("scissors") ||
                request.getPlayer().equals("paper") && computer.equals("rock") ||
                request.getPlayer().equals("scissors") && computer.equals("paper")) {
            winner = "player";
        } else {
            winner = "computer";
        }

        // Return the result
        return new Result(request.getPlayer(), computer, winner);
    }
   
}


