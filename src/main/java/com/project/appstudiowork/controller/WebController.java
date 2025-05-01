package com.project.appstudiowork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for handling web page requests
 */
@Controller
public class WebController {

    /**
     * Handles requests to the home page
     * @return the name of the home page template
     */
    @GetMapping("/")
    public String home() {
        return "index";
    }

    /**
     * Handles requests to the privacy policy page
     * @return the name of the privacy policy template
     */
    @GetMapping("/privacy-policy")
    public String privacyPolicy() {
        return "privacy-policy";
    }

    /**
     * Handles requests to the game page
     * @return the name of the game template
     */
    @GetMapping("/game")
    public String game() {
        return "game";
    }

    /**
     * Handles requests to the Tic Tac Toe game page
     * @return the name of the Tic Tac Toe game template
     */
    @GetMapping("/games/tictactoe")
    public String tictactoe() {
        return "tictactoe";
    }

    /**
     * Handles requests to the Sudoku game page
     * @return the name of the Sudoku game template
     */
    @GetMapping("/games/sudoku")
    public String sudoku() {
        return "sudoku";
    }

    /**
     * Handles requests to the Cross The Road game page
     * @return the name of the Cross The Road game template
     */
    @GetMapping("/games/crosstheroad")
    public String crossTheRoad() {
        return "crosstheroad";
    }

    /**
     * Handles requests to the project page
     * @return the name of the project template
     */
    @GetMapping("/project")
    public String project() {
        return "project";
    }

    /**
     * Handles requests to the mobile apps project page
     * @return the name of the mobile apps project template
     */
    @GetMapping("/project/mobile-apps")
    public String mobileApps() {
        return "mobile-apps";
    }

    /**
     * Handles requests to the games project page
     * @return the name of the games project template
     */
    @GetMapping("/project/games")
    public String games() {
        return "games";
    }

    /**
     * Handles requests to the web services project page
     * @return the name of the web services project template
     */
    @GetMapping("/project/web-services")
    public String webServices() {
        return "web-services";
    }

    /**
     * Handles requests to the case study page
     * @return the name of the case study template
     */
    @GetMapping("/case-study")
    public String caseStudy() {
        return "case-study";
    }

    /**
     * Handles requests to the about page
     * @return the name of the about template
     */
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
