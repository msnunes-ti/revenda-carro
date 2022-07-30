package com.example.revendacarro.services;

import com.example.revendacarro.Repository.MontadoraRepository;
import com.example.revendacarro.Repository.VeiculoRepository;
import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.mapper.*;
import com.example.revendacarro.model.Opcional;
import com.example.revendacarro.model.Veiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final MontadoraService montadoraService;

    private final MontadoraRepository montadoraRepository;
    private final OpcionalService opcionalService;
    private final ProprietarioService proprietarioService;

    public void cadastraVeiculo(CadastraVeiculoDTO cadastraVeiculoDTO) {
        Veiculo veiculo = CadastraVeiculoDTOMapper.toVeiculo(cadastraVeiculoDTO);
        veiculo.setMontadora(MontadoraDTOMapper.toMontadora(montadoraService.buscarMontadoraPorId(cadastraVeiculoDTO.getMontadoraId())));
        veiculo.setValor(BigDecimal.valueOf(cadastraVeiculoDTO.getValor()));
        veiculo.setProprietario(ProprietarioDTOMapper.toProprietario(proprietarioService.buscarPorId(cadastraVeiculoDTO.getProprietarioId())));
        List<Long> opcionalId = cadastraVeiculoDTO.getOpcionaisIds();
        List<Opcional> opcionalList = new ArrayList<>();
        for (Long l : opcionalId) {
            opcionalList.add(OpcionalDTOMapper.toOpcional(opcionalService.buscaOpcionalPeloId(l)));
        }
        veiculo.setOpcionais(opcionalList);
        veiculoRepository.save(veiculo);
    }

}
