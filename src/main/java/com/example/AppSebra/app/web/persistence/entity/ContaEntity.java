package com.example.AppSebra.app.web.persistence.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_conta")
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id;

    @Column(name = "nome", length = 255)
    private String nome;
    @Column(name = "descricao", length = 255)
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

    public ContaEntity() {
    }

    public ContaEntity(String nome, String descricao) {
        Objects.requireNonNull(nome, "Campo nome inválido.");
        Objects.requireNonNull(descricao,"Campo descricao inválido.");

        this.nome = nome;
        this.descricao = descricao;
    }
    public ContaEntity(Long id, String nome, String descricao) {
        Objects.requireNonNull(id, "Campo id inválido.");
        Objects.requireNonNull(nome, "Campo nome inválido.");
        Objects.requireNonNull(descricao,"Campo descricao inválido.");

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
