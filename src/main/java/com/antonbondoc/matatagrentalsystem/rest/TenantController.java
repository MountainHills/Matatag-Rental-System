package com.antonbondoc.matatagrentalsystem.rest;

import com.antonbondoc.matatagrentalsystem.core.TenantService;
import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/tenant")
@RequiredArgsConstructor
public class TenantController {

    private final TenantService tenantService;

    @GetMapping(path = "{tenantId}")
    public ResponseEntity<TenantResponseDto> getTenant(@PathVariable("tenantId") UUID tenantId) {
        return ResponseEntity.ok(tenantService.getTenant(tenantId));
    }

    @PostMapping(path = "{roomName}")
    public ResponseEntity<TenantResponseDto> createTenant(@PathVariable("roomName") String roomName, @Valid @RequestBody TenantRequestDto request) {
        return ResponseEntity.ok(tenantService.createTenant(roomName, request));
    }

    @PutMapping(path = "{tenantId}")
    public ResponseEntity<TenantResponseDto> updateTenant(@PathVariable("tenantId") UUID tenantId, @Valid @RequestBody TenantRequestDto request) {
        return ResponseEntity.ok(tenantService.updateTenantInformation(tenantId, request));
    }

    @DeleteMapping(path = "{tenantId}")
    public ResponseEntity<Void> deleteTenant(@PathVariable("tenantId") UUID tenantId) {
        tenantService.deleteTenant(tenantId);
        return ResponseEntity.noContent().build();
    }

}
