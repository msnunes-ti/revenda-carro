package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaMontadoraDTO;
import com.example.revendacarro.model.Montadora;

public class AtualizaMontadoraDTOMapper {

    public static Montadora toMontadora(AtualizaMontadoraDTO atualizaMontadoraDTO) {
        Montadora montadora = new Montadora.Builder().nome(atualizaMontadoraDTO.getNome()).build();
        return montadora;
    }

}
