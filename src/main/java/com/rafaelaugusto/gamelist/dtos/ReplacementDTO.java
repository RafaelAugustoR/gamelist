package com.rafaelaugusto.gamelist.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;
}
