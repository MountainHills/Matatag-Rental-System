package com.antonbondoc.matatagrentalsystem.core;

import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;
import com.antonbondoc.matatagrentalsystem.mapper.TenantMapper;
import com.antonbondoc.matatagrentalsystem.model.Room;
import com.antonbondoc.matatagrentalsystem.model.Tenant;
import com.antonbondoc.matatagrentalsystem.repository.RoomRepository;
import com.antonbondoc.matatagrentalsystem.repository.TenantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements TenantService {

    private final TenantRepository tenantRepository;
    private final RoomRepository roomRepository;
    private final TenantMapper tenantMapper = TenantMapper.INSTANCE;

    @Override
    public TenantResponseDto getTenant(UUID id) {
        Tenant tenant = tenantRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Tenant does not exist.")
        );
        return tenantMapper.tenantToTenantResponseDto(tenant);
    }

    @Override
    public TenantResponseDto createTenant(String roomName, TenantRequestDto request) {
        // Convert String from kebab case to normal string with spaces.
        roomName = roomName.replace('-', ' ');
        Room room = roomRepository.findByNameIgnoreCase(roomName).orElseThrow(
                () -> new EntityNotFoundException("Room does not exist")
        );
        Tenant tenant = tenantMapper.tenantRequestDtoToTenant(request);
        tenant.setRoom(room);
        Tenant createdTenant = tenantRepository.save(tenant);
        return tenantMapper.tenantToTenantResponseDto(createdTenant);
    }

    // TODO: Think about proper implementation of update Tenant.
    /*
    * The problem is that it's hard to update the room since I'm not getting the ID, but it's name.
    * Solutions I thought of:
    *   1. Create a new request dto for update. (CreateTenantDto, UpdateTenantDto)
    *   2. Separate method (scrapped).
    * */

    @Override
    public TenantResponseDto updateTenant(UUID id, TenantRequestDto request) {
        Tenant tenant = tenantRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Tenant does not exist.")
        );
        tenant.setFirstName(request.getFirstName());
        tenant.setLastName(request.getLastName());
        tenant.setContactInfo(request.getContactInfo());

        Tenant updated = tenantRepository.save(tenant);
        return tenantMapper.tenantToTenantResponseDto(updated);
    }


    @Override
    public void deleteTenant(UUID id) {
        Tenant tenant = tenantRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Tenant does not exist.")
        );
        tenantRepository.delete(tenant);
    }
}
