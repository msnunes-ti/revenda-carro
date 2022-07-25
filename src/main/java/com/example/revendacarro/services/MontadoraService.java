package com.example.revendacarro.services;

import com.example.revendacarro.Repository.MontadoraRepository;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.model.Montadora;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MontadoraService {

    private final MontadoraRepository montadoraRepository;

    private Montadora buscarPorId(Long id) {
        return montadoraRepository.findById(id).orElseThrow(() -> new RuntimeException("Id da Montadora não encontrado"));
    }

    public MontadoraDTO buscarTodas() {
        montadoraRepository.findAll();
    }
}
