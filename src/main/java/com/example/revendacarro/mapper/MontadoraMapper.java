package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaMontadoraDTO;
import com.example.revendacarro.dto.CadastraMontadoraDTO;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.model.Montadora;

import java.util.ArrayList;
import java.util.List;

public class MontadoraMapper {

    public static MontadoraDTO toMontadoraDTO(Montadora montadora) {
        MontadoraDTO montadoraDTO = new MontadoraDTO();
        montadoraDTO.setId(montadora.getId());
        montadoraDTO.setNome(montadora.getNome());
        return montadoraDTO;
    }

    public static List<MontadoraDTO> toMontadoraDTOList(List<Montadora> montadoras) {
        List<MontadoraDTO> montadoraDTOList = new ArrayList<>();
        for (Montadora m : montadoras) {
            montadoraDTOList.add(toMontadoraDTO(m));
        }
        return montadoraDTOList;
    }
    public static Montadora toMontadora(MontadoraDTO montadoraDTO) {
        Montadora montadora = new Montadora();
        montadora.setId(montadoraDTO.getId());
        montadora.setNome(montadoraDTO.getNome());
        return montadora;
    }
    public static Montadora toMontadoraAtualiza(AtualizaMontadoraDTO atualizaMontadoraDTO) {
        Montadora montadora = new Montadora.Builder().nome(atualizaMontadoraDTO.getNome()).build();
        return montadora;
    }

    public static Montadora toMontadoraCadastra(CadastraMontadoraDTO cadastraMontadoraDTO) {
        Montadora montadora = new Montadora.Builder().nome(cadastraMontadoraDTO.getNome()).build();
        return montadora;
    }
}
