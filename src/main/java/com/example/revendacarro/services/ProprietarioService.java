package com.example.revendacarro.services;

import com.example.revendacarro.Repository.ProprietarioRepository;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.model.Proprietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public List<Proprietario> buscarTodos() {
        return proprietarioRepository.findAll();
    }

    public void cadastraProprietario(CadastraProprietarioDTO cadastraProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(cadastraProprietarioDTO.getNome());
        proprietario.setCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(cadastraProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(LocalDate.now());
        proprietarioRepository.save(proprietario);
    }

}
