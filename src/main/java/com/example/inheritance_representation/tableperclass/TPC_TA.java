package com.example.inheritance_representation.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_ta")
public class TPC_TA extends TPC_User {
    private Double averageRating;
}
