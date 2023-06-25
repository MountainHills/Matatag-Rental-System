package com.antonbondoc.matatagrentalsystem.rest;

import com.antonbondoc.matatagrentalsystem.core.RoomService;
import com.antonbondoc.matatagrentalsystem.dto.request.RoomRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.RoomResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/room")
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomResponseDto>> getRooms() {
        return ResponseEntity.ok(roomService.getRooms());
    }

    @GetMapping(path = "{roomId}")
    public ResponseEntity<RoomResponseDto> getRoom(@PathVariable("roomId") UUID roomId) {
        return ResponseEntity.ok(roomService.getRoom(roomId));
    }

    @PostMapping
    public ResponseEntity<RoomResponseDto> createRoom(@Valid @RequestBody RoomRequestDto request) {
        return ResponseEntity.ok(roomService.createRoom(request));
    }

    @PutMapping(path = "{roomId}")
    public ResponseEntity<RoomResponseDto> updateRoom(@PathVariable("roomId") UUID roomId, @Valid @RequestBody RoomRequestDto request) {
        return ResponseEntity.ok(roomService.updateRoom(roomId, request));
    }

    @DeleteMapping(path = "{roomId}")
    public ResponseEntity<Void> deleteRoom(@PathVariable("roomId") UUID roomId) {
        roomService.deleteRoom(roomId);
        return ResponseEntity.noContent().build();
    }
}
