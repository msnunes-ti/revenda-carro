package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.model.Montadora;

import java.util.ArrayList;
import java.util.List;

public class MontadoraMapper {

    public static MontadoraDTO toMontadoraDTO(Montadora montadora) {
        MontadoraDTO montadoraDTO = new MontadoraDTO();
        montadoraDTO.setId(montadoraDTO.getId());
        montadoraDTO.setNome(montadora.getNome());
        return montadoraDTO;
    }

    public static List<MontadoraDTO> montadoraDTOList(List<Montadora> montadoras) {
        List<MontadoraDTO> montadoraDTOList = new ArrayList<>();
        for (Montadora m : montadoras) {
            montadoraDTOList.add(toMontadoraDTO(m));
        }
        return montadoraDTOList;
    }
}
