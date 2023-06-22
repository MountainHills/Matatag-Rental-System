package com.antonbondoc.matatagrentalsystem.repository;

import com.antonbondoc.matatagrentalsystem.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TenantRepository extends JpaRepository<Tenant, UUID> { }
