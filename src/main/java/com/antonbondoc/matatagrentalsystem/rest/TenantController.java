package com.antonbondoc.matatagrentalsystem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tenant")
public class TenantController {
    @GetMapping("/hello")
    public String greet() {
        return "Hello World from Tenant";
    }
}
