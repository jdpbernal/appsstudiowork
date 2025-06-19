package com.project.appstudiowork.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(GameController.class)
class GameControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void gameEndpointReturnsGameView() throws Exception {
        mockMvc.perform(get("/game"))
                .andExpect(status().isOk())
                .andExpect(view().name("game"));
    }

    @Test
    void ticTacToeEndpointReturnsTicTacToeView() throws Exception {
        mockMvc.perform(get("/games/tictactoe"))
                .andExpect(status().isOk())
                .andExpect(view().name("tictactoe"));
    }

    @Test
    void sudokuEndpointReturnsSudokuView() throws Exception {
        mockMvc.perform(get("/games/sudoku"))
                .andExpect(status().isOk())
                .andExpect(view().name("sudoku"));
    }

    @Test
    void crossTheRoadEndpointReturnsCrossTheRoadView() throws Exception {
        mockMvc.perform(get("/games/crosstheroad"))
                .andExpect(status().isOk())
                .andExpect(view().name("crosstheroad"));
    }

    @Test
    void guessTheWordEndpointReturnsGuessTheWordView() throws Exception {
        mockMvc.perform(get("/games/guesstheword"))
                .andExpect(status().isOk())
                .andExpect(view().name("guesstheword"));
    }
}
