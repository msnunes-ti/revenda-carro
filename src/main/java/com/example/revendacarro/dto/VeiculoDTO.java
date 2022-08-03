package com.example.revendacarro.dto;

import com.example.revendacarro.model.Montadora;
import com.example.revendacarro.model.Opcional;
import com.example.revendacarro.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class VeiculoDTO {

    @NotNull
    private Long id;

    @NotNull
    private MontadoraDTO montadora;

    @NotNull
    private String modelo;

    @NotNull
    private String cor;

    @NotNull
    private String placa;

    @NotNull
    private Proprietario proprietario;

    @NotNull
    private List<Opcional> opcionais;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private Boolean isVendido;
}
