package com.antonbondoc.matatagrentalsystem.dto.request;

import lombok.Data;

import java.util.UUID;

@Data
public class TenantRequestDto {
    private UUID id;

    private String firstName;

    private String lastName;

    private String room;

    private String contactInfo;
}
