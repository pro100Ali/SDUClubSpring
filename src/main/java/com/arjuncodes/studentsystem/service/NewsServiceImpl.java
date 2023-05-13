package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.repository.ClubRepository;
import com.arjuncodes.studentsystem.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private ClubRepository clubRepository;
    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }
    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
    @Override
    public List<News> getNewsById(int id) {
        Club club = clubRepository.getById(id);
        News news = club.getNews().get(1);
        return newsRepository.findAllById(news.getId());
    }
    @Override
    public void deleteNews(int id) {
        newsRepository.deleteById(id);
    }
    // Other methods
    public List<News> addNewsToClub(int clubId, News news) {
        Club club = clubRepository.findById(clubId)
                .orElseThrow(NullPointerException::new);
        List<News> newsList = club.getNews();
        newsList.add(news);
        clubRepository.save(club);
        return newsList;
    }

    @Override
    public List<News> getNewsForClub(int clubId, News news) {
        Club club = clubRepository.findById(clubId)
                .orElseThrow(NullPointerException::new);
        List<News> newsList = club.getNews();
//        newsList.add(news);
        clubRepository.save(club);
        return newsList;
    }
}