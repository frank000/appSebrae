package com.example.AppSebra.app.web.controller;

import com.example.AppSebra.app.web.exception.NotValidException;
import com.example.AppSebra.app.web.service.dto.ContaDto;
import com.example.AppSebra.core.entity.Conta;
import com.example.AppSebra.core.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService service;

    @PostMapping
    public Conta salvar(@Valid @RequestBody ContaDto conta){
        return service.salvar(new Conta(conta.getNome(), conta.getDescricao()));
    }

    @PutMapping("/{id}")
    public Conta altear(@PathVariable(value = "id") String id, @RequestBody ContaDto conta) throws NotValidException {
        Conta conta1 = service.buscarPorId(Long.parseLong(id));
        if(Objects.isNull(conta1)) throw new NotValidException("Conta inválida");

        conta1.setDescricao(conta.getDescricao());
        conta1.setNome(conta.getNome());
        return service.alterar(conta1);
    }

    @GetMapping
    public List<Conta> listarTodos(){
        return service.buscarContas();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable(value = "id") String id){
         service.deletar(Long.parseLong(id));
    }

}
