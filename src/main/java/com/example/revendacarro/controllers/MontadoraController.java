package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.AtualizaMontadoraDTO;
import com.example.revendacarro.dto.CadastraMontadoraDTO;
import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.model.Montadora;
import com.example.revendacarro.services.MontadoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@RequestMapping(path = "/montadoras")
@AllArgsConstructor
public class MontadoraController {

    private final MontadoraService montadoraService;

    @GetMapping
    public List<MontadoraDTO> buscartodas(@RequestParam(required = false) String nome) {
        return montadoraService.buscarTodas(nome);
    }

    @GetMapping(path = "/{id}")
    public MontadoraDTO buscarMontadoraPorId(@PathVariable Long id) {
        return montadoraService.buscarMontadoraPorId(id);
    }

    @PostMapping
    public @ResponseBody void cadastraMontadora(@RequestBody @Valid @NotBlank CadastraMontadoraDTO cadastraMontadoraDTO) {
        montadoraService.cadastraMontadora(cadastraMontadoraDTO);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody void atualizaMontadora(@PathVariable Long id, @RequestBody @Valid @NotBlank AtualizaMontadoraDTO atualizaMontadoraDTO) {

    }
}
