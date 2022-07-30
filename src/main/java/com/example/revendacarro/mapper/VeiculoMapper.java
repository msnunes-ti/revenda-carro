package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.VeiculoDTO;
import com.example.revendacarro.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoMapper {

    public static VeiculoDTO toVeiculoDTO(Veiculo veiculo) {
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        veiculoDTO.setId(veiculo.getId());
        veiculoDTO.setMontadora(veiculo.getMontadora());
        veiculoDTO.setModelo(veiculo.getModelo());
        veiculoDTO.setCor(veiculo.getCor());
        veiculoDTO.setPlaca(veiculo.getPlaca());
        veiculoDTO.setProprietario(veiculo.getProprietario());
        veiculoDTO.setOpcionais(veiculo.getOpcionais());
        veiculoDTO.setValor(veiculo.getValor());
        veiculoDTO.setIsVendido(veiculo.getIsVendido());
        return veiculoDTO;
    }

    public static List<VeiculoDTO> veiculoDTOList(List<Veiculo> veiculoList) {
        List<VeiculoDTO> veiculoDTOList = new ArrayList<>();
        for (Veiculo v : veiculoList) {
            veiculoDTOList.add(toVeiculoDTO(v));
        }
        return veiculoDTOList;
    }

}
