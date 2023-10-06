package com.example.inheritance_representation.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_ta")
@PrimaryKeyJoinColumn(name = "user_id")
public class JT_TA extends JT_User {
    private Double averageRating;
}
