package com.example.revendacarro.dto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class CadastraProprietarioDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String cpfCnpj;

    @NotBlank
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
