package com.cvtheme.back_end.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "teacher")
public class TeacherEntity extends UserEntity {
    @OneToOne(mappedBy = "teacher")
    private PromoEntity promo;

}
