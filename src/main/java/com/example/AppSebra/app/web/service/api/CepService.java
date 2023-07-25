package com.example.AppSebra.app.web.service.api;

import com.example.AppSebra.app.web.service.dto.CepDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep" ,value = "viacep", url = "https://viacep.com.br/ws")
public interface CepService {


    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    CepDto buscarPorCep(@PathVariable("cep") String cep);
}
