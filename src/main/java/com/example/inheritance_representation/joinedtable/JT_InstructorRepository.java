package com.example.inheritance_representation.joinedtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JT_InstructorRepository extends JpaRepository<JT_Instructor, Long> {
}
