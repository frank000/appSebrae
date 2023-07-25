package com.example.AppSebra.app.web.controller;


import com.example.AppSebra.app.web.exception.NotValidException;
import com.example.AppSebra.app.web.service.api.CepService;
import com.example.AppSebra.app.web.service.dto.CepDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public CepDto buscaPorCep(@PathVariable(name = "cep") String cep) throws NotValidException {
        Objects.requireNonNull(cep);
        cep = cep.replace("-", "");
        if(StringUtils.isEmpty(cep) || StringUtils.containsWhitespace(cep)) throw new NotValidException("Cep em Branco.");

        if(cep.length() != 8) throw new NotValidException("Cep não é válido. Favor conferir!");

        CepDto dto = this.cepService.buscarPorCep(cep);
        return dto;
    }

}
