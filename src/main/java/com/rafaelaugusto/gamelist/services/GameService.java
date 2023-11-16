package com.rafaelaugusto.gamelist.services;

import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<Game> findAll(){
         return gameRepository.findAll();
    }
}
