package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.model.Proprietario;
import com.example.revendacarro.services.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/revenda/proprietario")
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @GetMapping
    public List<Proprietario> buscarTodos() {
        return proprietarioService.buscarTodos();
    }

    @GetMapping(path = "/{id}/id")
    public Optional<Proprietario> buscarPorId(@PathVariable(required = false) Long id) {
        return proprietarioService.buscarPorId(id);
    }

    @GetMapping(path = "/{cpfCnpj}")
    public List<Proprietario> buscarPorCpfCnpj(@PathVariable(required = false) String cpfCnpj) {
        return proprietarioService.buscarPorCpfCnpj(cpfCnpj);
    }

    @PostMapping
    public @ResponseBody void cadastraProprietario(@RequestBody @Valid @NotBlank CadastraProprietarioDTO cadastraProprietarioDTO) {
        proprietarioService.cadastraProprietario(cadastraProprietarioDTO);
    }

    @PutMapping
    public @ResponseBody void atualizaProprietario(@RequestBody @Valid @NotBlank AtualizaProprietarioDTO atualizaProprietarioDTO) {
        proprietarioService.atualizaProprietario(atualizaProprietarioDTO);
    }

    @DeleteMapping(path = "/{id}/id")
    public void deletarProprietario(@PathVariable Long id) {
        proprietarioService.deletarProprietario(id);
    }

}
