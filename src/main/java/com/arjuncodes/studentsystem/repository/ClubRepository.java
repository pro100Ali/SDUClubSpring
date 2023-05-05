package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Integer> {
}
