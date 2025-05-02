package com.online_shop.online_shopping.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allows CORS for all paths, all origins, with all methods
        registry.addMapping("/**") // Path pattern
                .allowedOrigins("http://example.com", "http://localhost:4200") // Allowed origins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD") // Allowed HTTP methods
                .allowedHeaders("*") // Allowed headers
                .allowCredentials(true) // Allow credentials
                .maxAge(3600); // Cache the CORS pre-flight response for 1 hour
    }
}
