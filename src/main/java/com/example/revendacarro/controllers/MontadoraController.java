package com.example.revendacarro.controllers;

import com.example.revendacarro.dto.MontadoraDTO;
import com.example.revendacarro.services.MontadoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/montadora")
@AllArgsConstructor
public class MontadoraController {

    private final MontadoraService montadoraService;

    public List<MontadoraDTO> buscartodas() {
        return montadoraService
    }

}
