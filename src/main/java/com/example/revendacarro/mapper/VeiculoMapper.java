package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaVeiculoDTO;
import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.dto.VeiculoDTO;
import com.example.revendacarro.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoMapper {

    public static VeiculoDTO toVeiculoDTO(Veiculo veiculo) {
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        veiculoDTO.setId(veiculo.getId());
        veiculoDTO.setMontadora(MontadoraMapper.toMontadoraDTO(veiculo.getMontadora()));
        veiculoDTO.setModelo(veiculo.getModelo());
        veiculoDTO.setCor(veiculo.getCor());
        veiculoDTO.setPlaca(veiculo.getPlaca());
        veiculoDTO.setProprietario(veiculo.getProprietario());
        veiculoDTO.setOpcionais(veiculo.getOpcionais());
        veiculoDTO.setValor(veiculo.getValor());
        veiculoDTO.setIsVendido(veiculo.getIsVendido());
        return veiculoDTO;
    }

    public static Veiculo toVeiculo(AtualizaVeiculoDTO atualizaVeiculoDTO) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(atualizaVeiculoDTO.getModelo());
        veiculo.setCor(atualizaVeiculoDTO.getCor());
        veiculo.setPlaca(atualizaVeiculoDTO.getPlaca());
        veiculo.setIsVendido(atualizaVeiculoDTO.getIsVendido());
        return veiculo;
    }

    public static List<VeiculoDTO> veiculoDTOList(List<Veiculo> veiculoList) {
        List<VeiculoDTO> veiculoDTOList = new ArrayList<>();
        for (Veiculo v : veiculoList) {
            veiculoDTOList.add(toVeiculoDTO(v));
        }
        return veiculoDTOList;
    }

    public static Veiculo toVeiculoCadastra(CadastraVeiculoDTO cadastraVeiculoDTO) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(cadastraVeiculoDTO.getModelo());
        veiculo.setCor(cadastraVeiculoDTO.getCor());
        veiculo.setPlaca(cadastraVeiculoDTO.getPlaca());
        return veiculo;
    }
}
