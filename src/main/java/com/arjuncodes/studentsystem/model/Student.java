package com.arjuncodes.studentsystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Entity
@Table(name = "student")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public @Data class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NonNull
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    @NonNull
    private String address;

}
