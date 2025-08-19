package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public interface Utils {
    public static final String baseUrl = "${app.base-endpoint}";
}
