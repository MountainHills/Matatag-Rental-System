package com.antonbondoc.matatagrentalsystem.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class TenantResponseDto {
    private UUID id;

    private String firstName;

    private String lastName;

    private String room;

    private String contactInfo;
}
