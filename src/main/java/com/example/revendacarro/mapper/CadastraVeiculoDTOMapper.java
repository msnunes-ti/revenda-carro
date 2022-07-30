package com.example.revendacarro.mapper;

import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.model.Veiculo;


public class CadastraVeiculoDTOMapper {

    public static Veiculo toVeiculo(CadastraVeiculoDTO cadastraVeiculoDTO) {
        Veiculo veiculo = new Veiculo();
        veiculo.setMontadora(cadastraVeiculoDTO.getMontadora());
        veiculo.setModelo(cadastraVeiculoDTO.getModelo());
        veiculo.setCor(cadastraVeiculoDTO.getCor());
        veiculo.setPlaca(cadastraVeiculoDTO.getPlaca());
        veiculo.setOpcionais(cadastraVeiculoDTO.getOpcionais());
        veiculo.setProprietario(cadastraVeiculoDTO.getProprietario());
        return veiculo;
    }
}
