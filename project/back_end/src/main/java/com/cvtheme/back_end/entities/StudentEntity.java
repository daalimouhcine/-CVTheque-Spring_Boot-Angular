package com.cvtheme.back_end.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "student")
public class StudentEntity extends UserEntity {

    private String status = "studying";
}
