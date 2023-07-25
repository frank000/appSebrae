package com.example.AppSebra.app.web.persistence.mapper;

import com.example.AppSebra.app.web.persistence.entity.ContaEntity;
import com.example.AppSebra.core.entity.Conta;
import org.springframework.stereotype.Service;

@Service
public class ContaMapper {

    public ContaEntity convert(Conta conta){
        ContaEntity contaEntity;
        if(conta.getId() != null){
            contaEntity = new ContaEntity(
                    conta.getId(),
                    conta.getNome(),
                    conta.getDescricao()
            );
        }else{
            contaEntity = new ContaEntity(
                    conta.getNome(),
                    conta.getDescricao()
            );
        }

        return contaEntity;
    }

    public Conta convert(ContaEntity entity){
        Conta conta = new Conta(
                entity.getId(),
                entity.getNome(),
                entity.getDescricao()
        );
        return conta;
    }
}
