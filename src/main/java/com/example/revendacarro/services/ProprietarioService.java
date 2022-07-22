package com.example.revendacarro.services;

import com.example.revendacarro.Repository.ProprietarioRepository;
import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.mapper.AtualizaProprietarioDtoMapper;
import com.example.revendacarro.mapper.CadastraProprietarioDtoMapper;
import com.example.revendacarro.model.Proprietario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    public List<Proprietario> buscarTodos(String cpfCnpj) {
        if (cpfCnpj == null) {
            return proprietarioRepository.findAll();
        }
        return proprietarioRepository.findByCpfCnpj(cpfCnpj);
    }

    public Proprietario buscarPorId(Long id) {
        return buscarProprietarioPorId(id);
    }

    private Proprietario buscarProprietarioPorId(Long id) {
        return proprietarioRepository.findById(id).orElseThrow(() -> new RuntimeException("ID não encontrado."));
    }

    public void cadastraProprietario(CadastraProprietarioDTO cadastraProprietarioDTO) {
        long proprietarioEncontrado = proprietarioRepository.countByCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        if (proprietarioEncontrado > 0) {
            throw new RuntimeException("Esse CPF ou CNPJ já está cadastrado.");
        }
        proprietarioRepository.save(CadastraProprietarioDtoMapper.toProprietario(cadastraProprietarioDTO));
    }

    public void atualizaProprietario(Long id, AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario = buscarProprietarioPorId(id);
        proprietario = AtualizaProprietarioDtoMapper.toProprietario(atualizaProprietarioDTO);
        proprietarioRepository.save(proprietario);
    }

    public void deletarProprietario(Long id) {
        Proprietario proprietario = buscarProprietarioPorId(id);
        proprietarioRepository.delete(proprietario);
    }

}
