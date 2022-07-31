package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.services.ProprietarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@RequestMapping(path = "/proprietarios")
@RequiredArgsConstructor
public class ProprietarioController {

    private final ProprietarioService proprietarioService;
    private String nome;

    @GetMapping
    public List<ProprietarioDTO> buscarTodos(@RequestParam(required = false) String cpfCnpj) {
        return proprietarioService.buscarTodos(cpfCnpj);
    }

    @GetMapping(path = "/{id}")
    public ProprietarioDTO buscarPorId(@PathVariable Long id) {
        return proprietarioService.buscarPorId(id);
    }

    @PostMapping
    public @ResponseBody void cadastraProprietario(@RequestBody @Valid @NotBlank CadastraProprietarioDTO cadastraProprietarioDTO) {
        proprietarioService.cadastraProprietario(cadastraProprietarioDTO);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody void atualizaProprietario(@PathVariable Long id, @RequestBody @Valid @NotBlank AtualizaProprietarioDTO atualizaProprietarioDTO) {
        proprietarioService.atualizaProprietario(id, atualizaProprietarioDTO);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarProprietario(@PathVariable Long id) {
        proprietarioService.deletarProprietario(id);
    }
}
