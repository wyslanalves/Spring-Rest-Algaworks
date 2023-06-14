package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){

        return entityManager.createQuery("from Proprietario", Proprietario.class).getResultList();
    }
}
