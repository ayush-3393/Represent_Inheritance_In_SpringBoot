package com.example.inheritance_representation.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MSC_InstructorRepository extends JpaRepository<MSC_Instructor, Long> {
}
