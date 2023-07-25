package com.example.AppSebra.app.web.service;

import com.example.AppSebra.app.web.persistence.entity.ContaEntity;
import com.example.AppSebra.app.web.persistence.mapper.ContaMapper;
import com.example.AppSebra.app.web.persistence.repository.ContaRepository;
import com.example.AppSebra.core.entity.Conta;
import com.example.AppSebra.core.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository repository;

    @Autowired
    private ContaMapper mapper;

    @Override
    public Conta salvar(Conta conta) {
        ContaEntity save = repository.save(mapper.convert(conta));
        return mapper.convert(save);
    }

    @Override
    public Conta alterar(Conta conta) {
        ContaEntity save = repository.save(mapper.convert(conta));
        return mapper.convert(save);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Conta> buscarContas() {
        return repository.findAll().stream().map(entity -> mapper.convert(entity)).collect(Collectors.toList());
    }

    @Override
    public Conta buscarPorId(Long id) {
        Optional<ContaEntity> op = repository.findById(id);
        return op.isPresent() ? mapper.convert(op.get())  : null;
    }
}
