package com.rafaelaugusto.gamelist.repositories;

import com.rafaelaugusto.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
