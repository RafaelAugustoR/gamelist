package com.rafaelaugusto.gamelist.controllers;

import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/games")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping(path = "")
    public List<GameMinDTO> findAll(){
        List<Game> gamesFilter = gameService.findAll();
        return gamesFilter.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
