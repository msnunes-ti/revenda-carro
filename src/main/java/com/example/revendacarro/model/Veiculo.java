package com.example.revendacarro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Montadora montadora;

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
