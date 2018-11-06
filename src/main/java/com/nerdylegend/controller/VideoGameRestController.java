package com.nerdylegend.controller;

import com.nerdylegend.VideoGameService;
import com.nerdylegend.model.VideoGame;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class VideoGameRestController  {

    @Autowired
    private VideoGameService videoGameService;

    @RequestMapping("/Game-List")
    public List<VideoGame> getAllGames() {
       return videoGameService.findAllVideoGames();
    }

}
