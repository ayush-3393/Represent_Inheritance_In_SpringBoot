package com.example.inheritance_representation.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_ta")
public class MSC_TA extends MSC_User {
    private Double averageRating;
}
