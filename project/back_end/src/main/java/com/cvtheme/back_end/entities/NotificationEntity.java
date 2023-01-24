package com.cvtheme.back_end.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "notification")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private boolean seen;

    @OneToOne
    @JoinColumn(name = "motivation_letter_comment_id")
    private MotivationLetterCommentEntity motivationLetterComment;

    @OneToOne
    @JoinColumn(name = "resume_comment_id")
    private ResumeCommentEntity resumeComment;
}
