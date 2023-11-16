package com.rafaelaugusto.gamelist.repositories;

import com.rafaelaugusto.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
