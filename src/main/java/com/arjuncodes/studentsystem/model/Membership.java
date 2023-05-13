//package com.arjuncodes.studentsystem.model;
//
//import javax.persistence.*;
//
//@Entity

//@Table(name = "memberships")
//public class Membership {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "student_id")
//    private Student student;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "club_id")
//    private Club club;
//
//    // Add any other relevant membership properties
//
//    // Getters and setters
//}