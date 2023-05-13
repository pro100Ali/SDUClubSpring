package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.model.Student;

import java.util.List;

public interface ClubService {

    public Club saveClub(Club club);
    public List<Club> getAllClubs();

        public Club getClubById(int id);

}
