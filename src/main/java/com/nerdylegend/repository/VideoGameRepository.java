package com.nerdylegend.repository;

import com.nerdylegend.model.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {

}
