package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.CadastraMontadoraDTO;
import com.example.revendacarro.model.Montadora;

public class CadastraMontadoraDTOMapper {

    public static Montadora toMontadora(CadastraMontadoraDTO cadastraMontadoraDTO) {
        Montadora montadora = new Montadora.Builder().nome(cadastraMontadoraDTO.getNome()).build();
        return montadora;
    }
}
