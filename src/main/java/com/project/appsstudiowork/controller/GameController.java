package com.project.appsstudiowork.controller;

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


    @GetMapping("/games/guesstheword")
    public String guessTheWord() {
        return "guesstheword";
    }
}
