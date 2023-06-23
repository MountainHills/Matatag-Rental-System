package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;
import com.antonbondoc.matatagrentalsystem.mapper.TenantMapper;
import com.antonbondoc.matatagrentalsystem.model.Tenant;
import com.antonbondoc.matatagrentalsystem.repository.TenantRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements TenantService {
    private final TenantRepository tenantRepository;
    private final TenantMapper tenantMapper = TenantMapper.INSTANCE;

    @Override
    public TenantResponseDto getTenant(UUID id) {
        Tenant tenant = tenantRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Tenant does not exist.")
        );
        return tenantMapper.tenantToTenantResponseDto(tenant);
    }

    @Override
    public TenantResponseDto createTenant(TenantRequestDto request) {
        Tenant tenant = tenantMapper.tenantRequestDtoToTenant(request);
        Tenant createdTenant = tenantRepository.save(tenant);
        return tenantMapper.tenantToTenantResponseDto(createdTenant);
    }
}
