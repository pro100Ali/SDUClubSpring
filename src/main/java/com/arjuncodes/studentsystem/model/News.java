package com.arjuncodes.studentsystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "news")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public @Data
class News {

    @Id
    private int id;

    @Column(name = "title")
    @NonNull
    private String title;

    @Column(name = "description")
    @NonNull
    private String description;

//    @NonNull

    @ManyToOne()
    @JoinColumn(name = "club_id")
    private Club club;

    // getters and setters

}