package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.model.Proprietario;
import com.example.revendacarro.services.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/revenda")
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @GetMapping(path = "/proprietario")
    public List<Proprietario> buscarTodos() {
        return proprietarioService.buscarTodos();
    }

    @PostMapping
    public void cadastraProprietario(@RequestBody @Valid @NotNull CadastraProprietarioDTO cadastraProprietarioDTO) {
        proprietarioService.cadastraProprietario(cadastraProprietarioDTO);
    }

}
