package com.cvtheme.back_end.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "promo")
public class PromoEntity {
    private String name;
    private Date year;
    private String major;
}

