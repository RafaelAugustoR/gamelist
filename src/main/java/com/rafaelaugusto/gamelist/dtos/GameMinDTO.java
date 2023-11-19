package com.rafaelaugusto.gamelist.dtos;

import com.rafaelaugusto.gamelist.entities.Game;
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
        BeanUtils.copyProperties(entity, this);
    }
}
