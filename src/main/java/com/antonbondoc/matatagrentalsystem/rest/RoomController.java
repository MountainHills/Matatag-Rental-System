package com.antonbondoc.matatagrentalsystem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/room")
public class RoomController {
    @GetMapping("/hello")
    public String greet() {
        return "Hello World from Room";
    }
}
