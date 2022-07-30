package com.example.revendacarro.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private Montadora montadora;

    @NotNull
    private String modelo;

    @NotNull
    private String cor;

    @NotNull
    @Column(unique = true)
    private String placa;

    @NotNull
    @ManyToOne
    private Proprietario proprietario;

    @NotNull
    @ManyToMany
    private List<Opcional> opcionais;

//    @NotNull
    private BigDecimal valor;

    private Boolean isVendido;
}
