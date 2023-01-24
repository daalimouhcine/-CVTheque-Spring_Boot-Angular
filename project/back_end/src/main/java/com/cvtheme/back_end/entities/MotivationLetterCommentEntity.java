package com.cvtheme.back_end.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity(name = "motivation_letter_comment")
public class MotivationLetterCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Instant timestamp;

    @ManyToOne
    @JoinColumn(name = "cme_id")
    private CmeEntity cme;

    @ManyToOne
    @JoinColumn(name = "motivation_letter_id")
    private MotivationLetterEntity motivationLetter;

}
