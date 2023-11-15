package com.rafaelaugusto.gamelist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Game game)) return false;
        return Objects.equals(Id, game.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
