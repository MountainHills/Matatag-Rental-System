package com.antonbondoc.matatagrentalsystem.dto.response;

import com.antonbondoc.matatagrentalsystem.model.enums.RoomType;
import lombok.Data;

@Data
public class TenantRoomDto {
    private String name;

    private RoomType type;
}
