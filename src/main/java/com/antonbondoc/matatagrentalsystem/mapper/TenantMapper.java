package com.antonbondoc.matatagrentalsystem.mapper;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;
import com.antonbondoc.matatagrentalsystem.model.Tenant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TenantMapper {
    TenantMapper INSTANCE = Mappers.getMapper(TenantMapper.class);

    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Tenant tenantRequestDtoToTenant(TenantRequestDto request);

    TenantResponseDto tenantToTenantResponseDto(Tenant tenant);
}
