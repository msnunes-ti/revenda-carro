package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(path = "/veiculos")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoService veiculoService;

    @PostMapping
    public @ResponseBody void cadastraVeiculo(@RequestBody @Valid @NotNull CadastraVeiculoDTO cadastraVeiculoDTO) {
        veiculoService.cadastraVeiculo(cadastraVeiculoDTO);
    }
}
