package com.example.inheritance_representation.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class TPC_Mentor extends TPC_User {
    private int numberOfMentees;
    private int numberOfSessions;
}
