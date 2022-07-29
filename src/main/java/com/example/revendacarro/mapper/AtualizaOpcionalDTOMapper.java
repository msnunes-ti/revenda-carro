package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaOpcionalDTO;
import com.example.revendacarro.model.Opcional;

public class AtualizaOpcionalDTOMapper {

    public static Opcional toOpcional(AtualizaOpcionalDTO atualizaOpcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setNome(atualizaOpcionalDTO.getNome());
        return opcional;
    }
}
