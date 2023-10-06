package com.example.inheritance_representation.singletable;

import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@DiscriminatorValue("2")
public class ST_TA extends ST_User{
    private Double averageRating;
}
