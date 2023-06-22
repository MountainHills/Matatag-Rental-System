package com.antonbondoc.matatagrentalsystem.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class TenantDTO {
    private UUID id;

    private String firstName;

    private String lastName;

    private String room;

    private String contactInfo;

    private LocalDate joinedAt;
}
