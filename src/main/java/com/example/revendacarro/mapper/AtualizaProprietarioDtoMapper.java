package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

public class AtualizaProprietarioDtoMapper {

    public static Proprietario toProprietario(AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(atualizaProprietarioDTO.getNome());
        proprietario.setCpfCnpj(atualizaProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(atualizaProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(atualizaProprietarioDTO.getDataCadastro());
        return proprietario;
    }

}
