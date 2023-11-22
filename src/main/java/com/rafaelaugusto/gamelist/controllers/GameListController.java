package com.rafaelaugusto.gamelist.controllers;

import com.rafaelaugusto.gamelist.dtos.GameDTO;
import com.rafaelaugusto.gamelist.dtos.GameListDTO;
import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.services.GameListService;
import com.rafaelaugusto.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    @GetMapping("")
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }

}
