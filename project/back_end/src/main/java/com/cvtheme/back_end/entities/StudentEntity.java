package com.cvtheme.back_end.entities;

import com.cvtheme.back_end.entities.supperClass.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "student")
public class StudentEntity extends User {

    @Column(nullable = false)
    private String status = "studying";

    @ManyToOne
    @JoinColumn(name = "promo_id")
    private PromoEntity promo;

    @OneToMany(mappedBy = "student")
    private List<ResumeEntity> resumes;

    @OneToMany(mappedBy = "student")
    private List<MotivationLetterEntity> motivationLetters;

}
