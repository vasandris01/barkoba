package com.example.barkoba.service;

import com.example.barkoba.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    private Game game;
    private int choice;

    @Autowired
    public GameService(Game game, int choice) {
        this.game = game;
        this.choice = choice;
    }
}
