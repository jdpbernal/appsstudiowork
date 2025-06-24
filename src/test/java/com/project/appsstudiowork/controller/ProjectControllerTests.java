package com.project.appsstudiowork.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(ProjectController.class)
class ProjectControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void projectEndpointReturnsProjectView() throws Exception {
        mockMvc.perform(get("/project"))
                .andExpect(status().isOk())
                .andExpect(view().name("project"));
    }

    @Test
    void mobileAppsEndpointReturnsMobileAppsView() throws Exception {
        mockMvc.perform(get("/project/mobile-apps"))
                .andExpect(status().isOk())
                .andExpect(view().name("mobile-apps"));
    }

    @Test
    void gamesEndpointReturnsGamesView() throws Exception {
        mockMvc.perform(get("/project/games"))
                .andExpect(status().isOk())
                .andExpect(view().name("games"));
    }

    @Test
    void simpleGamesEndpointReturnsSimpleGamesView() throws Exception {
        mockMvc.perform(get("/project/simple-games"))
                .andExpect(status().isOk())
                .andExpect(view().name("simple-games"));
    }

    @Test
    void advancedGamesEndpointReturnsAdvancedGamesView() throws Exception {
        mockMvc.perform(get("/project/advanced-games"))
                .andExpect(status().isOk())
                .andExpect(view().name("advanced-games"));
    }

    @Test
    void graphicsArtEndpointReturnsGraphicsArtView() throws Exception {
        mockMvc.perform(get("/project/graphics-art"))
                .andExpect(status().isOk())
                .andExpect(view().name("graphics-art"));
    }

    @Test
    void webServicesEndpointReturnsWebServicesView() throws Exception {
        mockMvc.perform(get("/project/web-services"))
                .andExpect(status().isOk())
                .andExpect(view().name("web-services"));
    }
}