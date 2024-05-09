package com.mfortune.microservices.limitsservice.controller;

import com.mfortune.microservices.limitsservice.bean.Limits;
import com.mfortune.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrievelimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
