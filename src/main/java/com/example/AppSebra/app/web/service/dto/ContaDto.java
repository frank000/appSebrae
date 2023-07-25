package com.example.AppSebra.app.web.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ContaDto implements Serializable {

    @JsonProperty(value = "id")
    private Long id;

    @NotNull
    @Max(255)
    @JsonProperty(value = "nome")
    private String nome;

    @NotNull
    @Max(255)
    @JsonProperty(value = "descricao")
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
