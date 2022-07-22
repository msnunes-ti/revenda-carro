package com.example.revendacarro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class ProprietarioDTO {

    @NotNull
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String cpfCnpj;

    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    private LocalDate dataCadastro;

}
