package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class ProprietarioMapper {

    public static ProprietarioDTO toProprietarioDTO(Proprietario proprietario) {
        ProprietarioDTO proprietarioDTO = new ProprietarioDTO();
        proprietarioDTO.setId(proprietario.getId());
        proprietarioDTO.setNome(proprietario.getNome());
        proprietarioDTO.setCpfCnpj(proprietario.getCpfCnpj());
        proprietarioDTO.setDataNascimento(proprietario.getDataNascimento());
        proprietarioDTO.setDataCadastro(proprietario.getDataCadastro());
        return proprietarioDTO;
    }

    public static List<ProprietarioDTO> toProprietarioDTOList(List<Proprietario> proprietarioList) {
        List<ProprietarioDTO> proprietarioDTOList = new ArrayList<>();
        for (Proprietario p : proprietarioList) {
            proprietarioDTOList.add(toProprietarioDTO(p));
        }
        return proprietarioDTOList;
    }
}
