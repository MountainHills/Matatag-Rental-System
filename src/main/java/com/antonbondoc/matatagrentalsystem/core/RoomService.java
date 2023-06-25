package com.antonbondoc.matatagrentalsystem.core;


import com.antonbondoc.matatagrentalsystem.dto.request.RoomRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.RoomResponseDto;

import java.util.List;
import java.util.UUID;

public interface RoomService {
    List<RoomResponseDto> getRooms();
    RoomResponseDto getRoom(UUID id);
    RoomResponseDto createRoom(RoomRequestDto request);
    RoomResponseDto updateRoom(UUID id, RoomRequestDto request);
    void deleteRoom(UUID id);
}
