package com.example.inheritance_representation.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPC_UserRepository extends JpaRepository<TPC_User, Long> {
}
