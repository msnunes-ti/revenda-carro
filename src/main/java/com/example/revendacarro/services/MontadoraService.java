package com.example.revendacarro.services;

import com.example.revendacarro.Repository.MontadoraRepository;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.mapper.MontadoraMapper;
import com.example.revendacarro.model.Montadora;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MontadoraService {

    private final MontadoraRepository montadoraRepository;

    private Montadora buscarPorId(Long id) {
        return montadoraRepository.findById(id).orElseThrow(() -> new RuntimeException("Id da Montadora não encontrado"));
    }

    public List<MontadoraDTO> buscarTodas(String nome) {
        if (nome == null) {
            List<Montadora> montadoraList = montadoraRepository.findAll();
            return MontadoraMapper.montadoraDTOList(montadoraList);
        }
        List<Montadora> montadoraList = montadoraRepository.findByNomeIgnoreCase(nome);
        return MontadoraMapper.montadoraDTOList(montadoraList);
    }
    
}
