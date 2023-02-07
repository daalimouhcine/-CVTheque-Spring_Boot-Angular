package com.cvtheme.back_end.repositories;

import com.cvtheme.back_end.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    Optional<TeacherEntity> findByEmail(String email);
}
