package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.News;

import java.util.List;

public interface NewsService {
    public News saveNews(News news);

    public List<News> getAllNews();

    public List<News> getNewsById(int id);

    public void deleteNews(int id);

    public List<News> addNewsToClub(int clubId, News news);

    List<News> getNewsForClub(int clubId, News news);
}
