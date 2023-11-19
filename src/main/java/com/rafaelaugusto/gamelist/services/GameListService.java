package com.rafaelaugusto.gamelist.services;

import com.rafaelaugusto.gamelist.dtos.GameDTO;
import com.rafaelaugusto.gamelist.dtos.GameListDTO;
import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.entities.GameList;
import com.rafaelaugusto.gamelist.repositories.GameListRepository;
import com.rafaelaugusto.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gamesFilter = gameListRepository.findAll();
        return gamesFilter.stream().map(x -> new GameListDTO(x)).toList();
    }
}