package com.example.AppSebra.core.service;

import com.example.AppSebra.core.entity.Conta;

import java.util.List;

public interface ContaService {


    Conta salvar(Conta conta);
    Conta alterar(Conta conta);

    void deletar(Long id);

    List<Conta> buscarContas();
    Conta buscarPorId(Long id);


}
