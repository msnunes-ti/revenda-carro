package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.OpcionalDTO;
import com.example.revendacarro.services.OpcionalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/opcionais")
@AllArgsConstructor
public class OpcionalController {

    private final OpcionalService opcionalService;

    @GetMapping
    public List<OpcionalDTO> BuscarTodos(String nome) {
        return opcionalService.buscarTodosPeloNome(nome);
    }

}
