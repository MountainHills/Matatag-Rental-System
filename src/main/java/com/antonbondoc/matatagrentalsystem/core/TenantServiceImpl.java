package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.model.Tenant;
import com.antonbondoc.matatagrentalsystem.repository.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements TenantService {
    private TenantRepository tenantRepository;

    @Override
    public Tenant getTenant(UUID id) {
        return null;
    }

    @Override
    public Tenant createTenant(TenantRequestDto request) {
        return null;
    }
}
