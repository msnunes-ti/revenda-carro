package com.example.revendacarro.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class CadastraVeiculoDTO {

    @NotNull
    private Long montadoraId;

    @NotNull
    private String modelo;

    @NotNull
    private String cor;

    @NotNull
    private String placa;

    @NotNull
    private ProprietarioDTO proprietario;

    @NotNull
    private List<Long> opcionaisIds;

    @NotNull
    private Double valor;
}
