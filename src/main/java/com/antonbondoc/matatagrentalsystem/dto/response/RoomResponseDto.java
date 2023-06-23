package com.antonbondoc.matatagrentalsystem.dto;

import com.antonbondoc.matatagrentalsystem.model.enums.RoomType;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RoomResponseDto {
    private UUID id;

    private String letter;

    private RoomType type;

    private List<String> tenants;

    private String representative;
}
