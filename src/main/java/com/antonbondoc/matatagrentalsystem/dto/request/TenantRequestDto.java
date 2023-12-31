package com.antonbondoc.matatagrentalsystem.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TenantRequestDto {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private String contactInfo;
}
