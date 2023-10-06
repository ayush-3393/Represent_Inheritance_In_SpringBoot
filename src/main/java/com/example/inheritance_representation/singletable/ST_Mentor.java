package com.example.inheritance_representation.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_mentor")
@DiscriminatorValue("1")
public class ST_Mentor extends ST_User{
    private int numberOfMentees;
    private int numberOfSessions;
}
