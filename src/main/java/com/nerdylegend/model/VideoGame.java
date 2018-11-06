package com.nerdylegend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="VIDEOGAME")
@NamedQuery(query = "select a from VideoGame a", name = "query_find_all_video_games")
public class VideoGame implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="RELEASED_ON")
    private Date releasedOn;

    @Column(name="REVIEW_SCORE")
    private int reviewScore;

    @Column(name="CATEGORY")
    private String category;

    @Column(name="RATING")
    private String rating;
}
