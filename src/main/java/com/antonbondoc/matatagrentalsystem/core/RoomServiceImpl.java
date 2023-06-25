package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.RoomRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.RoomResponseDto;
import com.antonbondoc.matatagrentalsystem.mapper.RoomMapper;
import com.antonbondoc.matatagrentalsystem.model.Room;
import com.antonbondoc.matatagrentalsystem.repository.RoomRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper = RoomMapper.INSTANCE;

    @Override
    public List<RoomResponseDto> getRooms() {
        List<Room> rooms = roomRepository.findAll();
        return roomMapper.roomsToRoomResponseDtos(rooms);
    }

    @Override
    public RoomResponseDto getRoom(UUID id) {
        Room room = roomRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Room does not exist.")
        );
        return roomMapper.roomToRoomResponseDto(room);
    }

    @Override
    public RoomResponseDto createRoom(RoomRequestDto request) {
        Room req = roomMapper.roomRequestDtoToRoom(request);
        Room created = roomRepository.save(req);
        return roomMapper.roomToRoomResponseDto(created);
    }

    @Override
    public RoomResponseDto updateRoom(UUID id, RoomRequestDto request) {
        Room room = roomRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Room does not exist.")
        );
        room.setName(request.getName());
        room.setType(request.getType());
        return roomMapper.roomToRoomResponseDto(room);
    }

    @Override
    public void deleteRoom(UUID id) {
        roomRepository.deleteById(id);
    }
}
