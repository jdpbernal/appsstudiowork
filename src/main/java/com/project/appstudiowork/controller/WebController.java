package com.project.appstudiowork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/privacy-policy")
    public String privacyPolicy() {
        return "privacy-policy";
    }

    @GetMapping("/terms-of-service")
    public String termsOfService() {
        return "terms-of-service";
    }

    @GetMapping("/flashlight-privacy-policy")
    public String flashlightPrivacyPolicy() {
        return "flashlight-privacy-policy";
    }

    @GetMapping("/flashlight-terms-of-service")
    public String flashlightTermsOfService() {
        return "flashlight-terms-of-service";
    }

    @GetMapping("/calculator-privacy-policy")
    public String calculatorPrivacyPolicy() {
        return "calculator-privacy-policy";
    }

    @GetMapping("/calculator-terms-of-service")
    public String calculatorTermsOfService() {
        return "calculator-terms-of-service";
    }

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

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/case-study")
    public String caseStudy() {
        return "case-study";
    }

}
