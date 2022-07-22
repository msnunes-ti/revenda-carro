package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

import java.time.LocalDate;

public class CadastraProprietarioDtoMapper {

    public static Proprietario toProprietario(CadastraProprietarioDTO cadastraProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(cadastraProprietarioDTO.getNome());
        proprietario.setCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(cadastraProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(LocalDate.now());
        return proprietario;
    }
}
