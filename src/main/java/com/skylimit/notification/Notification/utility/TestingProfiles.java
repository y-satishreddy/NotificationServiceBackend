package com.skylimit.notification.Notification.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class TestingProfiles {

    @Value("${app.name}")
    private String name;

    @Value("${app.message}")
    private String message;

    @PostConstruct
    public void init() {
        System.out.println(name + " | " + message);
    }
}