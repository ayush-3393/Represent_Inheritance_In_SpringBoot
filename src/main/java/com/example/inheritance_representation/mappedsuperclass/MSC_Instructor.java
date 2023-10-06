package com.example.inheritance_representation.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_instructor")
public class MSC_Instructor extends MSC_User {
    private String subject;
    private int experience;
}
