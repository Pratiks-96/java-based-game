package com.game.controller;

import com.game.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/health")
    public String health() {
        return "Game Service is running!";
    }

    @GetMapping("/play")
    public String play() {
        return gameService.playGame();
    }
}
