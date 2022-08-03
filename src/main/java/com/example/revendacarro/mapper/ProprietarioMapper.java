package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.model.Proprietario;

import java.time.LocalDate;
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

    public static Proprietario toProprietarioCadastra(CadastraProprietarioDTO cadastraProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(cadastraProprietarioDTO.getNome());
        proprietario.setCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(cadastraProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(LocalDate.now());
        return proprietario;
    }

    public static Proprietario toProprietario(ProprietarioDTO proprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setId(proprietarioDTO.getId());
        proprietario.setNome(proprietarioDTO.getNome());
        proprietario.setCpfCnpj(proprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(proprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(proprietarioDTO.getDataCadastro());
        return proprietario;
    }

    public static List<ProprietarioDTO> toProprietarioDTOList(List<Proprietario> proprietarioList) {
        List<ProprietarioDTO> proprietarioDTOList = new ArrayList<>();
        for (Proprietario p : proprietarioList) {
            proprietarioDTOList.add(toProprietarioDTO(p));
        }
        return proprietarioDTOList;
    }

    public static Proprietario toProprietarioAtualiza(AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(atualizaProprietarioDTO.getNome());
        proprietario.setCpfCnpj(atualizaProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(atualizaProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(atualizaProprietarioDTO.getDataCadastro());
        return proprietario;
    }
}
