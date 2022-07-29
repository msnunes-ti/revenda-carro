package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.CadastraOpcionalDTO;
import com.example.revendacarro.model.Opcional;

public class CadastraOpcionalMapper {

    public static Opcional toOpcional(CadastraOpcionalDTO cadastraOpcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setNome(cadastraOpcionalDTO.getNome());
        return opcional;
    }
}
