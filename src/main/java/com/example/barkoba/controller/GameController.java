package com.example.barkoba.controller;

import com.example.barkoba.model.Game;
import com.example.barkoba.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/game")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping({"","/","/home"})
    public String getHome(Model model){
        model.addAttribute("game", gameService.getGame());
        model.addAttribute("choice", gameService.getChoice());
        return "home";
    }

    @PostMapping("/play")
    public String getChoice(@RequestParam("choice") int choice){
        System.out.println(choice);
        return "redirect:/game/home";
    }

}
