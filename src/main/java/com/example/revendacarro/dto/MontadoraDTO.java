package com.example.revendacarro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MontadoraDTO {

    @NotNull
    private Long id;

    @NotNull
    private String nome;
}
