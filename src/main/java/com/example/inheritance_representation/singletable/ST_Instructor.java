package com.example.inheritance_representation.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_instructor")
@DiscriminatorValue("3")
public class ST_Instructor extends ST_User{
    private String subject;
    private int experience;
}
