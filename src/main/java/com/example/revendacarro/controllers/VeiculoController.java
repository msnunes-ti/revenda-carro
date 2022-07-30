package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.AtualizaVeiculoDTO;
import com.example.revendacarro.dto.CadastraVeiculoDTO;
import com.example.revendacarro.dto.VeiculoDTO;
import com.example.revendacarro.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/veiculos")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoService veiculoService;

    @GetMapping(path = "/{id}")
    public VeiculoDTO buscarVeiculoPorId(@PathVariable Long id) {
        return veiculoService.buscaVeiculoPorId(id);
    }

    @GetMapping
    public List<VeiculoDTO> buscarTodos(@RequestParam(required = false) String modelo) {
        return veiculoService.buscarTodos(modelo);
    }

    @PostMapping
    public @ResponseBody void cadastraVeiculo(@RequestBody @Valid @NotNull CadastraVeiculoDTO cadastraVeiculoDTO) {
        veiculoService.cadastraVeiculo(cadastraVeiculoDTO);
    }

    @PutMapping(path = "/{id}")
    public void atualizaVeiculo(@PathVariable Long id, @RequestBody AtualizaVeiculoDTO atualizaVeiculoDTO) {
        veiculoService.atualizaVeiculo(id, atualizaVeiculoDTO);
    }
    
    @DeleteMapping(path = "{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        veiculoService.deletarVeiculo(id);
    }


}
