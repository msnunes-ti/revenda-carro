package com.example.revendacarro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CadastraMontadoraDTO {

    @NotNull
    private String nome;
}
