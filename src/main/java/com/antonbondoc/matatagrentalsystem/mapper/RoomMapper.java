package com.antonbondoc.matatagrentalsystem.mapper;

import com.antonbondoc.matatagrentalsystem.dto.request.RoomRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.RoomResponseDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantRoomDto;
import com.antonbondoc.matatagrentalsystem.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoomMapper {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    List<RoomResponseDto> roomsToRoomResponseDtos(List<Room> rooms);

    RoomResponseDto roomToRoomResponseDto(Room room);

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "tenants", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Room roomRequestDtoToRoom(RoomRequestDto request);

    TenantRoomDto roomToTenantRoomDto(Room room);
}
