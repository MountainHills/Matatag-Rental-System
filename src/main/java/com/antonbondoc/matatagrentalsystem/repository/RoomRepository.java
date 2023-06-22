package com.antonbondoc.matatagrentalsystem.repository;

import com.antonbondoc.matatagrentalsystem.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<Room, UUID> { }
