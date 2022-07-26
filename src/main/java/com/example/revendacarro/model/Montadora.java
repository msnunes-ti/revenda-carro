package com.example.revendacarro.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Montadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    public Montadora() {
    }

    public Montadora(Builder builder) {
        super();
        this.id = builder.id;
        this.nome = builder.nome;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static class Builder {

        private Long id;
        private String nome;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }
        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }
        public Montadora build() {
            return new Montadora(this);
        }
    }
}
