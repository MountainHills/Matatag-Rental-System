package com.antonbondoc.matatagrentalsystem.dto.request;

import com.antonbondoc.matatagrentalsystem.model.enums.RoomType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RoomRequestDto {
    @NotBlank
    private String name;

    @NotNull
    private RoomType type;
}
