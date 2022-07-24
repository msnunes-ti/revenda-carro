package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

public class ProprietarioDTOMapper {

    public static Proprietario toProprietario(ProprietarioDTO proprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setId(proprietarioDTO.getId());
        proprietario.setNome(proprietarioDTO.getNome());
        proprietario.setCpfCnpj(proprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(proprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(proprietarioDTO.getDataCadastro());
        return proprietario;
    }
}