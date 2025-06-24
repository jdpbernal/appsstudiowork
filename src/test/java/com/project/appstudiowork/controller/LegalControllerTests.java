package com.project.appstudiowork.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(LegalController.class)
class LegalControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void privacyPolicyEndpointReturnsPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("privacy-policy"));
    }

    @Test
    void termsOfServiceEndpointReturnsTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("terms-of-service"));
    }

    @Test
    void flashlightPrivacyPolicyEndpointReturnsFlashlightPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/flashlight-privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("flashlight-privacy-policy"));
    }

    @Test
    void flashlightTermsOfServiceEndpointReturnsFlashlightTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/flashlight-terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("flashlight-terms-of-service"));
    }

    @Test
    void calculatorPrivacyPolicyEndpointReturnsCalculatorPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/calculator-privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("calculator-privacy-policy"));
    }

    @Test
    void calculatorTermsOfServiceEndpointReturnsCalculatorTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/calculator-terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("calculator-terms-of-service"));
    }

    @Test
    void compassGeoLocationPrivacyPolicyEndpointReturnsCompassGeoLocationPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/compassgeolocation-privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("compassgeolocation-privacy-policy"));
    }

    @Test
    void compassGeoLocationTermsOfServiceEndpointReturnsCompassGeoLocationTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/compassgeolocation-terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("compassgeolocation-terms-of-service"));
    }

    @Test
    void guessTheWordPrivacyPolicyEndpointReturnsGuessTheWordPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/guesstheword-privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("guesstheword-privacy-policy"));
    }

    @Test
    void guessTheWordTermsOfServiceEndpointReturnsGuessTheWordTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/guesstheword-terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("guesstheword-terms-of-service"));
    }

    @Test
    void trackMyStepsPrivacyPolicyEndpointReturnsTrackMyStepsPrivacyPolicyView() throws Exception {
        mockMvc.perform(get("/trackmysteps-privacy-policy"))
                .andExpect(status().isOk())
                .andExpect(view().name("trackmysteps-privacy-policy"));
    }

    @Test
    void trackMyStepsTermsOfServiceEndpointReturnsTrackMyStepsTermsOfServiceView() throws Exception {
        mockMvc.perform(get("/trackmysteps-terms-of-service"))
                .andExpect(status().isOk())
                .andExpect(view().name("trackmysteps-terms-of-service"));
    }
}
