package com.cvtheme.back_end.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "resume")
public class ResumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String cvName;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @OneToMany(mappedBy = "resume")
    private List<ResumeCommentEntity> comments;

}
