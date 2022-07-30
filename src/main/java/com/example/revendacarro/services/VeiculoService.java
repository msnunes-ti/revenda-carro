package com.example.revendacarro.services;

import com.example.revendacarro.Repository.VeiculoRepository;
import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.mapper.CadastraVeiculoDTOMapper;
import com.example.revendacarro.mapper.MontadoraMapper;
import com.example.revendacarro.model.Veiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final MontadoraService montadoraService;
    private final OpcionalService opcionalService;
    private final ProprietarioService proprietarioService;

    public void cadastraVeiculo(CadastraVeiculoDTO cadastraVeiculoDTO) {
        Veiculo veiculo = CadastraVeiculoDTOMapper.toVeiculo(cadastraVeiculoDTO);
        veiculo.setMontadora(montadoraService.buscarMontadoraPorId(MontadoraDTO.tocadastraVeiculoDTO.getMontadora().getId()));
        veiculoRepository.save();
    }

}
