package com.rafaelaugusto.gamelist.dtos;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameListDTO {
    private Long id;
    private String name;
}