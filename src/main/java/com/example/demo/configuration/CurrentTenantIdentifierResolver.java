package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
public class CurrentTenantIdentifierResolver implements org.hibernate.context.spi.CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        if (SecurityContextHolder.getContext().getAuthentication()==null){
            return "any";
        } else {
            Authentication context = SecurityContextHolder.getContext().getAuthentication();
            Object o = context.getDetails();
            return "role";
        }

    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
