package com.antonbondoc.matatagrentalsystem.dto.response;

import com.antonbondoc.matatagrentalsystem.model.Room;
import lombok.Data;

import java.util.UUID;

@Data
public class TenantResponseDto {
    private UUID id;

    private String firstName;

    private String lastName;

    private RoomResponseDto room;

    private String contactInfo;
}
