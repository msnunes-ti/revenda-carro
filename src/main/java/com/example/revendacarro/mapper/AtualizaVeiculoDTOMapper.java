package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.AtualizaVeiculoDTO;
import com.example.revendacarro.model.Veiculo;

public class AtualizaVeiculoDTOMapper {

    public static Veiculo toVeiculo(AtualizaVeiculoDTO atualizaVeiculoDTO) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(atualizaVeiculoDTO.getModelo());
        veiculo.setCor(atualizaVeiculoDTO.getCor());
        veiculo.setPlaca(atualizaVeiculoDTO.getPlaca());
        veiculo.setIsVendido(atualizaVeiculoDTO.getIsVendido());
        return veiculo;
    }
}
