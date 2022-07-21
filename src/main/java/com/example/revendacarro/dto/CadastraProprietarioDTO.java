package com.example.revendacarro.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class CadastraProprietarioDTO {

    @NotNull
    private String nome;

    @NotNull
    private String cpfCnpj;

    @NotNull
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
