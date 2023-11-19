package com.rafaelaugusto.gamelist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Belonging belonging)) return false;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Belonging(Game game, GameList gameList, Integer position) {
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }
}

