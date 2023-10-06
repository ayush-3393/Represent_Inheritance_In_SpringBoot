package com.example.inheritance_representation.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_mentor")
public class MSC_Mentor extends MSC_User {
    private int numberOfMentees;
    private int numberOfSessions;
}
