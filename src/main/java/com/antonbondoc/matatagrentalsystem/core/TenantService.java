package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.model.Tenant;

import java.util.UUID;

public interface TenantService {
    Tenant getTenant(UUID id);

    Tenant createTenant(TenantRequestDto request);
}
