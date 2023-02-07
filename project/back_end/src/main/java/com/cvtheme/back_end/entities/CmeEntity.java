package com.cvtheme.back_end.entities;

import com.cvtheme.back_end.entities.supperClass.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "cme")
public class CmeEntity extends User {
    @OneToMany(mappedBy = "cme")
    private List<MotivationLetterCommentEntity> motivationLetterComments;

    @OneToMany(mappedBy = "cme")
    private List<ResumeCommentEntity> resumeComments;

}
