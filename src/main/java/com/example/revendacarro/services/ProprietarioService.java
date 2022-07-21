package com.example.revendacarro.services;

import com.example.revendacarro.Repository.ProprietarioRepository;
import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.model.Proprietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public List<Proprietario> buscarTodos() {
        return proprietarioRepository.findAll();
    }

    public Optional<Proprietario> buscarPorId(Long id) {
        return proprietarioRepository.findById(id);
    }

    public List<Proprietario> buscarPorCpfCnpj(String cpfCnpj) {
        return proprietarioRepository.findByCpfCnpj(cpfCnpj);
    }

    public void cadastraProprietario(CadastraProprietarioDTO cadastraProprietarioDTO) {
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(cadastraProprietarioDTO.getNome());
        proprietario.setCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(cadastraProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(LocalDate.now());
        proprietarioRepository.save(proprietario);
    }

    public void atualizaProprietario(@Valid AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario = proprietarioRepository.getById(atualizaProprietarioDTO.getId());
        proprietario.setId(atualizaProprietarioDTO.getId());
        proprietario.setNome(atualizaProprietarioDTO.getNome());
        proprietario.setCpfCnpj(atualizaProprietarioDTO.getCpfCnpj());
        proprietario.setDataNascimento(atualizaProprietarioDTO.getDataNascimento());
        proprietario.setDataCadastro(atualizaProprietarioDTO.getDataCadastro());
        proprietarioRepository.save(proprietario);
    }

    public void deletarProprietario(Long id) {
        proprietarioRepository.deleteById(id);
    }

}
