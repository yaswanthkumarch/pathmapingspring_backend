package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS from React app running at localhost:3000
        registry.addMapping("/**")  // Apply CORS to all routes
                .allowedOrigins("http://localhost:3000")  // Your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                .allowedHeaders("*");  // Allow any headers
    }
}
