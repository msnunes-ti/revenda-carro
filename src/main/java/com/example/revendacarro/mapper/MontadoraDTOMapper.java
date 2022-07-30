package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.model.Montadora;

public class MontadoraDTOMapper {

    public static Montadora toMontadora(MontadoraDTO montadoraDTO) {
        Montadora montadora = new Montadora();
        montadora.setId(montadoraDTO.getId());
        montadora.setNome(montadoraDTO.getNome());
        return montadora;
    }
}
