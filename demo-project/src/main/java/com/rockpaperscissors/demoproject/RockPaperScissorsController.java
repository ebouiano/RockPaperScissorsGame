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
        GameLogic gameLogic = new GameLogic();
        String computer = gameLogic.generateSymbol();
        String winner = gameLogic.decideWinner(request, computer);    
        // Return the result
        return new Result(request.getPlayer(), computer, winner);
    }


}


