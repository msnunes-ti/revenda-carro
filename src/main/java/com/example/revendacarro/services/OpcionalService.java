package com.example.revendacarro.services;

import com.example.revendacarro.Repository.OpcionalRepository;
import com.example.revendacarro.dto.AtualizaOpcionalDTO;
import com.example.revendacarro.dto.CadastraOpcionalDTO;
import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.mapper.CadastraOpcionalMapper;
import com.example.revendacarro.mapper.OpcionalMapper;
import com.example.revendacarro.model.Opcional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpcionalService {

    private final OpcionalRepository opcionalRepository;

    private Opcional buscaPorId(Long id) {
        return opcionalRepository.findById(id).orElseThrow(() -> new RuntimeException("ID do Opcional não encontrado."));
    }

    public OpcionalDTO buscaOpcionalPeloId(Long id) {
        return OpcionalMapper.toOpcionalDTO(buscaPorId(id));
    }

    public List<Opcional> buscarTodos() {
        return opcionalRepository.findAll();
    }

    public List<OpcionalDTO> buscarTodosPeloNome(String nome) {
        if (nome == null) {
            return OpcionalMapper.toOpcionalDTOList(buscarTodos());
        }
        return OpcionalMapper.toOpcionalDTOList(opcionalRepository.findByNomeContains(nome));
    }

    public void cadastraOpcional(CadastraOpcionalDTO cadastraOpcionalDTO) {
        Opcional opcional = CadastraOpcionalMapper.toOpcional(cadastraOpcionalDTO);
        opcionalRepository.save(opcional);
    }

    public void atualizaOpcional(Long id, AtualizaOpcionalDTO atualizaOpcionalDTO) {
        Opcional opcional = buscaPorId(id);
        opcional.setNome(atualizaOpcionalDTO.getNome());
        opcionalRepository.save(opcional);
    }

    public void deletaOpcional(Long id) {
        Opcional opcional = buscaPorId(id);
        opcionalRepository.delete(opcional);
    }



}
