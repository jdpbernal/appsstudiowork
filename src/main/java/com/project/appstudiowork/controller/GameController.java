package com.project.appstudiowork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/game")
    public String game() {
        return "game";
    }

    @GetMapping("/games/tictactoe")
    public String tictactoe() {
        return "tictactoe";
    }

    @GetMapping("/games/sudoku")
    public String sudoku() {
        return "sudoku";
    }

    @GetMapping("/games/crosstheroad")
    public String crossTheRoad() {
        return "crosstheroad";
    }

    @GetMapping("/games/guesstheword")
    public String guessTheWord() {
        return "guesstheword";
    }
}
