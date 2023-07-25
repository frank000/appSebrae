package com.example.AppSebra.app.web.persistence.repository;

import com.example.AppSebra.app.web.persistence.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {


}
