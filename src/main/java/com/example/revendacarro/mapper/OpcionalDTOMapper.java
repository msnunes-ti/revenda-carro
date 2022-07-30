package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.model.Opcional;

public class OpcionalDTOMapper {

    public static Opcional toOpcional(OpcionalDTO opcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setId(opcionalDTO.getId());
        opcional.setNome(opcionalDTO.getNome());
        return opcional;
    }
}
