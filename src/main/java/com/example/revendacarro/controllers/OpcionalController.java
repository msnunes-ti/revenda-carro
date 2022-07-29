package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.AtualizaOpcionalDTO;
import com.example.revendacarro.dto.CadastraOpcionalDTO;
import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.services.OpcionalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/opcionais")
@AllArgsConstructor
public class OpcionalController {

    private final OpcionalService opcionalService;

    @GetMapping
    public List<OpcionalDTO> BuscarTodos(@RequestParam(required = false) String nome) {
        return opcionalService.buscarTodosPeloNome(nome);
    }

    @GetMapping(path = "/{id}")
    public OpcionalDTO buscaPorId(@PathVariable Long id) {
        return opcionalService.buscaOpcionalPeloId(id);
    }

    @PostMapping
    public void cadastraOpcional(@RequestBody @Valid @NotNull CadastraOpcionalDTO cadastraOpcionalDTO) {
        opcionalService.cadastraOpcional(cadastraOpcionalDTO);
    }

    @PutMapping
    public void atualizaOpcional(Long id, @RequestBody AtualizaOpcionalDTO atualizaOpcionalDTO) {
        opcionalService.atualizaOpcional(id, atualizaOpcionalDTO);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteOpcional(@PathVariable Long id) {
        opcionalService.deletaOpcional(id);
    }
}
