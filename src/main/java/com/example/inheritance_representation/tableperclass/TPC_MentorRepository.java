package com.example.inheritance_representation.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPC_MentorRepository extends JpaRepository<TPC_Mentor, Long> {
}
