package com.arjuncodes.studentsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @JoinColumn(name = "news_id", referencedColumnName = "id")
    private List<News> newsList = new ArrayList<>();
    public void addNews(News news) {
        newsList.add(news);
        news.setClub(this);
    }

    public void removeNews(News news) {
        newsList.remove(news);
        news.setClub(null);
    }
}
