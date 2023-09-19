package com.example.barkoba.config;

import com.example.barkoba.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean(int number){
        return new Game(number);
    }

    @Bean
    public int numberBean(Random random){
        return random.nextInt(1000);
    }

    @Bean
    public Random randomBean(){
        return new Random();
    }
}
