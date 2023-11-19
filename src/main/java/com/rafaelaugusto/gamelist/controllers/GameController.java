package com.rafaelaugusto.gamelist.controllers;

import com.rafaelaugusto.gamelist.dtos.GameDTO;
import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping("/games/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }

    @GetMapping("/games")
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
}
