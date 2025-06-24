package com.project.appsstudiowork;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class AppsStudioWorkApplicationMainTests {

    @Test
    void mainMethodStartsSpringApplication() {
        try (MockedStatic<SpringApplication> springApplicationMock = Mockito.mockStatic(SpringApplication.class)) {
            // Arrange
            String[] args = {"--spring.profiles.active=test"};

            // Act
            AppsStudioWorkApplication.main(args);

            // Assert
            springApplicationMock.verify(() ->
                    SpringApplication.run(eq(AppsStudioWorkApplication.class), eq(args))
            );
        }
    }

    @Test
    void mainMethodWithEmptyArgs() {
        try (MockedStatic<SpringApplication> springApplicationMock = Mockito.mockStatic(SpringApplication.class)) {
            // Arrange
            String[] args = {};

            // Act
            AppsStudioWorkApplication.main(args);

            // Assert
            springApplicationMock.verify(() ->
                    SpringApplication.run(eq(AppsStudioWorkApplication.class), eq(args))
            );
        }
    }

    @Test
    void mainMethodWithNullArgs() {
        try (MockedStatic<SpringApplication> springApplicationMock = Mockito.mockStatic(SpringApplication.class)) {
            // Act
            AppsStudioWorkApplication.main(null);

            // Assert
            springApplicationMock.verify(() ->
                    SpringApplication.run(eq(AppsStudioWorkApplication.class), any())
            );
        }
    }
}
