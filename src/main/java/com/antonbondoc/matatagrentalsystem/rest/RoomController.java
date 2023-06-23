package com.antonbondoc.matatagrentalsystem.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/room")
public class RoomController {
    @GetMapping("/hello")
    public String greet() {
        return "Hello World from Room";
    }

    @GetMapping
    public void getRoom() {}

    @PostMapping
    public void createRoom() {}

    @PutMapping
    public void updateRoom() {}

    @DeleteMapping
    public void deleteRoom() {}
}
