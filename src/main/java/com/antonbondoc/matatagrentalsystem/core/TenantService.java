package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;

import java.util.UUID;

public interface TenantService {
    TenantResponseDto getTenant(UUID id);

    TenantResponseDto createTenant(TenantRequestDto request);

    TenantResponseDto updateTenant(UUID id, TenantRequestDto request);

    void deleteTenant(UUID id);
}
