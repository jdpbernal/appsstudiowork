package com.project.appsstudiowork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/project")
    public String project() {
        return "project";
    }

    @GetMapping("/project/mobile-apps")
    public String mobileApps() {
        return "mobile-apps";
    }

    @GetMapping("/project/games")
    public String games() {
        return "games";
    }

    @GetMapping("/project/simple-games")
    public String simpleGames() {
        return "simple-games";
    }

    @GetMapping("/project/advanced-games")
    public String advancedGames() {
        return "advanced-games";
    }

    @GetMapping("/project/graphics-art")
    public String graphicsArt() {
        return "graphics-art";
    }

    @GetMapping("/project/web-services")
    public String webServices() {
        return "web-services";
    }
}