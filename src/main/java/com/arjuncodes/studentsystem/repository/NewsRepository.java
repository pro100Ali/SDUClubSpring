package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}
