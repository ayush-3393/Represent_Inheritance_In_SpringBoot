package com.example.inheritance_representation.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ST_UserRepository extends JpaRepository<ST_User, Long> {
}
