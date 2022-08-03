package com.example.revendacarro.services;

import com.example.revendacarro.Repository.VeiculoRepository;
import com.example.revendacarro.dto.AtualizaVeiculoDTO;
import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.dto.VeiculoDTO;
import com.example.revendacarro.mapper.*;
import com.example.revendacarro.model.Opcional;
import com.example.revendacarro.model.Veiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final MontadoraService montadoraService;
    private final OpcionalService opcionalService;
    private final ProprietarioService proprietarioService;

    private Veiculo buscaPorId(Long id) {
        return veiculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Id do Veículo não encontrado."));
    }

    public VeiculoDTO buscaVeiculoPorId(Long id) {
        Veiculo veiculo = buscaPorId(id);
        return VeiculoMapper.toVeiculoDTO(veiculo);
    }

    public List<VeiculoDTO> buscarTodos(String modelo) {
        if (modelo == null) {
            return VeiculoMapper.veiculoDTOList(veiculoRepository.findAll());
        }
        return VeiculoMapper.veiculoDTOList(veiculoRepository.findByModeloContains(modelo));
    }
    @Transactional
    public void cadastraVeiculo(CadastraVeiculoDTO cadastraVeiculoDTO) {
        Veiculo veiculo = VeiculoMapper.toVeiculoCadastra(cadastraVeiculoDTO);
        veiculo.setMontadora(MontadoraMapper.toMontadora(montadoraService.buscarMontadoraPorId(cadastraVeiculoDTO.getMontadoraId())));
        veiculo.setValor(BigDecimal.valueOf(cadastraVeiculoDTO.getValor()));
        veiculo.setProprietario(ProprietarioMapper.toProprietario(cadastraVeiculoDTO.getProprietario()));
        List<Long> opcionalId = cadastraVeiculoDTO.getOpcionaisIds();
        List<Opcional> opcionalList = new ArrayList<>();
        for (Long l : opcionalId) {
            opcionalList.add(OpcionalMapper.toOpcional(opcionalService.buscaOpcionalPeloId(l)));
        }
        veiculo.setOpcionais(opcionalList);
        veiculo.setIsVendido(false);
        veiculoRepository.save(veiculo);
    }
    @Transactional
    public void atualizaVeiculo(Long id, AtualizaVeiculoDTO atualizaVeiculoDTO) {
        Veiculo veiculoEncontrado = buscaPorId(id);
        Veiculo veiculo = VeiculoMapper.toVeiculo(atualizaVeiculoDTO);
        veiculo.setId(veiculoEncontrado.getId());
        veiculo.setMontadora(MontadoraMapper.toMontadora(montadoraService.buscarMontadoraPorId(atualizaVeiculoDTO.getMontadoraId())));
        veiculo.setValor(BigDecimal.valueOf(atualizaVeiculoDTO.getValor()));
        veiculo.setProprietario(ProprietarioMapper.toProprietario(proprietarioService.buscarPorId(atualizaVeiculoDTO.getProprietarioId())));
        List<Long> opcionalId = atualizaVeiculoDTO.getOpcionaisIds();
        List<Opcional> opcionalList = new ArrayList<>();
        for (Long l : opcionalId) {
            opcionalList.add(OpcionalMapper.toOpcional(opcionalService.buscaOpcionalPeloId(l)));
        }
        veiculo.setOpcionais(opcionalList);
        veiculoRepository.save(veiculo);
    }
    @Transactional
    public void deletarVeiculo(Long id) {
        Veiculo veiculo = buscaPorId(id);
        veiculoRepository.delete(veiculo);
    }
}
