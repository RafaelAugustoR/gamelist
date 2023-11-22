package com.rafaelaugusto.gamelist.services;

import com.rafaelaugusto.gamelist.dtos.GameDTO;
import com.rafaelaugusto.gamelist.dtos.GameMinDTO;
import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.projections.GameMinProjection;
import com.rafaelaugusto.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> gamesFilter = gameRepository.findAll();
        return gamesFilter.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> gamesFilter = gameRepository.searchByList(listId);
        return gamesFilter.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
