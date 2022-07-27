package com.example.revendacarro.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculo {

    private Long id;

    private String modelo;

    private String placa;

    private Proprietario proprietario;

}
