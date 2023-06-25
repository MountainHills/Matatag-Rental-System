package com.antonbondoc.matatagrentalsystem.dto.response;

import com.antonbondoc.matatagrentalsystem.model.enums.RoomType;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RoomResponseDto {
    private UUID id;

    private String name;

    private RoomType type;

    private List<TenantResponseDto> tenants;
}
