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
     * Handles requests to the project page
     * @return the name of the project template
     */
    @GetMapping("/project")
    public String project() {
        return "project";
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
