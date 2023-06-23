package com.antonbondoc.matatagrentalsystem.repository;

import com.antonbondoc.matatagrentalsystem.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, UUID> { }
