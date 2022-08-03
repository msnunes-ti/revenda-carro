package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaOpcionalDTO;
import com.example.revendacarro.dto.CadastraOpcionalDTO;
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

    public static Opcional toOpcional(OpcionalDTO opcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setId(opcionalDTO.getId());
        opcional.setNome(opcionalDTO.getNome());
        return opcional;
    }

    public static Opcional toOpcionalAtualiza(AtualizaOpcionalDTO atualizaOpcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setNome(atualizaOpcionalDTO.getNome());
        return opcional;
    }

    public static Opcional toOpcionalCadastra(CadastraOpcionalDTO cadastraOpcionalDTO) {
        Opcional opcional = new Opcional();
        opcional.setNome(cadastraOpcionalDTO.getNome());
        return opcional;
    }
}
