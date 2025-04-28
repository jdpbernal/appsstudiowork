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
}