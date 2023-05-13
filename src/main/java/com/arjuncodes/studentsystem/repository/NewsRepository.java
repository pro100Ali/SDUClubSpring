package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer> {
    List<News> findAllById(int id);
}
