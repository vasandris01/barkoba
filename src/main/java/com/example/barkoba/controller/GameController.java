package com.example.barkoba.controller;

import com.example.barkoba.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameController {

    @GetMapping({"","/","/home"})
    public String getHome(Model model){
        model.addAttribute("game",1);
        return "home";
    }

}
