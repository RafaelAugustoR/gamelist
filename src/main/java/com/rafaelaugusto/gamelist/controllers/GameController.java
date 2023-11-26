package com.rafaelaugusto.gamelist.controllers;

import com.rafaelaugusto.gamelist.dtos.GameDTO;
import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
}