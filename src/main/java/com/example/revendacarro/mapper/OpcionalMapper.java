package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.model.Opcional;

import java.util.ArrayList;
import java.util.List;

public class OpcionalMapper {

    public static OpcionalDTO toOpcionalDTO(Opcional opcional) {
        OpcionalDTO opcionalDTO = new OpcionalDTO();
        opcionalDTO.setId(opcional.getId());
        opcionalDTO.setNome(opcional.getNome());
        return opcionalDTO;
    }

    public static List<OpcionalDTO> toOpcionalDTOList(List<Opcional> opcionalList) {
        List<OpcionalDTO> opcionalDTOList = new ArrayList<>();
        for (Opcional o: opcionalList)
            opcionalDTOList.add(OpcionalMapper.toOpcionalDTO(o));
            return opcionalDTOList;
        }
}
