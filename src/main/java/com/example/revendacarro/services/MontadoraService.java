package com.example.revendacarro.services;

import com.example.revendacarro.Repository.MontadoraRepository;
import com.example.revendacarro.dto.AtualizaMontadoraDTO;
import com.example.revendacarro.dto.CadastraMontadoraDTO;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.mapper.CadastraMontadoraDTOMapper;
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
            return MontadoraMapper.toMontadoraDTOList(montadoraList);
        }
        List<Montadora> montadoraList = montadoraRepository.findByNome(nome);
        return MontadoraMapper.toMontadoraDTOList(montadoraList);
    }

    public MontadoraDTO buscarMontadoraPorId(Long id) {
        return MontadoraMapper.toMontadoraDTO(buscarPorId(id));
    }

    public void cadastraMontadora(CadastraMontadoraDTO cadastraMontadoraDTO) {
        Long qtdeMontadoras = montadoraRepository.countByNome(cadastraMontadoraDTO.getNome());
        if (qtdeMontadoras > 0) {
            throw new RuntimeException("Montadora já cadastrada");
        }
        Montadora montadora = CadastraMontadoraDTOMapper.toMontadora(cadastraMontadoraDTO);
        montadoraRepository.save(montadora);
    }

    public void atualizaMontadora(Long id, AtualizaMontadoraDTO atualizaMontadoraDTO) {
        Montadora montadora = buscarPorId(id);
        montadora.setNome(atualizaMontadoraDTO.getNome());
        montadoraRepository.save(montadora);
    }

    public void deletarMontadora(Long id) {
        Montadora montadora = buscarPorId(id);
        montadoraRepository.delete(montadora);
    }

}

