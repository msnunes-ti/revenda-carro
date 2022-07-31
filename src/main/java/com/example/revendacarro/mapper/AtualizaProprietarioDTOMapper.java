package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

public class AtualizaProprietarioDTOMapper {

    public static Proprietario toProprietario(AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(atualizaProprietarioDTO.getNome());
        proprietario.setCpfCnpj(atualizaProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(atualizaProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(atualizaProprietarioDTO.getDataCadastro());
        return proprietario;
    }

    public static ProprietarioDTO toProprietarioDTO(AtualizaProprietarioDTO atualizaProprietarioDTO) {
        ProprietarioDTO proprietarioDTO = new ProprietarioDTO();
        proprietarioDTO.setNome(atualizaProprietarioDTO.getNome());
        proprietarioDTO.setCpfCnpj(atualizaProprietarioDTO.getCpfCnpj());
        proprietarioDTO.setDataNascimento(atualizaProprietarioDTO.getDataNascimento());
        proprietarioDTO.setDataCadastro(atualizaProprietarioDTO.getDataCadastro());
        return proprietarioDTO;
    }
}
