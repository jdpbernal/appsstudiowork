package com.project.appstudiowork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LegalController {

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

    @GetMapping("/compassgeolocation-privacy-policy")
    public String compassGeoLocationPrivacyPolicy() {
        return "compassgeolocation-privacy-policy";
    }

    @GetMapping("/compassgeolocation-terms-of-service")
    public String compassGeoLocationTermsOfService() {
        return "compassgeolocation-terms-of-service";
    }

    @GetMapping("/trackmysteps-privacy-policy")
    public String trackMyStepsPrivacyPolicy() {
        return "trackmysteps-privacy-policy";
    }

    @GetMapping("/trackmysteps-terms-of-service")
    public String trackMyStepsTermsOfService() {
        return "trackmysteps-terms-of-service";
    }

    @GetMapping("/guesstheword-privacy-policy")
    public String guessTheWordPrivacyPolicy() {
        return "guesstheword-privacy-policy";
    }

    @GetMapping("/guesstheword-terms-of-service")
    public String guessTheWordTermsOfService() {
        return "guesstheword-terms-of-service";
    }
}
