package com.cvtheme.back_end.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "motivation_letter")
public class MotivationLetterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String letter;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @OneToMany(mappedBy = "motivationLetter")
    private List<MotivationLetterCommentEntity> comments;
}
