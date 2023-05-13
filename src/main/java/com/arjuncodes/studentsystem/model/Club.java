package com.arjuncodes.studentsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Join;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
//if property is nil it will return
@Entity

@Table(name = "clubs")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public @Data
class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "description")
    @NonNull
    private String description;

    @OneToMany(targetEntity = News.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<News> news;

}
