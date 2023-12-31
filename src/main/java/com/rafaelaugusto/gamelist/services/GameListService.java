package com.rafaelaugusto.gamelist.services;

import com.rafaelaugusto.gamelist.dtos.GameListDTO;
import com.rafaelaugusto.gamelist.entities.GameList;
import com.rafaelaugusto.gamelist.projection.GameMinProjection;
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
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gamesFilter = gameListRepository.findAll();
        return gamesFilter.stream().map(x -> GameListDTO.builder()
                .id(x.getId())
                .name(x.getName())
                .build()).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList entity = gameListRepository.findById(id).get();
        return GameListDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}