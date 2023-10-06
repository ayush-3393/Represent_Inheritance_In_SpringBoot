package com.example.inheritance_representation.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MSC_MentorRepository extends JpaRepository<MSC_Mentor, Long> {
}
