package com.cvtheme.back_end.repositories;

import com.cvtheme.back_end.entities.CmeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CmeRepository extends JpaRepository<CmeEntity, Long> {
    Optional<CmeEntity> findByEmail(String email);
}
