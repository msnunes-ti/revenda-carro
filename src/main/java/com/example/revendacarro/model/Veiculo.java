package com.example.revendacarro.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
public class Veiculo {

    private Long id;

    private String modelo;

    private String placa;

    private Proprietario proprietario;

}
