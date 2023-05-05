package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.repository.ClubRepository;
import com.arjuncodes.studentsystem.repository.NewsRepository;
import com.arjuncodes.studentsystem.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clubs/{clubId}/news")
public class NewsController {

    @Autowired
    private ClubRepository clubRepository;


    @PostMapping()
    public ResponseEntity<News> addNews(@PathVariable Integer clubId, @RequestBody News news) {
        Optional<Club> clubOptional = clubRepository.findById(clubId);
        if (clubOptional.isPresent()) {
            Club club = clubOptional.get();
            news.setClub(club);
            club.getNewsList().add(news);
            clubRepository.save(club);
            return ResponseEntity.status(HttpStatus.CREATED).body(news);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}