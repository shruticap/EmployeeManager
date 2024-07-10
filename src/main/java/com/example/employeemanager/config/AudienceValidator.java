package com.example.employeemanager.config;


import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2ErrorCodes;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtValidator;
import org.springframework.util.Assert;

public class AudienceValidator implements JwtValidator {

    private final String expectedAudience;

    public AudienceValidator(String expectedAudience) {
        Assert.hasText(expectedAudience, "Expected audience must not be empty or null");
        this.expectedAudience = expectedAudience;
    }

    @Override
    public void validate(Jwt jwt) {
        if (!jwt.getAudience().contains(expectedAudience)) {
            OAuth2Error error = new OAuth2Error(OAuth2ErrorCodes.INVALID_TOKEN);
            throw new AudienceValidationException(error);
        }
    }
}
