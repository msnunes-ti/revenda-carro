package com.example.revendacarro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AtualizaOpcionalDTO {

    @NotNull
    public String nome;
}
