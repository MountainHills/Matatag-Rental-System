package com.antonbondoc.matatagrentalsystem.rest;

import com.antonbondoc.matatagrentalsystem.core.TenantService;
import com.antonbondoc.matatagrentalsystem.dto.request.TenantRequestDto;
import com.antonbondoc.matatagrentalsystem.dto.response.TenantResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/tenant")
@RequiredArgsConstructor
public class TenantController {

    private final TenantService tenantService;

    @GetMapping("/hello")
    public String greet() {
        return "Hello World from Tenant";
    }

    @GetMapping(path = "{tenantId}")
    public ResponseEntity<TenantResponseDto> getTenant(@PathVariable("tenantId") UUID tenantId) {
        return ResponseEntity.ok(tenantService.getTenant(tenantId));
    }

    @PostMapping
    public ResponseEntity<TenantResponseDto> createTenant(@Valid @RequestBody TenantRequestDto request) {
        return ResponseEntity.ok(tenantService.createTenant(request));
    }

    @PutMapping
    public void updateTenant() {}

    @DeleteMapping
    public void deleteTenant() {}

}
