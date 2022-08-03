package com.example.revendacarro.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "montadora_id")
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
    @JoinColumn(name = "proprietario_id")
    private Proprietario proprietario;

    @NotNull
    @ManyToMany
    @JoinTable(name = "veiculo_opcionais", joinColumns = @JoinColumn(name = "veiculo_id"), inverseJoinColumns = @JoinColumn(name = "opcionais_id"))
    private List<Opcional> opcionais;

    @NotNull
    private BigDecimal valor;

    private Boolean isVendido;
}
