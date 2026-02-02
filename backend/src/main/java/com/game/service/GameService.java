package com.game.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class GameService {

    private final String[] outcomes = {
            "🎉 You won the game!",
            "😢 You lost. Try again!",
            "😐 It's a draw!",
            "🔥 Jackpot! Big win!"
    };

    public String playGame() {
        Random random = new Random();
        return outcomes[random.nextInt(outcomes.length)];
    }
}
