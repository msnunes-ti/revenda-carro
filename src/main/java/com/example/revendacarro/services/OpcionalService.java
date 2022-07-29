package com.example.revendacarro.services;

import com.example.revendacarro.Repository.OpcionalRepository;
import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.mapper.OpcionalMapper;
import com.example.revendacarro.model.Opcional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpcionalService {

    private final OpcionalRepository opcionalRepository;

    private List<Opcional> buscarTodos() {
        return opcionalRepository.findAll();
    }

    public List<OpcionalDTO> buscarTodosPeloNome(String nome) {
        if (nome == null) {
            return OpcionalMapper.toOpcionalDTOList(buscarTodos());
        }
        return OpcionalMapper.toOpcionalDTOList(opcionalRepository.findByNomeIgnoreCase());
    }

}
