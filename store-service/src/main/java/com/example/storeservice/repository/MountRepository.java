package com.example.storeservice.repository;

import com.example.storeservice.entity.Mount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountRepository extends JpaRepository<Mount, Long> {
}
