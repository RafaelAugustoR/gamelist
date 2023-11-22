package com.rafaelaugusto.gamelist.dtos;

import com.rafaelaugusto.gamelist.entities.Game;
import com.rafaelaugusto.gamelist.projections.GameMinProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameMinDTO {

    private Long Id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        this.Id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjection projection) {
        Id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }
}
