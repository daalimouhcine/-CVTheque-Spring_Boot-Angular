package com.cvtheme.back_end.entities;

import com.cvtheme.back_end.entities.supperClass.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "teacher")
public class TeacherEntity extends User {
    @OneToOne(mappedBy = "teacher")
    private PromoEntity promo;

}
