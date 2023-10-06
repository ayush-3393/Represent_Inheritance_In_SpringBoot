package com.example.inheritance_representation.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JT_MentorRepository extends JpaRepository<JT_Mentor, Long> {
}
