package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.repository.ClubRepository;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.repository.ClubRepository;
import com.arjuncodes.studentsystem.repository.NewsRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ClubServiceImpl implements ClubService {
    @Autowired
    private ClubRepository clubRepository;
    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }
    @Override
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    @Override
    public Club getClubById(int id) {
        return clubRepository.getById(id);
    }

    @Autowired
    private NewsRepository newsRepository;

}
