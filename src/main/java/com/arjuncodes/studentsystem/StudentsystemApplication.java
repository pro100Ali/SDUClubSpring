package com.arjuncodes.studentsystem;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.model.News;
import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.ClubService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}


}

