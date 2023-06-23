package com.antonbondoc.matatagrentalsystem.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/tenant")
public class TenantController {
    @GetMapping("/hello")
    public String greet() {
        return "Hello World from Tenant";
    }

    @GetMapping
    public void getTenant() {}

    @PostMapping
    public void createTenant() {}

    @PutMapping
    public void updateTenant() {}

    @DeleteMapping
    public void deleteTenant() {}

}
