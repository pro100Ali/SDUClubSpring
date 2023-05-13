package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.repository.ClubRepository;
import com.arjuncodes.studentsystem.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("")
@CrossOrigin

public class NewsController {

    private final ClubRepository clubRepository;

    private final NewsService newsService;

    // Constructor injection
    public NewsController(ClubRepository clubRepository, NewsService newsService) {
        this.clubRepository = clubRepository;
        this.newsService = newsService;
    }

//    @PostMapping ("/clubs/{clubId}/news/add")
//    public News createNews(@RequestBody News news, @PathVariable String clubId) {
//        newsService.getNewsById(Integer.parseInt(clubId));
//         newsService.saveNews(news);
//         return news;
//    }


    @PostMapping ("/clubs/{clubId}/add")
    public List<News> addNews(@PathVariable int clubId, @RequestBody News news) {
        return newsService.addNewsToClub(clubId, news);
    }

    @GetMapping("/clubs/{clubId}/getAllNews")
    public List<News> getNewsForClub(@PathVariable int clubId, News news) {
        return newsService.getNewsForClub(clubId, news);
    }


    @DeleteMapping("/news/{id}")
    public ResponseEntity<?> deleteNews(@PathVariable int id) {
        newsService.deleteNews(id);
        return ResponseEntity.noContent().build();
    }

    public ClubRepository getClubRepository() {
        return clubRepository;
    }
}


