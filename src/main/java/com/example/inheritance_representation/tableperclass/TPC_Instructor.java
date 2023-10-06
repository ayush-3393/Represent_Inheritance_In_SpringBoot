package com.example.inheritance_representation.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_instructor")
public class TPC_Instructor extends TPC_User {
    private String subject;
    private int experience;
}
